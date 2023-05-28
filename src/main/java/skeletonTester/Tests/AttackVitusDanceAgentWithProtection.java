package main.java.skeletonTester.Tests;

import main.java.agents.Protection;
import main.java.agents.VitusDance;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

public class AttackVitusDanceAgentWithProtection extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with VitusDance Agent when the attacked virologist have Protection agent";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        //Set the envirement for the test
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        Protection p = new Protection();
        p.applyEffect(targetvirologist);
        VitusDance vitusDance = new VitusDance();

        //run the function to be tested
        virologist.useAgent(vitusDance, targetvirologist);
    }
}
