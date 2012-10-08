package agileexplained;

public class RomanNumeral {

	public static String convert(String year) {
		return convert(Integer.parseInt(year));
	}
	
	public static String convert(int arabic) {
		int thousands = arabic / 1000 % 10;
		int hundreds = arabic / 100 % 10;
		int tens = arabic / 10 % 10;
		int ones = arabic % 10;
		
		String roman = "";
		roman += repeat("M", thousands);
		roman += processDigit(hundreds, "C", "D", "M");
		roman += processDigit(tens, "X", "L", "C");
		roman += processDigit(ones, "I", "V", "X");
		return roman;
	}

	private static String processDigit(int digit, String ones, String fives, String tens) {
		if(digit == 4)  return ones + fives;
		if(digit == 9)  return ones + tens;
		
		String roman = "";
		if(digit >= 5) {
			roman += fives;
			digit -= 5;
		}
		
		roman += repeat(ones, digit);
		return roman;
	}
	
	private static String repeat(String character, int times) {
		String s = "";
		for(int i = 0; i < times; i++) {
			s += character;
		}
		return s;
	}
}
