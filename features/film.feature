Feature:  Retrieve Release Year
  In order to expand my knowledge
  As a movie aficionado
  I want to see what year a movie was released


  Scenario: Verify year is present in the results
    Given I am on the movie lookup page
    When I search for "The Goonies"
    Then I should see "1985"
    
    
