package sound;

import java.util.Map;

public abstract class MusicalAtom {
	private Pitch pitch;
	private IntPair lengthCoeff;

	public IntPair getLength(){
		return this.lengthCoeff;
	};
	public void setAccidental(Map<Integer, Integer> accidentals){
		int key =  this.pitch.toMidiNote();
		if(accidentals.containsKey(key)){
			this.pitch =  this.pitch.accidentalTranspose(accidentals.get(key));
				}		
	};
	public void setLyrics(String syllableLyric){};
	public Pitch getPitch(){
		return this.pitch;
	}

//	@Override 
//	public boolean equals(Object that){
//		return false 
//	}; 
//	@Override 
//	public int hashCode(){};
	@Override 
	public String toString(){
		return this.pitch.toString();
		};

}
