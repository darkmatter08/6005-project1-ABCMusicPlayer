package sound;

import java.util.Map;

public abstract class MusicalAtom implements Cloneable {

	private IntPair lengthCoeff;
	private String syllableLyric;
	
	public MusicalAtom(){}
	
	public MusicalAtom(IntPair length) {
		lengthCoeff = length.clone();
	}
	
	public IntPair getLength(){
		return this.lengthCoeff;
	}
	
	// This attaches a lyric to the note. lyrics will be matched during 
	// the exitMeasure() method of the listener.
	public void setLyrics(String syllableLyric){
		this.syllableLyric = syllableLyric;
	}
	
	public String getLyrics(){
		return this.syllableLyric;
	}
	
	public abstract MusicalAtom clone();
	
	abstract public String toString();
}
