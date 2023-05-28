package main.java.skeletonTester.Tests;

import main.java.agents.Protection;
import main.java.collectables.equipments.Cloak;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;

public class AttackProtectionAgentWithCloak extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with Protection Agent when the attacked virologist wears Cloak";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Tester.getInstance().turnOffLogging();

        //Set the envirement for the test
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        Cloak c = new Cloak();
        c.applyEffect(targetvirologist);
        Protection protection = new Protection();

        Tester.getInstance().turnOnLogging();

        //run the function to be tested
        virologist.useAgent(protection, targetvirologist);
    }
}
