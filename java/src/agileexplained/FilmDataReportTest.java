package agileexplained;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilmDataReportTest {

	@Test
	public void parseYear() {
		assertEquals("1985", FilmDataReport.parseYear("1985"));
		assertEquals("1985", FilmDataReport.parseYear("1985-06-27"));
		assertEquals("1985", FilmDataReport.parseYear("1985-06"));
		assertEquals("", FilmDataReport.parseYear(""));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void parseYearThrowsExceptionIfUnableToParse() {
		FilmDataReport.parseYear("NOT A DATE");
	}

}
