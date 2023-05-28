package main.java.skeletonTester.Tests;

import main.java.collectables.Collectable;
import main.java.collectables.equipments.Cloak;
import main.java.fields.Shelter;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;
import java.util.ArrayList;

public class CollectCloakTest extends Test {

    @Override
    public String getName() {
        return "Collect Cloak";
    }

    /**
     * runTest for the start the function
     */
    @Override
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        Virologist virologist = new Virologist("bob");
        Shelter shelter = new Shelter(
            new ArrayList<Collectable>() {
                {
                    add(new Cloak());
                    add(new Cloak());
                }
            }
        );

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        virologist.collect(shelter);
    }
}
