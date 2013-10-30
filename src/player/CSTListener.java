package player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.Chord;
import sound.IntPair;
import sound.KeySignature;
import sound.Measure;
import sound.MusicalAtom;
import sound.Note;
import sound.Piece;
import sound.PieceWalker;
import sound.Pitch;
import sound.Rest;
import grammar.ABCMusicParser.AbcbodyContext;
import grammar.ABCMusicParser.AbcheaderContext;
import grammar.ABCMusicParser.AbctuneContext;
import grammar.ABCMusicParser.BodysectionContext;
import grammar.ABCMusicParser.ElementContext;
import grammar.ABCMusicParser.MidtunefieldContext;
import grammar.ABCMusicParser.MultinoteContext;
import grammar.ABCMusicParser.NoteContext;
import grammar.ABCMusicParser.NoteelementContext;
import grammar.ABCMusicParser.NotelengthContext;
import grammar.ABCMusicParser.NoteorrestContext;
import grammar.ABCMusicParser.OptionalfieldsContext;
import grammar.ABCMusicParser.PitchContext;
import grammar.ABCMusicParser.TupletelementContext;
import grammar.ABCMusicParser.TupletspecContext;
import grammar.ABCMusicParserBaseListener;
import grammar.ABCMusicParserListener;
import player.LyricsListenerHelper;
public class CSTListener implements ABCMusicParserListener{
	Piece piece;
	
	Queue<String> voices = new LinkedList<String>() ;
	Queue<String> notes = new LinkedList<String>();
	Queue<String> lyrics = new LinkedList<String>();
	Queue<Object> measureAtoms = new LinkedList<Object>();
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		//System.out.println("Entering: "+ arg0.getClass().toString() + '\n' + arg0.getText());
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterElement(ElementContext ctx) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void exitElement(ElementContext ctx) {
		if (ctx.BARLINE() != null){
			System.out.println("Added a barline to measure atoms:"+ ctx.getText());
			measureAtoms.add(ctx.BARLINE().getText());
		}
	}

	@Override
	public void enterMultinote(MultinoteContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMultinote(MultinoteContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAbctune(AbctuneContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAbctune(AbctuneContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAbcbody(AbcbodyContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void exitAbcbody(AbcbodyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterOptionalfields(OptionalfieldsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitOptionalfields(OptionalfieldsContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMidtunefield(MidtunefieldContext ctx) {
		// TODO Auto-generated method stub
		String voiceStr = ctx.getText().replace("\n", "").substring(2);
		voices.add(voiceStr);
		System.out.println("added to voices quoe ->" + voiceStr);
		
	}

	@Override
	public void exitMidtunefield(MidtunefieldContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNoteorrest(NoteorrestContext ctx) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void exitNoteorrest(NoteorrestContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNotelength(NotelengthContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNotelength(NotelengthContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAbcheader(AbcheaderContext ctx) {
		// @cr we will need to make sure the grammar handles whitespace correctly in these fields
		String title = ctx.TITLE().toString().replace("\n", "");
		KeySignature Key = KeySignature.valueOf(ctx.KEY().toString().substring(2).replace("\n", ""));
		
		// set the tempo to 100 as default. Change if specified. 
		int tempo =  100;
		if (ctx.optionalfields().TEMPO() != null){
			String tempoStr = ctx.optionalfields().TEMPO().get(0).toString();
			tempo = Integer.parseInt(tempoStr.substring(6).replace("\n", ""));
		}
		
		// set the default meter to 4/4 as default. Change if specified.
		IntPair meter = new IntPair(4, 4);
		if (ctx.optionalfields().METER() != null){
			int num = Integer.parseInt(ctx.optionalfields().METER().get(0).toString().substring(2,3));
			int denom = Integer.parseInt(ctx.optionalfields().METER().get(0).toString().substring(4,5));
			meter = new IntPair(num, denom);
		}
		
		// set the default length to 1/1 as default. Change if specified.
		IntPair defaultLength = new IntPair(meter.numerator, meter.denominator);
		if (ctx.optionalfields().LENGTH() != null){
			int num = Integer.parseInt(ctx.optionalfields().LENGTH().get(0).toString().substring(2,3));
			int denom = Integer.parseInt(ctx.optionalfields().LENGTH().get(0).toString().substring(4,5));
			defaultLength = new IntPair(num, denom);
		}
		
		this.piece = new Piece(Key, tempo, title, meter, defaultLength);
		
	}

	@Override
	public void enterTupletspec(TupletspecContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTupletspec(TupletspecContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBodysection(BodysectionContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("scanning lyrics");
		if (ctx.LYRIC() != null){
			for (String lyric : LyricsListenerHelper.breakLyrics(ctx.LYRIC().getText().substring(2))){
				this.lyrics.add(lyric);
			}
			System.out.println("put thes lyrics on the stack:" + LyricsListenerHelper.breakLyrics(ctx.LYRIC().getText().toString().substring(2)));
		}
	}

	@Override
	public void exitBodysection(BodysectionContext ctx) {
		// TODO Auto-generated method stub
		// Ideally the stacks should be processed here and new the bulk of the AST building performed
		Measure m = new Measure();
		String lyric = null;
		boolean holdLyrics = false;
		if (this.lyrics.isEmpty()){holdLyrics = true;}
		System.out.println("size" + measureAtoms.size()+ "contents" + measureAtoms.toString());
		while (!(this.measureAtoms.isEmpty())){
			Object atom = this.measureAtoms.poll();
			if (!(this.lyrics.isEmpty())){
				lyric = this.lyrics.poll();
				if (lyric.equals("|")){
					holdLyrics = true;
				}
			}
			if (atom.equals("|") || atom.equals("||") 
					|| atom.equals("[|") || atom.equals( "|]") ||
							atom.equals(":|") || atom.equals("|:")){
				if (!(m.isEmpty())){
					System.out.println("adding this measure to piece" + m);
					this.piece.addMeasure(m);
				}
				m = new Measure();
			}
			else{
				Chord c = (Chord) atom;
				if (holdLyrics == false){
					c.addLyrics(lyric); 
				}
				
				m.addChord(c);		
			}
		}
		System.out.println("this is the measure " + m.toString());
		//piece.addMeasure(m);
		PieceWalker.walkPiece(piece);
	}

	@Override
	public void enterTupletelement(TupletelementContext ctx) {
		int tupletLength = 0;
		int numerator;
		int denominator;
		if (ctx.tupletspec() != null){
			tupletLength = Integer.parseInt(ctx.tupletspec().NUMBER().getText());
		}
		if (tupletLength == 1){
			numerator = 1;
			denominator = 1;
		}
		if (tupletLength == 2){
			numerator = 3;
			denominator = 2;
		}
		if (tupletLength == 3){
			numerator = 2;
			denominator = 3;
		}
		if (tupletLength == 4){
			numerator = 3;
			denominator = 4;
		}
		
		List<NoteelementContext> noteelements = ctx.noteelement();
		
		
		
	}

	@Override
	public void exitTupletelement(TupletelementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNoteelement(NoteelementContext ctx) {
		Chord chord = null;
		if (ctx.note() != null){
			IntPair length;
			if (ctx.note().notelength().getChildCount() != 0){
				String expression = ctx.note().notelength().getText();
				System.out.println("First: "+expression);
				length = LyricsListenerHelper.noteGetPair(expression);
			}
			else{
				length = new IntPair(1,1);
			}
			
			if (ctx.note().noteorrest() != null){
				if (ctx.note().noteorrest().pitch() != null){
					//String accidentals = LyricsListenerHelper.noteGetAccidental(expression);
					int octaves = LyricsListenerHelper.noteGetOctaves(ctx.note().noteorrest().pitch());
					Pitch pitch = new Pitch(LyricsListenerHelper.noteGetPitch(ctx.note().noteorrest().pitch().BASENOTE().getText()));
					pitch.octaveTranspose(octaves);
					Note note = new Note(pitch, length);
					chord = new Chord(note.getLength());
					chord.addAtom(note);
					System.out.println("added this note:" + ctx.note().noteorrest().pitch().BASENOTE().getText());
				}
				if(ctx.note().noteorrest().REST() != null){
					String expression = ctx.note().noteorrest().REST().getText();
					Rest rest = new Rest(length);
					chord = new Chord(rest.getLength());
					chord.addAtom(rest);
					System.out.println("added this note:" + ctx.note().noteorrest().REST().getText());
				}
			}
		}
		
		if (ctx.multinote() != null){
			List<NoteContext> cntxt = ctx.multinote().note();
			IntPair length = LyricsListenerHelper.chordMultiNoteHelper(cntxt.get(0)).getLength();
			chord = new Chord(length);
			for(int i = 1; i < cntxt.size(); i++){
				chord.addAtom(LyricsListenerHelper.chordMultiNoteHelper(cntxt.get(i)));
			}
		}
		
		measureAtoms.add(chord);
		
	}

	@Override
	public void exitNoteelement(NoteelementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPitch(PitchContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPitch(PitchContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNote(NoteContext ctx) {

	}

	@Override
	public void exitNote(NoteContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAbcheader(AbcheaderContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
