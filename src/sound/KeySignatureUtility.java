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
	
	private final Map<String, Map<Pitch, Integer>> KEYSIG = 
			makeMap();
	
	/**
	 * Constructs the KEYSIG map. Following the rule of fifths, adds 
	 * Major and Minor keys
	 * @return
	 */
	private Map<String, Map<Pitch, Integer>> makeMap(){
		Map<String, Map<Pitch, Integer>> keySigMap = new HashMap<String, Map<Pitch, Integer>>();
		
		// MAJOR KEYS
		
		// SHARP KEYS - C, G, D, A, E, B, F#
		// Order of sharps - F C G D A E B
		List<Character> sharpKey = new ArrayList<Character>();
		// C Major
		addKey("C", sharpKey, true, keySigMap);
		
		// G Major
		sharpKey.add('F');
		addKey("G", sharpKey, true, keySigMap);
		
		// D Major
		sharpKey.add('C');
		addKey("D", sharpKey, true, keySigMap);
		
		// A Major
		sharpKey.add('G');
		addKey("A", sharpKey, true, keySigMap);
		
		// E Major
		sharpKey.add('D');
		addKey("E", sharpKey, true, keySigMap);
		
		// B Major
		sharpKey.add('A');
		addKey("B", sharpKey, true, keySigMap);
		
		// F# Major
		sharpKey.add('E');
		addKey("F#", sharpKey, true, keySigMap);
		
		// FLAT KEYS - F, Bb, Eb, Ab, Db, Gb
		// Order of flats - B E A D G C F
		List<Character> flatKey = new ArrayList<Character>();
		
		// F Major
		flatKey.add('B');
		addKey("F", flatKey, false, keySigMap);
		
		// Bb Major
		flatKey.add('E');
		addKey("Bb", flatKey, false, keySigMap);
		
		// Eb Major
		flatKey.add('A');
		addKey("Eb", flatKey, false, keySigMap);
		
		// Ab Major
		flatKey.add('D');
		addKey("Ab", flatKey, false, keySigMap);
		
		// Db Major
		flatKey.add('G');
		addKey("Db", flatKey, false, keySigMap);
		
		// Gb Major
		flatKey.add('C');
		addKey("Gb", flatKey, false, keySigMap);
		
		return keySigMap;
	}
	
	/**
	 * Helper method that constructs a Map<Pitch, Integer> from keys, putting the
	 * result in keySig with they key being scale. 
	 * @param scale The scale that is the key to the value of the new Map
	 * @param keys
	 * @param isSharp
	 * @param keySig
	 */
	private void addKey(String scale, List<Character> keys, boolean isSharp, Map<String, Map<Pitch, Integer>> keySig){
		Map<Pitch, Integer> newScale = new HashMap<Pitch, Integer>();
		for(Character key: keys){
			int adjustment = 1;
			if(!isSharp)
				adjustment = -1;
			newScale.put(new Pitch(key), new Integer(adjustment));
		}
		keySig.put(scale, newScale);
	}
	
	public Pitch getAdjustedPitch(KeySignature s, Pitch rawPitch){
		return null;
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