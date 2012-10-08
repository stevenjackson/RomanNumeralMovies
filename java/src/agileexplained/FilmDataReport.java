package agileexplained;

import java.util.ArrayList;
import java.util.List;

public class FilmDataReport {

	public static String[] getStrings(Film film) {
		if(film == null) return new String[0];
		
		return filmAttributes(film).toArray(new String[0]);
	}

	private static List<String> filmAttributes(Film film) {
		List<String> attributes = new ArrayList<String>();
		attributes.add(film.getTitle());
		attributes.add(film.getDate().year());
		attributes.add(film.getDate().romanYear());
		return attributes;
	}

	
	
}
