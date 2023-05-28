package main.java.skeletonTester.Tests;

import main.java.agents.VitusDance;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

/**
 * Test for Attack with VitusDance Agent
 */
public class AttackVitusDanceAgent extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with VitusDance Agent";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        VitusDance vitusDance = new VitusDance();
        virologist.useAgent(vitusDance, targetvirologist);
    }
}
