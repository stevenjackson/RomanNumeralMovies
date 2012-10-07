class FilmPage
  include PageObject

  expected_title "Movie Release Date Finder"
  text_field(:film_title, :name => "film_title")
  button(:search, :text => 'Find Date')
end
