package sound;
import java.util.*;

import org.antlr.v4.runtime.misc.Pair;

public interface Sequence {
	public Pair<Integer, Integer>  getShortestLength();  // This will recursively search for the shortest length note in the AST and return a pair of (numerator, denominator)
	public List<MusicalAtom> getSequence(); //This will return a sequence of musical atoms that represent the Sequence.  
	@Override
	public boolean equals(Object that); // The equals method. Two sequences will be equal if they have the same sequence of equal musical Atoms
	@Override
	public int hashCode();  
	@Override
	public String toString();


}
