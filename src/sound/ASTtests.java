package sound;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
/**
 * 
 * @author dalitso
 * @category no_didit
 */
public class ASTtests {
	
	class testNote{
		Map <Integer, Integer> accidentalsMap ;
		List<Note> noteList;
		SequencePlayer player;
		public testNote(){
			try {
				this.player = new SequencePlayer(120, 8, null);		
				this.accidentalsMap = new HashMap<Integer, Integer>();
				accidentalsMap.put(new Pitch('C').toMidiNote(), new Pitch('C').accidentalTranspose(2).toMidiNote());
				this.noteList =new ArrayList<Note>();
				
				noteList.add(new Note(new Pitch('C'), new IntPair(1,4)));
				noteList.add(new Note(new Pitch('D'), new IntPair(1,4)));
				noteList.add(new Note(new Pitch('E'), new IntPair(1,4)));
				noteList.add(new Note(new Pitch('F'), new IntPair(1,4)));
				noteList.add(new Note(new Pitch('G'), new IntPair(1,4)));
				noteList.add(new Note(new Pitch('A'), new IntPair(1,4)));
				noteList.add(new Note(new Pitch('B'), new IntPair(1,4)));
		
			} catch (MidiUnavailableException e) {
				e.printStackTrace();
			} catch (InvalidMidiDataException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void playNotes(){
		// plays all the basic notes
		testNote testNote = new testNote();
		int start = 4;
		for (Note note : testNote.noteList ){
			testNote.player.addNote(note.getPitch().toMidiNote(), start, start + 15);
			start = start + 15;
		}
		try {
			testNote.player.play();
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}
}
