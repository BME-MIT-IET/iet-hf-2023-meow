Feature: Forget

  Scenario: Applying Forget effect
    Given a virologist with agents in their collection
    When the Forget effect is applied to the virologist
    Then the virologist's collection of agents should be empty
