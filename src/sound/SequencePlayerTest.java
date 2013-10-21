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

            player.play();

        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
	}
	
	@Test
	public void pieceTwoTest() {
		SequencePlayer player;
        try {
            // quarter note = 200 BPM, 12 ticks/beat
            player = new SequencePlayer(140, 12, null);
            //bar 1 chord top \n\t bottom
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 0, 6);
            	Pitch lowerChord = new Pitch('F').accidentalTranspose(1);
            	player.addNote(lowerChord.toMidiNote(), 0, 6);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 6, 6);
            	player.addNote(lowerChord.toMidiNote(), 6, 6);
            // Rest 12, 6
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 18, 6);
        		player.addNote(lowerChord.toMidiNote(), 18, 6);
            // Rest 24, 6
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 30, 6);
            	player.addNote(lowerChord.toMidiNote(), 30, 6);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 36, 12);
            	player.addNote(lowerChord.toMidiNote(), 36, 12);
            
            //bar 2
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 48, 12);
            	player.addNote(new Pitch('B').toMidiNote(), 48, 12);
            	player.addNote(new Pitch('G').toMidiNote(), 48, 12);
            // rest (60, 12)
            player.addNote(new Pitch('G').toMidiNote(), 72, 12);
            // rest (84, 12)
            
            // bar 3
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 18);
            player.addNote(new Pitch('G').toMidiNote(), 114, 6);
            // rest (120, 12)
            player.addNote(new Pitch('E').toMidiNote(), 132, 12);
            
            //bar 4
            player.addNote(new Pitch('E').toMidiNote(), 144, 6);
            player.addNote(new Pitch('A').toMidiNote(), 150, 12);
            player.addNote(new Pitch('B').toMidiNote(), 162, 12);
            player.addNote(new Pitch('B').accidentalTranspose(-1).toMidiNote(), 174, 6);
            player.addNote(new Pitch('A').toMidiNote(), 180, 12);
            
            //bar 5
            //quarter note triplet - 8 ticks/triplet note
            player.addNote(new Pitch('G').toMidiNote(), 192, 8);
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 200, 8);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 208, 8);
            
            player.addNote(new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), 216, 12);
            player.addNote(new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), 228, 6);
            player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 234, 6);
            
            //bar 6
            // rest (240, 6)
            player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 246, 12);
            player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 258, 6);
            player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 264, 6);
            player.addNote(new Pitch('B').toMidiNote(), 270, 9);
            
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
	public void pieceThreeTest() {
		
	}
}
