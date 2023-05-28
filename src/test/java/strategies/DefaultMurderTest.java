package strategies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DefaultMurderTest {

    @Test
    public void testMurder() {
        main.java.virologist.Virologist murderer = new main.java.virologist.Virologist("John");
        main.java.virologist.Virologist victim = new main.java.virologist.Virologist("Jane");
        List<main.java.virologist.Virologist> virologists = main.java.gameControl.GameController.getInstance().getAllVirologists();
        virologists.add(murderer);
        virologists.add(victim);

        main.java.strategies.DefaultMurder strategy = new main.java.strategies.DefaultMurder();

        // Perform the murder
        strategy.murder(murderer, victim);

        //az áldozat nem halt meg
        assertTrue(virologists.contains(victim));
    }
}