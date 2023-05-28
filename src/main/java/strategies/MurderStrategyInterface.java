package main.java.strategies;

import main.java.virologist.Virologist;

/**
 * Interface for the functions of the moving strategy
 */
public interface MurderStrategyInterface {
    public void murder(Virologist murderervirologist, Virologist murderedvirologist);
}
