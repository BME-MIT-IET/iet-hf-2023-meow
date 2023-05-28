package main.java.skeletonTester.Tests;

import main.java.agents.Forget;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

/**
 * Test for Attack with Forget Agent
 */
public class AttackForgetAgent extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with Forget Agent";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        Forget forget = new Forget();
        virologist.useAgent(forget, targetvirologist);
    }
}
