package sound;

import java.util.Map;

public abstract class MusicalAtom implements Cloneable {

	private IntPair lengthCoeff;
	
	public MusicalAtom(){}
	
	public MusicalAtom(IntPair length) {
		lengthCoeff = length.clone();
	}
	
	public IntPair getLength(){
		return this.lengthCoeff;
	}
	
	public abstract MusicalAtom clone();
	
	abstract public String toString();
}
