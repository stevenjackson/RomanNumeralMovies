package agileexplained;

public class Film {

	private String title;
	private String date;

	public Film(String title, String date) {
		this.title = title;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public FilmDate getDate() {
		return new FilmDate(date);
	}

}
