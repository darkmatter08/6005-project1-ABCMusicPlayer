package sound;

import java.util.ArrayList;
import java.util.List;

/**
 * Voice represents a voice for the length of a Measure. 
 * Each voice has at least one Chord. 
 * @author jains dalitso
 *
 */
public class Voice implements Sequence {

	private final List<Measure> measures;
	private IntPair shortestLength;
	
	/**
	 * Constructor for Voice. 
	 */
	public Voice() {
		this.measures = new ArrayList<Measure>();
	}
	
	/**
	 * Adds a measure to this voice. The measure must have the same number of beats
	 * 	as other measures added to this voice. 
	 * @param measure The measure to be appended. 
	 */
	public void addMeasure(Measure measure){
		// @cr How will we handle adding in voices that aren't a full measure?
		//		i.e. who's responsibility is padding the measure?
		if (this.measures.size() != 0)
			assert IntPair.fuzzyDoubleEquals(measure.getNumberOfBeats(), 
					this.measures.get(0).getNumberOfBeats());
			
		Measure m = measure.clone();
		
		this.measures.add(m);
		if (this.measures.size() == 1){
			this.shortestLength = m.getShortestLength();
		}
		else{
			if (m.getShortestLength().getValue() < this.shortestLength.getValue()){
				this.shortestLength = m.getShortestLength();
			}
		}
	}
	
	/**
	 * Requires that addMeasure() be called at least once prior. 
	 * @see Sequence.java spec
	 */
	@Override
	public IntPair getShortestLength() {
		return this.shortestLength;
	}
	
	/**
	 * @see Sequence.java spec
	 */
	//@Override
	public List<Chord> getSequence() {
		// TODO Auto-generated method stub
		List<Chord> sequence =  new ArrayList<Chord>();
		for (Measure m : this.measures){
			for (Chord c: m.getSequence()){ //@cr m.getSequence should be returning a clone
				sequence.add(c);
			}
		}
		return sequence;
	}
	
	/**
	 * @see Sequence.java spec
	 * Eclipse autogen
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((measures == null) ? 0 : measures.hashCode());
		result = prime * result
				+ ((shortestLength == null) ? 0 : shortestLength.hashCode());
		return result;
	}

	/**
	 * @see Sequence.java spec
	 * Eclipse autogen
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voice other = (Voice) obj;
		if (measures == null) {
			if (other.measures != null)
				return false;
		} else if (!measures.equals(other.measures))
			return false;
		if (shortestLength == null) {
			if (other.shortestLength != null)
				return false;
		} else if (!shortestLength.equals(other.shortestLength))
			return false;
		return true;
	}

	/**
	 * addMeasure() must be called at least once
	 * See spec in @see Sequence.java
	 */
	@Override
	public double getNumberOfBeats() {
		double numberOfBeats = 0;
		for(Measure m : this.measures){
			numberOfBeats += m.getNumberOfBeats();
		}
		return numberOfBeats;
	}

//	@Override
//	public List<Chord> getUnderlyingRep() {
//		List<Chord> rep = new ArrayList<Chord>();
//		for (Chord c: this.chords){
//			rep.add(c.clone());
//		}
//		return rep;
//	}
	
	@Override
	public Voice clone() {
		Voice clone = new Voice();
		for (Measure m : this.measures) {
			clone.addMeasure(m.clone());
		}
		return clone;
	}
}
