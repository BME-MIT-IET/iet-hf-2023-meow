Feature: Paralyzed effect on a Virologist

  Scenario: Applying the Paralyzed effect
    Given a Virologist
    When the Paralyzed effect is applied
    Then the Virologist should be paralyzed

  Scenario: Removing the Paralyzed effect
    Given a Virologist with the Paralyzed effect
    When the Paralyzed effect is removed
    Then the Virologist should no longer be paralyzed
