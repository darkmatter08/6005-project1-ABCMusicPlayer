package sound;

import java.util.ArrayList;
import java.util.List;

public class Chord implements Sequence{
	
	/* @cr
	 * probably a List<List<MusicalAtom>>. The inner list is a list of all 
	 * the musicalAtoms to be played at a time. The outer list is a list of 
	 * all these lists to be played at the same time. With the invariant that 
	 * all MusicalAtoms have the same length for every embedded list.
	 */
	private final List<List<MusicalAtom>> atoms;
	private final IntPair length;
	private IntPair shortestLength;
	
	/**
	 * Constructor for Chord
	 * @param length
	 */
	public Chord(IntPair length) {
		this.atoms =  new ArrayList<List<MusicalAtom>>();
		this.length = length;
	}
	
	/**
	 * Adds a list of MusicalAtoms to the end of the Chord. 
	 * @param a list of MusicalAtoms to be appended (and played at once). 
	 * Must not be null. Must obey the meter of the piece. Must all have
	 * the same length. 
	 */
	public void addAtom(List<MusicalAtom> a) {
		IntPair lastAtomLength = a.get(0).getLength();
		for (MusicalAtom m : a) {
			assert m.getLength().equals(lastAtomLength);
		}
		
		List<MusicalAtom> atom = new ArrayList<MusicalAtom>(a);
		MusicalAtom firstAtom  = atom.get(0);
		
		this.atoms.add(atom);
		if (this.atoms.size() == 1){
			// Check length of firstAtom, because all of these MusicalAtoms are the same length
			this.shortestLength = firstAtom.getLength();
		}
		else{
			if (firstAtom.getLength().compareTo(this.shortestLength.getValue()) < 0) { // @cr check this logic
				this.shortestLength = firstAtom.getLength();
			}
		}
	}
	
	/**
	 * Adds a single MusicalAtom to the end of the chord. 
	 * Useful when you don't need to play an actual chord
	 * @param a MusicalAtom to be added. Must not be null. Must 
	 * 	obey the meter of the piece.
	 */
	public void addAtom(MusicalAtom a){
		List<MusicalAtom> singleAtomList = new ArrayList<MusicalAtom>();
		singleAtomList.add(a);
		addAtom(singleAtomList);
	}
	
	/**
	 * @see Sequence.java spec
	 */
	@Override
	public IntPair getShortestLength() {
		// @cr dalitso your old implementation rechecked the whole array,
		// even though we're keeping track of this data at the time of addAtom()
		return this.shortestLength;
	}
	
	/**
	 * Requires that addAtom() be called at least once prior. 
	 * @see Sequence.java spec
	 */
	@Override
	public List<MusicalAtom> getSequence() {
		List<MusicalAtom> sequence =  new ArrayList<MusicalAtom>();
		// @cr garbage. this method can probably be dropped from the interface
		// We can rename getUnderlyingRep() to getSequence.
		for (MusicalAtom atom: this.atoms.get(0)){ 
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

	/**
	 * addAtom() must be called at least once
	 * See spec in @see Sequence.java
	 */
	@Override
	public int getNumberOfBeats() {
		double numberOfBeats = 0;
		for (List<MusicalAtom> simul : this.atoms){
			numberOfBeats += simul.get(0).getLength().getValue();
		}
		return (int) Math.round(numberOfBeats);
	}

	@Override
	public List<List<MusicalAtom>> getUnderlyingRep() {
		List<List<MusicalAtom>> rep = new ArrayList<List<MusicalAtom>>();
		for (List<MusicalAtom> m : this.atoms){
			List<MusicalAtom> simul = new ArrayList<MusicalAtom>();
			for (MusicalAtom ma : m){
				simul.add(ma.clone());
			}
			rep.add(simul);
		}
		return rep;
	}
	
	@Override
	public Chord clone() {
		Chord clone = new Chord(this.length.clone());
		for (List<MusicalAtom> m : this.atoms){
			List<MusicalAtom> simul = new ArrayList<MusicalAtom>();
			for (MusicalAtom ma : m){
				simul.add(ma.clone());
			}
			clone.addAtom(simul);
		}
		return clone;
	}
	
}
