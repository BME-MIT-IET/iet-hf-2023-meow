package main.java.collectables;

import main.java.virologist.Virologist;

/**
 * Interface for collectable items functions
 */
public interface Collectable {
    void collectBy(Virologist virologist);
    void discard(Virologist virologist);
}
