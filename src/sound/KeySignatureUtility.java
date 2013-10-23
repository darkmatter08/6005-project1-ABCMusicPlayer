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
	
	private static final Map<KeySignature, Map<Pitch, Integer>> KEYSIGMAP = 
			makeMap();
	
	/**
	 * Constructs the KEYSIG map. Following the rule of fifths, adds 
	 * Major and Minor keys
	 * @return
	 */
	private static Map<KeySignature, Map<Pitch, Integer>> makeMap(){
		Map<KeySignature, Map<Pitch, Integer>> keySigMap = 
				new HashMap<KeySignature, Map<Pitch, Integer>>();
		
		// MAJOR SHARP KEYS - C, G, D, A, E, B, F#
		// Order of sharps - F C G D A E B
		List<Character> sharpKey = new ArrayList<Character>();
		// C Major - A Minor
		addKey(KeySignature.C, sharpKey, true, keySigMap);
		addKey(KeySignature.Am, sharpKey, true, keySigMap);
		
		// G Major - E Minor
		sharpKey.add('F');
		addKey(KeySignature.G, sharpKey, true, keySigMap);
		addKey(KeySignature.Em, sharpKey, true, keySigMap);
		
		// D Major - B Minor
		sharpKey.add('C');
		addKey(KeySignature.D, sharpKey, true, keySigMap);
		addKey(KeySignature.Bm, sharpKey, true, keySigMap);
		
		// A Major - F# Minor
		sharpKey.add('G');
		addKey(KeySignature.A, sharpKey, true, keySigMap);
		addKey(KeySignature.Fsm, sharpKey, true, keySigMap);
		
		// E Major - C# Minor
		sharpKey.add('D');
		addKey(KeySignature.E, sharpKey, true, keySigMap);
		addKey(KeySignature.Csm, sharpKey, true, keySigMap);
		
		// B Major - G# Minor
		sharpKey.add('A');
		addKey(KeySignature.B, sharpKey, true, keySigMap);
		addKey(KeySignature.Gsm, sharpKey, true, keySigMap);
		
		// F# Major - D# Minor
		sharpKey.add('E');
		addKey(KeySignature.Fs, sharpKey, true, keySigMap);
		addKey(KeySignature.Dsm, sharpKey, true, keySigMap);
		
		// MAJOR FLAT KEYS - F, Bb, Eb, Ab, Db, Gb
		// Order of flats - B E A D G C F
		List<Character> flatKey = new ArrayList<Character>();
		
		// F Major - D Minor
		flatKey.add('B');
		addKey(KeySignature.F, flatKey, false, keySigMap);
		addKey(KeySignature.Dm, flatKey, false, keySigMap);
		
		// Bb Major - G Minor
		flatKey.add('E');
		addKey(KeySignature.Bb, flatKey, false, keySigMap);
		addKey(KeySignature.Gm, flatKey, false, keySigMap);
		
		// Eb Major - C Minor
		flatKey.add('A');
		addKey(KeySignature.Eb, flatKey, false, keySigMap);
		addKey(KeySignature.Cm, flatKey, false, keySigMap);
		
		// Ab Major - F Minor
		flatKey.add('D');
		addKey(KeySignature.Ab, flatKey, false, keySigMap);
		addKey(KeySignature.Fm, flatKey, false, keySigMap);
		
		// Db Major - Bb Minor
		flatKey.add('G');
		addKey(KeySignature.Db, flatKey, false, keySigMap);
		addKey(KeySignature.Bbm, flatKey, false, keySigMap);
		
		// Gb Major - Eb Minor
		flatKey.add('C');
		addKey(KeySignature.Gb, flatKey, false, keySigMap);
		addKey(KeySignature.Ebm, flatKey, false, keySigMap);
		
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
	private static void addKey(KeySignature scale, List<Character> keys, boolean isSharp, Map<KeySignature, Map<Pitch, Integer>> keySig){
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
	public static Pitch getAdjustedPitch(KeySignature s, Pitch rawPitch){
		assert KEYSIGMAP.containsKey(s);
		Map<Pitch, Integer> currentKeySig = KEYSIGMAP.get(s);
		int adjustment = 0;
		if(currentKeySig.containsKey(rawPitch))
			adjustment = currentKeySig.get(rawPitch);
		Pitch adjustedPitch = rawPitch.accidentalTranspose(adjustment);
		return adjustedPitch;
	}
}