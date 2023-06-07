Feature: Gloves Behavior

  Scenario: Virologist wearing gloves attacks back when attacked
    Given a virologist wearing gloves
    And an attacking agent
    And an attacker virologist
    When the gloves defend against the attacker
    And the gloves' life is decreased by 1
