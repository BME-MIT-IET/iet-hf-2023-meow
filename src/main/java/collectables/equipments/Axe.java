package main.java.collectables.equipments;

import main.java.strategies.MurderStrategyInterface;
import main.java.virologist.Virologist;

public class Axe extends Equipment implements MurderStrategyInterface {

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //life of an Axe
    private int life = 1;

    /**
     * Make teh virologist capable of murdering
     * @param virologist - he will be able to murder
     */
    public void applyEffect(Virologist virologist) {
        virologist.setMurderStrategy(this);
    }

    /**
     * Remove inventory bonus
     * @param virologist - his inventory's size must be reduced
     */
    @Override
    public void removeEffect(Virologist virologist) {
        virologist.removeMurderStrategy(this);
    }

    /**
     * With an axe a virologist can murder another virologist from the same field as he stands
     * @param murderervirologist - the virologist wants to murder
     * @param murderedvirologist - the virologist to be murdered
     */
    @Override
    public void murder(Virologist murderervirologist, Virologist murderedvirologist) {
        //check the neighborship and the axe
        if (life == 1 && murderedvirologist.getField().equals(murderervirologist.getField())) {
            murderedvirologist.die();
            System.out.println(murderervirologist.getName() + " murdered " + murderedvirologist.getName());
            life = 0;
        }
    }
}
