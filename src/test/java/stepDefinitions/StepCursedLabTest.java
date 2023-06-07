package stepDefinitions;


import io.cucumber.java.en.*;
import main.java.collectables.Collectable;
import main.java.fields.CursedLab;
import main.java.virologist.Virologist;
import main.java.collectables.gencodes.Gencode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepCursedLabTest {

    private CursedLab cursedLab;
    private ArrayList<Gencode> collectedGencodes;

    @Given("^a cursed lab with the following gencodes:$")
    public void createCursedLab(ArrayList<Collectable> gencodes) {
        ArrayList<Collectable> list = new ArrayList<>(gencodes);
        cursedLab = new CursedLab(list);
    }

    @When("^the virologist collects gencodes from the lab$")
    public void collectGencodes() {
        Virologist virologist = new Virologist("Jozsi");
        cursedLab.acceptVirologist(virologist);
        collectedGencodes = virologist.getGencodes();
    }

    @Then("^the virologist should learn the gencodes$")
    public void virologistLearnedGencodes() {
        for (Collectable gencode : cursedLab.getCollectable()) {
            assertTrue(collectedGencodes.contains(gencode));
        }
    }
}

