package sound;

public class Rest extends MusicalAtom{
	private String syllableLyric;
	public Rest clone(){
		return new Rest(super.getLength().clone());
	}
	public Rest(IntPair length) {
		super(length);		
	}
	public void setLyrics(String syllableLyric){
		this.syllableLyric = syllableLyric;
	}
	public String getLyrics(){
		return this.syllableLyric;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
}
