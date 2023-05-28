package main.java.skeletonTester.Tests;

import main.java.agents.Paralyzed;
import main.java.collectables.gencodes.Gencode;
import main.java.collectables.matters.AminoAcid;
import main.java.collectables.matters.NucleicAcid;
import main.java.skeletonTester.Test;
import main.java.virologist.*;

/**
 * This class tests the creation of a new agent.
 */
public class CreateAgent extends Test {

    public String getName() {
        return "Create Agent";
    }

    public void runTest() {
        Virologist virologist = new Virologist("bob");
        Gencode genCode = new Gencode(new Paralyzed(), new AminoAcid(50), new NucleicAcid(50));
        virologist.createAgent(genCode);
    }
}
