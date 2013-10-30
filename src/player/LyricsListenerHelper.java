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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LyricsListenerHelper {
	
	public static IntPair noteGetLength(NotelengthContext ctx) {
		if (ctx.getChildCount() == 1){
			if (ctx.FRACTIONBAR() != null){
				return new IntPair(1, 2);
			}
			int num = Integer.parseInt(ctx.getChild(0).getText());
			return new IntPair(num, 2);
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

	public static MusicalAtom chordMultiNoteHelper(NoteContext ctx) {
		MusicalAtom atom = null;
		if (ctx != null) {
			IntPair length;
			if (ctx.notelength() != null) {
				//String expression = ctx.notelength().getText();
				length = LyricsListenerHelper.noteGetLength(ctx.notelength());
			} else {
				length = new IntPair(1, 1);
			}

			if (ctx.noteorrest() != null) {
				if (ctx.noteorrest().pitch() != null) {
					String expression = ctx.noteorrest().pitch().getText();
					//String accidentals = LyricsListenerHelper.noteGetAccidental(expression);
					int octaves = LyricsListenerHelper.noteGetOctaves(ctx.noteorrest().pitch());
					Pitch pitch = new Pitch(
							LyricsListenerHelper.noteGetPitch(expression));
					pitch.octaveTranspose(octaves);
					Note note = new Note(pitch, length);
					return note;
				}
				if (ctx.noteorrest().REST() != null) {
					String expression = ctx.noteorrest().REST().getText();
					Rest rest = new Rest(length);
					return rest;

				}
			}
		}
		return atom;
	}

	public static List<String> breakLyrics(String Lyrics) {
		List<String> lyricList = new ArrayList<String>();
		Lyrics = Lyrics.replace("*", "- -");
		String[] lyricArray = Lyrics.split("\\s|\\-");

		for (String syllable : lyricArray) {
			if (syllable.indexOf('_') != -1) {
				while (syllable.indexOf('_') != -1) {
					syllable = syllable.replaceAll("_",
							"-" + syllable.substring(0, syllable.indexOf('_')));
				}
				String[] repeatedSyllables = syllable.split("-");
				for (String repeatedSyllable : repeatedSyllables) {
					lyricList.add(repeatedSyllable);
				}
			} else {
				lyricList.add(syllable);
			}
		}
		return lyricList;

	}
}