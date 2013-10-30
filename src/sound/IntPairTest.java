package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntPairTest {
	
	/**
	 * Testing Strategy:
	 * 	- the IntPair has the same values as when it was instantiated,
	 * 		in the right order
	 * 	- the getValue() method returns the quotient of the first value
	 * 		and the second value.
	 * 	- IntPair works even when we use Integer.MAX_VALUE
	 * 	- pair1.compareTo(pair2) works when pair1 > pair2, 
	 * 		pair1 < pair2, pair1 = pair2
	 * 	- fuzzyDoubleEquals(d1, d2) works when d1 and d2 satisfy
	 * 		and don't satisfy the tolerance. 
	 */
	
	@Test
	public void verifyValuesHoldTest() {
		final int VALUE_1 = 1;
		final int VALUE_2 = 2;
		IntPair pair = new IntPair(VALUE_1, VALUE_2);
		assertTrue(pair.numerator == VALUE_1);
		assertTrue(pair.denominator == VALUE_2);
		assertFalse(pair.numerator == VALUE_2);
		assertFalse(pair.denominator == VALUE_1);
	}
	
	@Test
	public void getValueTest() {
		final int VALUE_1 = 1;
		final int VALUE_2 = 2;
		IntPair pair = new IntPair(VALUE_1, VALUE_2);
		assertTrue(IntPair.fuzzyDoubleEquals(
				((double) pair.numerator)/pair.denominator, pair.getValue()));
	}
	
	@Test
	public void maxValuesTest() {
		final int VALUE_1 = Integer.MAX_VALUE;
		final int VALUE_2 = Integer.MIN_VALUE;
		IntPair pair = new IntPair(VALUE_1, VALUE_2);
		assertTrue(pair.numerator == VALUE_1);
		assertTrue(pair.denominator == VALUE_2);
		assertTrue(IntPair.fuzzyDoubleEquals(
				((double) pair.numerator)/pair.denominator, pair.getValue()));
	}
	
	@Test
	public void compareToTest() {
		final int VALUE_1 = 1;
		final int VALUE_2 = 2;
		final int VALUE_3 = -3;
		IntPair pair1 = new IntPair(VALUE_1, VALUE_2);
		IntPair pair2 = new IntPair(VALUE_1, VALUE_2);
		IntPair pair3 = new IntPair(VALUE_2, VALUE_3);
		assertTrue(pair1.compareTo(pair2) == 0);
		assertTrue(pair2.compareTo(pair1) == 0);
		assertTrue(pair1.compareTo(pair3) > 0);
		assertTrue(pair3.compareTo(pair2) < 0);
	}
	
	@Test
	public void fuzzyDoubleEqualsNoTolTest() {
		final double VALUE_1 = 1.23456789;
		final double VALUE_2 = 1.234567891;
		final double VALUE_3 = 9.87654321;
		assertTrue(IntPair.fuzzyDoubleEquals(VALUE_1, VALUE_1));
		assertTrue(IntPair.fuzzyDoubleEquals(VALUE_1, VALUE_2));
		assertFalse(IntPair.fuzzyDoubleEquals(VALUE_3, VALUE_2));
	}
	
	@Test
	public void fuzzyDoubleEqualsTolTest() {
		final double VALUE_1 = 1.23456789;
		final double VALUE_2 = 1.234567891;
		final double VALUE_3 = 9.87654321;
		final double TOL = 1;
		assertTrue(IntPair.fuzzyDoubleEquals(VALUE_1, VALUE_1, TOL));
		assertTrue(IntPair.fuzzyDoubleEquals(VALUE_1, VALUE_2, TOL));
		assertFalse(IntPair.fuzzyDoubleEquals(VALUE_3, VALUE_2, TOL));
	}

}
