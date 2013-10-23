package sound;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

public class Chord implements Sequence{
	private final List<MusicalAtom> atoms;
	private final IntPair length;
	private IntPair shortestLength;
	
	public Chord(IntPair length){
		this.atoms =  new ArrayList<MusicalAtom>();
		this.length = length;
	}
	
	public void addAtom(MusicalAtom atom){
		this.atoms.add(atom);
		if (this.atoms.size() == 1){
			this.shortestLength = atom.getLength();
		}
		else{
			if (atom.getLength().value < this.shortestLength.value){
				this.shortestLength = atom.getLength();
			}
		}
	}
	
	@Override
	public IntPair getShortestLength() {
		// TODO Auto-generated method stub
		MusicalAtom shortestAtom = null;
		double shortestLength = Double.POSITIVE_INFINITY;
		for (MusicalAtom atom: atoms){
			if (atom.getLength().value < shortestLength){
				shortestLength = atom.getLength().value;
				shortestAtom = atom;
			}
		}
		return shortestAtom.getLength();
	}

	@Override
	public List<MusicalAtom> getSequence() {
		// TODO Auto-generated method stub
		List<MusicalAtom> sequence =  new ArrayList<MusicalAtom>();
		for (MusicalAtom atom: this.atoms){
			sequence.add(atom);
		}
		return sequence;
	}
	
	@Override
	public String toString(){
		List<MusicalAtom> sequence = this.getSequence();
		return sequence.toString();
	}
	

}
