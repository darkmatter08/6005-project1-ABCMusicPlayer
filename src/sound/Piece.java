package sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Piece implements Sequence{
	//private final List<Measure> measures;
	private final String title;
	private final Voice voice = new Voice();
	
	// @cr Why are so many things initialized to null?
	// meter.numerator is beats/meter
	// 1/(meter.denominator) is the note that gets 1 beat
	private IntPair meter = null; // @cr how come we don't require clients to pass this in? Does it only matter for malformed inputs?
	private IntPair defaultLength = new IntPair(1,1); // @cr how come meter and defaultLength were final?
	private final int tempo;
	private final KeySignature keySig;
	private IntPair shortestLength;
	private final Map<String, Voice> voiceMap = new HashMap<String, Voice>(); 
	
	/**
	 * Constructor for piece. 
	 * @param keySig The keySignature associated with this Piece.  
	 * @param indexNumber An integer describing the track ordering of this Piece.
	 * @param tempo An integer representing the BPM of the defaultLength note. 
	 * @param title String representing the title of the piece
	 * @deprecated
	 */
	public Piece(KeySignature keySig, int tempo, String title) {
		this.keySig = keySig;
		this.tempo = tempo;
		this.title = title;
		//this.measures = new ArrayList<Measure>();
	}
	
//	public void setDefaultLength(int numrator, int denominator){
//		this.defaultLength = new IntPair(numrator, denominator);
//	}
	/**
	 * @cr may need to be removed. 
	 * @deprecated
	 * @return
	 */
	public IntPair getDefaultLength(){
		return this.defaultLength;
	}
	// Constructor that we should be using
	/**
	 * Constructor for Piece. 
	 * @param keySig The keySignature associated with this Piece.
	 * @param tempo int representing the BPM of the defaultLength note. 
	 * @param title String representing the title of the piece
	 * @param meter IntPair representing the meter.
	 * @param defaultLength The default note length (coefficient of 1)
	 */
	public Piece(KeySignature keySig, int tempo, String title, IntPair meter, IntPair defaultLength) {
		this.keySig = keySig;
		this.tempo = tempo;
		this.title = title;
		this.meter = meter;
		this.defaultLength = defaultLength;
		//this.measures = new ArrayList<Measure>();
	}
	
	/**
	 * Gets the tempo
	 * @return an integer representing the BPM. 
	 */
	public int getTempo(){
		return this.tempo;
	}
	
	/**
	 * Adds a measure to the end of the Piece. 
	 * @param m Measure to be appended. Must not be null. Must obey the meter
	 * 	of the piece. 
	 */
	public void addMeasure(String voiceString, Measure m){
		// @cr we need an assert showing that m has the correct # of beats
//		if (this.measures.size() != 0)
//			assert m.getNumberOfBeats() == this.getNumberOfBeats(); 
		if (this.measures.size() == 1){
			this.shortestLength = m.getShortestLength();
		}
		else{
			if (m.getShortestLength().getValue() < this.shortestLength.getValue()){
				this.shortestLength = m.getShortestLength();
			}
		}
		
		if (this.voiceMap.containsKey(voiceString)){
			Voice voice = (Voice) this.voiceMap.get(voiceString);
			voice.addMeasure(m);
		}
		
		//else {
			// this should throw an exception of some type to show that the voice is not found
		//}
	}

	public void addMeasure(Measure m){
		this.voice.addMeasure(m);
		if (this.voice.size() == 1){
			this.shortestLength = m.getShortestLength();
		}
		else{
			if (m.getShortestLength().getValue() < this.shortestLength.getValue()){
				this.shortestLength = m.getShortestLength();
			}
		}
	}	
	/**
	 * Gets the key signature of the Piece
	 * @return KeySignature the KeySignature enum type that represents the
	 * 	key signature.
	 */
	public KeySignature getKeySig(){
		return this.keySig;//This get method will be used to get the keySig attribute
	}
	/**
	 * @return List<MusicalAtom> returns a sequence of MusicalAtoms that 
	 * represent the song's notes and rests. 
	 */
// @old implementation
//	@Override
//	public List<MusicalAtom> getSequence(){
//		List<MusicalAtom> sequence =  new ArrayList<MusicalAtom>();
//		for (Measure measure: this.measures){
//			for (MusicalAtom atom: measure.getSequence()){
//				sequence.add(atom);
//			}
//		}
//		return sequence;
//	}
	
	public List<Chord> getSequence(){
		return this.voice.getSequence();
	}
	
	public List<Chord> getSequence(String voiceString){
		return ((Voice) this.voiceMap.get(voiceString)).getSequence();
		
	}
	
	/**
	 * addMeasure() must be called at least once before getShortestLength is called.
	 * Used to calculate the ticksPerBeat
	 * @return IntPair representing the shortest MusicalAtom's coefficient.
	 */
	@Override
	public IntPair getShortestLength() {
		// verify that addMeasure() has been called at least once
		assert this.measures.size() > 0; 
		// TODO Auto-generated method stub 
		return this.shortestLength;
	}
	
	/**
	 * See spec in @see Sequence.java
	 */
	@Override
	public String toString(){
		return this.getSequence().toString();
	}
	
	/**
	 * addMeasure() must be called at least once
	 * See spec in @see Sequence.java
	 */
//	@Override
//	public int getNumberOfBeats() {
//		int result = 0;
//		for(Measure measure: this.measures){
//			result += measure.getNumberOfBeats();
//		}
//		return result;
//	}

//	@Override
//	public List<Measure> getUnderlyingRep() {
//		List<Measure> rep = new ArrayList<Measure>();
//		for (Measure m : this.measures){
//			rep.add(m.clone());
//		}
//		return rep;
//	}
	
	@Override
	public Piece clone() {
		Piece clone = new Piece(this.keySig, this.tempo, this.title, this.meter.clone(), this.defaultLength.clone());
		for (Measure m : this.measures) {
			clone.addMeasure(m);
		}
		return clone;
	}
}
