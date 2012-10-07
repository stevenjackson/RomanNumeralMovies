Given /^I am on the movie lookup page$/ do
  @page = FilmPage.new(@browser)
  @page.navigate_to("http://localhost:9292")
end

When /^I search for "(.*?)"$/ do |movie|
  @page.film_title = movie
  @page.search
end

Then /^I should see "(.*?)"$/ do |text|
  @page.text.should include text
end
