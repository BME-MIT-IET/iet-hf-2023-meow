package main.java.skeletonTester.Tests;

import main.java.agents.Protection;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

public class AttackProtectionAgentWithProtection extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with Protection Agent when the attacked virologist have Protection agent";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        //Set the envirement for the test
        Virologist virologist = new Virologist("james");
        Virologist targetvirologist = new Virologist("bob");
        Protection p = new Protection();
        p.applyEffect(targetvirologist);
        Protection protection = new Protection();

        //run the function to be tested
        virologist.useAgent(protection, targetvirologist);
    }
}
