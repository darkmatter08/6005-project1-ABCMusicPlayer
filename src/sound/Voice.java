package sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Voice implements Sequence {

	private final List<Chord> chords;
	private final Map <Integer, Integer> accidentals; // This store a dictionary with note as key and it the associated accidental as the value 
	private IntPair shortestLength;
	public Voice() {
		this.chords = new ArrayList<Chord>();
		this.accidentals = new HashMap<Integer, Integer>();
	}
	
	public void addAccidental(char accidental){
		this.accidentals.put(0, 0); //this is just a place holder
		
	}
	public void addChord(Chord chord){
		this.chords.add(chord);
		if (this.chords.size() == 1){
			this.shortestLength = chord.getShortestLength();
		}
		else{
			if (chord.getShortestLength().value < this.shortestLength.value){
				this.shortestLength = chord.getShortestLength();
			}
		}
		
	} // This will take a chord and add it to the chords
	@Override
	public IntPair getShortestLength() {
		// TODO Auto-generated method stub
		return this.shortestLength;
	}

	@Override
	public List<MusicalAtom> getSequence() {
		// TODO Auto-generated method stub
		List<MusicalAtom> sequence =  new ArrayList<MusicalAtom>();
		for (Chord chord: this.chords){
			for (MusicalAtom atom: chord.getSequence()){
				sequence.add(atom);
			}
		}
		return sequence;
	}
// TODO implement equals and hashCode
//	@Override 
//	public boolean equals(Object that){}; 
//	@Override
//	public int hashCode(){};
}
