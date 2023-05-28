package main.java.skeletonTester.Tests;

import main.java.collectables.Collectable;
import main.java.collectables.matters.AminoAcid;
import main.java.collectables.matters.NucleicAcid;
import main.java.fields.Storage;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;
import java.util.ArrayList;

public class DiscardNucleicAcid extends Test {

    /**
     * getName for the menu
     */
    @Override
    public String getName() {
        return "Discard NucleicAcid";
    }

    /**
     * runTest for the start the function
     */
    @Override
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        ArrayList<Collectable> collectableArrayList = new ArrayList<Collectable>();
        collectableArrayList.add(new NucleicAcid());
        collectableArrayList.add(new AminoAcid());
        Virologist virologist = new Virologist("bob");
        Storage storage = new Storage(collectableArrayList);
        //Collect NucleicAcid
        virologist.collect(storage);

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        virologist.discard(new NucleicAcid(30));
    }
}