package main.java.agents;

import main.java.strategies.MoveStrategyInterface;
import main.java.utils.Random;
import main.java.virologist.Virologist;

public class BearDance extends Agent implements MoveStrategyInterface {

    /**
     * Apply the VitusDance effect on a virologist, now the virologist moves random directions
     * @param virologist the virologist to apply the effect on
     */
    public void applyEffect(Virologist virologist) {
        virologist.setMoveStrategy(this);
    }

    /**
     *Don't remove the BearDance effect
     * @param virologist the virologist to remove the effect from
     */
    @Override
    public void removeEffect(Virologist virologist) {}

    /**
     * This function handles the virologist's move(move random directions or not)
     * @param virologist the virologist to move
     */
    @Override
    public void move(Virologist virologist, int nextTileIndex) {
        //get a random tile to step
        Random r = new Random();
        int nextstep = r.randomBetween(0, virologist.getField().getNeighbors().size() - 1);

        //step to the given tile
        virologist.getField().removeVirologist(virologist);
        virologist.getField().getNeighbors().get(nextstep).acceptVirologist(virologist);
        virologist.getField().destroy();
        System.out.println("Virologist has moved to " + virologist.getField().getClass().getSimpleName());
        for (Virologist v : virologist.getField().getVirologists()) {
            if (!v.getName().equals(virologist.getName())) virologist.useAgent(new BearDance(), v);
        }
    }
}