package sound;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.Pair;

public class Chord implements Sequence{
	private final List<MusicalAtom> atoms;
	
	public Chord(){
		this.atoms =  new ArrayList<MusicalAtom>();
	}
	
	public void addAtom(MusicalAtom atom){
		this.atoms.add(atom);
	}
	
	@Override
	public Pair<Integer, Integer> getShortestLength() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MusicalAtom> getSequence() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
