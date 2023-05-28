package main.java.skeletonTester.Tests;

import main.java.agents.Paralyzed;
import main.java.collectables.Collectable;
import main.java.collectables.gencodes.Gencode;
import main.java.collectables.matters.AminoAcid;
import main.java.collectables.matters.NucleicAcid;
import main.java.fields.Lab;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;
import java.util.ArrayList;

public class CollectGencode extends Test {

    /**
     * * getName for the menu
     */

    public String getName() {
        return "Collect Gencode";
    }

    /**
     * runTest for the start the function
     */
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        //Set the envirement for the test
        AminoAcid a = new AminoAcid(30);
        NucleicAcid n = new NucleicAcid(30);
        Paralyzed p = new Paralyzed();
        Virologist virologist = new Virologist("bob");
        Lab lab = new Lab(
            new ArrayList<Collectable>() {
                {
                    add(new Gencode(p, a, n));
                }
            }
        );

        Tester.getInstance().turnOnLogging();
        //run the function to be tested
        virologist.collect(lab);
    }
}
