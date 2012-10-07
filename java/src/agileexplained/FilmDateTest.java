package agileexplained;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilmDateTest {

	@Test
	public void parseYear() {
		assertEquals("1985", FilmDate.parseYear("1985"));
		assertEquals("1985", FilmDate.parseYear("1985-06-27"));
		assertEquals("1985", FilmDate.parseYear("1985-06"));
		assertEquals("", FilmDate.parseYear(""));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void parseYearThrowsExceptionIfUnableToParse() {
		FilmDate.parseYear("NOT A DATE");
	}

}
