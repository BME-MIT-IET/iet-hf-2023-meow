package main.java.skeletonTester.Tests;

import main.java.agents.Paralyzed;
import main.java.collectables.Collectable;
import main.java.collectables.matters.AminoAcid;
import main.java.collectables.matters.NucleicAcid;
import main.java.fields.Storage;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;
import java.util.ArrayList;

public class StealAminoAcid extends Test {

    /**
     * * getName for the menu
     */

    public String getName() {
        return "Steal AminoAcid";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        ArrayList<Collectable> collectableArrayList = new ArrayList<Collectable>();
        collectableArrayList.add(new AminoAcid());
        collectableArrayList.add(new NucleicAcid());
        Virologist targetvirologist = new Virologist("bob");
        Storage storage = new Storage(collectableArrayList);

        //Collect AminoAcid
        targetvirologist.collect(storage);

        Virologist robbervirologist = new Virologist("james");

        Paralyzed paralyzedAgent = new Paralyzed();
        paralyzedAgent.applyEffect(targetvirologist);

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        robbervirologist.steal(new AminoAcid(10), targetvirologist);
    }
}
