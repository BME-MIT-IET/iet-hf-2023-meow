package main.java.agents;

import main.java.collectables.gencodes.Gencode;
import main.java.virologist.Virologist;
import java.util.ArrayList;

public class Forget extends Agent {

    /**
     * Apply the Forget effect on a virologist, removes an agent from the virologist's collection
     * @param virologist the virologist to apply the effect on
     */
    public void applyEffect(Virologist virologist) {
        virologist.setGencodes(new ArrayList<Gencode>());
    }

    /**
     * This effect can't be removed, it is an empty function
     * @param virologist the virologist to apply the effect on
     */
    @Override
    public void removeEffect(Virologist virologist) {}
}
