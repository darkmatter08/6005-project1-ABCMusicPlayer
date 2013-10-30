package sound;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @category no_didit
 * @author jains
 *
 */
public class PieceWalkerTest {
	
	/**
	 * Testing Strategy:
	 * 	- Sequential notes
	 *  - Notes in a chord
	 *  - Sequential notes in different voices (different rhythms 
	 *  	in the voices)
	 *  - Notes in a chord in different voices (different rhythms
	 *  	in the voices)
	 *  - Lyrics in all of the previous
	 *  - Rests and Notes in chords in a measure
	 */
	
	@Test
	public void sequentialNotesTest() {
		Piece amazingGrace = new Piece(KeySignature.C, 200, "Amazing Grace", new IntPair(3, 4), new IntPair(1, 8));
		
		List<Measure> measures = new ArrayList<Measure>();
		
		Measure m;
		
		// Measure 1
		m = new Measure();
		measures.add(m);
		Chord c;
		c = new Chord(new IntPair(4, 1)); c.addAtom(new Rest(new IntPair(4, 1))); m.addChord(c);
		addPitchToMeasure(new Pitch('D'), new IntPair(2, 1), m, "A");
		
		// Measure 2
		m = new Measure();
		measures.add(m);
		addPitchToMeasure(new Pitch('G'), new IntPair(4, 1), m, "ma");
		addPitchToMeasure(new Pitch('B'), new IntPair(1, 1), m, "zing");
		addPitchToMeasure(new Pitch('G'), new IntPair(1, 1), m);
		
		// Measure 3
		m = new Measure();
		measures.add(m);
		addPitchToMeasure(new Pitch('B'), new IntPair(4, 1), m, "grace!");
		addPitchToMeasure(new Pitch('A'), new IntPair(2, 1), m, "How");
		
		// Measure 4
		m = new Measure();
		measures.add(m);
		addPitchToMeasure(new Pitch('G'), new IntPair(4, 1), m, "Sweet");
		addPitchToMeasure(new Pitch('E'), new IntPair(2, 1), m, "the");
		
		// Measure 5
		m = new Measure();
		measures.add(m);
		addPitchToMeasure(new Pitch('D'), new IntPair(4, 1), m, "Sound");
		addPitchToMeasure(new Pitch('D'), new IntPair(2, 1), m, "That");
		
		// Measure 6
		m = new Measure();
		measures.add(m);
		addPitchToMeasure(new Pitch('G'), new IntPair(4, 1), m, "Saved");
		addPitchToMeasure(new Pitch('B'), new IntPair(1, 1), m, "a");
		addPitchToMeasure(new Pitch('G'), new IntPair(1, 1), m);
		
		// Measure 7
		m = new Measure();
		measures.add(m);
		addPitchToMeasure(new Pitch('B'), new IntPair(4, 1), m, "Wretch");
		addPitchToMeasure(new Pitch('A'), new IntPair(2, 1), m, "Like");
		
		// Measure 7
		m = new Measure();
		measures.add(m);
		addPitchToMeasure(new Pitch('D').octaveTranspose(1), new IntPair(8, 1), m, "me");
		
		for (Measure meas : measures)
			amazingGrace.addMeasure(meas);
		PieceWalker.walkPiece(amazingGrace);
	}
	
	private void addChordToMeasure(List<Pitch> pitches, IntPair length, Measure m, List<String> lyrics) {
		for (int i = 0; i < pitches.size(); i++){
			Pitch pitch = pitches.get(i);
			Chord c = new Chord(length); c.addAtom(new Note(pitch, length)); 
			if (!(lyrics.get(i) == null))
				c.addLyrics(lyrics.get(i));
			m.addChord(c);
		}
//		for (Pitch pitch : pitches){
//			Chord c = new Chord(length); c.addAtom(new Note(pitch, length)); m.addChord(c);
//		}	
	}
	
	private void addPitchToMeasure(Pitch pitch, IntPair length, Measure m, String lyric) {
		List<Pitch> pitches = new ArrayList<Pitch>();
		List<String> lyrics = new ArrayList<String>();
		pitches.add(pitch);
		lyrics.add(lyric);
		addChordToMeasure(pitches, length, m, lyrics);
	}
	
	private void addPitchToMeasure(Pitch pitch, IntPair length, Measure m) {
		List<Pitch> pitches = new ArrayList<Pitch>();
		List<String> lyrics = new ArrayList<String>();
		pitches.add(pitch);
		lyrics.add(null);
		addChordToMeasure(pitches, length, m, lyrics);
	}

}
