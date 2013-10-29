package sound;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class KeySignatureUtilityTest {
	
	/*
	 * Testing Strategy:
	 * 	- Test several sharp scales
	 * 		- Several major keys
	 * 		- Several minor keys
	 * 	- Test several flat scales
	 * 		- Several major keys
	 * 		- Several minor keys
	 * 	- Test different octaves
	 */
	
	@Test
	public void octaveTest() {
		Pitch f = new Pitch('F').octaveTranspose(2);
		Pitch fs = new Pitch('F').octaveTranspose(2).accidentalTranspose(1);
		Pitch temp = KeySignatureUtility.getAdjustedPitch(KeySignature.G, f);
		assertTrue(temp.equals(fs));
	}
	
	@Test
	public void testCMajorAMinor(){
		// Make a list of pitches 
		List<Pitch> scale = new ArrayList<Pitch>();
		scale.add(new Pitch('G'));
		scale.add(new Pitch('A'));
		scale.add(new Pitch('B'));
		scale.add(new Pitch('C'));
		scale.add(new Pitch('D'));
		scale.add(new Pitch('E'));
		scale.add(new Pitch('F'));
		scale.add(new Pitch('G'));
		
		// Make a list of expected pitches
		List<Pitch> scaleExpected = new ArrayList<Pitch>();
		scaleExpected.add(new Pitch('G'));
		scaleExpected.add(new Pitch('A'));
		scaleExpected.add(new Pitch('B'));
		scaleExpected.add(new Pitch('C'));
		scaleExpected.add(new Pitch('D'));
		scaleExpected.add(new Pitch('E'));
		scaleExpected.add(new Pitch('F'));
		scaleExpected.add(new Pitch('G'));
		
		scaleTestHelper(scale, scaleExpected, KeySignature.C);
		scaleTestHelper(scale, scaleExpected, KeySignature.Am);
	}
	
	@Test
	public void testGMajorEMinor() {
		// Make a list of pitches 
		List<Pitch> gScale = new ArrayList<Pitch>();
		gScale.add(new Pitch('G'));
		gScale.add(new Pitch('A'));
		gScale.add(new Pitch('B'));
		gScale.add(new Pitch('C'));
		gScale.add(new Pitch('D'));
		gScale.add(new Pitch('E'));
		gScale.add(new Pitch('F'));
		gScale.add(new Pitch('G'));
		
		// Make a list of expected pitches
		List<Pitch> gScaleExpected = new ArrayList<Pitch>();
		gScaleExpected.add(new Pitch('G'));
		gScaleExpected.add(new Pitch('A'));
		gScaleExpected.add(new Pitch('B'));
		gScaleExpected.add(new Pitch('C'));
		gScaleExpected.add(new Pitch('D'));
		gScaleExpected.add(new Pitch('E'));
		gScaleExpected.add(new Pitch('F').accidentalTranspose(1)); // G Major
		gScaleExpected.add(new Pitch('G'));
		
		scaleTestHelper(gScale, gScaleExpected, KeySignature.G);
		scaleTestHelper(gScale, gScaleExpected, KeySignature.Em);
	}
	
	@Test 
	public void testFSharpMajorDMinor() {
		// Make a list of pitches 
		List<Pitch> scale = new ArrayList<Pitch>();
		scale.add(new Pitch('G'));
		scale.add(new Pitch('A'));
		scale.add(new Pitch('B'));
		scale.add(new Pitch('C'));
		scale.add(new Pitch('D'));
		scale.add(new Pitch('E'));
		scale.add(new Pitch('F'));
		scale.add(new Pitch('G'));
		
		// Make a list of expected pitches
		List<Pitch> scaleExpected = new ArrayList<Pitch>();
		scaleExpected.add(new Pitch('G').accidentalTranspose(1));
		scaleExpected.add(new Pitch('A').accidentalTranspose(1));
		scaleExpected.add(new Pitch('B'));
		scaleExpected.add(new Pitch('C').accidentalTranspose(1));
		scaleExpected.add(new Pitch('D').accidentalTranspose(1));
		scaleExpected.add(new Pitch('E').accidentalTranspose(1));
		scaleExpected.add(new Pitch('F').accidentalTranspose(1));
		scaleExpected.add(new Pitch('G').accidentalTranspose(1));
		
		scaleTestHelper(scale, scaleExpected, KeySignature.Fs);
		scaleTestHelper(scale, scaleExpected, KeySignature.Dsm);
	}
	
	@Test 
	public void testBbMajorGMinor() {
		// Make a list of pitches 
		List<Pitch> scale = new ArrayList<Pitch>();
		scale.add(new Pitch('G'));
		scale.add(new Pitch('A'));
		scale.add(new Pitch('B'));
		scale.add(new Pitch('C'));
		scale.add(new Pitch('D'));
		scale.add(new Pitch('E'));
		scale.add(new Pitch('F'));
		scale.add(new Pitch('G'));
		
		// Make a list of expected pitches
		List<Pitch> scaleExpected = new ArrayList<Pitch>();
		scaleExpected.add(new Pitch('G'));
		scaleExpected.add(new Pitch('A'));
		scaleExpected.add(new Pitch('B').accidentalTranspose(-1));
		scaleExpected.add(new Pitch('C'));
		scaleExpected.add(new Pitch('D'));
		scaleExpected.add(new Pitch('E').accidentalTranspose(-1));
		scaleExpected.add(new Pitch('F'));
		scaleExpected.add(new Pitch('G'));
		
		scaleTestHelper(scale, scaleExpected, KeySignature.Bb);
		scaleTestHelper(scale, scaleExpected, KeySignature.Gm);
	}
	
	@Test 
	public void testGbMajorEbMinor() {
		// Make a list of pitches 
		List<Pitch> scale = new ArrayList<Pitch>();
		scale.add(new Pitch('G'));
		scale.add(new Pitch('A'));
		scale.add(new Pitch('B'));
		scale.add(new Pitch('C'));
		scale.add(new Pitch('D'));
		scale.add(new Pitch('E'));
		scale.add(new Pitch('F'));
		scale.add(new Pitch('G'));
		
		// Make a list of expected pitches
		List<Pitch> scaleExpected = new ArrayList<Pitch>();
		scaleExpected.add(new Pitch('G').accidentalTranspose(-1));
		scaleExpected.add(new Pitch('A').accidentalTranspose(-1));
		scaleExpected.add(new Pitch('B').accidentalTranspose(-1));
		scaleExpected.add(new Pitch('C').accidentalTranspose(-1));
		scaleExpected.add(new Pitch('D').accidentalTranspose(-1));
		scaleExpected.add(new Pitch('E').accidentalTranspose(-1));
		scaleExpected.add(new Pitch('F'));
		scaleExpected.add(new Pitch('G').accidentalTranspose(-1));
		
		scaleTestHelper(scale, scaleExpected, KeySignature.Gb);
		scaleTestHelper(scale, scaleExpected, KeySignature.Ebm);
	}
	
	private void scaleTestHelper(List<Pitch> rawPitches, List<Pitch> expectedPitches, KeySignature s){
		assertTrue(rawPitches.size() == expectedPitches.size());
		Iterator<Pitch> rawPitchIterator = rawPitches.iterator();
		Iterator<Pitch> expectedPitchIterator = expectedPitches.iterator();
		while(rawPitchIterator.hasNext() && expectedPitchIterator.hasNext()){
			Pitch next = rawPitchIterator.next();
			Pitch outputPitch = KeySignatureUtility.getAdjustedPitch(s, next);
			assertTrue(outputPitch.equals(expectedPitchIterator.next()));
		}
	}
}
