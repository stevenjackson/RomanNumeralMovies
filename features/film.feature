Feature:  Retrieve Release Year
  In order to expand my knowledge
  As a movie aficionado
  I want to see what year a movie was released

  Background:
    Given I am on the movie lookup page 
  
  Scenario: Verify year is present in the results
    When I search for "The Goonies"
    Then I should see "1985"
