Feature: Create a simple workflow project
  I want to create a simple workflow project.

  Scenario: Attempting to create a project with no language and no representation
    Given that I open a wizard for a new workflow project "test"
    When I select no language
    And no representation
    Then I cannot finish the wizard    
