package main.java.skeletonTester.Tests;

import main.java.fields.Field;
import main.java.skeletonTester.Test;
import main.java.skeletonTester.Tester;
import main.java.virologist.Virologist;
import java.util.List;

/**
 * Tests the move, when the virologist is paralyzed.
 */
public class MoveVitus extends Test {

    @Override
    public String getName() {
        return "Move Vitus";
    }

    @Override
    public void runTest() {
        Virologist virologist = new Virologist("james");
        Tester.getInstance().turnOffLogging();
        virologist.setField(new Field());

        List<Field> neighbours = virologist.getField().getNeighbors();

        Tester.getInstance().turnOnLogging();

        //Here the user input does NOT matter, because the virologist is paralyzed.
        virologist.move(-1);
    }
}
