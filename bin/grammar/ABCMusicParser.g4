/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

parser grammar ABCMusicParser; options { tokenVocab=ABCMusicLexer; }

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
 
abctune : abcheader abcbody EOF;

//Header
abcheader : INDEX TITLE optionalfields? KEY;
optionalfields : (COMPOSER | LENGTH | METER | TEMPO | VOICE)+;

//Body
abcbody : bodysection+;
bodysection : element+ LINEFEED+ (LYRIC LINEFEED+)? | midtunefield;
element : noteelement | tupletelement | BARLINE | NTHREPEAT;
noteelement : note | multinote;
note : noteorrest notelength?;
multinote : OPENBRACKET note+ CLOSEBRACKET;
noteorrest : pitch | REST;
pitch : ACCIDENTAL? BASENOTE OCTAVE?;

notelength : (NUMBER)? FRACTIONBAR? (NUMBER)?;

tupletelement : tupletspec noteelement+;
tupletspec : OPENPAREN NUMBER;

midtunefield : VOICEBODY;






