package main.java.skeletonTester.Tests;

import main.java.collectables.Collectable;
import main.java.collectables.matters.AminoAcid;
import main.java.collectables.matters.NucleicAcid;
import main.java.fields.Storage;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;
import java.util.ArrayList;

public class CollectAminoAcid extends Test {

    /**
     * getName for the menu
     */
    @Override
    public String getName() {
        return "Collect AminoAcid";
    }

    /**
     * runTest for the start the function
     */
    @Override
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        ArrayList<Collectable> collectableArrayList = new ArrayList<Collectable>();
        collectableArrayList.add(new AminoAcid());
        collectableArrayList.add(new NucleicAcid());
        Virologist virologist = new Virologist("bob");

        Storage storage = new Storage(collectableArrayList);

        Tester.getInstance().turnOnLogging();
        //Collect AminoAcid
        virologist.collect(storage);
    }
}
