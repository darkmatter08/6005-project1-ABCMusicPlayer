package player;

import sound.Measure;
import sound.Chord;
import sound.IntPair;
import sound.MusicalAtom;
import sound.Note;
import sound.Piece;
import sound.Pitch;
import sound.Rest;
import grammar.ABCMusicParser.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LyricsListenerHelper {
	
	public static IntPair noteGetLength(NotelengthContext ctx) {
		if (ctx.getChildCount() == 0){
			return new IntPair(1,1);
		}
		else if (ctx.getChildCount() == 1){
			if (ctx.FRACTIONBAR() != null){
				return new IntPair(1, 2);
			}
			int num = Integer.parseInt(ctx.getChild(0).getText());
			return new IntPair(num, 1);
		}
		else{
			if (ctx.getChildCount() == 3){
				int num = Integer.parseInt(ctx.getChild(0).getText());
				int denom = Integer.parseInt(ctx.getChild(2).getText());
				return new IntPair(num, denom);
				}
		
			else{
				if (ctx.getChild(0).getText().equals("/")){
					int denom = Integer.parseInt(ctx.getChild(1).getText());
					return new IntPair(1, denom);
				}
				else{
					int num = Integer.parseInt(ctx.getChild(0).getText());
					return new IntPair(num, 2);
				}
			}
		}
	}

	public static List<Object> attachLyrics(Queue<?> lyrics, Queue<?> measureAtoms){
		List<Object> measureList = new ArrayList<Object>();
		if (measureAtoms.isEmpty()){
			return measureList;
		}
		List<Object> demarcations = new ArrayList<Object>();
		List<List<?>> mapMeasure = new ArrayList<List<?>>();
		List<List<?>> mapLyrics = new ArrayList<List<?>>();
		
		List<Object> measure = new ArrayList<Object>();
		int i = 0;
		while (!(measureAtoms.isEmpty())){
			Object atom =measureAtoms.poll();
			
			if (i == 0 ){
				if ((atom.toString().equals("|") || atom.toString().equals("||") 
						|| atom.toString().equals("[|") || atom.toString().equals( "|]") ||
								atom.toString().equals(":|") || atom.toString().equals("|:") ||
								atom.toString().equals("[1") || atom.toString().equals("[2"))){
					i ++;
					
					demarcations.add(atom);
					continue;
				}	
			}
			
			if (atom.toString().equals("|") || atom.toString().equals("||") 
					|| atom.toString().equals("[|") || atom.toString().equals( "|]") ||
							atom.toString().equals(":|") || atom.toString().equals("|:") ||
							atom.toString().equals("[1") || atom.toString().equals("[2")){
				mapMeasure.add(measure);
				demarcations.add(atom);
				measure = new ArrayList<Object>();
				i ++;
				continue;
			}
			else{
				measure.add(atom);
				i++;
			}
			
		}
		
		List<Object> lyricslist = new ArrayList<Object>();
		i =0;
		while (!(lyrics.isEmpty())){
			Object atom =lyrics.poll();
			
			if (i == 0 ){
				if ((atom.toString().equals("|") || atom.toString().equals("||") 
						|| atom.toString().equals("[|") || atom.toString().equals( "|]") ||
								atom.toString().equals(":|") || atom.toString().equals("|:") ||
								atom.toString().equals("[1") || atom.toString().equals("[2"))){
					i ++;
					continue;
				}
				
			}
			
			if (atom.toString().equals("|") || atom.toString().equals("||") 
					|| atom.toString().equals("[|") || atom.toString().equals( "|]") ||
							atom.toString().equals(":|") || atom.toString().equals("|:") ||
							atom.toString().equals("[1") || atom.toString().equals("[2")){
				mapLyrics.add(lyricslist);
				lyricslist = new ArrayList<Object>();
				i++;
				continue;
			}
			else if (mapLyrics.size() < mapMeasure.size()){  
				if (lyricslist.size() == mapMeasure.get(mapLyrics.size()).size()){
					mapLyrics.add(lyricslist);
					lyricslist = new ArrayList<Object>();
					lyricslist.add(atom);
					i++;
					continue;
				}
				else{
					lyricslist.add(atom);
					i++;
				}
			}
			else{
				lyricslist.add(atom);
				i++;
			}
			
		}
		mapLyrics.add(lyricslist);
		for(i = 0; i < mapMeasure.size(); i++){
			for (int j = 0; j< mapMeasure.get(i).size(); j ++){
				if (i < mapLyrics.size() && j < mapLyrics.get(i).size() ){
				((Chord) (mapMeasure.get(i).get(j))).addLyrics(((String) (mapLyrics.get(i).get(j))));
				}
			}
		}
		Measure m;
		for(i = 0; i < mapMeasure.size(); i++){
			m = new Measure();
			for (int j = 0; j< mapMeasure.get(i).size(); j ++){
				System.out.println(mapMeasure.get(i).get(j));
				m.addChord((Chord) (mapMeasure.get(i).get(j)));
			}
			measureList.add(m);
		}
		List<Object> objectsList = new ArrayList<Object>();
		if (demarcations.size() > measureList.size()){
			objectsList.add(demarcations.get(0));
			for (int id = 0; id < measureList.size(); id++){
				objectsList.add(measureList.get(id));
				objectsList.add(demarcations.get(id+1));
			}
			
		}
		else{
			for (int id = 0; id < measureList.size(); id++){

				objectsList.add(demarcations.get(id));
				objectsList.add(measureList.get(id));
			}
		}
		return objectsList;
	}
	public static IntPair getPair(String expression) {
		Pattern pattern = Pattern.compile("(.+?)(\\d+)/(\\d+)(.+?)");
		Matcher matcher = pattern.matcher(expression);
		matcher.matches();
		int num = Integer.parseInt(matcher.group(2).toString());
		int denom = Integer.parseInt(matcher.group(3).toString());
		System.out.print("" + num + "," + denom);
		IntPair p = new IntPair(num, denom);
		return p;
	}

	public static char noteGetPitch(String expression) {
		return expression.toUpperCase().charAt(0);
	}

	public static int noteGetOctaves(PitchContext pitch) {
		int octaves = 0;
		if (pitch.OCTAVE() != null) {
			System.out.println("these are the octaves" + pitch.OCTAVE());
			String[] Arr = pitch.OCTAVE().getText().split("");
			for (int i = 0; i < Arr.length; i++) {
				if (Arr[i].equals(",")) {
					octaves += -1;
				}
				if (Arr[i].equals("\'")) {
					octaves += 1;
				}
			}
		}
		if ("cdefgab".contains(pitch.BASENOTE().getText())){
			octaves += 1;
		}
		
		return octaves;
	}

	public static IntPair noteGetPair(String expression) {
		Pattern pattern;
		Matcher matcher;
		String num;
		String denom;
		int denomint;
		int numint;

		pattern = Pattern.compile("^\\d+$");
		matcher = pattern.matcher(expression);
		// matcher.matches()
		// System.out
		if (matcher.matches()) {
			numint = Integer.parseInt(matcher.group(0).toString());
			return new IntPair(numint, 1);
		}

		pattern = Pattern.compile("\\D*(\\d+)/(\\d+)\\D*", Pattern.DOTALL);
		matcher = pattern.matcher(expression);
		if (matcher.matches()) {
			num = matcher.group(1).toString();
			denom = matcher.group(2).toString();
			numint = Integer.parseInt(num);
			denomint = Integer.parseInt(denom);
			System.out.print("" + num + "," + denom);
			IntPair p = new IntPair(numint, denomint);
			return p;
		}

		pattern = Pattern.compile("\\D*/(\\d+)\\D*", Pattern.DOTALL);
		matcher = pattern.matcher(expression);
		if (matcher.matches()) {
			denom = matcher.group(1).toString();
			numint = 1;
			denomint = Integer.parseInt(denom);
			System.out.print("" + 1 + "," + denom);
			return new IntPair(numint, denomint);
		}

		pattern = Pattern.compile("\\D*(\\d+)/\\D*", Pattern.DOTALL);
		matcher = pattern.matcher(expression);
		if (matcher.matches()) {
			num = matcher.group(1).toString();
			denomint = 2;
			numint = Integer.parseInt(num);
			System.out.print("" + num + "," + 2);
			return new IntPair(numint, denomint);
		}
		System.out.println("This is expression: " + expression);
		throw new NumberFormatException();
	}

	public static MusicalAtom chordMultiNoteHelper(NoteContext ctx, IntPair defaultLength) {
		MusicalAtom atom = null;
		if (ctx != null) {
			IntPair length;
			if (ctx.notelength().getChildCount() != 0) {
				//String expression = ctx.notelength().getText();
				IntPair multiplier = LyricsListenerHelper.noteGetLength(ctx.notelength());
				int numerator = multiplier.numerator;
				int denominator = multiplier.denominator;
				length = new IntPair(defaultLength.numerator * numerator, defaultLength.denominator * denominator);
			} else {
				length = defaultLength;
			}

			if (ctx.noteorrest() != null) {
				if (ctx.noteorrest().pitch() != null) {
					//String accidentals = LyricsListenerHelper.noteGetAccidental(expression);
					int octaves = LyricsListenerHelper.noteGetOctaves(ctx.noteorrest().pitch());
					Pitch pitch = new Pitch(LyricsListenerHelper.noteGetPitch(ctx.noteorrest().pitch().BASENOTE().getText()));
					pitch.octaveTranspose(octaves);
					Note note = new Note(pitch, length);
					return note;
				}
				if (ctx.noteorrest().REST() != null) {
					Rest rest = new Rest(length);
					return rest;

				}
			}
		}
		return atom;
	}

	public static List<String> breakLyrics(String Lyrics) {
		List<String> lyricList = new ArrayList<String>();
		Lyrics = Lyrics.replaceAll("\\s+", " ").trim();		
		Lyrics = Lyrics.replaceAll("\\*", "- -");
		String[] lyricArray = Lyrics.split("\\s|([ ^\\ ]-)");
		System.out.println(Lyrics);
		for (String syllable : lyricArray) {
			if (syllable.equals("-")){syllable = " ";}
			if (syllable.equals("\\-")){syllable = "-";}
			if (syllable.indexOf('_') != -1) {
				while (syllable.indexOf('_') != -1) {
					syllable = syllable.replaceAll("_",
							"- ");
				}
				String[] repeatedSyllables = syllable.split("(-)");
				for (String repeatedSyllable : repeatedSyllables) {
					lyricList.add(repeatedSyllable);
				}
			} else {
				lyricList.add(syllable);
			}
		}
		return lyricList;

	}

	public static Chord tupletElementHelper(NoteelementContext ctx, IntPair defaultLength, int tupletSpec) {
		Chord chord = null;
		int tupletNumerator = 0;
		int tupletDenominator = 0;
		
		if (tupletSpec == 1){
			tupletNumerator = 1;
			tupletDenominator = 1;
		}
		if (tupletSpec == 2){
			tupletNumerator = 3;
			tupletDenominator = 2;
		}
		if (tupletSpec == 3){
			tupletNumerator = 2;
			tupletDenominator = 3;
		}
		if (tupletSpec == 4){
			tupletNumerator = 3;
			tupletDenominator = 4;
		}
		
		if (ctx.note() != null){
			IntPair length;
			if (ctx.note().notelength().getChildCount() != 0){
				IntPair multiplier = LyricsListenerHelper.noteGetLength(ctx.note().notelength());
				int numerator = multiplier.numerator;
				int denominator = multiplier.denominator;
				length = new IntPair(defaultLength.numerator * numerator * tupletNumerator, defaultLength.denominator * denominator * tupletDenominator);
			}
			else{
				int numerator = defaultLength.numerator;
				int denominator = defaultLength.denominator;
				length = new IntPair(numerator * tupletNumerator, denominator * tupletDenominator);
			}
			
			if (ctx.note().noteorrest().pitch() != null){
				int octaves = LyricsListenerHelper.noteGetOctaves(ctx.note().noteorrest().pitch());
				Pitch pitch = new Pitch(LyricsListenerHelper.noteGetPitch(ctx.note().noteorrest().pitch().BASENOTE().getText()));
				pitch.octaveTranspose(octaves);
				Note note = new Note(pitch, length);
				chord = new Chord(note.getLength());
				chord.addAtom(note);
				return chord;
			}

		}
		
		if (ctx.multinote() != null){
			List<NoteContext> cntxt = ctx.multinote().note();
			IntPair multiplier = LyricsListenerHelper.noteGetLength(cntxt.get(0).notelength());
			int numerator = multiplier.numerator * tupletNumerator;
			int denominator = multiplier.denominator * tupletDenominator;
			IntPair length = new IntPair(defaultLength.numerator * numerator, defaultLength.denominator * denominator);
			chord = new Chord(length);
			for(int i = 0; i < cntxt.size(); i++){
				chord.addAtom(LyricsListenerHelper.chordMultiNoteHelper(cntxt.get(i), defaultLength));
			}
			return chord;
		}
		
		return chord;
		
	}
}