package main.java.skeletonTester.Tests;

import main.java.agents.Protection;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

/**
 * Test for Attack with Protection Agent
 */
public class AttackProtectionAgent extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with Protection Agent";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        Protection protection = new Protection();
        virologist.useAgent(protection, targetvirologist);
    }
}
