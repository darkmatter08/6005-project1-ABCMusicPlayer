package sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.Pair;

public class Voice implements Sequence {

	private final List<Chord> chords;
	private final Map <Integer, Integer> accidentals; // This store a dictionary with note as key and it the associated accidental as the value 
	
	public Voice() {
		this.chords = new ArrayList<Chord>();
		this.accidentals = new HashMap<Integer, Integer>();
	}
	
	public void addAccidental(char accidental){
		this.accidentals.put(0, 0); //this is just a place holder
		
	}
	public void addChord(Chord chord){
		this.chords.add(chord);
		
	} // This will take a chord and add it to the chords
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
// TODO implement equals and hashCode
//	@Override 
//	public boolean equals(Object that){}; 
//	@Override
//	public int hashCode(){};
}
