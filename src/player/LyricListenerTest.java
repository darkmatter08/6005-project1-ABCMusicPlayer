package player;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import sound.IntPair;

public class LyricListenerTest {
	@Test
	public void testFractions(){
		IntPair p = LyricsListenerHelper.getPair("Q:19443/2245234=100");
		assertEquals(19443, p.numerator);
		assertEquals(2245234, p.denominator);	
		}
	@Test
	public void testPair(){
		IntPair p = LyricsListenerHelper.noteGetPair("/2245234");
		assertEquals(1, p.numerator);
		assertEquals(2245234, p.denominator);
	}
	@Test
	public void testnotepair(){
		IntPair p = LyricsListenerHelper.noteGetPair("16/22");
		assertEquals(16, p.numerator);
		assertEquals(22, p.denominator);
	}
	@Test
	public void testnonumerator(){
		IntPair p = LyricsListenerHelper.noteGetPair("13/");
		assertEquals(13, p.numerator);
		assertEquals(2, p.denominator);	
	}
	@Test
	public void testSingledigit(){
		IntPair p = LyricsListenerHelper.noteGetPair("42");
		assertEquals(42, p.numerator);
		assertEquals(1, p.denominator);	
	}
	
	@Test
	public void testLyricBreak(){
		String Lyric = "dog___ dog~eat~cat i-eat-cow";
		List<String> Syllables = LyricsListenerHelper.breakLyrics(Lyric);
		assertEquals("[dog, dog, dog, dog, dog~eat~cat, i, eat, cow]", 
				Syllables.toString());
	}
}

