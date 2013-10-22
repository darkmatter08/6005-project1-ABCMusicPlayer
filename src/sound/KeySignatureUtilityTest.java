package sound;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class KeySignatureUtilityTest {
	
	@Test
	public void basicTest() {
		Pitch f = new Pitch('F');
		Pitch fs = new Pitch('F').accidentalTranspose(1);
		Pitch temp = KeySignatureUtility.getAdjustedPitch(KeySignature.G, f);
		assertTrue(temp.equals(fs));
	}
	
	@Test
	public void testGMajor() {
		// Make a list of pitches 
		List<Pitch> gScale = new ArrayList<Pitch>();
//		gScale.add(new Pitch('G'));
//		gScale.add(new Pitch('A'));
//		gScale.add(new Pitch('B'));
//		gScale.add(new Pitch('C'));
//		gScale.add(new Pitch('D'));
//		gScale.add(new Pitch('E'));
		gScale.add(new Pitch('F'));
//		gScale.add(new Pitch('G'));
		
		// Make a list of expected pitches
		List<Pitch> gScaleExpected = new ArrayList<Pitch>();
//		gScaleExpected.add(new Pitch('G'));
//		gScaleExpected.add(new Pitch('A'));
//		gScaleExpected.add(new Pitch('B'));
//		gScaleExpected.add(new Pitch('C'));
//		gScaleExpected.add(new Pitch('D'));
//		gScaleExpected.add(new Pitch('E'));
		gScaleExpected.add(new Pitch('F').accidentalTranspose(1)); // G Major
//		gScaleExpected.add(new Pitch('G'));
		
		scaleTestHelper(gScale, gScaleExpected, KeySignature.G);
	}
	
	private void scaleTestHelper(List<Pitch> rawPitches, List<Pitch> expectedPitches, KeySignature s){
		assertTrue(rawPitches.size() == expectedPitches.size());
		Iterator<Pitch> rawPitchIterator = rawPitches.iterator();
		Iterator<Pitch> expectedPitchIterator = expectedPitches.iterator();
		while(rawPitchIterator.hasNext() && expectedPitchIterator.hasNext()){
			Pitch outputPitch = KeySignatureUtility.getAdjustedPitch(s, rawPitchIterator.next());
			assertTrue(outputPitch.equals(expectedPitchIterator.next()));
		}
	}

}
