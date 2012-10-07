package agileexplained;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilmDataReport {

	public static final Pattern[] DATE_PATTERNS = new Pattern[] {
		Pattern.compile("(\\d{4})"),
		Pattern.compile("(\\d{4})-\\d{2}-\\d{2}"),
		Pattern.compile("(\\d{4})-\\d{2}"),
		Pattern.compile("()"),
		
	};

	public static String[] getStrings(Film film) {
		if(film == null) return new String[0];
		
		return filmAttributes(film).toArray(new String[0]);
	}

	private static List<String> filmAttributes(Film film) {
		List<String> attributes = new ArrayList<String>();
		attributes.add(film.getTitle());
		attributes.add(parseYear(film.getDate()));
		return attributes;
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
	
}
