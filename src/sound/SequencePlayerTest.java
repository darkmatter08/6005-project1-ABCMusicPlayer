package sound;

import static org.junit.Assert.*;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;
/**
 * Warmup - hard-coded songs from the warm up to the MIDI interface
 * @author jains
 * @category no_didit
 */
public class SequencePlayerTest {

	@Test
	public void pieceOneTest() {
		SequencePlayer player;
        try {
            // quarter note = 140 BPM, 12 ticks/beat
            player = new SequencePlayer(140, 12, null);
            //bar 1
            player.addNote(new Pitch('C').toMidiNote(), 0, 4*3);
            player.addNote(new Pitch('C').toMidiNote(), 4*3, 4*3);
            player.addNote(new Pitch('C').toMidiNote(), 8*3, 3*3);
            player.addNote(new Pitch('D').toMidiNote(), 11*3, 1*3);
            player.addNote(new Pitch('E').toMidiNote(), 12*3, 4*3);
            // bar 2
            player.addNote(new Pitch('E').toMidiNote(), 16*3, 3*3);
            player.addNote(new Pitch('D').toMidiNote(), 19*3, 1*3);
            player.addNote(new Pitch('E').toMidiNote(), 20*3, 3*3);
            player.addNote(new Pitch('F').toMidiNote(), 23*3, 1*3);
            player.addNote(new Pitch('G').toMidiNote(), 24*3, 8*3);
            // bar 3
            // triplet - 4 ticks/1 triplet note
            int tripletPitch1 = new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote();
            player.addNote(tripletPitch1, 96, 4);
            player.addNote(tripletPitch1, 100, 4);
            player.addNote(tripletPitch1, 104, 4);
            // triplet
            player.addNote(new Pitch('G').toMidiNote(), 108, 4);
            player.addNote(new Pitch('G').toMidiNote(), 112, 4);
            player.addNote(new Pitch('G').toMidiNote(), 116, 4);
            //triplet
            player.addNote(new Pitch('E').toMidiNote(), 120, 4);
            player.addNote(new Pitch('E').toMidiNote(), 124, 4);
            player.addNote(new Pitch('E').toMidiNote(), 128, 4);
            //triplet
            player.addNote(new Pitch('C').toMidiNote(), 132, 4);
            player.addNote(new Pitch('C').toMidiNote(), 136, 4);
            player.addNote(new Pitch('C').toMidiNote(), 140, 4);
            // bar 4
            player.addNote(new Pitch('G').toMidiNote(), 144, 9);
            player.addNote(new Pitch('F').toMidiNote(), 153, 3);
            player.addNote(new Pitch('E').toMidiNote(), 156, 9);
            player.addNote(new Pitch('D').toMidiNote(), 165, 3);
            player.addNote(new Pitch('C').toMidiNote(), 168, 24);
            
            System.out.println(player);

            // play!
            player.play();

            /*
             * Note: A possible weird behavior of the Java sequencer: Even if the
             * sequencer has finished playing all of the scheduled notes and is
             * manually closed, the program may not terminate. This is likely
             * due to daemon threads that are spawned when the sequencer is
             * opened but keep on running even after the sequencer is killed. In
             * this case, you need to explicitly exit the program with
             * System.exit(0).
             */
            // System.exit(0);

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
	}
	
	@Test
	public void pieceTwoTest() {
		
	}
	
	@Test
	public void pieceThreeTest() {
		
	}
}
