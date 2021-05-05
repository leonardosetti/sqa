Feature: <WebSite> Search Engine
  Scenario: Empty Search Box by Button
    // Given When And Then

    Given I am on <WebSite> Home Page
    When I click on SearchButton
    Then the message <msg> shows up
