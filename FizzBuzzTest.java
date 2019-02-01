package com.manifestcorp;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fizz;
	@Before
	public void setUp() {
	fizz = new FizzBuzz();
	fizz.creates100LinesOfFizzBuzz();
	}
	@After
	public void tearDown() throws Exception {
		fizz = null;
	}
	@Test
	public void leaveUnfizzableNumbersAlone()
	{
		assertEquals("Numbers will display if neither a multiple of 3 or 5", "2", fizz.fizzBuzzCreator(2));
	}
	@Test
	public void numberIsAMultipleOfThree() 
	{
		assertEquals("Fizz will display if multiple of 3", "Fizz", fizz.fizzBuzzCreator(3));
	}
	@Test
	public void numberIsAMultipleOfFive()
	{
		assertEquals("Fizz will display if multiple of 5", "Buzz", fizz.fizzBuzzCreator(5));
	}
	@Test
	public void numberIsAMultipleOfFifteen()
	{
		assertEquals("FizzBuzz will display if multiple of 15", "FizzBuzz", fizz.fizzBuzzCreator(15));
	}
}
