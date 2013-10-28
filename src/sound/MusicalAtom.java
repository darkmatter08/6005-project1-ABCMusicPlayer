package sound;

import java.util.Map;

public abstract class MusicalAtom implements Cloneable {
	private Pitch pitch;
	private IntPair lengthCoeff;
	
	public MusicalAtom(){}
	
	public MusicalAtom(Pitch p, IntPair length) {
		pitch = p.clone();
		lengthCoeff = length.clone();
	}
	
	public IntPair getLength(){
		return this.lengthCoeff;
	};
	public void setAccidental(Map<Integer, Integer> accidentals){
		int key =  this.pitch.toMidiNote();
		if(accidentals.containsKey(key)){
			this.pitch =  this.pitch.accidentalTranspose(accidentals.get(key));
				}		
	};
	abstract void setLyrics(String syllableLyric);
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
	
	public abstract MusicalAtom clone();
//	{
//		return new MusicalAtom(this.pitch.clone(), this.lengthCoeff.clone());
//	}

}
