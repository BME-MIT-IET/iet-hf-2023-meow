package main.java.collectables.equipments;

import main.java.agents.Agent;
import main.java.strategies.DefenseStrategyInterface;
import main.java.virologist.Virologist;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Class for the Cloak objects. With a Cloak, the attacks towards the virologost can fail, with a gicen percentage
 */
public class Cloak extends Equipment implements DefenseStrategyInterface {

    private  Random rand;

    public Cloak() {
        try{
            rand = SecureRandom.getInstanceStrong();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    /**
     * Apply and remove gloves effect on the virologist's defense strategy
     * @param virologist - the virologist, who uses the equipment
     */
    public void applyEffect(Virologist virologist) {
        virologist.setDefenseStrategy(this);
    }

    /**
     * Remove the effect of the equipment from the virologist
     * @param virologist - the virologist, who uses the equipment
     */
    public void removeEffect(Virologist virologist) {
        virologist.removeDefenseStrategy(this);
    }

    /**
     * The defense function for the defending strategy
     * @param agent - agent is used by the attacker
     * @param attacker - the virologist, who uses the agent
     * @param defender - the attacked virologist
     */
    @Override
    public void defense(Agent agent, Virologist defender, Virologist attacker) {
        double chance = rand.nextDouble();
        //decide with a random whether the defending was succesful
        if (chance > 0.843) {
            agent.applyEffect(defender);
            defender.storeAgent(agent);
            if (attacker != null) System.out.println(
                defender.getName() + " get " + agent.getClass().getSimpleName() + " from " + attacker.getName()
            ); else System.out.println("The cursedLab attacked with Beardance " + defender.getName());
        } else System.out.println("The cloak defended the virologist");
    }
}
