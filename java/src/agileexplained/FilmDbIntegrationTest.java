package agileexplained;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FilmDbIntegrationTest {

	private FilmDb db;

	@Before
	public void setUp() throws Exception {
		File theFilmDb = new File("film.db");
		db = new FilmDb(theFilmDb.getAbsolutePath());
		db.connect();
	}
	
	@After
	public void tearDown() {
		db.disconnect();
	}
	
	private void assertMatchesFormat(String date) {
		for(Pattern p : FilmDate.DATE_PATTERNS) {
			if(p.matcher(date).matches())
				return;
		}
		
		fail("Did not find a match for" + date);
	}
	
	@Test
	public void connectToDb() throws Exception {
		assertEquals(198312, db.getFilmCount());
	}
	
	@Test
	public void retrieveFilm() throws Exception {
		Film film = db.retrieveFilm("The Goonies");
		assertNotNull(film);
	}
	
	@Test
	public void retrieveFilmIsNullForNonExistentMovie() throws Exception {
		assertNull(db.retrieveFilm("The Unlikely Adventures of @$%%UAasdfkj!!a"));
	}
	
	@Test
	public void yearFormatTest() {
		for(String date :  db.getAllReleaseDates()){
			assertMatchesFormat(date);
		}
	}
}
