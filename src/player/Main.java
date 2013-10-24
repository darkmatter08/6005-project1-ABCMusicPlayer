package player;

import java.io.IOException;

import grammar.ABCMusicLexer;
import grammar.ABCMusicParser;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) {
        // YOUR CODE HERE
    	 // Create a stream of tokens using the lexer.
        CharStream stream;
		try {
			stream = new ANTLRFileStream(file);
			ABCMusicLexer lexer = new ABCMusicLexer(stream);
	        lexer.reportErrorsAsExceptions();
	        TokenStream tokens = new CommonTokenStream(lexer);
	        
	        // Feed the tokens into the parser.
	        ABCMusicParser parser = new ABCMusicParser(tokens);
	        parser.reportErrorsAsExceptions();
	        
	        // Generate the parse tree using the starter rule.
	        ParseTree tree;
	        tree = parser.abctune(); // "line" is the starter rule.
	        
	        // Walk the tree with the listener.
	        ParseTreeWalker walker = new ParseTreeWalker();
	        ParseTreeListener listener = new Listener();
	        walker.walk(listener, tree);
	        
	        // After walking the tree calling the getExpression() function on Listener returns the expression built by 
	        // The listener
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

    public static void main(String[] args) {
        // CALL play() HERE
    	play("sample_abc/simple.abc");
    }
}
