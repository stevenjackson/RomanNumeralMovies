package agileexplained;


public class RomanNumeral {
	private enum Symbol {
		M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);
		private final int number;

		Symbol(int number) {
			this.number = number;
		}
	}

	public static String convert(int number) {
		String roman = "";
		
		for (Symbol symbol : Symbol.values()) {
			while (number >= symbol.number) {
				roman += symbol;
				number -= symbol.number;
			}
			
		}
		
		return roman;
	}

	public static String convert(String year) {
		return convert(Integer.parseInt(year));
	}
}
