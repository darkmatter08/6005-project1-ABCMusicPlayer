// Generated from ./ABCMusicParser.g4 by ANTLR 4.0

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
		CLOSEPAREN=24, VOICEBODY=11, KEY=7, REST=14, COMMENTBODY=29, NUMBER=26, 
		COMPOSER=1, OPENBRACKET=20, BASENOTE=17, OCTAVE=18, WHITESPACE=19, ACCIDENTAL=13, 
		MODEMINOR=12, LENGTH=2, LINEFEED=25, CLOSEBRACKET=21, INDEX=6, NTHREPEAT=16, 
		VOICE=8, NOCOMMENTBODY=28, BARLINE=15, NOCOMMENT=9, FRACTIONBAR=22, METER=3, 
		OPENPAREN=23, COMMENT=10, TEMPO=4, LYRIC=27, TITLE=5;
	public static final String[] tokenNames = {
		"<INVALID>", "COMPOSER", "LENGTH", "METER", "TEMPO", "TITLE", "INDEX", 
		"KEY", "VOICE", "NOCOMMENT", "COMMENT", "VOICEBODY", "'m'", "ACCIDENTAL", 
		"REST", "BARLINE", "NTHREPEAT", "BASENOTE", "OCTAVE", "WHITESPACE", "'['", 
		"']'", "'/'", "'('", "')'", "LINEFEED", "NUMBER", "LYRIC", "NOCOMMENTBODY", 
		"COMMENTBODY"
	};
	public static final int
		RULE_abctune = 0, RULE_abcheader = 1, RULE_optionalfields = 2, RULE_abcbody = 3, 
		RULE_bodysection = 4, RULE_element = 5, RULE_noteelement = 6, RULE_note = 7, 
		RULE_multinote = 8, RULE_noteorrest = 9, RULE_pitch = 10, RULE_notelength = 11, 
		RULE_tupletelement = 12, RULE_tupletspec = 13, RULE_midtunefield = 14;
	public static final String[] ruleNames = {
		"abctune", "abcheader", "optionalfields", "abcbody", "bodysection", "element", 
		"noteelement", "note", "multinote", "noteorrest", "pitch", "notelength", 
		"tupletelement", "tupletspec", "midtunefield"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusicParser.g4"; }

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
		public AbcheaderContext abcheader() {
			return getRuleContext(AbcheaderContext.class,0);
		}
		public AbcbodyContext abcbody() {
			return getRuleContext(AbcbodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public AbctuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abctune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterAbctune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitAbctune(this);
		}
	}

	public final AbctuneContext abctune() throws RecognitionException {
		AbctuneContext _localctx = new AbctuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abctune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); abcheader();
			setState(31); abcbody();
			setState(32); match(EOF);
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
		public TerminalNode INDEX() { return getToken(ABCMusicParser.INDEX, 0); }
		public OptionalfieldsContext optionalfields() {
			return getRuleContext(OptionalfieldsContext.class,0);
		}
		public TerminalNode KEY() { return getToken(ABCMusicParser.KEY, 0); }
		public TerminalNode TITLE() { return getToken(ABCMusicParser.TITLE, 0); }
		public AbcheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abcheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterAbcheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitAbcheader(this);
		}
	}

	public final AbcheaderContext abcheader() throws RecognitionException {
		AbcheaderContext _localctx = new AbcheaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abcheader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(INDEX);
			setState(35); match(TITLE);
			setState(37);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER) | (1L << LENGTH) | (1L << METER) | (1L << TEMPO) | (1L << VOICE))) != 0)) {
				{
				setState(36); optionalfields();
				}
			}

			setState(39); match(KEY);
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

	public static class OptionalfieldsContext extends ParserRuleContext {
		public TerminalNode LENGTH(int i) {
			return getToken(ABCMusicParser.LENGTH, i);
		}
		public TerminalNode TEMPO(int i) {
			return getToken(ABCMusicParser.TEMPO, i);
		}
		public List<TerminalNode> METER() { return getTokens(ABCMusicParser.METER); }
		public List<TerminalNode> VOICE() { return getTokens(ABCMusicParser.VOICE); }
		public List<TerminalNode> TEMPO() { return getTokens(ABCMusicParser.TEMPO); }
		public TerminalNode METER(int i) {
			return getToken(ABCMusicParser.METER, i);
		}
		public List<TerminalNode> LENGTH() { return getTokens(ABCMusicParser.LENGTH); }
		public TerminalNode VOICE(int i) {
			return getToken(ABCMusicParser.VOICE, i);
		}
		public TerminalNode COMPOSER(int i) {
			return getToken(ABCMusicParser.COMPOSER, i);
		}
		public List<TerminalNode> COMPOSER() { return getTokens(ABCMusicParser.COMPOSER); }
		public OptionalfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalfields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterOptionalfields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitOptionalfields(this);
		}
	}

	public final OptionalfieldsContext optionalfields() throws RecognitionException {
		OptionalfieldsContext _localctx = new OptionalfieldsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optionalfields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER) | (1L << LENGTH) | (1L << METER) | (1L << TEMPO) | (1L << VOICE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER) | (1L << LENGTH) | (1L << METER) | (1L << TEMPO) | (1L << VOICE))) != 0) );
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

	public static class AbcbodyContext extends ParserRuleContext {
		public List<BodysectionContext> bodysection() {
			return getRuleContexts(BodysectionContext.class);
		}
		public BodysectionContext bodysection(int i) {
			return getRuleContext(BodysectionContext.class,i);
		}
		public AbcbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abcbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterAbcbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitAbcbody(this);
		}
	}

	public final AbcbodyContext abcbody() throws RecognitionException {
		AbcbodyContext _localctx = new AbcbodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_abcbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46); bodysection();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOICEBODY) | (1L << ACCIDENTAL) | (1L << REST) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << OPENBRACKET) | (1L << OPENPAREN))) != 0) );
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

	public static class BodysectionContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public TerminalNode LINEFEED(int i) {
			return getToken(ABCMusicParser.LINEFEED, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public MidtunefieldContext midtunefield() {
			return getRuleContext(MidtunefieldContext.class,0);
		}
		public TerminalNode LYRIC() { return getToken(ABCMusicParser.LYRIC, 0); }
		public List<TerminalNode> LINEFEED() { return getTokens(ABCMusicParser.LINEFEED); }
		public BodysectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodysection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterBodysection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitBodysection(this);
		}
	}

	public final BodysectionContext bodysection() throws RecognitionException {
		BodysectionContext _localctx = new BodysectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bodysection);
		int _la;
		try {
			setState(70);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BARLINE:
			case NTHREPEAT:
			case BASENOTE:
			case OPENBRACKET:
			case OPENPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51); element();
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << BASENOTE) | (1L << OPENBRACKET) | (1L << OPENPAREN))) != 0) );
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56); match(LINEFEED);
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LINEFEED );
				setState(67);
				_la = _input.LA(1);
				if (_la==LYRIC) {
					{
					setState(61); match(LYRIC);
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(62); match(LINEFEED);
						}
						}
						setState(65); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==LINEFEED );
					}
				}

				}
				break;
			case VOICEBODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); midtunefield();
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
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_element);
		try {
			setState(76);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BASENOTE:
			case OPENBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); noteelement();
				}
				break;
			case OPENPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); tupletelement();
				}
				break;
			case BARLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); match(BARLINE);
				}
				break;
			case NTHREPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); match(NTHREPEAT);
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
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterNoteelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitNoteelement(this);
		}
	}

	public final NoteelementContext noteelement() throws RecognitionException {
		NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_noteelement);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BASENOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); note();
				}
				break;
			case OPENBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); multinote();
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
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); noteorrest();
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(83); notelength();
				}
				break;
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

	public static class MultinoteContext extends ParserRuleContext {
		public TerminalNode CLOSEBRACKET() { return getToken(ABCMusicParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENBRACKET() { return getToken(ABCMusicParser.OPENBRACKET, 0); }
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
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterMultinote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitMultinote(this);
		}
	}

	public final MultinoteContext multinote() throws RecognitionException {
		MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multinote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(OPENBRACKET);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87); note();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BASENOTE))) != 0) );
			setState(92); match(CLOSEBRACKET);
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
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterNoteorrest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitNoteorrest(this);
		}
	}

	public final NoteorrestContext noteorrest() throws RecognitionException {
		NoteorrestContext _localctx = new NoteorrestContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_noteorrest);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASENOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(REST);
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
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(98); match(ACCIDENTAL);
				}
			}

			setState(101); match(BASENOTE);
			setState(103);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(102); match(OCTAVE);
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
		public TerminalNode FRACTIONBAR() { return getToken(ABCMusicParser.FRACTIONBAR, 0); }
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
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterNotelength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitNotelength(this);
		}
	}

	public final NotelengthContext notelength() throws RecognitionException {
		NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_notelength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(105); match(NUMBER);
				}
				break;
			}
			setState(109);
			_la = _input.LA(1);
			if (_la==FRACTIONBAR) {
				{
				setState(108); match(FRACTIONBAR);
				}
			}

			setState(112);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(111); match(NUMBER);
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
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterTupletelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitTupletelement(this);
		}
	}

	public final TupletelementContext tupletelement() throws RecognitionException {
		TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tupletelement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114); tupletspec();
			setState(116); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(115); noteelement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public TerminalNode OPENPAREN() { return getToken(ABCMusicParser.OPENPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(ABCMusicParser.NUMBER, 0); }
		public TupletspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterTupletspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitTupletspec(this);
		}
	}

	public final TupletspecContext tupletspec() throws RecognitionException {
		TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tupletspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(OPENPAREN);
			setState(121); match(NUMBER);
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
		public TerminalNode VOICEBODY() { return getToken(ABCMusicParser.VOICEBODY, 0); }
		public MidtunefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midtunefield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).enterMidtunefield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicParserListener ) ((ABCMusicParserListener)listener).exitMidtunefield(this);
		}
	}

	public final MidtunefieldContext midtunefield() throws RecognitionException {
		MidtunefieldContext _localctx = new MidtunefieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_midtunefield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(VOICEBODY);
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
		"\2\3\37\u0080\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3(\n\3\3\3\3\3\3\4\6\4-\n\4\r\4\16\4"+
		".\3\5\6\5\62\n\5\r\5\16\5\63\3\6\6\6\67\n\6\r\6\16\68\3\6\6\6<\n\6\r\6"+
		"\16\6=\3\6\3\6\6\6B\n\6\r\6\16\6C\5\6F\n\6\3\6\5\6I\n\6\3\7\3\7\3\7\3"+
		"\7\5\7O\n\7\3\b\3\b\5\bS\n\b\3\t\3\t\5\tW\n\t\3\n\3\n\6\n[\n\n\r\n\16"+
		"\n\\\3\n\3\n\3\13\3\13\5\13c\n\13\3\f\5\ff\n\f\3\f\3\f\5\fj\n\f\3\r\5"+
		"\rm\n\r\3\r\5\rp\n\r\3\r\5\rs\n\r\3\16\3\16\6\16w\n\16\r\16\16\16x\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\3\4\3\6\n\n\u0085\2 \3\2\2\2\4$\3\2\2\2\6,\3\2\2\2\b\61\3\2\2\2\nH"+
		"\3\2\2\2\fN\3\2\2\2\16R\3\2\2\2\20T\3\2\2\2\22X\3\2\2\2\24b\3\2\2\2\26"+
		"e\3\2\2\2\30l\3\2\2\2\32t\3\2\2\2\34z\3\2\2\2\36}\3\2\2\2 !\5\4\3\2!\""+
		"\5\b\5\2\"#\7\1\2\2#\3\3\2\2\2$%\7\b\2\2%\'\7\7\2\2&(\5\6\4\2\'&\3\2\2"+
		"\2\'(\3\2\2\2()\3\2\2\2)*\7\t\2\2*\5\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2"+
		"\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60\62\5\n\6\2\61\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\t\3\2\2\2\65\67\5\f\7\2\66\65"+
		"\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:<\7\33\2\2;:\3\2"+
		"\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>E\3\2\2\2?A\7\35\2\2@B\7\33\2\2A@\3"+
		"\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2E?\3\2\2\2EF\3\2\2\2FI\3"+
		"\2\2\2GI\5\36\20\2H\66\3\2\2\2HG\3\2\2\2I\13\3\2\2\2JO\5\16\b\2KO\5\32"+
		"\16\2LO\7\21\2\2MO\7\22\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\r"+
		"\3\2\2\2PS\5\20\t\2QS\5\22\n\2RP\3\2\2\2RQ\3\2\2\2S\17\3\2\2\2TV\5\24"+
		"\13\2UW\5\30\r\2VU\3\2\2\2VW\3\2\2\2W\21\3\2\2\2XZ\7\26\2\2Y[\5\20\t\2"+
		"ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\27\2\2_\23\3"+
		"\2\2\2`c\5\26\f\2ac\7\20\2\2b`\3\2\2\2ba\3\2\2\2c\25\3\2\2\2df\7\17\2"+
		"\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\7\23\2\2hj\7\24\2\2ih\3\2\2\2ij\3\2"+
		"\2\2j\27\3\2\2\2km\7\34\2\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\7\30\2\2o"+
		"n\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\7\34\2\2rq\3\2\2\2rs\3\2\2\2s\31\3\2\2"+
		"\2tv\5\34\17\2uw\5\16\b\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\33"+
		"\3\2\2\2z{\7\31\2\2{|\7\34\2\2|\35\3\2\2\2}~\7\r\2\2~\37\3\2\2\2\25\'"+
		".\638=CEHNRV\\beilorx";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}