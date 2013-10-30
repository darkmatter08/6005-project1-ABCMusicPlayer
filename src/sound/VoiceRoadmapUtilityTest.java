package sound;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

/**
 * @category no_didit
 */
public class VoiceRoadmapUtilityTest {

	@Test
	public void linearTest() {
		VoiceRoadmapUtility util = new VoiceRoadmapUtility();
		
		Measure measure = new Measure();
		
		// the first bar
		Chord chord;
		Note n;
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('D'), new IntPair(1,1)); n.setLyrics("A"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('D'), new IntPair(1,1)); n.setLyrics("B"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('A'), new IntPair(1,1)); n.setLyrics("C"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('A'), new IntPair(1,1)); n.setLyrics("D"); chord.addAtom(n); measure.addChord(chord);
		util.addMeasure(measure);
		
		// the second bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(2,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		// the third bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		// the fourth bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(2,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		Piece piece = new Piece(KeySignature.D, 100, "Alphabet Song", new IntPair(4, 4), new IntPair(1, 1));
		
		List<Measure> linearPiece = util.linearize();
		System.out.println("========SJ===========");
		System.out.println(linearPiece.toString());
		
		for (Measure linearMeas : linearPiece) {
			piece.addMeasure(linearMeas);
		}
		
		System.out.println(piece.toString());
		PieceWalker.walkPiece(piece);
	}
	
	@Test
	public void singleRepeatTest() {
		VoiceRoadmapUtility util = new VoiceRoadmapUtility();
		
		Measure measure = new Measure();
		
		// the first bar
		Chord chord;
		Note n;
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('D'), new IntPair(1,1)); n.setLyrics("A"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('D'), new IntPair(1,1)); n.setLyrics("B"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('A'), new IntPair(1,1)); n.setLyrics("C"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('A'), new IntPair(1,1)); n.setLyrics("D"); chord.addAtom(n); measure.addChord(chord);
		util.addMeasure(measure);
		
		// the second bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(2,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		util.addDemarcation(VoiceRoadmapUtility.FR);
		
		// the third bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		// the fourth bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(2,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		util.addDemarcation(VoiceRoadmapUtility.BR);
		
		Piece piece = new Piece(KeySignature.D, 100, "Alphabet Song", new IntPair(4, 4), new IntPair(1, 1));
		
		List<Measure> linearPiece = util.linearize();
		System.out.println("========SJ===========");
		System.out.println(linearPiece.toString());
		
		for (Measure linearMeas : linearPiece) {
			piece.addMeasure(linearMeas);
		}
		
		System.out.println(piece.toString());
		PieceWalker.walkPiece(piece);
	}
	
	@Test
	public void noFRRepeatTest() {
		VoiceRoadmapUtility util = new VoiceRoadmapUtility();
		
		Measure measure = new Measure();
		
		// the first bar
		Chord chord;
		Note n;
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('D'), new IntPair(1,1)); n.setLyrics("A"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('D'), new IntPair(1,1)); n.setLyrics("B"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('A'), new IntPair(1,1)); n.setLyrics("C"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('A'), new IntPair(1,1)); n.setLyrics("D"); chord.addAtom(n); measure.addChord(chord);
		util.addMeasure(measure);
		
		// the second bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(2,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		// the third bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		// the fourth bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(2,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		util.addDemarcation(VoiceRoadmapUtility.BR);
		
		Piece piece = new Piece(KeySignature.D, 100, "Alphabet Song", new IntPair(4, 4), new IntPair(1, 1));
		
		List<Measure> linearPiece = util.linearize();
		System.out.println("========SJ===========");
		System.out.println(linearPiece.toString());
		
		for (Measure linearMeas : linearPiece) {
			piece.addMeasure(linearMeas);
		}
		
		System.out.println(piece.toString());
		PieceWalker.walkPiece(piece);
	}
	
	@Test 
	public void multipleEndingsTest() {
		VoiceRoadmapUtility util = new VoiceRoadmapUtility();
		
		Measure measure = new Measure();
		
		// the first bar
		Chord chord;
		Note n;
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('D'), new IntPair(1,1)); n.setLyrics("A"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('D'), new IntPair(1,1)); n.setLyrics("B"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('A'), new IntPair(1,1)); n.setLyrics("C"); chord.addAtom(n); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); n = new Note(new Pitch('A'), new IntPair(1,1)); n.setLyrics("D"); chord.addAtom(n); measure.addChord(chord);
		util.addMeasure(measure);
		
		// the second bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(2,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		util.addDemarcation(VoiceRoadmapUtility.FE);
		
		// the third bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		util.addDemarcation(VoiceRoadmapUtility.BR);
		util.addDemarcation(VoiceRoadmapUtility.SE);
		
		// the fourth bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(2,1)));	measure.addChord(chord);
		util.addMeasure(measure);
		
		util.addDemarcation(VoiceRoadmapUtility.DB);
		
		Piece piece = new Piece(KeySignature.D, 100, "Alphabet Song", new IntPair(4, 4), new IntPair(1, 1));
		
		List<Measure> linearPiece = util.linearize();
		System.out.println("========SJ===========");
		System.out.println(linearPiece.toString());
		
		for (Measure linearMeas : linearPiece) {
			piece.addMeasure(linearMeas);
		}
		
		System.out.println(piece.toString());
		PieceWalker.walkPiece(piece);
	}
	
	@Test
	public void multipleRepeatTest() {
		
	}

}
