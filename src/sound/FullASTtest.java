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
		ASTListener.ASTplay(piece);


	}
}
