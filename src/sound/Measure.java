package sound;

import java.util.ArrayList;
import java.util.List;

public class Measure implements Sequence {
	private final List<Voice> voices;
	private IntPair shortestLength;
	
	public Measure(){
		this.voices = new ArrayList<Voice>();
	}
	public void addVoice(Voice voice){
		this.voices.add(voice);
		if (this.voices.size() == 1){
			this.shortestLength = voice.getShortestLength();
		}
		else{
			if (voice.getShortestLength().value < this.shortestLength.value){
				this.shortestLength = voice.getShortestLength();
			}
		}
	}
	@Override
	public IntPair getShortestLength() {
		// TODO Auto-generated method stub
		return shortestLength;
	}

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

}
