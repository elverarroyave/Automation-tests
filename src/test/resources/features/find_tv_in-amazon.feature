#Author:Elver Arroyave
    #language:en

Feature: As user I need to search a product in the main Amazon site.
  Software

  Background: Main page
      Given the customer enter to main page

  Scenario: Search TV LG in Amazon
    Given I enter "Tv Lg" in the search bar
    When I press the search magnifying glass
    Then I can see the search results of "Tv Lg"