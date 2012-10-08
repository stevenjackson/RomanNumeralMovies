package agileexplained;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralTest {

	private void assertConvert(String roman, int arabic) {
		assertEquals(roman, RomanNumeral.convert(arabic));
	}
	
	
	@Test
	public void converts1() {
		assertConvert("I", 1);
	}
	
	@Test
	public void converts2() {
		assertConvert("II", 2);
	}
	
	@Test
	public void converts4() {
		assertConvert("IV", 4);
	}
	
	@Test
	public void converts5() {
		assertConvert("V", 5);
	}
	
	@Test
	public void converts8() {
		assertConvert("VIII", 8);
	}
	
	@Test
	public void converts9() {
		assertConvert("IX", 9);
	}
	
	@Test
	public void converts10() {
		assertConvert("X", 10);
	}
	
	@Test
	public void converts13() {
		assertConvert("XIII", 13);
	}
	
	@Test
	public void converts18() {
		assertConvert("XVIII", 18);
	}
	
	@Test
	public void converts19() {
		assertConvert("XIX", 19);
	}
	
	@Test
	public void converts31() {
		assertConvert("XXXI", 31);
	}
	
	@Test
	public void converts39() {
		assertConvert("XXXIX", 39);
	}
	
	@Test
	public void converts40() {
		assertConvert("XL", 40);
	}
	
	@Test
	public void converts50() {
		assertConvert("L", 50);
	}
	
	@Test
	public void converts88() {
		assertConvert("LXXXVIII", 88);
	}
	
	@Test
	public void converts90() {
		assertConvert("XC", 90);
	}
	
	@Test
	public void converts100() {
		assertConvert("C", 100);
	}
	
	@Test
	public void converts399() {
		assertConvert("CCCXCIX", 399);
	}
	
	@Test
	public void converts985() {
		assertConvert("CMLXXXV", 985);
	}
	
	@Test
	public void converts1000() {
		assertConvert("M", 1000);
	}
	
	@Test
	public void converts1985() {
		assertConvert("MCMLXXXV", 1985);
	}
	
	@Test
	public void converts3000() {
		assertConvert("MMM", 3000);
	}

}
