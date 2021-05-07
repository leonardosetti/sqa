Feature: BoiTempo Search Engine
  //@mandatory

  Scenario: Empty Search Box by Button

    Given I am on BoiTempo Home Page
    When I click on SearchButton
    Then the search box shows up
