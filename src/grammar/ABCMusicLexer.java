// Generated from ./ABCMusicLexer.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMPOSER=1, LENGTH=2, METER=3, TEMPO=4, TITLE=5, INDEX=6, KEY=7, VOICE=8, 
		NOCOMMENT=9, COMMENT=10, VOICEBODY=11, MODEMINOR=12, ACCIDENTAL=13, REST=14, 
		BARLINE=15, NTHREPEAT=16, BASENOTE=17, OCTAVE=18, WHITESPACE=19, OPENBRACKET=20, 
		CLOSEBRACKET=21, FRACTIONBAR=22, OPENPAREN=23, CLOSEPAREN=24, LINEFEED=25, 
		NUMBER=26, LYRIC=27, NOCOMMENTBODY=28, COMMENTBODY=29;
	public static final int BODY = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "BODY"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMPOSER", "LENGTH", "METER", "TEMPO", "TITLE", "INDEX", "KEY", "VOICE", 
		"NOCOMMENT", "COMMENT", "VOICEBODY", "'m'", "ACCIDENTAL", "REST", "BARLINE", 
		"NTHREPEAT", "BASENOTE", "OCTAVE", "WHITESPACE", "'['", "']'", "'/'", 
		"'('", "')'", "LINEFEED", "NUMBER", "LYRIC", "NOCOMMENTBODY", "COMMENTBODY"
	};
	public static final String[] ruleNames = {
		"DIGIT", "FRACTION", "EOL", "COMPOSER", "LENGTH", "METER", "TEMPO", "TITLE", 
		"INDEX", "KEY", "VOICE", "NOCOMMENT", "COMMENT", "VOICEBODY", "MODEMINOR", 
		"ACCIDENTAL", "REST", "BARLINE", "NTHREPEAT", "BASENOTE", "OCTAVE", "WHITESPACE", 
		"OPENBRACKET", "CLOSEBRACKET", "FRACTIONBAR", "OPENPAREN", "CLOSEPAREN", 
		"LINEFEED", "NUMBER", "LYRIC", "NOCOMMENTBODY", "COMMENTBODY"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusicLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 9: KEY_action((RuleContext)_localctx, actionIndex); break;

		case 11: NOCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 12: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 21: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 30: NOCOMMENTBODY_action((RuleContext)_localctx, actionIndex); break;

		case 31: COMMENTBODY_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void NOCOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void KEY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _mode = BODY;  break;
		}
	}
	private void COMMENTBODY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: skip();  break;
		}
	}
	private void NOCOMMENTBODY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\37\u0137\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7"+
		"\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17"+
		"\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26"+
		"\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35"+
		"\4\36\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\3\6\3H\n\3\r\3\16\3I\3\3\3"+
		"\3\6\3N\n\3\r\3\16\3O\3\4\5\4S\n\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5[\n\5\r"+
		"\5\16\5\\\3\5\6\5`\n\5\r\5\16\5a\3\6\3\6\3\6\3\6\3\6\6\6i\n\6\r\6\16\6"+
		"j\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7t\n\7\3\7\6\7w\n\7\r\7\16\7x\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\6\b\u0081\n\b\r\b\16\b\u0082\3\b\6\b\u0086\n\b\r\b\16"+
		"\b\u0087\3\t\3\t\3\t\3\t\6\t\u008e\n\t\r\t\16\t\u008f\3\t\6\t\u0093\n"+
		"\t\r\t\16\t\u0094\3\n\3\n\3\n\3\n\6\n\u009b\n\n\r\n\16\n\u009c\3\n\6\n"+
		"\u00a0\n\n\r\n\16\n\u00a1\3\13\3\13\3\13\3\13\6\13\u00a8\n\13\r\13\16"+
		"\13\u00a9\3\13\6\13\u00ad\n\13\r\13\16\13\u00ae\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\6\f\u00b7\n\f\r\f\16\f\u00b8\3\f\6\f\u00bc\n\f\r\f\16\f\u00bd\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\6\16\u00c6\n\16\r\16\16\16\u00c7\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\6\17\u00d0\n\17\r\17\16\17\u00d1\3\17\6\17\u00d5\n\17"+
		"\r\17\16\17\u00d6\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e2"+
		"\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00f1\n\23\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\3\25\3\25\3\26\6"+
		"\26\u00fc\n\26\r\26\16\26\u00fd\3\26\6\26\u0101\n\26\r\26\16\26\u0102"+
		"\5\26\u0105\n\26\3\27\3\27\3\27\6\27\u010a\n\27\r\27\16\27\u010b\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u011b"+
		"\n\35\r\35\16\35\u011c\3\36\6\36\u0120\n\36\r\36\16\36\u0121\3\37\3\37"+
		"\3\37\3\37\6\37\u0128\n\37\r\37\16\37\u0129\3 \3 \3 \3 \3!\3!\6!\u0132"+
		"\n!\r!\16!\u0133\3!\3!\2\"\4\2\1\6\2\1\b\2\1\n\3\1\f\4\1\16\5\1\20\6\1"+
		"\22\7\1\24\b\1\26\t\2\30\n\1\32\13\3\34\f\4\36\r\1 \16\1\"\17\1$\20\1"+
		"&\21\1(\22\1*\23\1,\24\1.\25\5\60\26\1\62\27\1\64\30\1\66\31\18\32\1:"+
		"\33\1<\34\1>\35\1@\36\6B\37\7\4\2\3\16\3\62;\4\f\f\17\17\4\f\f\17\17\4"+
		"\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\\\\||\4C"+
		"Ici\4\f\f\17\17\4\f\f\17\17\u015b\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2"+
		"\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32"+
		"\3\2\2\2\2\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3"+
		"&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60\3\2\2\2\3\62"+
		"\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2\2\2\3<\3\2\2\2\3"+
		">\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\4D\3\2\2\2\6G\3\2\2\2\bR\3\2\2\2\nV\3"+
		"\2\2\2\fc\3\2\2\2\16l\3\2\2\2\20z\3\2\2\2\22\u0089\3\2\2\2\24\u0096\3"+
		"\2\2\2\26\u00a3\3\2\2\2\30\u00b2\3\2\2\2\32\u00bf\3\2\2\2\34\u00c3\3\2"+
		"\2\2\36\u00cb\3\2\2\2 \u00d8\3\2\2\2\"\u00e1\3\2\2\2$\u00e3\3\2\2\2&\u00f0"+
		"\3\2\2\2(\u00f6\3\2\2\2*\u00f8\3\2\2\2,\u0104\3\2\2\2.\u0109\3\2\2\2\60"+
		"\u010f\3\2\2\2\62\u0111\3\2\2\2\64\u0113\3\2\2\2\66\u0115\3\2\2\28\u0117"+
		"\3\2\2\2:\u011a\3\2\2\2<\u011f\3\2\2\2>\u0123\3\2\2\2@\u012b\3\2\2\2B"+
		"\u012f\3\2\2\2DE\t\2\2\2E\5\3\2\2\2FH\5\4\2\2GF\3\2\2\2HI\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\7\61\2\2LN\5\4\2\2ML\3\2\2\2NO\3\2\2\2OM"+
		"\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QS\7\17\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2"+
		"TU\7\f\2\2U\t\3\2\2\2VW\7E\2\2WX\7<\2\2XZ\3\2\2\2Y[\n\3\2\2ZY\3\2\2\2"+
		"[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\5\b\4\2_^\3\2\2\2`a\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2\2cd\7N\2\2de\7<\2\2ef\3\2\2\2fh\5\6"+
		"\3\2gi\5\b\4\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lm\7"+
		"O\2\2mn\7<\2\2ns\3\2\2\2ot\7E\2\2pq\7E\2\2qt\7~\2\2rt\5\6\3\2so\3\2\2"+
		"\2sp\3\2\2\2sr\3\2\2\2tv\3\2\2\2uw\5\b\4\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2y\17\3\2\2\2z{\7S\2\2{|\7<\2\2|}\3\2\2\2}~\5\6\3\2~\u0080"+
		"\7?\2\2\177\u0081\5\4\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\b"+
		"\4\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\21\3\2\2\2\u0089\u008a\7V\2\2\u008a\u008b\7<\2\2"+
		"\u008b\u008d\3\2\2\2\u008c\u008e\n\4\2\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u0093\5\b\4\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0097\7Z\2\2\u0097\u0098"+
		"\7<\2\2\u0098\u009a\3\2\2\2\u0099\u009b\n\5\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u00a0\5\b\4\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\25\3\2\2\2\u00a3\u00a4\7M\2\2"+
		"\u00a4\u00a5\7<\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\n\6\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00ad\5\b\4\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\b\13\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7X\2\2\u00b3\u00b4\7<\2\2"+
		"\u00b4\u00b6\3\2\2\2\u00b5\u00b7\n\7\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00bc\5\b\4\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\b\r\3\2\u00c2\33\3\2\2\2\u00c3\u00c5\7\'\2\2\u00c4"+
		"\u00c6\n\b\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\16\4\2\u00ca"+
		"\35\3\2\2\2\u00cb\u00cc\7X\2\2\u00cc\u00cd\7<\2\2\u00cd\u00cf\3\2\2\2"+
		"\u00ce\u00d0\n\t\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\5\b\4\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\37\3\2\2\2\u00d8\u00d9\7o\2\2\u00d9!\3\2\2\2\u00da\u00e2\7"+
		"`\2\2\u00db\u00dc\7`\2\2\u00dc\u00e2\7`\2\2\u00dd\u00e2\7a\2\2\u00de\u00df"+
		"\7a\2\2\u00df\u00e2\7a\2\2\u00e0\u00e2\7?\2\2\u00e1\u00da\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00e0\3\2"+
		"\2\2\u00e2#\3\2\2\2\u00e3\u00e4\t\n\2\2\u00e4%\3\2\2\2\u00e5\u00f1\7~"+
		"\2\2\u00e6\u00e7\7~\2\2\u00e7\u00f1\7~\2\2\u00e8\u00e9\7]\2\2\u00e9\u00f1"+
		"\7~\2\2\u00ea\u00eb\7~\2\2\u00eb\u00f1\7_\2\2\u00ec\u00ed\7<\2\2\u00ed"+
		"\u00f1\7~\2\2\u00ee\u00ef\7~\2\2\u00ef\u00f1\7<\2\2\u00f0\u00e5\3\2\2"+
		"\2\u00f0\u00e6\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ec"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\'\3\2\2\2\u00f2\u00f3\7]\2\2\u00f3"+
		"\u00f7\7\63\2\2\u00f4\u00f5\7]\2\2\u00f5\u00f7\7\64\2\2\u00f6\u00f2\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f7)\3\2\2\2\u00f8\u00f9\t\13\2\2\u00f9+"+
		"\3\2\2\2\u00fa\u00fc\7)\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0105\3\2\2\2\u00ff\u0101\7."+
		"\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00fb\3\2\2\2\u0104\u0100\3\2"+
		"\2\2\u0105-\3\2\2\2\u0106\u0107\7\61\2\2\u0107\u010a\7v\2\2\u0108\u010a"+
		"\7\"\2\2\u0109\u0106\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\27"+
		"\5\2\u010e/\3\2\2\2\u010f\u0110\7]\2\2\u0110\61\3\2\2\2\u0111\u0112\7"+
		"_\2\2\u0112\63\3\2\2\2\u0113\u0114\7\61\2\2\u0114\65\3\2\2\2\u0115\u0116"+
		"\7*\2\2\u0116\67\3\2\2\2\u0117\u0118\7+\2\2\u01189\3\2\2\2\u0119\u011b"+
		"\5\b\4\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d;\3\2\2\2\u011e\u0120\5\4\2\2\u011f\u011e\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122=\3"+
		"\2\2\2\u0123\u0124\7y\2\2\u0124\u0125\7<\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0128\n\f\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a?\3\2\2\2\u012b\u012c\7\'\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\b \6\2\u012eA\3\2\2\2\u012f\u0131\7\'\2\2\u0130\u0132"+
		"\n\r\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b!\7\2\u0136C\3\2\2\2%"+
		"\2\3IOR\\ajsx\u0082\u0087\u008f\u0094\u009c\u00a1\u00a9\u00ae\u00b8\u00bd"+
		"\u00c7\u00d1\u00d6\u00e1\u00f0\u00f6\u00fd\u0102\u0104\u0109\u010b\u011c"+
		"\u0121\u0129\u0133";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}