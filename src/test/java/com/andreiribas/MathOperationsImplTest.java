package com.andreiribas;
import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 
 */

/**
 * @author andrei
 *
 */
public class MathOperationsImplTest {
	
	private static final Logger LOGGER = Logger.getLogger(MathOperationsImplTest.class);
	
	private static MathOperations fixture;
	
	@BeforeClass
	public static void setUpClass() {
		
		MathOperationsImplTest.fixture = new MathOperationsImpl();
		
		LOGGER.debug("setUpClass() method."); 
	
	}
	
	@Before
	public void setUp() {
		LOGGER.debug("setUp() method."); 
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddWhenAddingNoNumbersShouldThrowException() {
		fixture.add();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddWhenAddingOnlyOneNumberShouldThrowException() {
		fixture.add(1);
	}
	
	@Test(expected = NullPointerException.class)
	public void testAddWhenAddingTwoNullNumbersShouldThrowException() {
		fixture.add(null, null);
	}
	
	@Test
	@Ignore
	public void testAddWhenAddingTwoNullNumbersShouldThrowExceptionAndFailTestBecauseItsNotCatched() {
		fixture.add(null, null);
	}
	
	@Test
	public void testAddWhenAddingTwoPositiveNumbersShouldReturnAPositiveNumber() {
		
		Number result = fixture.add(1, 2);
		
		TestCase.assertTrue(result.intValue() > 0);
		
		TestCase.assertFalse(result.intValue() <= 0);
		
		TestCase.assertEquals(3, result.intValue());
		
	}
	
	@Test
	public void testAddWhenAddingANegativeAndAPositiveNumbersShouldReturnAPositiveNumberIfPositiveNumberIsHigher() {
		TestCase.assertEquals(1, fixture.add(2, -1).intValue());
	}
	
	@Test
	public void testAddWhenAddingANegativeAndAPositiveNumbersShouldReturnANegativeNumberIfNegativeNumberIsHigher() {
		TestCase.assertEquals(-1, fixture.add(1, -2).intValue());
	}
	
	@Test
	public void testAddWhenAddingANegativeAndAPositiveNumbersShouldReturnZeroWhenBothNumbersAreEqual() {
		TestCase.assertEquals(-0, fixture.add(2, -2).intValue());
	}
	
	@Test
	public void testAddWhenAddingTwoNegativeNumbersShouldReturnANegativeNumber() {
		
		Number result = fixture.add(-1, -2);
		
		TestCase.assertTrue(result.intValue() < 0);
		
		TestCase.assertFalse(result.intValue() >= 0);
		
		TestCase.assertEquals(-3, result.intValue());
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractWhenSubtractingNoNumbersShouldThrowException() {
		fixture.subtract();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubtractWhenSubtractingOnlyOneNumberShouldThrowException() {
		fixture.subtract(1);
	}
	
	@Test(expected = NullPointerException.class)
	public void testSubtractWhenSubtractingTwoNullNumbersShouldThrowException() {
		fixture.subtract(null, null);
	}
	

	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplyWhenMultiplyingNoNumbersShouldThrowException() {
		fixture.multiply();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testMultiplyWhenMultiplyingOnlyOneNumberShouldThrowException() {
		fixture.multiply(1);
	}
	
	@Test(expected = NullPointerException.class)
	public void testMultiplyWhenMultiplyingTwoNullNumbersShouldThrowException() {
		fixture.multiply(null, null);
	}
	
	@Test
	public void testMultiplyWhenMultiplyingTwoPositiveNumbersShouldReturnAPositiveNumber() {
		TestCase.assertEquals(6, fixture.multiply(3, 2).intValue());
	}
	
	@Test
	public void testMultiplyWhenMultiplyingTwoNegativeNumbersShouldReturnAPositiveNumber() {
		TestCase.assertEquals(6, fixture.multiply(-3, -2).intValue());
	}
	
	@Test
	public void testSubtractWhenSubtractingTwoNegativeNumbersShouldReturnAPositiveNumber() {
		TestCase.assertEquals(2, fixture.subtract(-2, -4).intValue());
	}
	
	@Test
	public void testDivideWhenDividingByZeroShouldReturnInfiniteNumber() {
		TestCase.assertTrue(Double.isInfinite(fixture.divide(1, 0).doubleValue()));
	}
	
	@Test
	public void testDivideWhenDividingZeroByOneShouldReturnZero() {
		TestCase.assertEquals(0, fixture.divide(0, 1).intValue());
	}
	
	@Test
	public void testDivideWhenDividingSixByTwoShouldReturnThree() {
		TestCase.assertEquals(3, fixture.divide(6, 2).intValue());
	}
	
	@AfterClass
	public static void tearDownClass() {
		LOGGER.debug("tearDownClass() method."); 
	}
	
	@After
	public void tearDown() {
		LOGGER.debug("tearDown() method."); 
	}
	
}
