package sound;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Piece implements Sequence{
	private final List<Measure> measures;
	private final String title;
	private final String composer = null;
	private final IntPair meter = null;
	private final IntPair defaultLength = null;
	private final int tempo;
	private final int indexNumber;
	private final KeySignature keySig; //Key is an enum 
	private IntPair shortestLength;

	public Piece(KeySignature keySig, int indexNumber, int tempo, String title) {
		this.keySig = keySig;
		this.indexNumber = indexNumber;
		this.tempo = tempo;
		this.title = title;
		this.measures = new ArrayList<Measure>();

	}
	
	public int getTempo(){
		return this.tempo;
	}
	public void addMeasure(Measure m){
		this.measures.add(m);
		if (this.measures.size() == 1){
			this.shortestLength = m.getShortestLength();
		}
		else{
			if (m.getShortestLength().value < this.shortestLength.value){
				this.shortestLength = m.getShortestLength();
			}
		}
		// This will take a measure and add it to the measures list.  
	}
	public KeySignature getKeySig(){
		return this.keySig;//This get method will be used to get the keySig attibute
	}
	@Override
	public List<MusicalAtom> getSequence(){
		List<MusicalAtom> sequence =  new ArrayList<MusicalAtom>();
		for (Measure measure: measures){
			for (MusicalAtom atom: measure.getSequence()){
				sequence.add(atom);
			}
		}
		return sequence;
	}
	@Override
	public IntPair getShortestLength() {
		// TODO Auto-generated method stub
		return this.shortestLength;
		
	}


}
 