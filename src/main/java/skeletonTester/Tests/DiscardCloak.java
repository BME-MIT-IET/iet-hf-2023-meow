package main.java.skeletonTester.Tests;

import main.java.collectables.equipments.Cloak;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;

public class DiscardCloak extends Test {

    public String getName() {
        return "Discard Cloak";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        Cloak cloak = new Cloak();
        Virologist virologist = new Virologist("bob");
        cloak.collectBy(virologist);

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        virologist.discard(cloak);
    }
}
