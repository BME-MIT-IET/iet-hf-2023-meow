package main.java.skeletonTester.Tests;

import main.java.agents.Paralyzed;
import main.java.collectables.equipments.Gloves;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

public class AttackParalyzedAgentWithGloves extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with Paralyzed Agent when the attacked virologist wears Gloves";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        //Set the envirement for the test
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        Gloves g = new Gloves();
        g.applyEffect(targetvirologist);
        Paralyzed paralyzed = new Paralyzed();

        //run the function to be tested
        virologist.useAgent(paralyzed, targetvirologist);
    }
}
