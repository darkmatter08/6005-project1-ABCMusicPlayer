package sound;

import java.util.List;

/**
 * Interface that represents a musical sequence. 
 * @author jains dalitso
 *
 */
public interface Sequence {
	
	// This will recursively search for the shortest length note in the 
	// AST and return a pair of (numerator, denominator)
	/**
	 * @return IntPair that represents the shortest length MusicalAtom
	 * 	of the Sequence
	 */
	public IntPair getShortestLength();  
	
	/**
	 * @return List<MusicalAtom> A list of MusicalAtoms that represents
	 * 	the Sequence. 
	 */
	public List<MusicalAtom> getSequence();  
	
	/**
	 * The equality method. Two sequences are equal if they are represented by 
	 * 	the same sequence of MusicalAtoms.
	 * 	Obeys reflexiveness, transitivity, invariance
	 * @param that Object to be compared to.
	 * @return boolean true if the objects are equal, false otherwise.
	 */
	@Override public boolean equals(Object that); 
	
	/**
	 * Two equal objects will have the same hashCode.
	 * Two different objects will have unique hashCodes.
	 * @return int hashCode representing the Sequence
	 */
	@Override public int hashCode();  
	
	/**
	 * @return String representing the Sequence
	 */
	@Override public String toString();
}
