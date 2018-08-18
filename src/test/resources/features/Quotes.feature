@QuoteFeature
Feature: Quote feature

  @Positive
  Scenario: Add quote
    Given User open wonderful quote page
    When User input quote "Nothing is impossible!"
    And User type author "Gege"
    And User select colour "cyan"
    And User click add quote button
    Then Quote should be added

  Scenario: Add quote
    Given User open wonderful quote page
    When User input quote "Nothing is impossible!"
    And User type author "Gege"
    And User select colour "cyan"
    And User click add quote button
    Then Quote should be added