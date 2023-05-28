package main.java.strategies;

import main.java.virologist.Virologist;

/**
 * Interface for the functions of the moving strategy
 */
public interface MoveStrategyInterface {
    public void move(Virologist virologist, int nextTileIndex);
}
