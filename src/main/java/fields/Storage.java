package main.java.fields;

import main.java.collectables.Collectable;

import java.util.ArrayList;

/**
 * The class, what describes a Storage facility.
 * From the storage, Virologist can collect NucleicAcid or/and AminoAcid limitless
 */
public class Storage extends Field {

    private ArrayList<Collectable> matters;

    /**
     * We can initialize a Storage with giving the list of the matter(s) what are held in there.
     * @param matters - The matters what are collectable from the storage
     */
    public Storage(ArrayList<Collectable> matters) {
        this.matters = matters;
    }

    /**
     * @return the items (matters) what a Virologist can learn from the Storage
     */
    public ArrayList<Collectable> getCollectable() {
        return matters;
    }

    @Override
    public void destroy() {
        matters.clear();
    }

    @Override
    public FIELD_TYPE getType() {
        return FIELD_TYPE.STORAGE;
    }
}
