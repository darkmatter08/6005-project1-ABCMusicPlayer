package sound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class KeySignature {
	
	private final Map<String, Map<Pitch, Integer>> KEYSIG = 
			new HashMap<String, Map<Pitch, Integer>>();
	
	public KeySignature(){
		// MAJOR KEYS
		// C Major
		addKey("C", new ArrayList<Character>(), true);
		
		// G Major
		List<Character> key = new ArrayList<Character>();
		key.add('F');
		addKey("G", key, true);
		
		// D Major
		key.add('C');
		addKey("D", key, true);
		
		// A Major
		key.add('G');
		addKey("A", key, true);
		
		// E Major
		key.add('D');
		addKey("E", key, true);
		
		// B Major
		key.add('A');
		addKey("B", key, true);
		
		// F# Major
		key.add('E');
		addKey("F#", key, true);
	}
	
	private void addKey(String scale, List<Character> keys, boolean isSharp){
		Map<Pitch, Integer> newScale = new HashMap<Pitch, Integer>();
		for(Character key: keys){
			int adjustment = 1;
			if(!isSharp)
				adjustment = -1;
			newScale.put(new Pitch(key), new Integer(adjustment));
		}
		KEYSIG.put(scale, newScale);
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