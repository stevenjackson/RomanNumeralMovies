package agileexplained;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralTest {

	private void assertNumeral(String string, int number) {
		assertEquals(string, RomanNumeral.convert(number));
	}

	@Test
	public void testSymbols() {
		assertNumeral("I", 1);
		assertNumeral("V", 5);
		assertNumeral("X", 10);
		assertNumeral("L", 50);
		assertNumeral("C", 100);
		assertNumeral("D", 500);
		assertNumeral("M", 1000);
	}
	
	@Test
	public void testAdditions() throws Exception {
		assertNumeral("II", 2);
		assertNumeral("VI", 6);
		assertNumeral("VII", 7);
		assertNumeral("VIII", 8);
	}
	
	@Test
	public void testSubtractions() throws Exception {
		assertNumeral("IV", 4);
		assertNumeral("IX", 9);
		assertNumeral("XL", 40);
		assertNumeral("XC", 90);
		assertNumeral("CD", 400);
		assertNumeral("CM", 900);
	}
	
	@Test
	public void testYears() throws Exception {
		assertNumeral("MCMLXXXV", 1985);
		assertNumeral("MCMLXXIX", 1979);	
	}
}
