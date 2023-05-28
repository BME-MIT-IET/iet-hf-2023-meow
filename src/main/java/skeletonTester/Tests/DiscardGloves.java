package main.java.skeletonTester.Tests;

import main.java.collectables.equipments.Gloves;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;

public class DiscardGloves extends Test {

    public String getName() {
        return "Discard Gloves";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        Gloves gloves = new Gloves();
        Virologist virologist = new Virologist("bob");
        gloves.collectBy(virologist);

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        virologist.discard(gloves);
    }
}
