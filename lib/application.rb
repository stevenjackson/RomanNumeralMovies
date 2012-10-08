require 'bundler/setup'
require 'enumerator'
require 'sinatra'
require 'haml'

require 'java'
$CLASSPATH << "java/lib/sqlite-jdbc-3.7.2.jar"
$CLASSPATH << "java/bin"
java_import 'agileexplained.FilmService'
films = FilmService.new(File.expand_path('film.db'))

get '/' do
  film_title = params[:film_title] || ''
  
  if film_title.empty?
    @results = []
  else
    @results = films.getFilmData(film_title)
  end
  
  if @results.empty?
    @columns = []
  else
    @columns = ["Title", "Year Released"]
  end
  
  @film_title = CGI.escapeHTML film_title

  haml :index
end
