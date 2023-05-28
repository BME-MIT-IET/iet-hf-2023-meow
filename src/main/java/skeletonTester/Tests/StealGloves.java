package main.java.skeletonTester.Tests;

import main.java.agents.Paralyzed;
import main.java.collectables.equipments.Gloves;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;

public class StealGloves extends Test {

    /**
     * * getName for the menu
     */

    public String getName() {
        return "Steal Gloves";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Tester.getInstance().turnOffLogging();

        //Set the envirement for the test
        Gloves gloves = new Gloves();
        Virologist robbervirologist = new Virologist("bob");
        Virologist targetvirologist = new Virologist("james");
        gloves.collectBy(targetvirologist);
        Paralyzed paralyzedAgent = new Paralyzed();
        paralyzedAgent.applyEffect(targetvirologist);

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        robbervirologist.steal(gloves, targetvirologist);
    }
}
