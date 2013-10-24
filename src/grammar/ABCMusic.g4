/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusic;

/*
 * This puts 'package grammar;' at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
@header {
package grammar;
}

/*
 * This adds code to the generated lexer and parser. This makes the lexer and
 * parser throw errors if they encounter invalid input. Do not change these
 * lines unless you know what you're doing.
 */
@members {
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
}

/*
 * These are the lexical rules. They define the tokens used by the lexer.
 */
 
//Header
fragment DIGIT : [0-9]+;
KEYACCIDENTAL : '#' | 'b';
MODEMINOR : 'm';
METERFRACTION : DIGIT+ '/' DIGIT+;
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=';
REST : 'Z' | 'z';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';
NTHREPEAT : '[1' | '[2';
BASENOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';
OCTAVE : '\''+ | ','+;
COMMENT : '%' ~('\r'|'\n')* -> skip ;
WHITESPACE : [\t' ']+;
NUMBER : DIGIT;
/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the 'start rule'. The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * 'line' the start rule.
 *
 * For more information, see
 * http://www.antlr.org/wiki/display/ANTLR4/Parser+Rules#ParserRules-StartRulesandEOF
 */
 
 //Header
 
abctune : abcheader abcmusic EOF;

abcheader : fieldnumber fieldtitle otherfields* fieldkey;

fieldnumber : 'X:' NUMBER+ ('\r'|'\n')+;
fieldtitle : 'T:' ~('\r'|'\n')* ('\r'|'\n')+;
otherfields : fieldcomposer | fielddefaultlength | fieldmeter | fieldtempo | fieldvoice;
fieldcomposer : 'C:' ~('\r'|'\n')* ('\r'|'\n')+;
fielddefaultlength : 'L:' notelengthstrict ('\r'|'\n')+;
fieldmeter : 'M:' meter ('\r'|'\n')+;
fieldtempo : 'Q:' tempo ('\r'|'\n')+;
fieldvoice : 'V:' ~('\r'|'\n')* ('\r'|'\n')+;
fieldkey : 'K:' key ('\r'|'\n')+;

key : keynote MODEMINOR?;
keynote : BASENOTE KEYACCIDENTAL?;

meter : 'C' | 'C|' | METERFRACTION;

tempo : METERFRACTION '=' NUMBER+;

//Body

abcmusic : abcline+;
abcline : element+ ('\r'|'\n')+ (lyric ('\r'|'\n')+)? | midtunefield;
element : noteelement | tupletelement | BARLINE | NTHREPEAT | WHITESPACE;

noteelement : note | multinote;
note : noteorrest notelength?;
noteorrest : pitch | REST;
pitch : ACCIDENTAL? BASENOTE OCTAVE?;

notelength : (NUMBER+)? ('/'(NUMBER+)?);
notelengthstrict : NUMBER+ '/' NUMBER+;

tupletelement : tupletspec noteelement+;
tupletspec : '(' NUMBER;

multinote : '[' note+ ']';

midtunefield : fieldvoice;
lyric : 'w:' lyricalelement*;
lyricalelement : ' '+ | '-' | '_' | '*' | '~' | '\-' | '|' | ~('\r'|'\n')*;

