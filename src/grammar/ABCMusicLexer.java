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
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		KEYACCIDENTAL=25, MODEMINOR=26, METERFRACTION=27, ACCIDENTAL=28, REST=29, 
		BARLINE=30, NTHREPEAT=31, BASENOTE=32, OCTAVE=33, COMMENT=34, WHITESPACE=35, 
		NUMBER=36, STUFF=37, BAR=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'C'", "'C:'", "'\n'", "'*'", "'-'", "'['", "'('", "'\r'", "'X:'", 
		"'T:'", "'Q:'", "'w:'", "' '", "'-'", "'M:'", "'L:'", "'_'", "'='", "'V:'", 
		"'K:'", "'/'", "'~'", "'C|'", "KEYACCIDENTAL", "'m'", "METERFRACTION", 
		"ACCIDENTAL", "REST", "BARLINE", "NTHREPEAT", "BASENOTE", "OCTAVE", "COMMENT", 
		"WHITESPACE", "NUMBER", "STUFF", "'|'"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "DIGIT", 
		"KEYACCIDENTAL", "MODEMINOR", "METERFRACTION", "ACCIDENTAL", "REST", "BARLINE", 
		"NTHREPEAT", "BASENOTE", "OCTAVE", "COMMENT", "WHITESPACE", "NUMBER", 
		"STUFF", "BAR"
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
		case 34: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4(\u00da\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\6\32\u008e\n\32\r\32\16\32\u008f\3\33\3\33\3\34\3\34\3\35\6\35\u0097"+
		"\n\35\r\35\16\35\u0098\3\35\3\35\6\35\u009d\n\35\r\35\16\35\u009e\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00a8\n\36\3\37\3\37\3 \3 \5 \u00ae"+
		"\n \3!\3!\3!\3!\5!\u00b4\n!\3\"\3\"\3#\6#\u00b9\n#\r#\16#\u00ba\3#\6#"+
		"\u00be\n#\r#\16#\u00bf\5#\u00c2\n#\3$\3$\7$\u00c6\n$\f$\16$\u00c9\13$"+
		"\3$\3$\3%\6%\u00ce\n%\r%\16%\u00cf\3&\3&\3\'\6\'\u00d5\n\'\r\'\16\'\u00d6"+
		"\3(\3(\2)\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25"+
		"\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)"+
		"\26\1+\27\1-\30\1/\31\1\61\32\1\63\2\1\65\33\1\67\34\19\35\1;\36\1=\37"+
		"\1? \1A!\1C\"\1E#\1G$\2I%\1K&\1M\'\1O(\1\3\2\t\3\62;\4%%dd\4\\\\||\4C"+
		"Ici\4\f\f\17\17\5\13\13\"\"))\4C\\c|\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2\r\\\3\2"+
		"\2\2\17^\3\2\2\2\21`\3\2\2\2\23b\3\2\2\2\25d\3\2\2\2\27g\3\2\2\2\31j\3"+
		"\2\2\2\33m\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!u\3\2\2\2#x\3\2\2\2%{\3\2\2"+
		"\2\'}\3\2\2\2)\177\3\2\2\2+\u0082\3\2\2\2-\u0085\3\2\2\2/\u0087\3\2\2"+
		"\2\61\u0089\3\2\2\2\63\u008d\3\2\2\2\65\u0091\3\2\2\2\67\u0093\3\2\2\2"+
		"9\u0096\3\2\2\2;\u00a7\3\2\2\2=\u00a9\3\2\2\2?\u00ab\3\2\2\2A\u00b3\3"+
		"\2\2\2C\u00b5\3\2\2\2E\u00c1\3\2\2\2G\u00c3\3\2\2\2I\u00cd\3\2\2\2K\u00d1"+
		"\3\2\2\2M\u00d4\3\2\2\2O\u00d8\3\2\2\2QR\7_\2\2R\4\3\2\2\2ST\7E\2\2T\6"+
		"\3\2\2\2UV\7E\2\2VW\7<\2\2W\b\3\2\2\2XY\7\f\2\2Y\n\3\2\2\2Z[\7,\2\2[\f"+
		"\3\2\2\2\\]\7/\2\2]\16\3\2\2\2^_\7]\2\2_\20\3\2\2\2`a\7*\2\2a\22\3\2\2"+
		"\2bc\7\17\2\2c\24\3\2\2\2de\7Z\2\2ef\7<\2\2f\26\3\2\2\2gh\7V\2\2hi\7<"+
		"\2\2i\30\3\2\2\2jk\7S\2\2kl\7<\2\2l\32\3\2\2\2mn\7y\2\2no\7<\2\2o\34\3"+
		"\2\2\2pq\7\"\2\2q\36\3\2\2\2rs\7^\2\2st\7/\2\2t \3\2\2\2uv\7O\2\2vw\7"+
		"<\2\2w\"\3\2\2\2xy\7N\2\2yz\7<\2\2z$\3\2\2\2{|\7a\2\2|&\3\2\2\2}~\7?\2"+
		"\2~(\3\2\2\2\177\u0080\7X\2\2\u0080\u0081\7<\2\2\u0081*\3\2\2\2\u0082"+
		"\u0083\7M\2\2\u0083\u0084\7<\2\2\u0084,\3\2\2\2\u0085\u0086\7\61\2\2\u0086"+
		".\3\2\2\2\u0087\u0088\7\u0080\2\2\u0088\60\3\2\2\2\u0089\u008a\7E\2\2"+
		"\u008a\u008b\7~\2\2\u008b\62\3\2\2\2\u008c\u008e\t\2\2\2\u008d\u008c\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\64\3\2\2\2\u0091\u0092\t\3\2\2\u0092\66\3\2\2\2\u0093\u0094\7o\2\2\u0094"+
		"8\3\2\2\2\u0095\u0097\5\63\32\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\7\61\2\2\u009b\u009d\5\63\32\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f:\3\2\2\2\u00a0\u00a8"+
		"\7`\2\2\u00a1\u00a2\7`\2\2\u00a2\u00a8\7`\2\2\u00a3\u00a8\7a\2\2\u00a4"+
		"\u00a5\7a\2\2\u00a5\u00a8\7a\2\2\u00a6\u00a8\7?\2\2\u00a7\u00a0\3\2\2"+
		"\2\u00a7\u00a1\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8<\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa>\3\2\2\2\u00ab\u00ad"+
		"\5O(\2\u00ac\u00ae\5O(\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"@\3\2\2\2\u00af\u00b0\7]\2\2\u00b0\u00b4\7\63\2\2\u00b1\u00b2\7]\2\2\u00b2"+
		"\u00b4\7\64\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4B\3\2\2\2"+
		"\u00b5\u00b6\t\5\2\2\u00b6D\3\2\2\2\u00b7\u00b9\7)\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00c2\3\2\2\2\u00bc\u00be\7.\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00b8\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2F\3\2\2\2\u00c3\u00c7\7\'\2\2"+
		"\u00c4\u00c6\n\6\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\b$\2\2\u00cbH\3\2\2\2\u00cc\u00ce\t\7\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0J\3\2\2\2"+
		"\u00d1\u00d2\5\63\32\2\u00d2L\3\2\2\2\u00d3\u00d5\t\b\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"N\3\2\2\2\u00d8\u00d9\7~\2\2\u00d9P\3\2\2\2\17\2\u008f\u0098\u009e\u00a7"+
		"\u00ad\u00b3\u00ba\u00bf\u00c1\u00c7\u00cf\u00d6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}