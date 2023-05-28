package main.java.skeletonTester.Tests;

import main.java.agents.Forget;
import main.java.collectables.equipments.Cloak;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

public class AttackForgetAgentWithCloak extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with Forget Agent when the attacked virologist wears Cloak";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        //Set the environment for the test
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        Cloak c = new Cloak();
        c.applyEffect(targetvirologist);
        Forget forget = new Forget();

        //run the function to be tested
        virologist.useAgent(forget, targetvirologist);
    }
}
