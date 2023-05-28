package main.java.skeletonTester.Tests;

import main.java.agents.Paralyzed;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;

/**
 * Tests the round flow, when the Virologist is paralyzed.
 */
public class RoundFlowParalyzed extends Test {

    @Override
    public String getName() {
        return "Round Flow Paralyzed";
    }

    @Override
    public void runTest() {
        Tester.getInstance().turnOffLogging();
        Paralyzed paralyze = new Paralyzed();
        Virologist virologist = new Virologist("bob");
        virologist.useAgent(paralyze, virologist);
        Tester.getInstance().turnOnLogging();

        virologist.startOfTurn();
    }
}
