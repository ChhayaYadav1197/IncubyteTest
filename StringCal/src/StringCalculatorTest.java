package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testAddEmptyString() {
		StringCalculator cal = new StringCalculator();
		assertEquals(0, cal.Add(""));
	}
	
	@Test
	void testAddSingleNumber() {
		StringCalculator cal = new StringCalculator();
		assertEquals(1, cal.Add("1"));
	}
	@Test
	void testAddTwoNumbers() {
		StringCalculator cal = new StringCalculator();
		assertEquals(3, cal.Add("1,2"));
	}
	

	@Test
	void testAddUnknowAmountOfNumbers() {
		StringCalculator cal = new StringCalculator();
		assertEquals(19, cal.Add("1,2,3,4,4,5"));
	}
}
