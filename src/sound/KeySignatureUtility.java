package sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Utility class that allows a client to retrieve a pitch's 
 * 'adjustment'/'key signature accidental' given a key signature. 
 * @author jains
 *
 */
public final class KeySignatureUtility {
	
	private final Map<KeySignature, Map<Pitch, Integer>> KEYSIG = 
			makeMap();
	
	/**
	 * Constructs the KEYSIG map. Following the rule of fifths, adds 
	 * Major and Minor keys
	 * @return
	 */
	private Map<KeySignature, Map<Pitch, Integer>> makeMap(){
		Map<KeySignature, Map<Pitch, Integer>> keySigMap = new HashMap<KeySignature, Map<Pitch, Integer>>();
		
		// MAJOR KEYS
		
		// SHARP KEYS - C, G, D, A, E, B, F#
		// Order of sharps - F C G D A E B
		List<Character> sharpKey = new ArrayList<Character>();
		// C Major
		addKey(KeySignature.C, sharpKey, true, keySigMap);
		
		// G Major
		sharpKey.add('F');
		addKey(KeySignature.G, sharpKey, true, keySigMap);
		
		// D Major
		sharpKey.add('C');
		addKey(KeySignature.D, sharpKey, true, keySigMap);
		
		// A Major
		sharpKey.add('G');
		addKey(KeySignature.A, sharpKey, true, keySigMap);
		
		// E Major
		sharpKey.add('D');
		addKey(KeySignature.E, sharpKey, true, keySigMap);
		
		// B Major
		sharpKey.add('A');
		addKey(KeySignature.B, sharpKey, true, keySigMap);
		
		// F# Major
		sharpKey.add('E');
		addKey(KeySignature.Fs, sharpKey, true, keySigMap);
		
		// FLAT KEYS - F, Bb, Eb, Ab, Db, Gb
		// Order of flats - B E A D G C F
		List<Character> flatKey = new ArrayList<Character>();
		
		// F Major
		flatKey.add('B');
		addKey(KeySignature.F, flatKey, false, keySigMap);
		
		// Bb Major
		flatKey.add('E');
		addKey(KeySignature.Bb, flatKey, false, keySigMap);
		
		// Eb Major
		flatKey.add('A');
		addKey(KeySignature.Eb, flatKey, false, keySigMap);
		
		// Ab Major
		flatKey.add('D');
		addKey(KeySignature.Ab, flatKey, false, keySigMap);
		
		// Db Major
		flatKey.add('G');
		addKey(KeySignature.Db, flatKey, false, keySigMap);
		
		// Gb Major
		flatKey.add('C');
		addKey(KeySignature.Gb, flatKey, false, keySigMap);
		
		return keySigMap;
	}
	
	/**
	 * Helper method that constructs a Map<Pitch, Integer> from keys, putting the
	 * result in keySig with they key being scale. 
	 * @param scale The KeySignature that is the key to the value of the new Map
	 * @param keys
	 * @param isSharp
	 * @param keySig
	 */
	private void addKey(KeySignature scale, List<Character> keys, boolean isSharp, Map<KeySignature, Map<Pitch, Integer>> keySig){
		Map<Pitch, Integer> newScale = new HashMap<Pitch, Integer>();
		for(Character key: keys){
			int adjustment = 1;
			if(!isSharp)
				adjustment = -1;
			newScale.put(new Pitch(key), new Integer(adjustment));
		}
		keySig.put(scale, newScale);
	}
	
	/**
	 * Allows you to get a new Pitch that is adjusted according to 
	 * the KeySignature s.
	 * @param s The KeySignature you are applying to the rawPitch
	 * @param rawPitch The Pitch that a keySignature is applied to.
	 * @return a Pitch that is adjusted according to the keySignature
	 */
	public Pitch getAdjustedPitch(KeySignature s, Pitch rawPitch){
		assert KEYSIG.containsKey(s);
		int adjustment = KEYSIG.get(s).get(rawPitch);
		Pitch adjustedPitch = rawPitch.accidentalTranspose(adjustment);
		return adjustedPitch;
	}
}

// Old Code - not sure about how object refs will affect the addMajorKey method

//public KeySignature(){
//	// MAJOR SCALES
//	// C Major
//	Map<Pitch, Integer> keyC = new HashMap<Pitch, Integer>();
//	KEYSIG.put("C", keyC);
//	
//	// G Major
//	Map<Pitch, Integer> keyG = new HashMap<Pitch, Integer>();
//	keyG.put(new Pitch('F'), new Integer(1));
//	KEYSIG.put("G", keyG);
//	
//	// D Major
//	Map<Pitch, Integer> keyD = new HashMap<Pitch, Integer>();
//	keyD.put(new Pitch('F'), new Integer(1));
//	keyD.put(new Pitch('C'), new Integer(1));
//	KEYSIG.put("D", keyD);
//	
//	// A Major
//	Map<Pitch, Integer> keyA = new HashMap<Pitch, Integer>();
//	keyA.put(new Pitch('F'), new Integer(1));
//	keyA.put(new Pitch('C'), new Integer(1));
//	keyA.put(new Pitch('G'), new Integer(1));
//	KEYSIG.put("A", keyA);
//	
//	// E Major
//	Map<Pitch, Integer> keyE = new HashMap<Pitch, Integer>();
//	keyE.put(new Pitch('F'), new Integer(1));
//	keyE.put(new Pitch('C'), new Integer(1));
//	keyE.put(new Pitch('G'), new Integer(1));
//	keyE.put(new Pitch('G'), new Integer(1));
//	KEYSIG.put("E", keyE);
//}