class FilmPage
  include PageObject

  expected_title "Movie Release Year Finder"
  text_field(:film_title, :name => "film_title")
  button(:search, :text => 'Find Year')
end
