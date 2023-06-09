package main.java.agents;

import main.java.strategies.DefenseStrategyInterface;
import main.java.virologist.Virologist;

import java.util.logging.Logger;

public class Protection extends Agent implements DefenseStrategyInterface {

    /**
     * Apply the Protection effect on a virologist, now the virologist is protected from agents
     * @param virologist the virologist to apply the effect on
     */
    public void applyEffect(Virologist virologist) {
        virologist.setDefenseStrategy(this);
        virologist.storeAgent(this);
    }

    /**
     * Removes the Protection effect, now the virologist is not protected from agents
     * @param virologist the virologist to remove the effect from
     */
    @Override
    public void removeEffect(Virologist virologist) {
        virologist.removeDefenseStrategy(this);
    }

    /**
     * This function handles the virologist's defense(protected or not protected)
     * @param agent the virologist to handle the defense
     * @param defenderVirologist the virologist that is being attacked
     * @param attackerVirologist the virologist that is attacking
     */
    @Override
    public void defense(Agent agent, Virologist defenderVirologist, Virologist attackerVirologist) {
        Logger.getLogger(this.getClass().getName()).info("The target had protection agent applied on himself, the attack was ineffective!");
        //Nothing happens, hence this function is empty
    }
}
