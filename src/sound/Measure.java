package sound;

import java.util.ArrayList;
import java.util.List;

public class Measure implements Sequence {
	
	private final List<Voice> voices;
	private IntPair shortestLength;
	
	/**
	 * Constructor for Measure
	 */
	public Measure(){
		this.voices = new ArrayList<Voice>();
	}
	
	/**
	 * Adds a voice to this measure. The voice must have the same number of 
	 * beats per measure as other voices. @cr how will we handle this?
	 * @param voice The voice to be added to the measure
	 */
	public void addVoice(Voice voice){
		this.voices.add(voice);
		if (this.voices.size() == 1){
			this.shortestLength = voice.getShortestLength();
		}
		else{
			if (voice.getShortestLength().getValue() < this.shortestLength.getValue()){
				this.shortestLength = voice.getShortestLength();
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
	@Override
	public List<MusicalAtom> getSequence() {
		// TODO Auto-generated method stub
		List<MusicalAtom> sequence =  new ArrayList<MusicalAtom>();
		for (Voice voice: voices){
			for (MusicalAtom atom: voice.getSequence()){
				sequence.add(atom);
			}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((shortestLength == null) ? 0 : shortestLength.hashCode());
		result = prime * result + ((voices == null) ? 0 : voices.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Measure other = (Measure) obj;
		if (shortestLength == null) {
			if (other.shortestLength != null)
				return false;
		} else if (!shortestLength.equals(other.shortestLength))
			return false;
		if (voices == null) {
			if (other.voices != null)
				return false;
		} else if (!voices.equals(other.voices))
			return false;
		return true;
	}
	
}
