// Generated from ABCMusicParser.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicParserListener extends ParseTreeListener {
	void enterElement(ABCMusicParser.ElementContext ctx);
	void exitElement(ABCMusicParser.ElementContext ctx);

	void enterMultinote(ABCMusicParser.MultinoteContext ctx);
	void exitMultinote(ABCMusicParser.MultinoteContext ctx);

	void enterAbctune(ABCMusicParser.AbctuneContext ctx);
	void exitAbctune(ABCMusicParser.AbctuneContext ctx);

	void enterAbcbody(ABCMusicParser.AbcbodyContext ctx);
	void exitAbcbody(ABCMusicParser.AbcbodyContext ctx);

	void enterOptionalfields(ABCMusicParser.OptionalfieldsContext ctx);
	void exitOptionalfields(ABCMusicParser.OptionalfieldsContext ctx);

	void enterMidtunefield(ABCMusicParser.MidtunefieldContext ctx);
	void exitMidtunefield(ABCMusicParser.MidtunefieldContext ctx);

	void enterNoteorrest(ABCMusicParser.NoteorrestContext ctx);
	void exitNoteorrest(ABCMusicParser.NoteorrestContext ctx);

	void enterNotelength(ABCMusicParser.NotelengthContext ctx);
	void exitNotelength(ABCMusicParser.NotelengthContext ctx);

	void enterAbcheader(ABCMusicParser.AbcheaderContext ctx);
	void exitAbcheader(ABCMusicParser.AbcheaderContext ctx);

	void enterTupletspec(ABCMusicParser.TupletspecContext ctx);
	void exitTupletspec(ABCMusicParser.TupletspecContext ctx);

	void enterBodysection(ABCMusicParser.BodysectionContext ctx);
	void exitBodysection(ABCMusicParser.BodysectionContext ctx);

	void enterTupletelement(ABCMusicParser.TupletelementContext ctx);
	void exitTupletelement(ABCMusicParser.TupletelementContext ctx);

	void enterNoteelement(ABCMusicParser.NoteelementContext ctx);
	void exitNoteelement(ABCMusicParser.NoteelementContext ctx);

	void enterPitch(ABCMusicParser.PitchContext ctx);
	void exitPitch(ABCMusicParser.PitchContext ctx);

	void enterNote(ABCMusicParser.NoteContext ctx);
	void exitNote(ABCMusicParser.NoteContext ctx);
}