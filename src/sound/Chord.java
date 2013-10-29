package sound;

import java.util.ArrayList;
import java.util.List;

public class Chord implements Sequence{
	
	private final List<MusicalAtom> atoms;
	private final IntPair length;
	private IntPair shortestLength;
	
	/**
	 * Constructor for Chord
	 * @param length
	 */
	public Chord(IntPair length){
		this.atoms =  new ArrayList<MusicalAtom>();
		this.length = length;
	}
	
	/**
	 * Adds a MusicalAtom to the end of the Chord. 
	 * @param m Measure to be appended. Must not be null. Must obey the meter
	 * 	of the piece. 
	 */
	public void addAtom(MusicalAtom a){
		MusicalAtom atom = a.clone();
		
		this.atoms.add(atom);
		if (this.atoms.size() == 1){
			this.shortestLength = atom.getLength();
		}
		else{
			if (atom.getLength().getValue() < this.shortestLength.getValue()){
				this.shortestLength = atom.getLength();
			}
		}
	}
	public List<MusicalAtom> getAtoms(){
		return this.atoms;
	}
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public IntPair getShortestLength() {
		return this.shortestLength;
	}
	
	/**
	 * Requires that addAtom() be called at least once prior. 
	 * @see Sequence.java spec
	 */
	//@Override
	public List<Chord> getSequence() {
		List<Chord> sequence =  new ArrayList<Chord>();
		sequence.add(this);
		return sequence;
	}
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public String toString(){
		List<MusicalAtom> sequence = this.getAtoms();
		return sequence.toString();
	}
	
	/**
	 * @see Sequence.java spec
	 * Autogened by Eclipse
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atoms == null) ? 0 : atoms.hashCode());
		result = prime * result
				+ ((shortestLength == null) ? 0 : shortestLength.hashCode());
		return result;
	}
	
	/**
	 * @see Sequence.java spec
	 * Autogened by Eclipse
	 */
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
		if (shortestLength == null) {
			if (other.shortestLength != null)
				return false;
		} else if (!shortestLength.equals(other.shortestLength))
			return false;
		return true;
	}

	/**
	 * addAtom() must be called at least once
	 * See spec in @see Sequence.java
	 */
//	@Override
//	public int getNumberOfBeats() {
//		return atoms.size();
//	}
//
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
	
	public IntPair getLength() {
		return this.length;
		}
	
}
