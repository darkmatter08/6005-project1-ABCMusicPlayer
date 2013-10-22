package sound;

import java.util.Map;

import org.antlr.v4.runtime.misc.Pair;

public abstract class MusicalAtom {
	private Pitch pitch;
	private Pair<Integer, Integer> lengthCoeff;

	public Pair<Integer, Integer> getLength(){
		return this.lengthCoeff;
	};
	public void setAccidental(Map<Integer, Integer> accidentals){
		int key =  this.pitch.toMidiNote();
		if(accidentals.containsKey(key)){
			this.pitch =  this.pitch.accidentalTranspose(accidentals.get(key));
				}		
	};
	public void setLyrics(String syllableLyric){};
	

//	@Override 
//	public boolean equals(Object that){
//		return false 
//	}; 
//	@Override 
//	public int hashCode(){};
//	@Override 
//	public String toString(){};

}
