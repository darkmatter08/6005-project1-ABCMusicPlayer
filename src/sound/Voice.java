package sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Voice represents a voice for the length of a Measure. 
 * Each voice has at least one Chord. 
 * @author jains dalitso
 *
 */
public class Voice implements Sequence {

	private final List<Chord> chords; 
	private IntPair shortestLength;
	
	/**
	 * Constructor for Voice. 
	 */
	public Voice() {
		this.chords = new ArrayList<Chord>();
	}
	
	/**
	 * Adds chord to the voice. The chord must have the same 
	 * 	number of beats as this voice does.  
	 * @param chord The chord to be added. Must not be null.
	 */
	public void addChord(Chord chord) {
		// @cr does padding apply to a chord? @see measure.addVoice()
		if (this.chords.size() != 0)
			assert chord.getNumberOfBeats() == this.getNumberOfBeats();
		
		this.chords.add(chord);
		if (this.chords.size() == 1){
			this.shortestLength = chord.getShortestLength();
		}
		else{
			if (chord.getShortestLength().compareTo(this.shortestLength) < 0){
				this.shortestLength = chord.getShortestLength();
			}
		}
	} 
	
	/**
	 * Requires that addChord() be called at least once prior. 
	 * @see Sequence.java spec
	 */
	@Override
	public IntPair getShortestLength() {
		// TODO Auto-generated method stub
		return this.shortestLength;
	}
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public List<MusicalAtom> getSequence() {
		List<MusicalAtom> sequence =  new ArrayList<MusicalAtom>();
		for (Chord chord: this.chords){
			for (MusicalAtom atom: chord.getSequence()){
				sequence.add(atom);
			}
		}
		return sequence;
	}
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public String toString() {
		return this.getSequence().toString();
	}
	
	/**
	 * @see Sequence.java spec
	 * Eclipse autogen
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chords == null) ? 0 : chords.hashCode());
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
		if (chords == null) {
			if (other.chords != null)
				return false;
		} else if (!chords.equals(other.chords))
			return false;
		if (shortestLength == null) {
			if (other.shortestLength != null)
				return false;
		} else if (!shortestLength.equals(other.shortestLength))
			return false;
		return true;
	}
	
	/**
	 * addChord() must be called at least once
	 * See spec in @see Sequence.java
	 */
	@Override
	public int getNumberOfBeats() {
		Chord maxBeats = this.chords.get(0);
		for(Chord chord : this.chords){
			if(chord.getNumberOfBeats() > maxBeats.getNumberOfBeats())
				maxBeats = chord;
		}
		return maxBeats.getNumberOfBeats();
	}
}
