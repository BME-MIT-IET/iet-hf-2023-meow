package main.java.agents;

import main.java.strategies.MoveStrategyInterface;
import main.java.virologist.Virologist;

import java.util.logging.Logger;

public class VitusDance extends Agent implements MoveStrategyInterface {

    /**
     * Apply the VitusDance effect on a virologist, now the virologist moves random directions
     * @param virologist the virologist to apply the effect on
     */
    public void applyEffect(Virologist virologist) {
        virologist.setMoveStrategy(this);
        virologist.storeAgent(this);
    }

    /**
     * Removes the VitusDance effect, now the virologist does not move random directions
     * @param virologist the virologist to remove the effect from
     */
    @Override
    public void removeEffect(Virologist virologist) {
        virologist.setMoveStrategy(this);
    }

    /**
     * This function handles the virologist's move(move random directions or not)
     * @param virologist the virologist to move
     */
    @Override
    public void move(Virologist virologist, int nextTileIndex) {
        //get a random tile to step
        main.java.utils.RandomExtra r = new main.java.utils.RandomExtra();
        int nextstep = r.randomBetween(0, virologist.getField().getNeighbors().size() - 1);

        //step to the given tile
        virologist.getField().removeVirologist(virologist);
        virologist.getField().getNeighbors().get(nextstep).acceptVirologist(virologist);

        Logger.getLogger(this.getClass().getName()).info(virologist.getName() + " has moved to " + virologist.getField().getClass().getSimpleName());
    }
}
