package agileexplained;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FilmDb {
	private static final String dbFile = "/Users/stevejackson/leandog/agileexplained/roman_numeral/film.db";
	private Connection connection;
	
	public void connect() throws Exception {
		Class.forName("org.sqlite.JDBC");
		connection = DriverManager.getConnection("jdbc:sqlite:" + dbFile);
	}
	
	public void disconnect() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getFilmCount() {
		try {
			return tryGetFilmCount();
		} catch (Exception e) {
			return 0;
		}
	}
	
	private int tryGetFilmCount() throws SQLException {
		Statement statement = null;
		try {
			statement = connection.createStatement();  
	        ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) FROM film");  
	        return resultSet.getInt(1);
		} finally {
			close(statement);
		}
	}

	private void close(Statement statement) {
		if(statement == null) return;
		
		try {
			statement.close();
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
	}

	public Film retrieveFilm(String title) throws SQLException {
		Statement statement = null;
		try {
			statement = connection.createStatement();  
	        ResultSet resultSet = statement.executeQuery("SELECT * FROM film WHERE name='" + title + "'");  
	        return createFilm(resultSet);
		} finally {
			close(statement);
		}
	}

	private Film createFilm(ResultSet resultSet) throws SQLException {
		if(!resultSet.next()) return null;
		
		Film film = new Film(resultSet.getString("name"), resultSet.getString("initial_release_date"));
		return film;
	}
}
