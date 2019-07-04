Feature: Create workflow project using the EDS representation
  I want to create workflow project that uses the EDS representation

  Scenario: Attempting to create a project with no language and no representation
    Given that I open a wizard for a new workflow project "test"
    When I select no language
    And the "EKumi Default Representation" representation
    And I finish the wizard
    Then the project "test" exists
    And the project "test" has the Modeling nature
    And the project "test" has an empty EDS model called "test.eds"
