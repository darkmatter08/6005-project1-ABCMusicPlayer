package sound;

import java.util.Map;

public class Note extends MusicalAtom{
	
	private Pitch pitch;
	private String syllableLyric;
	
	// This will initialize the class with the parse note pitch with the 
	// length of length
	public Note(Pitch pitch, IntPair length) {
		super(length);
		this.pitch = pitch;
		
	}
	
	public Pitch getPitch(){
		return this.pitch;
	}
	
	// This sets the accidental
	public void setAccidental(Map<Integer, Integer> accidentals) {
		int key = this.pitch.toMidiNote();
		if (accidentals.containsKey(key)){
			this.pitch = this.pitch.accidentalTranspose(accidentals.get(key));
		}
	}
	
	// This attaches a lyric to the note. lyrics will be matched during 
	// the exitMeasure() method of the listener.
	public void setLyrics(String syllableLyric){
		this.syllableLyric = syllableLyric;
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
		Note clone = new Note(this.pitch.clone(), super.getLength().clone());
		clone.setLyrics(this.getLyrics());
		return clone;
	}
}
