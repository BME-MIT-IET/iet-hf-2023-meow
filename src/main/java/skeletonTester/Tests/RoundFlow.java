package main.java.skeletonTester.Tests;

import main.java.skeletonTester.Test;
import main.java.virologist.Virologist;

/**
 * c
 */
public class RoundFlow extends Test {

    @Override
    public String getName() {
        return "Round Flow";
    }

    @Override
    public void runTest() {
        Virologist virologist = new Virologist("bob");

        virologist.startOfTurn();
    }
}
