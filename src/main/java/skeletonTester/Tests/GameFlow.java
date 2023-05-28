package main.java.skeletonTester.Tests;

import main.java.gameControl.GameController;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.UserInputHandler;
import main.java.virologist.Virologist;

import java.util.ArrayList;

/**
 * Tests the game flow. For every virologist, the user is asked to enter the
 * if the virologist has won the game.
 * Until then the game continues, and calls each virologist's startOfTurn method.
 */
public class GameFlow extends Test {

    @Override
    public String getName() {
        return "GameFlow";
    }

    @Override
    public void runTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        GameController.getInstance().initGame(names);

        boolean isSomeoneWon = false;

        while (!isSomeoneWon) {
            for (Virologist virologist : GameController.getInstance().getAllVirologists()) {
                virologist.startOfTurn();
                if (UserInputHandler.getUserInputBoolean("Did " + virologist + " won the game?")) {
                    isSomeoneWon = true;
                    break;
                }
            }
        }
    }
}
