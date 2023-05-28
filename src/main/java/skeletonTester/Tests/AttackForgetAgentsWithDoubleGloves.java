package main.java.skeletonTester.Tests;

import main.java.agents.Forget;
import main.java.collectables.equipments.Gloves;
import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

public class AttackForgetAgentsWithDoubleGloves extends Test {

    /**
     * getName for the menu
     */
    public String getName() {
        return "Attack with Forget Agent when both Virologist have Gloves";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Virologist virologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        Gloves g = new Gloves();
        Gloves g1 = new Gloves();
        g.applyEffect(targetvirologist);
        g1.applyEffect(virologist);
        Forget forget = new Forget();
        virologist.useAgent(forget, targetvirologist);
    }
}
