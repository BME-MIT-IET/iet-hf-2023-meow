package main.java.skeletonTester.Tests;

import main.java.fields.Field;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.skeletonTester.UserInputHandler;
import main.java.virologist.Virologist;
import java.util.List;

/**
 * Tests the default move of a virologist.
 */
public class MoveDefault extends Test {

    @Override
    public String getName() {
        return "Move Default";
    }

    @Override
    public void runTest() {
        Virologist virologist = new Virologist("bob");
        Tester.getInstance().turnOffLogging();
        virologist.setField(new Field());

        List<Field> neighbours = virologist.getField().getNeighbors();
        int fieldId = UserInputHandler.getUserInputInt("Move to which field? (1-" + neighbours.size() + ")", 1, neighbours.size());

        Tester.getInstance().turnOnLogging();

        virologist.move(fieldId - 1);
    }
}
