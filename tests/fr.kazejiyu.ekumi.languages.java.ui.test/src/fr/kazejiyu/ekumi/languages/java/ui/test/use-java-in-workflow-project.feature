Feature: Create a workflow project feature the Java scripting language
  I want to use Java to define the behavior of tasks.

  Scenario: Create Project
    Given that I open a wizard for a new workflow project "test"
    When I use the "Java" language
    And the "Stub Representation" representation
    And I finish the wizard
    Then the project "test" exists
    And the project "test" has the Java nature
    And the project "test" has the PDE nature
