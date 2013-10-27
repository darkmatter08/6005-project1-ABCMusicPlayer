// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'C'", "'C:'", "'\n'", "'*'", "'-'", "'['", "'('", 
		"'\r'", "'X:'", "'T:'", "'Q:'", "'w:'", "' '", "'-'", "'M:'", "'L:'", 
		"'_'", "'='", "'V:'", "'K:'", "'/'", "'~'", "'C|'", "KEYACCIDENTAL", "'m'", 
		"METERFRACTION", "ACCIDENTAL", "REST", "BARLINE", "NTHREPEAT", "BASENOTE", 
		"OCTAVE", "COMMENT", "WHITESPACE", "NUMBER", "STUFF", "'|'"
	};
	public static final int
		RULE_abctune = 0, RULE_abcheader = 1, RULE_fieldnumber = 2, RULE_fieldtitle = 3, 
		RULE_otherfields = 4, RULE_fieldcomposer = 5, RULE_fielddefaultlength = 6, 
		RULE_fieldmeter = 7, RULE_fieldtempo = 8, RULE_fieldvoice = 9, RULE_fieldkey = 10, 
		RULE_key = 11, RULE_keynote = 12, RULE_meter = 13, RULE_tempo = 14, RULE_abcmusic = 15, 
		RULE_abcline = 16, RULE_element = 17, RULE_noteelement = 18, RULE_note = 19, 
		RULE_noteorrest = 20, RULE_pitch = 21, RULE_notelength = 22, RULE_notelengthstrict = 23, 
		RULE_tupletelement = 24, RULE_tupletspec = 25, RULE_multinote = 26, RULE_midtunefield = 27, 
		RULE_lyric = 28, RULE_lyricalelement = 29;
	public static final String[] ruleNames = {
		"abctune", "abcheader", "fieldnumber", "fieldtitle", "otherfields", "fieldcomposer", 
		"fielddefaultlength", "fieldmeter", "fieldtempo", "fieldvoice", "fieldkey", 
		"key", "keynote", "meter", "tempo", "abcmusic", "abcline", "element", 
		"noteelement", "note", "noteorrest", "pitch", "notelength", "notelengthstrict", 
		"tupletelement", "tupletspec", "multinote", "midtunefield", "lyric", "lyricalelement"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public ABCMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AbctuneContext extends ParserRuleContext {
		public AbcmusicContext abcmusic() {
			return getRuleContext(AbcmusicContext.class,0);
		}
		public AbcheaderContext abcheader() {
			return getRuleContext(AbcheaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public AbctuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abctune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbctune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbctune(this);
		}
	}

	public final AbctuneContext abctune() throws RecognitionException {
		AbctuneContext _localctx = new AbctuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abctune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); abcheader();
			setState(61); abcmusic();
			setState(62); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbcheaderContext extends ParserRuleContext {
		public OtherfieldsContext otherfields(int i) {
			return getRuleContext(OtherfieldsContext.class,i);
		}
		public List<OtherfieldsContext> otherfields() {
			return getRuleContexts(OtherfieldsContext.class);
		}
		public FieldkeyContext fieldkey() {
			return getRuleContext(FieldkeyContext.class,0);
		}
		public FieldtitleContext fieldtitle() {
			return getRuleContext(FieldtitleContext.class,0);
		}
		public FieldnumberContext fieldnumber() {
			return getRuleContext(FieldnumberContext.class,0);
		}
		public AbcheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abcheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbcheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbcheader(this);
		}
	}

	public final AbcheaderContext abcheader() throws RecognitionException {
		AbcheaderContext _localctx = new AbcheaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abcheader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); fieldnumber();
			setState(65); fieldtitle();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 12) | (1L << 16) | (1L << 17) | (1L << 20))) != 0)) {
				{
				{
				setState(66); otherfields();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); fieldkey();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldnumberContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(ABCMusicParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ABCMusicParser.NUMBER); }
		public FieldnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldnumber(this);
		}
	}

	public final FieldnumberContext fieldnumber() throws RecognitionException {
		FieldnumberContext _localctx = new FieldnumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldnumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(10);
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75); match(NUMBER);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldtitleContext extends ParserRuleContext {
		public FieldtitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldtitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldtitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldtitle(this);
		}
	}

	public final FieldtitleContext fieldtitle() throws RecognitionException {
		FieldtitleContext _localctx = new FieldtitleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fieldtitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(11);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << KEYACCIDENTAL) | (1L << MODEMINOR) | (1L << METERFRACTION) | (1L << ACCIDENTAL) | (1L << REST) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << OCTAVE) | (1L << COMMENT) | (1L << WHITESPACE) | (1L << NUMBER) | (1L << STUFF) | (1L << BAR))) != 0) );
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherfieldsContext extends ParserRuleContext {
		public FieldvoiceContext fieldvoice() {
			return getRuleContext(FieldvoiceContext.class,0);
		}
		public FieldmeterContext fieldmeter() {
			return getRuleContext(FieldmeterContext.class,0);
		}
		public FielddefaultlengthContext fielddefaultlength() {
			return getRuleContext(FielddefaultlengthContext.class,0);
		}
		public FieldtempoContext fieldtempo() {
			return getRuleContext(FieldtempoContext.class,0);
		}
		public FieldcomposerContext fieldcomposer() {
			return getRuleContext(FieldcomposerContext.class,0);
		}
		public OtherfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherfields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOtherfields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOtherfields(this);
		}
	}

	public final OtherfieldsContext otherfields() throws RecognitionException {
		OtherfieldsContext _localctx = new OtherfieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_otherfields);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case 3:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); fieldcomposer();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); fielddefaultlength();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); fieldmeter();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 4);
				{
				setState(99); fieldtempo();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 5);
				{
				setState(100); fieldvoice();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldcomposerContext extends ParserRuleContext {
		public FieldcomposerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldcomposer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldcomposer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldcomposer(this);
		}
	}

	public final FieldcomposerContext fieldcomposer() throws RecognitionException {
		FieldcomposerContext _localctx = new FieldcomposerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldcomposer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(3);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << KEYACCIDENTAL) | (1L << MODEMINOR) | (1L << METERFRACTION) | (1L << ACCIDENTAL) | (1L << REST) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << OCTAVE) | (1L << COMMENT) | (1L << WHITESPACE) | (1L << NUMBER) | (1L << STUFF) | (1L << BAR))) != 0)) {
				{
				{
				setState(104);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FielddefaultlengthContext extends ParserRuleContext {
		public NotelengthstrictContext notelengthstrict() {
			return getRuleContext(NotelengthstrictContext.class,0);
		}
		public FielddefaultlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddefaultlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFielddefaultlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFielddefaultlength(this);
		}
	}

	public final FielddefaultlengthContext fielddefaultlength() throws RecognitionException {
		FielddefaultlengthContext _localctx = new FielddefaultlengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fielddefaultlength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(17);
			setState(116); notelengthstrict();
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldmeterContext extends ParserRuleContext {
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public FieldmeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldmeter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldmeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldmeter(this);
		}
	}

	public final FieldmeterContext fieldmeter() throws RecognitionException {
		FieldmeterContext _localctx = new FieldmeterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldmeter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(16);
			setState(123); meter();
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldtempoContext extends ParserRuleContext {
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public FieldtempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldtempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldtempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldtempo(this);
		}
	}

	public final FieldtempoContext fieldtempo() throws RecognitionException {
		FieldtempoContext _localctx = new FieldtempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldtempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(12);
			setState(130); tempo();
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldvoiceContext extends ParserRuleContext {
		public FieldvoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldvoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldvoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldvoice(this);
		}
	}

	public final FieldvoiceContext fieldvoice() throws RecognitionException {
		FieldvoiceContext _localctx = new FieldvoiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldvoice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(20);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 3) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 13) | (1L << 14) | (1L << 15) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << KEYACCIDENTAL) | (1L << MODEMINOR) | (1L << METERFRACTION) | (1L << ACCIDENTAL) | (1L << REST) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << OCTAVE) | (1L << COMMENT) | (1L << WHITESPACE) | (1L << NUMBER) | (1L << STUFF) | (1L << BAR))) != 0)) {
				{
				{
				setState(137);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(143);
					_la = _input.LA(1);
					if ( !(_la==4 || _la==9) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldkeyContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public FieldkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterFieldkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitFieldkey(this);
		}
	}

	public final FieldkeyContext fieldkey() throws RecognitionException {
		FieldkeyContext _localctx = new FieldkeyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(21);
			setState(149); key();
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode MODEMINOR() { return getToken(ABCMusicParser.MODEMINOR, 0); }
		public KeynoteContext keynote() {
			return getRuleContext(KeynoteContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); keynote();
			setState(157);
			_la = _input.LA(1);
			if (_la==MODEMINOR) {
				{
				setState(156); match(MODEMINOR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeynoteContext extends ParserRuleContext {
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public TerminalNode KEYACCIDENTAL() { return getToken(ABCMusicParser.KEYACCIDENTAL, 0); }
		public KeynoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keynote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterKeynote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitKeynote(this);
		}
	}

	public final KeynoteContext keynote() throws RecognitionException {
		KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_keynote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(BASENOTE);
			setState(161);
			_la = _input.LA(1);
			if (_la==KEYACCIDENTAL) {
				{
				setState(160); match(KEYACCIDENTAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeterContext extends ParserRuleContext {
		public TerminalNode METERFRACTION() { return getToken(ABCMusicParser.METERFRACTION, 0); }
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_meter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 24) | (1L << METERFRACTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode METERFRACTION() { return getToken(ABCMusicParser.METERFRACTION, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(ABCMusicParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ABCMusicParser.NUMBER); }
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(METERFRACTION);
			setState(166); match(19);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167); match(NUMBER);
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbcmusicContext extends ParserRuleContext {
		public AbclineContext abcline(int i) {
			return getRuleContext(AbclineContext.class,i);
		}
		public List<AbclineContext> abcline() {
			return getRuleContexts(AbclineContext.class);
		}
		public AbcmusicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abcmusic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbcmusic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbcmusic(this);
		}
	}

	public final AbcmusicContext abcmusic() throws RecognitionException {
		AbcmusicContext _localctx = new AbcmusicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_abcmusic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172); abcline();
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 8) | (1L << 20) | (1L << ACCIDENTAL) | (1L << REST) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << WHITESPACE))) != 0) );
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==4 || _la==9) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbclineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public MidtunefieldContext midtunefield() {
			return getRuleContext(MidtunefieldContext.class,0);
		}
		public AbclineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abcline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbcline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbcline(this);
		}
	}

	public final AbclineContext abcline() throws RecognitionException {
		AbclineContext _localctx = new AbclineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_abcline);
		int _la;
		try {
			int _alt;
			setState(208);
			switch (_input.LA(1)) {
			case 7:
			case 8:
			case ACCIDENTAL:
			case REST:
			case BARLINE:
			case NTHREPEAT:
			case BASENOTE:
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(182); element();
						setState(186);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==14) {
							{
							{
							setState(183); match(14);
							}
							}
							setState(188);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(192);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(189); element();
								}
								} 
							}
							setState(194);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(197); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(205);
				_la = _input.LA(1);
				if (_la==13) {
					{
					setState(199); lyric();
					setState(201); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(200);
							_la = _input.LA(1);
							if ( !(_la==4 || _la==9) ) {
							_errHandler.recoverInline(this);
							}
							consume();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(203); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					} while ( _alt!=2 && _alt!=-1 );
					}
				}

				}
				break;
			case 20:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); midtunefield();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode BARLINE() { return getToken(ABCMusicParser.BARLINE, 0); }
		public TerminalNode WHITESPACE() { return getToken(ABCMusicParser.WHITESPACE, 0); }
		public TerminalNode NTHREPEAT() { return getToken(ABCMusicParser.NTHREPEAT, 0); }
		public TupletelementContext tupletelement() {
			return getRuleContext(TupletelementContext.class,0);
		}
		public NoteelementContext noteelement() {
			return getRuleContext(NoteelementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_element);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case 7:
			case ACCIDENTAL:
			case REST:
			case BASENOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); noteelement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); tupletelement();
				}
				break;
			case BARLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(212); match(BARLINE);
				}
				break;
			case NTHREPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(213); match(NTHREPEAT);
				}
				break;
			case WHITESPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(214); match(WHITESPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteelementContext extends ParserRuleContext {
		public MultinoteContext multinote() {
			return getRuleContext(MultinoteContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public NoteelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNoteelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNoteelement(this);
		}
	}

	public final NoteelementContext noteelement() throws RecognitionException {
		NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_noteelement);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BASENOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); note();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); multinote();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteContext extends ParserRuleContext {
		public NoteorrestContext noteorrest() {
			return getRuleContext(NoteorrestContext.class,0);
		}
		public NotelengthContext notelength() {
			return getRuleContext(NotelengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); noteorrest();
			setState(223);
			_la = _input.LA(1);
			if (_la==22 || _la==NUMBER) {
				{
				setState(222); notelength();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteorrestContext extends ParserRuleContext {
		public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public NoteorrestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteorrest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNoteorrest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNoteorrest(this);
		}
	}

	public final NoteorrestContext noteorrest() throws RecognitionException {
		NoteorrestContext _localctx = new NoteorrestContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_noteorrest);
		try {
			setState(227);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASENOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); match(REST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PitchContext extends ParserRuleContext {
		public TerminalNode OCTAVE() { return getToken(ABCMusicParser.OCTAVE, 0); }
		public TerminalNode BASENOTE() { return getToken(ABCMusicParser.BASENOTE, 0); }
		public TerminalNode ACCIDENTAL() { return getToken(ABCMusicParser.ACCIDENTAL, 0); }
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(229); match(ACCIDENTAL);
				}
			}

			setState(232); match(BASENOTE);
			setState(234);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(233); match(OCTAVE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotelengthContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(ABCMusicParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ABCMusicParser.NUMBER); }
		public NotelengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelength(this);
		}
	}

	public final NotelengthContext notelength() throws RecognitionException {
		NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_notelength);
		int _la;
		try {
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236); match(NUMBER);
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(241); match(NUMBER);
						}
						}
						setState(244); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NUMBER );
					}
				}

				{
				setState(248); match(22);
				setState(254);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(250); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(249); match(NUMBER);
						}
						}
						setState(252); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NUMBER );
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotelengthstrictContext extends ParserRuleContext {
		public TerminalNode METERFRACTION() { return getToken(ABCMusicParser.METERFRACTION, 0); }
		public NotelengthstrictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notelengthstrict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNotelengthstrict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNotelengthstrict(this);
		}
	}

	public final NotelengthstrictContext notelengthstrict() throws RecognitionException {
		NotelengthstrictContext _localctx = new NotelengthstrictContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_notelengthstrict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(METERFRACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupletelementContext extends ParserRuleContext {
		public TupletspecContext tupletspec() {
			return getRuleContext(TupletspecContext.class,0);
		}
		public NoteelementContext noteelement(int i) {
			return getRuleContext(NoteelementContext.class,i);
		}
		public List<NoteelementContext> noteelement() {
			return getRuleContexts(NoteelementContext.class);
		}
		public TupletelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTupletelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTupletelement(this);
		}
	}

	public final TupletelementContext tupletelement() throws RecognitionException {
		TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tupletelement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260); tupletspec();
			setState(262); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(261); noteelement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(264); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupletspecContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ABCMusicParser.NUMBER, 0); }
		public TupletspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTupletspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTupletspec(this);
		}
	}

	public final TupletspecContext tupletspec() throws RecognitionException {
		TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tupletspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(8);
			setState(267); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultinoteContext extends ParserRuleContext {
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public MultinoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multinote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMultinote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMultinote(this);
		}
	}

	public final MultinoteContext multinote() throws RecognitionException {
		MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multinote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269); match(7);
			setState(271); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(270); note();
				}
				}
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BASENOTE))) != 0) );
			setState(275); match(1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MidtunefieldContext extends ParserRuleContext {
		public FieldvoiceContext fieldvoice() {
			return getRuleContext(FieldvoiceContext.class,0);
		}
		public MidtunefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midtunefield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMidtunefield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMidtunefield(this);
		}
	}

	public final MidtunefieldContext midtunefield() throws RecognitionException {
		MidtunefieldContext _localctx = new MidtunefieldContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_midtunefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); fieldvoice();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LyricContext extends ParserRuleContext {
		public LyricalelementContext lyricalelement(int i) {
			return getRuleContext(LyricalelementContext.class,i);
		}
		public List<LyricalelementContext> lyricalelement() {
			return getRuleContexts(LyricalelementContext.class);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lyric);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(13);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(280); lyricalelement();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LyricalelementContext extends ParserRuleContext {
		public LyricalelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyricalelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyricalelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyricalelement(this);
		}
	}

	public final LyricalelementContext lyricalelement() throws RecognitionException {
		LyricalelementContext _localctx = new LyricalelementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lyricalelement);
		int _la;
		try {
			int _alt;
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(286); match(14);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(289); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); match(6);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292); match(18);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293); match(5);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294); match(23);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(295); match(15);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(296); match(BAR);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(300);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(297);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==4 || _la==9) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						} 
					}
					setState(302);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3(\u0134\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3"+
		"\3\4\3\4\6\4O\n\4\r\4\16\4P\3\4\6\4T\n\4\r\4\16\4U\3\5\3\5\6\5Z\n\5\r"+
		"\5\16\5[\3\5\6\5_\n\5\r\5\16\5`\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\7"+
		"\7l\n\7\f\7\16\7o\13\7\3\7\6\7r\n\7\r\7\16\7s\3\b\3\b\3\b\6\by\n\b\r\b"+
		"\16\bz\3\t\3\t\3\t\6\t\u0080\n\t\r\t\16\t\u0081\3\n\3\n\3\n\6\n\u0087"+
		"\n\n\r\n\16\n\u0088\3\13\3\13\7\13\u008d\n\13\f\13\16\13\u0090\13\13\3"+
		"\13\6\13\u0093\n\13\r\13\16\13\u0094\3\f\3\f\3\f\6\f\u009a\n\f\r\f\16"+
		"\f\u009b\3\r\3\r\5\r\u00a0\n\r\3\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\20"+
		"\3\20\3\20\6\20\u00ab\n\20\r\20\16\20\u00ac\3\21\6\21\u00b0\n\21\r\21"+
		"\16\21\u00b1\3\21\6\21\u00b5\n\21\r\21\16\21\u00b6\3\22\3\22\7\22\u00bb"+
		"\n\22\f\22\16\22\u00be\13\22\3\22\7\22\u00c1\n\22\f\22\16\22\u00c4\13"+
		"\22\6\22\u00c6\n\22\r\22\16\22\u00c7\3\22\3\22\6\22\u00cc\n\22\r\22\16"+
		"\22\u00cd\5\22\u00d0\n\22\3\22\5\22\u00d3\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00da\n\23\3\24\3\24\5\24\u00de\n\24\3\25\3\25\5\25\u00e2\n\25\3"+
		"\26\3\26\5\26\u00e6\n\26\3\27\5\27\u00e9\n\27\3\27\3\27\5\27\u00ed\n\27"+
		"\3\30\6\30\u00f0\n\30\r\30\16\30\u00f1\3\30\6\30\u00f5\n\30\r\30\16\30"+
		"\u00f6\5\30\u00f9\n\30\3\30\3\30\6\30\u00fd\n\30\r\30\16\30\u00fe\5\30"+
		"\u0101\n\30\5\30\u0103\n\30\3\31\3\31\3\32\3\32\6\32\u0109\n\32\r\32\16"+
		"\32\u010a\3\33\3\33\3\33\3\34\3\34\6\34\u0112\n\34\r\34\16\34\u0113\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\7\36\u011c\n\36\f\36\16\36\u011f\13\36\3"+
		"\37\6\37\u0122\n\37\r\37\16\37\u0123\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u012d\n\37\f\37\16\37\u0130\13\37\5\37\u0132\n\37\3\37\2 \2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\21\4\6\6\13"+
		"\13\4\6\6\13\13\4\6\6\13\13\4\6\6\13\13\4\6\6\13\13\4\6\6\13\13\4\6\6"+
		"\13\13\4\6\6\13\13\4\6\6\13\13\4\6\6\13\13\4\6\6\13\13\5\4\4\32\32\35"+
		"\35\4\6\6\13\13\4\6\6\13\13\4\6\6\13\13\u014c\2>\3\2\2\2\4B\3\2\2\2\6"+
		"L\3\2\2\2\bW\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16u\3\2\2\2\20|\3\2\2\2\22"+
		"\u0083\3\2\2\2\24\u008a\3\2\2\2\26\u0096\3\2\2\2\30\u009d\3\2\2\2\32\u00a1"+
		"\3\2\2\2\34\u00a5\3\2\2\2\36\u00a7\3\2\2\2 \u00af\3\2\2\2\"\u00d2\3\2"+
		"\2\2$\u00d9\3\2\2\2&\u00dd\3\2\2\2(\u00df\3\2\2\2*\u00e5\3\2\2\2,\u00e8"+
		"\3\2\2\2.\u0102\3\2\2\2\60\u0104\3\2\2\2\62\u0106\3\2\2\2\64\u010c\3\2"+
		"\2\2\66\u010f\3\2\2\28\u0117\3\2\2\2:\u0119\3\2\2\2<\u0131\3\2\2\2>?\5"+
		"\4\3\2?@\5 \21\2@A\7\1\2\2A\3\3\2\2\2BC\5\6\4\2CG\5\b\5\2DF\5\n\6\2ED"+
		"\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\26\f\2"+
		"K\5\3\2\2\2LN\7\f\2\2MO\7&\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QS\3\2\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2"+
		"\2WY\7\r\2\2XZ\n\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2"+
		"\2\2]_\t\4\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\t\3\2\2\2bh\5"+
		"\f\7\2ch\5\16\b\2dh\5\20\t\2eh\5\22\n\2fh\5\24\13\2gb\3\2\2\2gc\3\2\2"+
		"\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\13\3\2\2\2im\7\5\2\2jl\n\5\2\2kj\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2nq\3\2\2\2om\3\2\2\2pr\t\6\2\2qp\3\2"+
		"\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\r\3\2\2\2uv\7\23\2\2vx\5\60\31\2w"+
		"y\t\7\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\17\3\2\2\2|}\7\22\2"+
		"\2}\177\5\34\17\2~\u0080\t\b\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\21\3\2\2\2\u0083\u0084\7\16\2\2"+
		"\u0084\u0086\5\36\20\2\u0085\u0087\t\t\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\23\3\2\2\2\u008a"+
		"\u008e\7\26\2\2\u008b\u008d\n\n\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\t\13\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\25\3\2\2\2\u0096"+
		"\u0097\7\27\2\2\u0097\u0099\5\30\r\2\u0098\u009a\t\f\2\2\u0099\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\27\3\2\2\2\u009d\u009f\5\32\16\2\u009e\u00a0\7\34\2\2\u009f\u009e\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\31\3\2\2\2\u00a1\u00a3\7\"\2\2\u00a2\u00a4"+
		"\7\33\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a6\t\r\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00aa\7\25"+
		"\2\2\u00a9\u00ab\7&\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00b0\5\"\22"+
		"\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\t\16\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3"+
		"\2\2\2\u00b8\u00bc\5$\23\2\u00b9\u00bb\7\20\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\5$\23\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00b8\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cf\3\2\2\2\u00c9\u00cb\5:"+
		"\36\2\u00ca\u00cc\t\17\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c9\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\58\35\2\u00d2"+
		"\u00c5\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3#\3\2\2\2\u00d4\u00da\5&\24\2"+
		"\u00d5\u00da\5\62\32\2\u00d6\u00da\7 \2\2\u00d7\u00da\7!\2\2\u00d8\u00da"+
		"\7%\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da%\3\2\2\2\u00db\u00de\5(\25\2"+
		"\u00dc\u00de\5\66\34\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\'"+
		"\3\2\2\2\u00df\u00e1\5*\26\2\u00e0\u00e2\5.\30\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2)\3\2\2\2\u00e3\u00e6\5,\27\2\u00e4\u00e6\7\37\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6+\3\2\2\2\u00e7\u00e9\7"+
		"\36\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\7\"\2\2\u00eb\u00ed\7#\2\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed-\3\2\2\2\u00ee\u00f0\7&\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u0103\3\2\2\2\u00f3"+
		"\u00f5\7&\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0100\7\30\2\2\u00fb\u00fd\7"+
		"&\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u00ef\3\2\2\2\u0102\u00f8\3\2\2\2\u0103"+
		"/\3\2\2\2\u0104\u0105\7\35\2\2\u0105\61\3\2\2\2\u0106\u0108\5\64\33\2"+
		"\u0107\u0109\5&\24\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\63\3\2\2\2\u010c\u010d\7\n\2\2\u010d"+
		"\u010e\7&\2\2\u010e\65\3\2\2\2\u010f\u0111\7\t\2\2\u0110\u0112\5(\25\2"+
		"\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\3\2\2\u0116\67\3\2\2\2\u0117"+
		"\u0118\5\24\13\2\u01189\3\2\2\2\u0119\u011d\7\17\2\2\u011a\u011c\5<\37"+
		"\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e;\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\7\20\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0132\3\2\2\2\u0125\u0132\7\b\2\2\u0126\u0132\7\24\2\2\u0127"+
		"\u0132\7\7\2\2\u0128\u0132\7\31\2\2\u0129\u0132\7\21\2\2\u012a\u0132\7"+
		"(\2\2\u012b\u012d\n\20\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0121\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u0126\3\2\2\2\u0131"+
		"\u0127\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u0129\3\2\2\2\u0131\u012a\3\2"+
		"\2\2\u0131\u012e\3\2\2\2\u0132=\3\2\2\2-GPU[`gmsz\u0081\u0088\u008e\u0094"+
		"\u009b\u009f\u00a3\u00ac\u00b1\u00b6\u00bc\u00c2\u00c7\u00cd\u00cf\u00d2"+
		"\u00d9\u00dd\u00e1\u00e5\u00e8\u00ec\u00f1\u00f6\u00f8\u00fe\u0100\u0102"+
		"\u010a\u0113\u011d\u0123\u012e\u0131";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}