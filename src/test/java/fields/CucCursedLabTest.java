package fields;


import io.cucumber.java.en.*;
import main.java.collectables.Collectable;
import main.java.fields.CursedLab;
import main.java.virologist.Virologist;
import main.java.collectables.gencodes.Gencode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CucCursedLabTest {

    private CursedLab cursedLab;
    private ArrayList<Gencode> collectedGenecodes;

    @Given("^a cursed lab with the following gencodes:$")
    public void createCursedLab(List<Collectable> gencodes) {
        cursedLab = new CursedLab(new ArrayList<>(gencodes));
    }

    @When("^the virologist collects gencodes from the lab$")
    public void collectGencodes() {
        Virologist virologist = new Virologist("Jozsi");
        cursedLab.acceptVirologist(virologist);
        collectedGenecodes = virologist.getGencodes();
    }

    @Then("^the virologist should learn the gencodes$")
    public void virologistLearnedGencodes() {
        for (Collectable gencode : cursedLab.getCollectable()) {
            assertTrue(collectedGenecodes.contains(gencode));
        }
    }
}

