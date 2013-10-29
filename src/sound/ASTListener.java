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
        	//old implementation
//        	int ticksPerBeat = 12 * (int) piece.getShortestLength().getValue() +1;
//            player = new SequencePlayer(piece.getTempo(), ticksPerBeat, null);
//            List<MusicalAtom> sequence = piece.getSequence();
//            int startTick = 0;
//            for (MusicalAtom atom : sequence){
//            	player.addNote(atom.getPitch().toMidiNote(), startTick, startTick + (int) (atom.getLength().getValue()) +1);
//            	startTick = startTick + (int) (atom.getLength().getValue())+1;
//            }    
        	//@cr a bug in getShortestLength()
        	System.out.println("the shortest length is :" + piece.getShortestLength().numerator + "/"+ piece.getShortestLength().denominator);
        	int ticksPerBeat = 6 * (int)((piece.getShortestLength().denominator)); // handles triplets by multiplying by a common factor
            player = new SequencePlayer(piece.getTempo(), ticksPerBeat, null);
            List<Chord> sequence = piece.getSequence();
            int startTick = 0;
            for (Chord c : sequence){
            	int duration = (int) Math.round(c.getLength().getValue()*ticksPerBeat);
            	for (MusicalAtom atom :  c.getAtoms()){
            		player.addNote(atom.getPitch().toMidiNote(), startTick, duration);
            		startTick = startTick + duration;
            	}
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
