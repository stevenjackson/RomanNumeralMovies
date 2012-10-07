package agileexplained;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FilmDbIntegrationTest {

	private FilmDb db;

	@Before
	public void setUp() throws Exception {
		db = new FilmDb();
		db.connect();
	}
	
	@After
	public void tearDown() {
		db.disconnect();
	}
	
	@Test
	public void connectToDb() throws Exception {
		assertEquals(198313, db.getFilmCount());
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

}
