package sound;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class PieceWalker {

	public static SequencePlayer walkPiece(Piece piece){
		SequencePlayer player = null;
        try {
        	int ticksPerBeat = 12 * (int) piece.getShortestLength().getValue() +1;
            player = new SequencePlayer(piece.getTempo(), ticksPerBeat, null);
            
            int startTick = 0;
            for (Measure m : piece.getUnderlyingRep()) {
            	int voiceStartTick = 0;
            	for (Voice v : m.getUnderlyingRep()) {
            		for (Chord c : v.getUnderlyingRep()) {
            			int duration = 0;
            			for (MusicalAtom simul: c.getUnderlyingRep()){
	            			duration = (int) Math.ceil((simul.getLength().getValue() * ticksPerBeat));
            				player.addNote(simul.getPitch().toMidiNote(), voiceStartTick, duration);
            			}
            			voiceStartTick += duration; // add length of duration to tracker
            		}
            		voiceStartTick = startTick;
            	}
            	startTick += ticksPerBeat * m.getNumberOfBeats();
            	// increment start tick by ticks/beat * beats/measure
            }
            
        	// TODO check this assumption ie the math may be wrong
            // ticks/beat is a multiple of the shortest length note
        	// no lyrics for now no key signature applied for now
        	// prefer ticks per beat must take int num and denom and do something with them
            
//            List<MusicalAtom> sequence = piece.getSequence();
//            int startTick = 0; 
//            for (MusicalAtom atom : sequence){
//            	player.addNote(atom.getPitch().toMidiNote(), startTick, startTick + (int) (atom.getLength().getValue()) +1);
//            	startTick = startTick + (int) (atom.getLength().getValue())+1;
//            }            
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
