// Generated from ABCMusic.g4 by ANTLR 4.0

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
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, KEYACCIDENTAL=26, MODEMINOR=27, METERFRACTION=28, ACCIDENTAL=29, 
		REST=30, BARLINE=31, NTHREPEAT=32, BASENOTE=33, OCTAVE=34, COMMENT=35, 
		WHITESPACE=36, NUMBER=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'C'", "'C:'", "'\n'", "'*'", "'-'", "'['", "'('", "'\r'", "'X:'", 
		"'T:'", "'Q:'", "'w:'", "' '", "'-'", "'M:'", "'L:'", "'_'", "'='", "'V:'", 
		"'K:'", "'/'", "'~'", "'C|'", "'|'", "KEYACCIDENTAL", "'m'", "METERFRACTION", 
		"ACCIDENTAL", "REST", "BARLINE", "NTHREPEAT", "BASENOTE", "OCTAVE", "COMMENT", 
		"WHITESPACE", "NUMBER"
	};
	public static final String[] ruleNames = {
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"DIGIT", "KEYACCIDENTAL", "MODEMINOR", "METERFRACTION", "ACCIDENTAL", 
		"REST", "BARLINE", "NTHREPEAT", "BASENOTE", "OCTAVE", "COMMENT", "WHITESPACE", 
		"NUMBER"
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
	public String getGrammarFileName() { return "ABCMusic.g4"; }

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
		case 35: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\'\u00dc\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\6\33\u008e\n\33\r\33\16\33\u008f\3\34\3\34\3\35\3\35\3\36\6\36\u0097"+
		"\n\36\r\36\16\36\u0098\3\36\3\36\6\36\u009d\n\36\r\36\16\36\u009e\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00a8\n\37\3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u00b7\n!\3\"\3\"\3\"\3\"\5\"\u00bd\n\"\3#\3#\3$\6"+
		"$\u00c2\n$\r$\16$\u00c3\3$\6$\u00c7\n$\r$\16$\u00c8\5$\u00cb\n$\3%\3%"+
		"\7%\u00cf\n%\f%\16%\u00d2\13%\3%\3%\3&\6&\u00d7\n&\r&\16&\u00d8\3\'\3"+
		"\'\2(\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26"+
		"\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\2\1\67\34\19\35\1;\36\1=\37\1"+
		"? \1A!\1C\"\1E#\1G$\1I%\2K&\1M\'\1\3\2\b\3\62;\4%%dd\4\\\\||\4CIci\4\f"+
		"\f\17\17\5\13\13\"\"))\u00ec\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2"+
		"\2\7S\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3\2\2"+
		"\2\23`\3\2\2\2\25b\3\2\2\2\27e\3\2\2\2\31h\3\2\2\2\33k\3\2\2\2\35n\3\2"+
		"\2\2\37p\3\2\2\2!s\3\2\2\2#v\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\u0080"+
		"\3\2\2\2-\u0083\3\2\2\2/\u0085\3\2\2\2\61\u0087\3\2\2\2\63\u008a\3\2\2"+
		"\2\65\u008d\3\2\2\2\67\u0091\3\2\2\29\u0093\3\2\2\2;\u0096\3\2\2\2=\u00a7"+
		"\3\2\2\2?\u00a9\3\2\2\2A\u00b6\3\2\2\2C\u00bc\3\2\2\2E\u00be\3\2\2\2G"+
		"\u00ca\3\2\2\2I\u00cc\3\2\2\2K\u00d6\3\2\2\2M\u00da\3\2\2\2OP\7_\2\2P"+
		"\4\3\2\2\2QR\7E\2\2R\6\3\2\2\2ST\7E\2\2TU\7<\2\2U\b\3\2\2\2VW\7\f\2\2"+
		"W\n\3\2\2\2XY\7,\2\2Y\f\3\2\2\2Z[\7/\2\2[\16\3\2\2\2\\]\7]\2\2]\20\3\2"+
		"\2\2^_\7*\2\2_\22\3\2\2\2`a\7\17\2\2a\24\3\2\2\2bc\7Z\2\2cd\7<\2\2d\26"+
		"\3\2\2\2ef\7V\2\2fg\7<\2\2g\30\3\2\2\2hi\7S\2\2ij\7<\2\2j\32\3\2\2\2k"+
		"l\7y\2\2lm\7<\2\2m\34\3\2\2\2no\7\"\2\2o\36\3\2\2\2pq\7^\2\2qr\7/\2\2"+
		"r \3\2\2\2st\7O\2\2tu\7<\2\2u\"\3\2\2\2vw\7N\2\2wx\7<\2\2x$\3\2\2\2yz"+
		"\7a\2\2z&\3\2\2\2{|\7?\2\2|(\3\2\2\2}~\7X\2\2~\177\7<\2\2\177*\3\2\2\2"+
		"\u0080\u0081\7M\2\2\u0081\u0082\7<\2\2\u0082,\3\2\2\2\u0083\u0084\7\61"+
		"\2\2\u0084.\3\2\2\2\u0085\u0086\7\u0080\2\2\u0086\60\3\2\2\2\u0087\u0088"+
		"\7E\2\2\u0088\u0089\7~\2\2\u0089\62\3\2\2\2\u008a\u008b\7~\2\2\u008b\64"+
		"\3\2\2\2\u008c\u008e\t\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\66\3\2\2\2\u0091\u0092\t\3\2"+
		"\2\u00928\3\2\2\2\u0093\u0094\7o\2\2\u0094:\3\2\2\2\u0095\u0097\5\65\33"+
		"\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\7\61\2\2\u009b\u009d\5\65\33"+
		"\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f<\3\2\2\2\u00a0\u00a8\7`\2\2\u00a1\u00a2\7`\2\2\u00a2\u00a8"+
		"\7`\2\2\u00a3\u00a8\7a\2\2\u00a4\u00a5\7a\2\2\u00a5\u00a8\7a\2\2\u00a6"+
		"\u00a8\7?\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a3\3\2"+
		"\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8>\3\2\2\2\u00a9\u00aa"+
		"\t\4\2\2\u00aa@\3\2\2\2\u00ab\u00b7\7~\2\2\u00ac\u00ad\7~\2\2\u00ad\u00b7"+
		"\7~\2\2\u00ae\u00af\7]\2\2\u00af\u00b7\7~\2\2\u00b0\u00b1\7~\2\2\u00b1"+
		"\u00b7\7_\2\2\u00b2\u00b3\7<\2\2\u00b3\u00b7\7~\2\2\u00b4\u00b5\7~\2\2"+
		"\u00b5\u00b7\7<\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00ae"+
		"\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"B\3\2\2\2\u00b8\u00b9\7]\2\2\u00b9\u00bd\7\63\2\2\u00ba\u00bb\7]\2\2\u00bb"+
		"\u00bd\7\64\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bdD\3\2\2\2"+
		"\u00be\u00bf\t\5\2\2\u00bfF\3\2\2\2\u00c0\u00c2\7)\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00cb\3\2\2\2\u00c5\u00c7\7.\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c1\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cbH\3\2\2\2\u00cc\u00d0\7\'\2\2"+
		"\u00cd\u00cf\n\6\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\b%\2\2\u00d4J\3\2\2\2\u00d5\u00d7\t\7\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9L\3\2\2\2"+
		"\u00da\u00db\5\65\33\2\u00dbN\3\2\2\2\16\2\u008f\u0098\u009e\u00a7\u00b6"+
		"\u00bc\u00c3\u00c8\u00ca\u00d0\u00d8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}