package main.java.skeletonTester.Tests;

import main.java.collectables.equipments.Bag;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;

public class DiscardBag extends Test {

    public String getName() {
        return "Discard Bag";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        Virologist virologist = new Virologist("bob");
        Bag bag = new Bag();
        bag.collectBy(virologist);

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        virologist.discard(bag);
    }
}
