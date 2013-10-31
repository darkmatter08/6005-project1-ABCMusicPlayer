/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

lexer grammar ABCMusicLexer;

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
 
//Header Mode: Everything inside the Header
//MAJOR QUESTION : Should we be robust and allow for incorrect entries?

fragment DIGIT: [0-9];
fragment FRACTION: DIGIT+ '/' DIGIT+;
fragment EOL: '\r'? '\n';

COMPOSER :	'C:' ~('\r' | '\n')+ EOL+;
LENGTH : 	'L:' FRACTION EOL+; 
METER : 	'M:' ('C' | 'C|' | FRACTION) EOL+;
TEMPO : 	'Q:' FRACTION '=' DIGIT+ EOL+;
TITLE :		'T:' ~('\r' | '\n')+ EOL+;
INDEX :		'X:' ~('\r' | '\n')+ EOL+;
KEY : 		'K:' ~('\r' | '\n')+ EOL+ -> mode(BODY);
VOICE :		'V:' ~('\r' | '\n')+ EOL+;

NOCOMMENT : '%' -> skip;
COMMENT : 	'%' ~('\r' | '\n')+ -> skip;

mode BODY;
VOICEBODY : 'V:' ~('\r' | '\n')+ EOL+;
MODEMINOR : 'm';
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=';
REST : 'Z' | 'z';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';
NTHREPEAT : '[1' | '[2';
BASENOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b';
OCTAVE : '\''+ | ','+;
WHITESPACE : ('/t' | ' ')+ -> skip;
OPENBRACKET: '[';
CLOSEBRACKET: ']';
FRACTIONBAR : '/';
OPENPAREN : '(';
CLOSEPAREN : ')';
LINEFEED : EOL+;
NUMBER: DIGIT+;
LYRIC: 'w:' ~('\r' | '\n')+;
NOCOMMENTBODY : '%' -> skip;
COMMENTBODY : '%' ~('\r' | '\n')+ -> skip;
