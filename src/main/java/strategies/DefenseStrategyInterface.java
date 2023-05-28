package main.java.strategies;

import main.java.agents.Agent;
import main.java.virologist.Virologist;

/**
 * Interface for the functions of the defending strategy
 */
public interface DefenseStrategyInterface {
    public void defense(Agent agent,Virologist defenderVirologist, Virologist attackerVirologist);
}
