package sound;

public class Rest extends MusicalAtom{
	public Rest clone(){
		Rest clone = new Rest(super.getLength().clone());
		clone.setLyrics(getLyrics());
		return clone;
	}
	public Rest(IntPair length) {
		super(length);		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "REST:" + getLength().numerator + "/" + getLength().denominator;
	}
}
