package player;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.KeySignature;
import sound.Piece;

import grammar.ABCMusicBaseListener;
import grammar.ABCMusicParser;

public class Listener extends ABCMusicBaseListener {

	@Override public void enterAbctune(ABCMusicParser.AbctuneContext ctx) {
	}
	@Override public void exitAbctune(ABCMusicParser.AbctuneContext ctx) { }

	@Override public void enterTempo(ABCMusicParser.TempoContext ctx) { }
	@Override public void exitTempo(ABCMusicParser.TempoContext ctx) { }

	@Override public void enterMidtunefield(ABCMusicParser.MidtunefieldContext ctx) { }
	@Override public void exitMidtunefield(ABCMusicParser.MidtunefieldContext ctx) { }

	@Override public void enterFieldcomposer(ABCMusicParser.FieldcomposerContext ctx) { }
	@Override public void exitFieldcomposer(ABCMusicParser.FieldcomposerContext ctx) { }

	@Override public void enterAbcline(ABCMusicParser.AbclineContext ctx) { }
	@Override public void exitAbcline(ABCMusicParser.AbclineContext ctx) { }

	@Override public void enterAbcmusic(ABCMusicParser.AbcmusicContext ctx) { }
	@Override public void exitAbcmusic(ABCMusicParser.AbcmusicContext ctx) { }

	@Override public void enterFieldvoice(ABCMusicParser.FieldvoiceContext ctx) { }
	@Override public void exitFieldvoice(ABCMusicParser.FieldvoiceContext ctx) { }

	@Override public void enterMeter(ABCMusicParser.MeterContext ctx) { }
	@Override public void exitMeter(ABCMusicParser.MeterContext ctx) { }

	@Override public void enterFieldmeter(ABCMusicParser.FieldmeterContext ctx) { }
	@Override public void exitFieldmeter(ABCMusicParser.FieldmeterContext ctx) { }

	@Override public void enterNoteelement(ABCMusicParser.NoteelementContext ctx) { }
	@Override public void exitNoteelement(ABCMusicParser.NoteelementContext ctx) { }

	@Override public void enterNotelengthstrict(ABCMusicParser.NotelengthstrictContext ctx) { }
	@Override public void exitNotelengthstrict(ABCMusicParser.NotelengthstrictContext ctx) { }

	@Override public void enterFieldtempo(ABCMusicParser.FieldtempoContext ctx) { }
	@Override public void exitFieldtempo(ABCMusicParser.FieldtempoContext ctx) { }

	@Override public void enterKey(ABCMusicParser.KeyContext ctx) { }
	@Override public void exitKey(ABCMusicParser.KeyContext ctx) { }

	@Override public void enterNote(ABCMusicParser.NoteContext ctx) { }
	@Override public void exitNote(ABCMusicParser.NoteContext ctx) { }

	@Override public void enterKeynote(ABCMusicParser.KeynoteContext ctx) { }
	@Override public void exitKeynote(ABCMusicParser.KeynoteContext ctx) { }

	@Override public void enterElement(ABCMusicParser.ElementContext ctx) { }
	@Override public void exitElement(ABCMusicParser.ElementContext ctx) { }

	@Override public void enterMultinote(ABCMusicParser.MultinoteContext ctx) { }
	@Override public void exitMultinote(ABCMusicParser.MultinoteContext ctx) { }

	@Override public void enterFieldtitle(ABCMusicParser.FieldtitleContext ctx) { }
	@Override public void exitFieldtitle(ABCMusicParser.FieldtitleContext ctx) { }

	@Override public void enterFieldnumber(ABCMusicParser.FieldnumberContext ctx) { }
	@Override public void exitFieldnumber(ABCMusicParser.FieldnumberContext ctx) { }

	@Override public void enterNoteorrest(ABCMusicParser.NoteorrestContext ctx) { }
	@Override public void exitNoteorrest(ABCMusicParser.NoteorrestContext ctx) { }

	@Override public void enterLyric(ABCMusicParser.LyricContext ctx) { }
	@Override public void exitLyric(ABCMusicParser.LyricContext ctx) { }

	@Override public void enterNotelength(ABCMusicParser.NotelengthContext ctx) { }
	@Override public void exitNotelength(ABCMusicParser.NotelengthContext ctx) { }

	@Override public void enterFieldkey(ABCMusicParser.FieldkeyContext ctx) { }
	@Override public void exitFieldkey(ABCMusicParser.FieldkeyContext ctx) { }

	@Override public void enterAbcheader(ABCMusicParser.AbcheaderContext ctx) { 
	}
	@Override public void exitAbcheader(ABCMusicParser.AbcheaderContext ctx) { 
		Piece piece;
		System.out.println(ctx.fieldnumber().getText());
		System.out.println(ctx.otherfields().get(0).fieldcomposer().getText());
		System.out.println(ctx.otherfields().get(0).fieldcomposer().getText());
		System.out.println(ctx.otherfields().get(0).fieldcomposer().getText());
		System.out.println(ctx.otherfields().get(0).fieldcomposer().getText());
		System.out.println(ctx.fieldtitle().getText());

//		KeySignature keySig = ctx.fieldkey().
//		System.out.println()
//		piece = new Piece(keySig, indexNumber, tempo, title)
	}

	@Override public void enterTupletspec(ABCMusicParser.TupletspecContext ctx) { }
	@Override public void exitTupletspec(ABCMusicParser.TupletspecContext ctx) { }

	@Override public void enterLyricalelement(ABCMusicParser.LyricalelementContext ctx) { }
	@Override public void exitLyricalelement(ABCMusicParser.LyricalelementContext ctx) { }

	@Override public void enterTupletelement(ABCMusicParser.TupletelementContext ctx) { }
	@Override public void exitTupletelement(ABCMusicParser.TupletelementContext ctx) { }

	@Override public void enterFielddefaultlength(ABCMusicParser.FielddefaultlengthContext ctx) { }
	@Override public void exitFielddefaultlength(ABCMusicParser.FielddefaultlengthContext ctx) { }

	@Override public void enterPitch(ABCMusicParser.PitchContext ctx) { }
	@Override public void exitPitch(ABCMusicParser.PitchContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }

}
