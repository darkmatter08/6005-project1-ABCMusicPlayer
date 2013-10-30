package sound;

import java.util.ArrayList;
import java.util.List;

public class Chord implements Sequence{
	
	private final List<MusicalAtom> atoms;
	private final IntPair length;
	
	/**
	 * Constructor for Chord
	 * @param length
	 */
	public Chord(IntPair length){
		this.atoms =  new ArrayList<MusicalAtom>();
		this.length = length;
	}
	
	/**
	 * Adds a MusicalAtom to the Chord, to be played simultaneously. 
	 * @param a MusicalAtom to be appended. Must not be null. 
	 */
	public void addAtom(MusicalAtom a){
		// @cr assert that the length of the MusicalAtom is the same as the length
		assert a.getLength().equals(length);
		
		MusicalAtom atom = a.clone();
		this.atoms.add(atom);
	}
	
	/**
	 * Will always get the length of the Chord
	 * @see Sequence.java spec
	 */
	@Override
	public IntPair getShortestLength() {
		return this.length;
	}
	
	/**
	 * Requires that addAtom() be called at least once prior. 
	 * @see Sequence.java spec
	 */
	//@Override
	public List<MusicalAtom> getSequence() {
		// @cr needs cloning
		return this.atoms;
	}
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public String toString(){
		List<MusicalAtom> sequence = this.getSequence();
		return sequence.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atoms == null) ? 0 : atoms.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
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
		Chord other = (Chord) obj;
		if (atoms == null) {
			if (other.atoms != null)
				return false;
		} else if (!atoms.equals(other.atoms))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		return true;
	}

	/**
	 * addAtom() must be called at least once
	 * See spec in @see Sequence.java
	 */
	@Override
	public double getNumberOfBeats() {
		return atoms.get(0).getLength().getValue();
	}

//	@Override
	public List<MusicalAtom> getUnderlyingRep() {
		List<MusicalAtom> rep = new ArrayList<MusicalAtom>();
		for (MusicalAtom m: this.atoms){
			rep.add(m.clone());
		}
		return rep;
	}
	
	@Override
	public Chord clone() {
		Chord clone = new Chord(this.length.clone());
		for (MusicalAtom m : this.atoms) {
			clone.addAtom(m);
		}
		return clone;
	}

	/*
	 * the cord set the lyrics to its first note
	 */
	public void addLyrics(String lyric) {
		// TODO Auto-generated method stub
		//this.atoms.get(0).;
		
	}	
}
