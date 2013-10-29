package sound;

import org.junit.Test;

/**
 * 
 * @author dalitso
 * @category no_didit
 * this a full ast test. It will test playing the abc file abc_song.abd. Since the parser isnt yet build
 * every note will be hard coded. 
 * 
 * X:1
 *T:Alphabet Song
 *C:Traditional Kid's Song
 *M:4/4
 *L:1/4
 *Q:1/4=100
 *K:D 
 *| D D A A|B B A2|G G F F|E/2E/2E/2E/2 D2|
 *
 *w:A B C D E F G  H I J K L  M  N  O   P
 *  A A G F | F F E2|A       A  G  G | F F E2|
 *w:Q R S *   T U V  W~(dou-ble u) | X Y Z
 *   D   D    A    A |B B A2 | G    G  F    F | E     E  D2|
 *w: Now I've said my A B C's. Tell me what you think of me.
 */
public class FullASTtest {
	@Test
	public void fullASTtest(){
		Piece piece = new Piece(KeySignature.D, 100, "Alphabet Song");
		
		Measure measure = new Measure();
		
		// the first bar
		Chord chord;
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(1,1)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(1,1))); measure.addChord(chord);
		piece.addMeasure(measure);
		
		// the second bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(2,1)));	measure.addChord(chord);
		piece.addMeasure(measure);
		
		// the third bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F').accidentalTranspose(1), new IntPair(1,1)));	measure.addChord(chord);
		piece.addMeasure(measure);
		
		// the fourth bar
		measure = new Measure();
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,2)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(2,1)));	measure.addChord(chord);
		piece.addMeasure(measure);
		System.out.println(piece.toString());
		ASTListener.ASTplay(piece);

	}
	
	@Test
	public void sjWalkerTest(){
		Piece piece = new Piece(KeySignature.D, 100, "SJ Music", new IntPair(4, 4), new IntPair(1, 1));
				//(KeySignature.D, 100, "Alphabet Song");
		Measure measure = new Measure();
		
		// the first bar
		Voice voice; 
		voice = new Voice();
		Chord chord;
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(1,1))); voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(1,1))); voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(1,1)));	voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(1,1))); voice.addChord(chord);
		measure.addVoice(voice);
		piece.addMeasure(measure);
		
		// the second bar
		measure = new Measure();
		voice = new Voice();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('B'), new IntPair(1,1))); voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('A'), new IntPair(2,1)));	voice.addChord(chord);
		measure.addVoice(voice);
		piece.addMeasure(measure);
		
		// the third bar
		measure = new Measure();
		voice = new Voice();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,1))); voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F'), new IntPair(1,1)));	voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('F'), new IntPair(1,1)));	voice.addChord(chord);
		measure.addVoice(voice);
		piece.addMeasure(measure);
		
		// the fourth bar
		measure = new Measure();
		voice = new Voice();
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2))); voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,2)));	voice.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('D'), new IntPair(1,1)));	voice.addChord(chord);
		measure.addVoice(voice);
		piece.addMeasure(measure);
		System.out.println(piece.toString());
		PieceWalker.walkPiece(piece);


	}

	@Test
	public void pieceOneTest(){
		/**
		 * X: 1
		 *T:Piece No.1
		 *M:4/4
		 *L:1/4
		 *Q:1/4=140
		 *K:C
		 *C C C3/4 D/4 E | E3/4 D/4 E3/4 F/4 G2 | (3CCC/ (3GGG/ (3EEE/ (3CCC/ | G3/4 F/4 E3/4 D/4 C2
		 */
		Piece piece = new Piece(KeySignature.C, 140, "Piece No.1");
		piece.setDefaultLength(1, 4);
		Measure measure = new Measure();
		
		// the first bar
		Chord chord;
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('C'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('C'), new IntPair(1,1))); measure.addChord(chord);
		chord = new Chord(new IntPair(3,4)); chord.addAtom(new Note(new Pitch('C'), new IntPair(3,4)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,4)); chord.addAtom(new Note(new Pitch('D'), new IntPair(1,4))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,1)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,1))); measure.addChord(chord);
		piece.addMeasure(measure);
		
		// the second bar
		measure = new Measure();
		chord = new Chord(new IntPair(3,4)); chord.addAtom(new Note(new Pitch('E'), new IntPair(3,4))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,4)); chord.addAtom(new Note(new Pitch('D'), new IntPair(1,4))); measure.addChord(chord);
		chord = new Chord(new IntPair(3,4)); chord.addAtom(new Note(new Pitch('E'), new IntPair(3,4)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,4)); chord.addAtom(new Note(new Pitch('F'), new IntPair(1,4))); measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('G'), new IntPair(2,1))); measure.addChord(chord);
		piece.addMeasure(measure);
		
		// the third bar (3CCC (3GGG (3EEE (3CCC 
		// (3CCC
		measure = new Measure();
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('C'), new IntPair(1,3))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('C'), new IntPair(1,3))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('C'), new IntPair(1,3)));	measure.addChord(chord);
		
		// (3GGG 
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,3))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,3))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('G'), new IntPair(1,3)));	measure.addChord(chord);
		
		// (3EEE
		// the third bar (3CCC (3GGG (3EEE (3CCC 
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,3))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,3))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('E'), new IntPair(1,3)));	measure.addChord(chord);
		
		// (3CCC
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('C'), new IntPair(1,3))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('C'), new IntPair(1,3))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,3)); chord.addAtom(new Note(new Pitch('C'), new IntPair(1,3)));	measure.addChord(chord);

		piece.addMeasure(measure);
		
		// the fourth bar G3/4 F/4 E3/4 D/4 C2
		measure = new Measure();
		chord = new Chord(new IntPair(3,4)); chord.addAtom(new Note(new Pitch('G'), new IntPair(3,4))); measure.addChord(chord);
		chord = new Chord(new IntPair(1,4)); chord.addAtom(new Note(new Pitch('F'), new IntPair(1,4))); measure.addChord(chord);
		chord = new Chord(new IntPair(3,4)); chord.addAtom(new Note(new Pitch('E'), new IntPair(3,4)));	measure.addChord(chord);
		chord = new Chord(new IntPair(1,4)); chord.addAtom(new Note(new Pitch('D'), new IntPair(1,4))); measure.addChord(chord);
		chord = new Chord(new IntPair(2,1)); chord.addAtom(new Note(new Pitch('C'), new IntPair(2,1))); measure.addChord(chord);
		piece.addMeasure(measure);
		
		System.out.println(piece.toString());
		ASTListener.ASTplay(piece);
		

		
	}
}
