package player;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.Chord;
import sound.IntPair;
import sound.KeySignature;
import sound.KeySignatureUtility;
import sound.Measure;
import sound.MusicalAtom;
import sound.Note;
import sound.Piece;
import sound.PieceWalker;
import sound.Pitch;
import sound.Rest;
import sound.Voice;
import sound.VoiceRoadmapUtility;
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
	IntPair defaultNoteLength;
	Queue<String> voices = new LinkedList<String>() ;
	Queue<String> lyrics = new LinkedList<String>();
	Queue<Object> measureAtoms = new LinkedList<Object>();
	Queue<Object> measuresAndDemarcations = new LinkedList<Object>();
	List<String> tempList = new ArrayList<String>();
	
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
	}
	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
	}
	@Override
	public void visitErrorNode(ErrorNode arg0) {		
	}
	@Override
	public void visitTerminal(TerminalNode arg0) {
	}
	@Override
	public void enterElement(ElementContext ctx) {
	}
	@Override
	public void exitElement(ElementContext ctx) {
		if (ctx.BARLINE() != null){
			measureAtoms.add(ctx.BARLINE().getText());
		}
		if (ctx.NTHREPEAT() != null){
			measureAtoms.add(ctx.NTHREPEAT().getText());
		}
	}

	@Override
	public void enterMultinote(MultinoteContext ctx) {		
	}
	@Override
	public void exitMultinote(MultinoteContext ctx) {
	}
	@Override
	public void enterAbctune(AbctuneContext ctx) {	
	}
	@Override
	public void exitAbctune(AbctuneContext ctx) {
				
	}

	@Override
	public void enterAbcbody(AbcbodyContext ctx) {
			}

	@Override
	public void exitAbcbody(AbcbodyContext ctx) {
	//System.out.println("This is the piece before walking: "+this.piece.toString());
		PieceWalker.walkPiece(this.piece);
		System.out.println("The total voices: "+ this.tempList);
	}




	@Override
	public void enterOptionalfields(OptionalfieldsContext ctx) {
	}

	@Override
	public void exitOptionalfields(OptionalfieldsContext ctx) {
		}

	@Override
	public void enterMidtunefield(MidtunefieldContext ctx) {
		if (ctx.VOICEBODY() != null) {
			String voiceStr = ctx.VOICEBODY().getText().replace("\n", "").substring(2);
			this.voices.add(voiceStr);
			System.out.println("Added voice: "+ voiceStr);
		}
	}

	@Override
	public void exitMidtunefield(MidtunefieldContext ctx) {
	}

	@Override
	public void enterNoteorrest(NoteorrestContext ctx) {
		}

	@Override
	public void exitNoteorrest(NoteorrestContext ctx) {
	}

	@Override
	public void enterNotelength(NotelengthContext ctx) {
		
	}

	@Override
	public void exitNotelength(NotelengthContext ctx) {
		
	}

	@Override
	public void enterAbcheader(AbcheaderContext ctx) {
		// @cr we will need to make sure the grammar handles whitespace correctly in these fields
		String title = ctx.TITLE().toString().substring(2).replace("\n", "");
		KeySignature Key = KeySignature.valueOf(ctx.KEY().toString().substring(2).replace("\n", ""));
		
		// set the tempo to 100 as default. Change if specified. 
		int tempo =  100;
		if (ctx.optionalfields().TEMPO() != null){
			String tempoStr = ctx.optionalfields().TEMPO().get(0).toString();
			tempo = Integer.parseInt(tempoStr.substring(6).replace("\n", ""));
			//System.out.print("header tempo" + ctx.optionalfields().TEMPO().get(0).toString());
			IntPair tempoPair = LyricsListenerHelper.getPair(ctx.optionalfields().TEMPO().get(0).
					toString().replaceAll(" ", "").replaceAll("\n", ""));
			tempo = (int)(tempo * tempoPair.getValue());
			
			//System.out.print(tempoPair.numerator + "<=,=> "+ tempoPair.denominator);
		}
		
		// set the default meter to 4/4 as default. Change if specified.
		IntPair meter = new IntPair(4, 4);
//		if (ctx.optionalfields().METER() != null){
//			try{
//			int num = Integer.parseInt(ctx.optionalfields().METER().get(0).toString().substring(2,3));
//			int denom = Integer.parseInt(ctx.optionalfields().METER().get(0).toString().substring(4,5));
//			meter = new IntPair(num, denom);
//			}
//			catch (NumberFormatException){
//				if (ctx.optionalfields().METER().get(0).getText().equals("C\n")){
//					meter
//				}
//			}
//		}
		
		if (ctx.optionalfields().LENGTH() != null && ctx.optionalfields().LENGTH().size() > 0){
			int num = Integer.parseInt(ctx.optionalfields().LENGTH().get(0).toString().substring(2,3));
			int denom = Integer.parseInt(ctx.optionalfields().LENGTH().get(0).toString().substring(4,5));
			this.defaultNoteLength = new IntPair(num, denom);
		}
		else{
			if (meter.getValue() < 0.75){
				this.defaultNoteLength = new IntPair(1,16);
			}
			else{
				this.defaultNoteLength = new IntPair(1,8);
			}
		}
		
		this.piece = new Piece(Key, 4000 , title, meter, this.defaultNoteLength);
		
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
		//System.out.println("scanning lyrics");
		if (ctx.LYRIC() != null){
			for (String lyric : LyricsListenerHelper.breakLyrics(ctx.LYRIC().getText().substring(2))){
				this.lyrics.add(lyric);
			}
			//System.out.println("put the lyrics on the stack:" + LyricsListenerHelper.breakLyrics(ctx.LYRIC().getText().toString().substring(2)));
		}
	}

	@Override
	public void exitBodysection(BodysectionContext ctx) {
		List<Object> measuresList = LyricsListenerHelper.attachLyrics(lyrics, measureAtoms);
		for(int i = measuresList.size()-1; i > 0; i--){
			if (measuresList.get(i) == "|"){
				measuresList.remove(i);
			}
			
		}
		if (!(measuresList.isEmpty())){
			for (Object m: measuresList){
				if (m instanceof Measure){
					if(!((Measure)m).isEmpty()){
						this.measuresAndDemarcations.add(m);
					}
				}
				else{
					this.measuresAndDemarcations.add(m);
				}
			}
		}

		System.out.println("measures and Demarcation: "+this.measuresAndDemarcations.toString());
		VoiceRoadmapUtility linearizer = new VoiceRoadmapUtility();
		for(Object mORd : this.measuresAndDemarcations){
			if (mORd instanceof Measure){
				linearizer.addMeasure((Measure) mORd);
			}
			else if (mORd instanceof String){
				linearizer.addDemarcation((String) mORd);
			}
		}
		List<Measure> linearizedMeasures = linearizer.linearize();
		System.out.println("Linearized Measure: "+ linearizedMeasures);
		if(this.voices.size()==0){
			this.voices.add("Default Voice");
		}
		if(this.voices.size()==1){
			for(Measure measure : linearizedMeasures){
				piece.addMeasure(this.voices.peek(), measure);
			}
		}
		if(this.voices.size()==2){
			this.voices.remove();
			for(Measure measure : linearizedMeasures){
				piece.addMeasure(this.voices.peek(), measure);
			}
		}

	}

	@Override
	public void enterTupletelement(TupletelementContext ctx) {
		int tupletLength = 0;
		if (ctx.tupletspec() != null){
			tupletLength = Integer.parseInt(ctx.tupletspec().NUMBER().getText());
		}
		
		List<NoteelementContext> noteelements = ctx.noteelement();
		for(int i =0; i < noteelements.size(); i++){
			if(i<tupletLength){
				measureAtoms.add(LyricsListenerHelper.tupletElementHelper(noteelements.get(i), this.defaultNoteLength, tupletLength));
			}
			else{
				measureAtoms.add(LyricsListenerHelper.tupletElementHelper(noteelements.get(i), this.defaultNoteLength, 1));
			}
		}
		
	}

	@Override
	public void exitTupletelement(TupletelementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNoteelement(NoteelementContext ctx) {
		Chord chord = null;
		System.out.print("this is the ctx of :" + ctx.getText());
		if (ctx.note() != null){
			IntPair length;
			if (ctx.note().notelength().getChildCount() != 0){
				IntPair multiplier = LyricsListenerHelper.noteGetLength(ctx.note().notelength());
				int numerator = multiplier.numerator;
				int denominator = multiplier.denominator;
				length = new IntPair(this.defaultNoteLength.numerator * numerator, this.defaultNoteLength.denominator * denominator);
			}
			else{
				length = this.defaultNoteLength;
			}
			
			if (ctx.note().noteorrest() != null){
				if (ctx.note().noteorrest().pitch() != null){
					//String accidentals = LyricsListenerHelper.noteGetAccidental(expression);
					int octaves = LyricsListenerHelper.noteGetOctaves(ctx.note().noteorrest().pitch());
					Pitch pitch = new Pitch(LyricsListenerHelper.noteGetPitch(ctx.note().noteorrest().pitch().BASENOTE().getText()));
					Pitch p = KeySignatureUtility.getAdjustedPitch(piece.getKeySig(), pitch);
					p = p.octaveTranspose(octaves);
					Note note = new Note(p, length);
					chord = new Chord(note.getLength());
					chord.addAtom(note);
					//System.out.println("added this note:" + ctx.note().noteorrest().pitch().BASENOTE().getText() + note.getLength().getValue());
				}
				if(ctx.note().noteorrest().REST() != null){
					Rest rest = new Rest(length);
					chord = new Chord(rest.getLength());
					chord.addAtom(rest);
					//System.out.println("added this rest:" + ctx.note().noteorrest().REST().getText() + rest.getLength().getValue());
				}
			}
		}
		
		if (ctx.multinote() != null){
			List<NoteContext> cntxt = ctx.multinote().note();
			IntPair multiplier = LyricsListenerHelper.noteGetLength(cntxt.get(0).notelength());
			int numerator = multiplier.numerator;
			int denominator = multiplier.denominator;
			IntPair length = new IntPair(this.defaultNoteLength.numerator * numerator, this.defaultNoteLength.denominator * denominator);
			chord = new Chord(length);
			for(int i = 0; i < cntxt.size(); i++){
				chord.addAtom(LyricsListenerHelper.chordMultiNoteHelper(cntxt.get(i), this.defaultNoteLength));
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
