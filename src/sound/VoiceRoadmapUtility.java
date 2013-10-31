package sound;

import java.util.List;
import java.util.ArrayList;

/**
 * @cr TODO repeat of whole song should repeat second ending. 
 */

/**
 * A utility class to linearize the music
 * @author jains
 *
 */
public class VoiceRoadmapUtility {
	
	// @cr don't know if I need static
	// The demarcations
	public static final String BR = ":|";
	public static final String FR = "|:";
	public static final String FE = "[1";
	public static final String SE = "[2";
	public static final String DB = "||";
	
	private List<Object> queue = new ArrayList<Object>();
	private int pointer;
	
	public VoiceRoadmapUtility() {
		pointer = 0;
	}
	
	/**
	 * Adds a measure to the song. Must not be null
	 * @param m Measure to be added
	 */
	public void addMeasure(Measure m) {
		queue.add(m);
	}
	
	/**
	 * A demarcation represents a significant element for the musical roadmap.
	 * 	Includes: 
	 * 		"BR" - ":|" - BackwardsRepeat
	 * 		"FR" - "|:" - ForwardsRepeat
	 * 		"FE" - "[1" - FirstEnding
	 * 		"SE" - "[2" - SecondEnding
	 * 		"DB" - "||" - DoubleBar
	 * 	Accessed as public instance fields of this class. 
	 * @param demarcation String demarcation
	 */
	public void addDemarcation(String demarcation) {
		assert demarcation.equals(BR) || demarcation.equals(FR) || demarcation.equals(FE) 
			|| demarcation.equals(SE) || demarcation.equals(DB);
		queue.add(demarcation);
	}
	
	/**
	 * Linearizes the song. Can only be called once over the lifetime of the VoiceRoadmapUtility
	 * 	Object and return a correct result. 
	 * 	Must call addMeasure at least once before calling it.
	 * @return List<Meaure> representing a linearized version of the song
	 */
	public List<Measure> linearize() {
		assert queue.size() > 0;
		
		boolean inMulEnding = false;
		List<Measure> linearTune = new ArrayList<Measure>();
		
		while(pointer < queue.size()){
			
			Object next;
			if (inMulEnding)
				next = pop();
			else
				next = peek();
			
			
			if (next instanceof Measure){
				linearTune.add((Measure) next);
			}
			
			else {
				String nextStr = (String) next;
				if (nextStr.equals(FR)) { /* Skip FR on way in */ }
				
				else if (nextStr.equals(BR)){
					
					if (inMulEnding)
						inMulEnding = false;
					else{
						changeTo(FR);
					}
					movePointerToBeginningOfRepeatSection();
					pointer--; // counteracts the effect of incrementing the pointer afterwards
				}
				
				else if (nextStr.equals(SE)) { /* Skip second ending demarcator */ }
				
				else if (nextStr.equals(FE)) {
					delete();
					pointer--;
					inMulEnding = true;
				}
				
				else if (nextStr.equals(DB)) { /* Skip double bar */ }
			}
			pointer++;
		}
		
		return linearTune;
	}
	
	private Object pop() {
		// pointer remains in place
		Object next = queue.get(pointer);
		queue.remove(pointer);
		pointer--;
		return next;
	}
	
	private Object peek() {
		//pointer jumps 1
		Object next = queue.get(pointer);
		//pointer++;
		return next;
	}
	
	private void delete() {
//		// decrement pointer by 1 because we will pop or peek in the next round.
//		pointer--;
		// pointer remains in place because next will be assigned to where 
		// the pointer currently is, ie at a new element.
		queue.remove(pointer);
	}
	
	private void changeTo(Object o){
		queue.set(pointer, o);
	}
	
	/**
	 * Moves the pointer to the beginning of the repeated section. 
	 * Will find first FR, DB, or the beginning of the song, in that order
	 */
	private void movePointerToBeginningOfRepeatSection() {
		int pos; 
		for(pos = pointer - 1; pos >= 0; pos--){
			Object currentObject = queue.get(pos);
			if (!(currentObject instanceof Measure)){
				String currentString = (String) currentObject;
				if (currentString.equals(FR) || currentString.equals(DB)){
					pointer = pos; // we will skip this position when we start again.
					return;
				}
			}
			else if (pos == 0) { //is the first measure of the song.
				pointer = pos; 
				return;
			}
		}
	}
	
	public String toString() {
		return queue.toString();
	}
}
