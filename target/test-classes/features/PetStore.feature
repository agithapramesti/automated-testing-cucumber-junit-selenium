@PetFeature
Feature: Pet feature

  Scenario: verify add pet
    Given prepare add pet request data with id "1234" and pet name "Meong"
    When send add pet request
    Then add pet response data id should be "1234"
    And add pet response data pet name should be "Meong"
