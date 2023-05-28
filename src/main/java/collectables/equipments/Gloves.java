package main.java.collectables.equipments;

import main.java.agents.Agent;
import main.java.strategies.DefenseStrategyInterface;
import main.java.virologist.Virologist;

/**
 * Class for the Gloves objects. With Gloves the virologist instead of suffer the agents effect, attacks back the during an attack
 */
public class Gloves extends Equipment implements DefenseStrategyInterface {

    int life = 3;

    /**
     * The defense function for the defending strategy
     * @param agent - agent is used by the attacker
     * @param defenderVirologist - the virologist, who uses the agent
     * @param attackerVirologist - the attacked virologist
     */
    @Override
    public void defense(Agent agent, Virologist defenderVirologist, Virologist attackerVirologist) {
        //if the attacker is not a cursedlab, it attacks back
        if (attackerVirologist != null) {
            System.out.println("Hence the attacked virologist wears gloves, he attacks back");
            defenderVirologist.useAgent(agent, attackerVirologist);
        } else System.out.println("The virologist is defended against a cursedlab he stepped on");
        life--;

        //if life goes down to 0 it melts down from hand
        if (life == 0) {
            defenderVirologist.discard(this);
        }
    }

    /**
     * Apply and remove gloves effect on the virologist's defense strategy
     * @param virologist - the virologist who is using the gloves
     */
    public void applyEffect(Virologist virologist) {
        virologist.setDefenseStrategy(this);
    }

    /**
     * Remove the effect of the gloves
     * @param virologist - the virologist who is using the gloves
     */
    public void removeEffect(Virologist virologist) {
        virologist.removeDefenseStrategy(this);
    }
}
