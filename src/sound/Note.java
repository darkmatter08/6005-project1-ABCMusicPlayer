package sound;

import java.util.Map;

public class Note extends MusicalAtom{
	
	private Pitch pitch;
	private IntPair lengthCoeff;
	private String syllableLyric;

	public Note(Pitch pitch, IntPair length) {
		super(pitch, length);
		this.lengthCoeff = length;
		this.pitch = pitch;
		// This will initialize the class with the parse note pitch with the length of length
	}
	
	public Pitch getPitch(){
		return this.pitch;
	}
	public IntPair getLength(){
		return this.lengthCoeff;// This will get the length of the note
	}
	public void setAccidental(Map<Integer, Integer> accidentals) {
		int key = this.pitch.toMidiNote();
		if (accidentals.containsKey(key)){
			this.pitch = this.pitch.accidentalTranspose(accidentals.get(key));
		}		
		// This sets the accidental.
	}
	public void setLyrics(String syllableLyric){
		this.syllableLyric = syllableLyric;// This attaches a lyric to the note. lyrics will be matched during the exitMeasure() method of the listener.
	}
	
	public String getLyrics(){
		return this.syllableLyric;
	}
	
	@Override 
	public String toString(){
		return this.pitch.toString();
	}

	@Override
	public Note clone() {
		Note clone = new Note(this.pitch.clone(), this.lengthCoeff.clone());
		clone.setLyrics(this.getLyrics());
		return clone;
	}
}
