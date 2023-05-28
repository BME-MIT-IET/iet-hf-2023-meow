package main.java.fields;

import main.java.collectables.Collectable;

import java.util.ArrayList;

/**
 * The class, what describes a shelter.
 * From the shelter, Virologist can collect Equipments
 */
public class Shelter extends Field {

    private ArrayList<Collectable> collectables;

    /**
     * We can initialize a shelter with giving the list of its equipments
     * @param collectables - The equipments can be collected from a shelter
     */
    public Shelter(ArrayList<Collectable> collectables) {
        this.collectables = collectables;
    }

    /**
     * @return the items (Equipments) what are collecatble from the shelter
     */
    public ArrayList<Collectable> getCollectable() {
        return collectables;
    }

    public void removeCollectable(Collectable coll) {
        collectables.remove(coll);
    }

    @Override
    public FIELD_TYPE getType() {
        return FIELD_TYPE.SHELTER;
    }
}
