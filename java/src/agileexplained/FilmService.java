package agileexplained;

public class FilmService {
	private FilmDb db;

	public FilmService(String pathToFilmDatabase) {
		setupDb(pathToFilmDatabase);
	}
	
	private void setupDb(String pathToFilmDatabase) {
		try {
			db = new FilmDb(pathToFilmDatabase);
			db.connect(); 
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public String[] getFilmData(String title) {
		try {
			Film film = db.retrieveFilm(title);
			return FilmDataReport.getStrings(film);
		} catch (Exception e) {
			e.printStackTrace();
			return new String[0];
		}
	}
}
