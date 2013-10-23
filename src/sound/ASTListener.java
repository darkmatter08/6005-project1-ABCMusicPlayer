package sound;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * 
 * @author dalitso
 * this is the class that plays the AST
 */
public class ASTListener {
	public static SequencePlayer ASTplay(Piece piece){
		SequencePlayer player = null;
        try {
        	// TODO check this assumption ie the math may be wrong
            // ticks/beat is a multiple of the shortest length note
        	// no lyrics for now no key signature applied for now
        	// prefer ticks per beat must take int num and denom and do something with them
        	int ticksPerBeat = 12 * (int) piece.getShortestLength().value +1;
            player = new SequencePlayer(piece.getTempo(), ticksPerBeat, null);
            List<MusicalAtom> sequence = piece.getSequence();
            int startTick = 0;
            for (MusicalAtom atom : sequence){
            	player.addNote(atom.getPitch().toMidiNote(), startTick, startTick + (int) (atom.getLength().value) +1);
            	startTick = startTick + (int) (atom.getLength().value)+1;
            }            
            System.out.println(player);
            player.play();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
	
	return player;
	}
}
