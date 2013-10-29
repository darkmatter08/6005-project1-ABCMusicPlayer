package sound;

import java.util.ArrayList;
import java.util.List;

public class Measure implements Sequence {
	
	private final List<Chord> chords;
	private IntPair shortestLength;
	
	/**
	 * Constructor for Measure
	 */
	public Measure() {
		this.chords = new ArrayList<Chord>();
	}
	
	/**
	 * Adds a voice to this measure. The voice must have the same number of 
	 * beats per measure as other voices. @cr how will we handle this?
	 * @param voice The voice to be added to the measure
	 */
	public void addChord(Chord c) {
		// @cr does padding apply to a chord? @see measure.addVoice()
//		if (this.chords.size() != 0)
//			assert c.getNumberOfBeats() == this.getNumberOfBeats();
		
		Chord chord = c.clone();
		
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
	 * @see Sequence.java spec
	 */
	@Override
	public IntPair getShortestLength() {
		// TODO Auto-generated method stub
		return shortestLength;
	}

	/**
	 * @see Sequence.java spec
	 */
	//@Override
	public List<Chord> getSequence() {
		List<Chord> sequence =  new ArrayList<Chord>();
		for (Chord chord: this.chords){
			sequence.add(chord);
			
		}
		return sequence;
	}
	
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public String toString(){
		return this.getSequence().toString();
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result
//				+ ((shortestLength == null) ? 0 : shortestLength.hashCode());
//		result = prime * result + ((voices == null) ? 0 : voices.hashCode());
//		return result;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Measure other = (Measure) obj;
//		if (shortestLength == null) {
//			if (other.shortestLength != null)
//				return false;
//		} else if (!shortestLength.equals(other.shortestLength))
//			return false;
//		if (voices == null) {
//			if (other.voices != null)
//				return false;
//		} else if (!voices.equals(other.voices))
//			return false;
//		return true;
//	}
	
	/**
	 * addVoice() must be called at least once
	 * See spec in @see Sequence.java
	 */
//	@Override
//	public int getNumberOfBeats() {
//		// @cr can a voice end at different time? 
//		Voice maxBeats = this.voices.get(0);
//		for(Voice voice : this.voices){
//			if(voice.getNumberOfBeats() > maxBeats.getNumberOfBeats()){
//				m.getNumberOfBeats();
//				}
//			}
//				maxBeats = voice;
//		}
//	
//		return maxBeats.getNumberOfBeats();
//	}

//	@Override
//	public List<Voice> getUnderlyingRep() {
//		List<Voice> rep = new ArrayList<Voice>();
//		for (Voice v: this.voices){
//			rep.add(v.clone());
//		}
//		return rep;
//	}
//	
//	@Override
//	public Measure clone() {
//		Measure clone = new Measure();
//		for (Voice v : this.voices) {
//			clone.addVoice(v);
//		}
//		return clone;
//	}
	
}
