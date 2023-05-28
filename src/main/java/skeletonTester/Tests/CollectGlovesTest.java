package main.java.skeletonTester.Tests;

import main.java.collectables.Collectable;
import main.java.collectables.equipments.Gloves;
import main.java.fields.Shelter;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;
import java.util.ArrayList;

public class CollectGlovesTest extends Test {

    @Override
    public String getName() {
        return "Collect Gloves";
    }

    @Override
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        Virologist virologist = new Virologist("bob");
        Shelter shelter = new Shelter(
            new ArrayList<Collectable>() {
                {
                    add(new Gloves());
                    add(new Gloves());
                }
            }
        );

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        virologist.collect(shelter);
    }
}
