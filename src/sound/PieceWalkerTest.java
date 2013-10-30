package sound;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	@Test
	public void chordTest() {
		Piece chordTest = new Piece(KeySignature.C, 200, "ChordTest", new IntPair(3, 4), new IntPair(1, 8));
		
		List<Measure> measures = new ArrayList<Measure>();
		Measure m;
		List<Pitch> pitches;
		
		// measure 1
		m = new Measure();
		measures.add(m);
		pitches = Arrays.asList(new Pitch('G'), new Pitch('B'), new Pitch('D'));
		addChordToMeasure(pitches, new IntPair(1, 1), m);
		pitches = Arrays.asList(new Pitch('G'), new Pitch('B'), new Pitch('D'));
		addChordToMeasure(pitches, new IntPair(1, 1), m);
		
		// measure 2
		m = new Measure();
		measures.add(m);
		pitches = Arrays.asList(new Pitch('A'), new Pitch('C'), new Pitch('E'));
		addChordToMeasure(pitches, new IntPair(1, 1), m);
		pitches = Arrays.asList(new Pitch('A'), new Pitch('C'), new Pitch('E'));
		addChordToMeasure(pitches, new IntPair(1, 1), m);
		
		for (Measure meas : measures)
			chordTest.addMeasure(meas);
		PieceWalker.walkPiece(chordTest);
	}
	
	private void addChordToMeasure(List<Pitch> pitches, IntPair length, Measure m, String lyrics) {	
		Chord c = new Chord(length);
		for (Pitch p : pitches) {
			c.addAtom(new Note(p, length));
		}
		if (!(lyrics == null))
			c.addLyrics(lyrics);
		m.addChord(c);
	}
	
	// Helper method, equivalent to addChordToMeasure(), but when there are no lyrics to add
	private void addChordToMeasure(List<Pitch> pitches, IntPair length, Measure m) {	
		addChordToMeasure(pitches, length, m, null);
	}
	
	// Helper method, equivalent to addChordToMeasure(), but when there is only 1 pitch in the chord
	private void addPitchToMeasure(Pitch pitch, IntPair length, Measure m, String lyric) {
		List<Pitch> pitches = new ArrayList<Pitch>();
		pitches.add(pitch);
		addChordToMeasure(pitches, length, m, lyric);
	}
	
	// Helper method, equivalent to addPitchToMeasure, but with no lyric on the note
	private void addPitchToMeasure(Pitch pitch, IntPair length, Measure m) {
		addPitchToMeasure(pitch, length, m, null);
	}

}
