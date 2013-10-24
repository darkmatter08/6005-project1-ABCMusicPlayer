package sound;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

public class Chord implements Sequence{
	
	/* @cr
	 * probably a List<List<MusicalAtom>>. The inner list is a list of all 
	 * the musicalAtoms to be played at a time. The outer list is a list of 
	 * all these lists to be played at the same time. With the invariant that 
	 * all MusicalAtoms have the same length for every embedded list.
	 */
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
	public void addAtom(MusicalAtom atom){
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
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public IntPair getShortestLength() {
		MusicalAtom shortestAtom = null;
		double shortestLength = Double.POSITIVE_INFINITY;
		for (MusicalAtom atom: atoms){
			if (atom.getLength().getValue() < shortestLength){
				shortestLength = atom.getLength().getValue();
				shortestAtom = atom;
			}
		}
		return shortestAtom.getLength();
	}
	
	/**
	 * Requires that addAtom() be called at least once prior. 
	 * @see Sequence.java spec
	 */
	@Override
	public List<MusicalAtom> getSequence() {
		List<MusicalAtom> sequence =  new ArrayList<MusicalAtom>();
		for (MusicalAtom atom: this.atoms){
			sequence.add(atom);
		}
		return sequence;
	}
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public String toString(){
		List<MusicalAtom> sequence = this.getSequence();
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
	
}
