package agileexplained;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilmDate {

	private String date;
	public static final Pattern[] DATE_PATTERNS = new Pattern[] {
		Pattern.compile("(\\d{4})"),
		Pattern.compile("(\\d{4})-\\d{2}-\\d{2}"),
		Pattern.compile("(\\d{4})-\\d{2}"),
		Pattern.compile("()"),
		
	};

	public FilmDate(String date) {
		this.date = date;
	}
	
	public String year() {
		return parseYear(date);
	}
	
	public static String parseYear(String date) {
		for(Pattern p : DATE_PATTERNS) {
			Matcher m = p.matcher(date);
			if(m.matches()) {
				return m.group(1);
			}
		}
		
		throw new IllegalArgumentException("Could not parse " + date);
	}

	public String romanYear() {
		return RomanNumeral.convert(year());
	}

}
