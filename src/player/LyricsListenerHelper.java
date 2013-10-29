package player;
import sound.Measure;
import sound.Chord;
import sound.IntPair;
import sound.Piece;
import grammar.ABCMusicParser.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LyricsListenerHelper {
	public static List<Measure> addNotesToLyrics(Queue<ElementContext> notes, Queue <String> lyrics , Piece piece){
		List<Measure> measures = new ArrayList<Measure>();
		Measure m = new Measure();
		Chord chord;
		ElementContext note =  notes.poll();
		while (!(note.getText().contains("|"))){
			
			// if we have a single note
			if (note.noteelement().multinote() == null){
				//check if it has a length
				if (note.noteelement().note().notelength() != null){
					
				}
				else{
					IntPair length = piece.getDefaultLength();
				}
				
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
	
	public static IntPair noteGetPair(String expression){
		 Pattern pattern = Pattern.compile("^(\\d)$");
		 Matcher matcher = pattern.matcher(expression);
		 
		 if (matcher.matches()){
			 if (!(matcher.group(1).isEmpty())){
				 int numint = Integer.parseInt(matcher.group(1).toString());
				 return new IntPair(numint, 1);
				 }
		 }
			 
		
		 int denomint;
		 int numint;
		 
		 Pattern fractionpattern = Pattern.compile("(.+?)(\\d+)/(\\d+)(.+?)");
		 Matcher fractionmatcher = fractionpattern.matcher(expression);
		 fractionmatcher.matches();
		 
		 String num =  fractionmatcher.group(2).toString();
		 String denom = fractionmatcher.group(3).toString();
		 
		 if (num.equals("") ){
			 numint = 1;
		 }
		 else{
			 numint = Integer.parseInt(num);
		 }
		 

		 if (denom.equals("") ){
			 denomint = 2;
		 }
		 else{
			 denomint = Integer.parseInt(denom);
		 }
		 
		 System.out.print("" + num + "," + denom);
		 IntPair p = new IntPair(numint, denomint);
		 return p;
	}
}