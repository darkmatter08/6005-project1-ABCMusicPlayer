package player;
import sound.Measure;
import sound.Chord;
import sound.IntPair;
import sound.Note;
import sound.Piece;
import sound.Pitch;
import grammar.ABCMusicParser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LyricsListenerHelper {
	public static List<Measure> addNotesToLyrics(Queue<ElementContext> notes, Queue <String> lyrics , Piece piece){
		List<Measure> measures = new ArrayList<Measure>();
		Measure m = new Measure();
		Chord chord;
		ElementContext note =  notes.poll();
		String syllableLyric = lyrics.poll();
		while (!(note.getText().contains("|"))){
			Map <Integer, String> accidentalsMap = new HashMap<Integer, String>();
			IntPair length;
			// if we have a single note
			if (note.noteelement().multinote() == null){
				//check if it has a length
				if (note.noteelement().note().notelength() != null){
					length = noteGetPair(note.noteelement().note().notelength().getText());					
				}
				else{
					length = piece.getDefaultLength();
				}
				
				//check for accidentals and octaves
				//if (note.noteelement().note().noteorrest().pitch() != null){
				String expression = note.noteelement().note().noteorrest().pitch().BASENOTE().getText();
				int octaves = noteGetOctaves(note.noteelement().note().noteorrest().pitch().OCTAVE().getText());
				if (expression.matches("[c|d|e|f|g|a|b]")){
					octaves += -1:
				}
				
				
				String accidentals = noteGetAccidental(expression);
				
				Pitch pitch = new Pitch(noteGetPitch(expression));
				accidentalsMap.put(pitch.toMidiNote(), accidentals);
				
				
				
				Note chordNote = new Note(pitch , length);
				
				chordNote.setAccidental(accidentalsMap);
				chordNote.setLyrics(syllableLyric);
				chord = new Chord(length);
				chord.addAtom(chordNote);
			}
		}
		return measures;
		
		
	}
	
	public static IntPair getPair(String expression){
		 Pattern pattern = Pattern.compile("(.+?)(\\d+)/(\\d+)(.+?)");
		 Matcher matcher = pattern.matcher(expression);
		 matcher.matches();
		 int num = Integer.parseInt(matcher.group(2).toString());
		 int denom = Integer.parseInt(matcher.group(3).toString());
		 System.out.print("" + num + "," + denom);
		 IntPair p = new IntPair(num, denom);
		 return p;		
	}
	
	public static String noteGetAccidental(String expression){
		 Pattern pattern = Pattern.compile("(.+?)([C|D|E|F|G|A|B|c|d|e|f|g|a|b])");
		 Matcher matcher = pattern.matcher(expression);
		 matcher.matches();
		 return matcher.group(1).toString();		
	}
	
	public static char noteGetPitch(String expression){
		 Pattern pattern = Pattern.compile("(.+?)([C|D|E|F|G|A|B|c|d|e|f|g|a|b])(.+?)");
		 Matcher matcher = pattern.matcher(expression);
		 matcher.matches();
		 return matcher.group(2).toUpperCase().charAt(0);		
	}
	
	public static int noteGetOctaves(String expression){
		 Pattern pattern = Pattern.compile("([C|D|E|F|G|A|B|c|d|e|f|g|a|b])(.+)");
		 Matcher matcher = pattern.matcher(expression);
		 
		 int octaves = 0;
		 if (matcher.matches()){
			 if (matcher.group(1).toString().matches("[c|d|e|f|g|a|b]")){
				 octaves += 1;
			 }
		 }
		 for (char c: matcher.group(2).toCharArray()){
			 if (c == ','){
				 octaves += -1;
			 }
			 if (c == '\''){
				 octaves += 1;
			 }
		 }
		 return octaves;
	}
	
	public static IntPair noteGetPair(String expression){
		Pattern pattern;
		Matcher matcher;
		String num;
		String denom;
		int denomint;
		int numint;
		
		pattern = Pattern.compile("^\\d+$");
		matcher = pattern.matcher(expression);
		//matcher.matches()
		//System.out
		if (matcher.matches()){
			numint = Integer.parseInt(matcher.group(0).toString());
			return new IntPair(numint, 1);
			}
					 
		pattern = Pattern.compile("\\D*(\\d+)/(\\d+)\\D*", Pattern.DOTALL);
		matcher = pattern.matcher(expression);
		if (matcher.matches()){
		num =  matcher.group(1).toString();
		denom = matcher.group(2).toString();
		numint = Integer.parseInt(num);
		denomint = Integer.parseInt(denom);
		System.out.print("" + num + "," + denom);
		IntPair p = new IntPair(numint, denomint);
		return p;}
		
		pattern = Pattern.compile("\\D*/(\\d+)\\D*", Pattern.DOTALL);
		matcher = pattern.matcher(expression);
		if (matcher.matches()){
		denom = matcher.group(1).toString();
		numint = 1;
		denomint = Integer.parseInt(denom);
		System.out.print("" + 1 + "," + denom);
		return new IntPair(numint, denomint);
		}
		
		pattern = Pattern.compile("\\D*(\\d+)/\\D*", Pattern.DOTALL);
		matcher = pattern.matcher(expression);
		if (matcher.matches()){
		num = matcher.group(1).toString();
		denomint = 2;
		numint = Integer.parseInt(num);
		System.out.print("" + num + "," + 2);
		return new IntPair(numint, denomint);
		}
		
		throw new NumberFormatException();
	}}