package main.java.skeletonTester.Tests;

import main.java.agents.Paralyzed;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

/**
 * Test for Attack with paralyzed Agent
 */
public class AttackParalyzedAgent extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with Paralyzed Agent";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        Paralyzed paralyzed = new Paralyzed();
        virologist.useAgent(paralyzed, targetvirologist);
    }
}
