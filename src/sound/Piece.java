package sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Piece implements Sequence{
	private final String title;
	private final String RESERVED_DEFAULT_VOICE = "RESERVED_DEFAULT_VOICE";

	// meter.numerator is beats/meter
	// 1/(meter.denominator) is the note that gets 1 beat
	private IntPair meter = new IntPair(4,4); // @cr how come we don't require clients to pass this in? Does it only matter for malformed inputs?
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
	 * @param voiceString name of the voice that's associated with this measure. 
	 * 	Must not be equal to "RESERVED_DEFAULT_VOICE" 
	 * @param m Measure to be appended. Must not be null. Must obey the meter
	 * 	of the piece. 
	 */
	public void addMeasure(String voiceString, Measure m){
		// @cr we need an assert showing that m has the correct # of beats
//		if (this.measures.size() != 0)
//			assert m.getNumberOfBeats() == this.getNumberOfBeats(); 
		if (this.voiceMap.containsKey(voiceString)){
			Voice voice = this.voiceMap.get(voiceString);
			voice.addMeasure(m);
		}
		else{
			Voice newVoice = new Voice();
			newVoice.addMeasure(m.clone());
			this.voiceMap.put(voiceString, newVoice);
		}
		
		if (this.voiceMap.size() == 1){
			this.shortestLength = m.getShortestLength();
		}
		else{
			if (m.getShortestLength().getValue() < this.shortestLength.getValue()){
				this.shortestLength = m.getShortestLength();
			}
		}
		
	}
	
	/**
	 * Append a measure to this piece. Only one of the addMeasure() methods can be called over the 
	 * 	lifetime of this Piece Object. 
	 * @param m Measure to add to the Piece
	 */
	public void addMeasure(Measure m) {
		addMeasure(RESERVED_DEFAULT_VOICE, m);
	}
	
	/**
	 * Gets the key signature of the Piece
	 * @return KeySignature the KeySignature enum type that represents the
	 * 	key signature.
	 */
	public KeySignature getKeySig() {
		return this.keySig;
	}
	
	/**
	 * @return List<List<Chord>> returns a sequence of that represent the song's 
	 * notes and rests. Each List contains a List<Chord> of all Chords associated with a voice. 
	 */	
	public List<List<Chord>> getSequence() {
		List<List<Chord>> sequence =  new ArrayList<List<Chord>>(); 
		for (Voice v : this.voiceMap.values()){ // v.getSequence should be returning a clone.
			sequence.add(v.getSequence());
		}
		return sequence;
	}
	
	/**
	 * addMeasure() must be called at least once before getShortestLength is called.
	 * Used to calculate the ticksPerBeat
	 * @return IntPair representing the shortest MusicalAtom's coefficient.
	 */
	@Override
	public IntPair getShortestLength() {
		// verify that addMeasure() has been called at least once
		assert this.voiceMap.size() > 0; 
		return this.shortestLength;
	}
	
	/**
	 * See spec in @see Sequence.java
	 */
	@Override
	public String toString(){
		return this.getSequence().toString();
	}
	
//	/**
//	 * @cr implement later
//	 */
//	@Override
//	public int hashCode(){
//		
//		return 0
//	}
	
	/**
	 * addMeasure() must be called at least once
	 * See spec in @see Sequence.java
	 */
//	@Override
//	public int getNumberOfBeats() {
//		double result = 0;
//		for(Voice v: this.voiceMap.values()){
//			result += v.getNumberOfBeats();
//		}
//		result += this.voice.getNumberOfBeats();
//
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
	
	/**
	 * @cr fix this later
	 */
//	@Override
//	public Piece clone() {
//		Piece clone = new Piece(this.keySig, this.tempo, this.title, this.meter.clone(), this.defaultLength.clone());
//		Map<String, Voice> cloneMap = new HashMap<String, Voice>();
//		for (String key : this.voiceMap.keySet()) {
//			clone.addMeasure(key, voiceMap.get(key).clone());
//		}
//		
//		return clone;
//	}
}
