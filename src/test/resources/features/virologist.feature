Feature: Virologist
    As a virologist
    I want to perform actions and interact with the game
    So that I can progress in the game

    Scenario: Attacking another virologist
        Given there are two virologists named "Virologist1" and "Virologist2"
        When "Virologist1" attacks "Virologist2"
        Then "Virologist2" should be affected by the attack