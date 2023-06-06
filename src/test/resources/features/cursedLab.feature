Feature: Cursed Lab Behavior

  Scenario: Virologist collects gencodes from a cursed lab
    Given a cursed lab with the following gencodes:
      | Gencode |
      | G1      |
      | G2      |
    When the virologist collects gencodes from the lab
    Then the virologist should learn the gencodes
