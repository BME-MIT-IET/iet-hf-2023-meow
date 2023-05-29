package main.java.agents;

import main.java.collectables.Collectable;
import main.java.strategies.RoundRunStrategyInterface;
import main.java.view.PopUpView;
import main.java.virologist.Virologist;

public class Paralyzed extends Agent implements RoundRunStrategyInterface {

    /**
     * Apply the Paralyzed effect on a virologist, now the virologist cant do anything
     * @param virologist the virologist to apply the effect on
     */
    public void applyEffect(Virologist virologist) {
        virologist.setRoundRunStrategy(this);
        virologist.storeAgent(this);
    }

    /**
     * Remove the Paralyzed effect, now the virologist can do things
     * @param virologist the virologist to remove the effect from
     */
    @Override
    public void removeEffect(Virologist virologist) {
        virologist.removeRoundRunStrategy(this);
    }

    /**
     * Other virologist steal collectables from the paralyed virologist
     * @param coll the collectable to steal
     * @param targetVirologist the virologist that steals the collectable
     */
    @Override
    public Collectable handleSteal(Collectable coll, Virologist targetVirologist) {
        coll.discard(targetVirologist);
        return coll;
    }

    @Override
    public void roundRun() {
        // do nothing
        PopUpView.showError(
            "The virologist is paralyzed, you can do nothing to prevent your impending doom (at least for the time being)!",
            "Paralyzed"
        );
    }

    @Override
    public void move(Virologist virologist) {}

    @Override
    public void murder(Virologist virologist) {}

    @Override
    public void steal(Virologist virologist) {}

    @Override
    public void discard(Virologist virologist) {}

    @Override
    public void createAgent(Virologist virologist) {}

    @Override
    public void useAgent(Virologist virologist) {}

    @Override
    public void collect(Virologist virologist) {}
    /**
     * This function handles the virologist's round(can or can't do things)
     * @param virologist the virologist that is doing the round
     */

}
