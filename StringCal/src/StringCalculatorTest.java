package src;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void testAddEmptyString() throws Exception {
		StringCalculator cal = new StringCalculator();
		assertEquals(0, cal.Add(""));
	}

	@Test
	void testAddSingleNumber() throws Exception {
		StringCalculator cal = new StringCalculator();
		assertEquals(1, cal.Add("1"));
	}

	@Test
	void testAddTwoNumbers() throws Exception {
		StringCalculator cal = new StringCalculator();
		assertEquals(3, cal.Add("1,2"));
	}

	@Test
	void testAddUnknowAmountOfNumbers() throws Exception {
		StringCalculator cal = new StringCalculator();
		assertEquals(19, cal.Add("1,2,3,4,4,5"));
	}

	@Test
	void allowAddToHandleNewLineBetweenNumbers() throws Exception {
		StringCalculator cal = new StringCalculator();
		assertEquals(5, cal.Add("1\n2,2"));
	}

	@Test
	void allowAddToHandleNewLineBetweenNumbersNotComma() {
		StringCalculator cal = new StringCalculator();

		assertThrows(NumberFormatException.class, () -> {
			cal.Add("20,\n,");
		});

	}

	@Test
	void allowAddToHandleAnyDelimiter() throws Exception {
		StringCalculator cal = new StringCalculator();
		assertEquals(3, cal.Add("//^\n1^2"));
	}
}
