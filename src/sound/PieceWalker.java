package sound;

import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class PieceWalker {

	public static SequencePlayer walkPiece(Piece piece){
		SequencePlayer player = null;
        try {
        	int ticksPerBeat = 6 * piece.getShortestLength().denominator;
        	LyricListener listener = new LyricListener() {
                public void processLyricEvent(String text) {
                    System.out.println(text);
                }
            };
            player = new SequencePlayer(piece.getTempo(), ticksPerBeat, listener);
            
            for (List<Chord> voice : piece.getSequence()){
            	int voiceTick = 0;
            	for (Chord sequentialChord : voice){
            		int duration = 0;
            		for(MusicalAtom simulAtom : sequentialChord.getSequence()){
            			// note length * ticksPerBeat
            			duration = (int) Math.round(simulAtom.getLength().getValue() * ticksPerBeat); // @cr screw up point.
            			if (simulAtom instanceof Note){
            				Note simulNote = (Note) simulAtom;
            				player.addNote(simulNote.getPitch().toMidiNote(), voiceTick, duration);
            				if (! (simulNote.getLyrics() == null))
            					player.addLyricEvent(simulNote.getLyrics(), voiceTick);
            			}
            		}
            		voiceTick += duration;
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
