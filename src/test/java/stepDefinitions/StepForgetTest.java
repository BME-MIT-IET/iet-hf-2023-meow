package stepDefinitions;

import io.cucumber.java.en.*;
import main.java.agents.Forget;
import main.java.collectables.matters.AminoAcid;
import main.java.collectables.matters.NucleicAcid;
import main.java.virologist.Virologist;
import main.java.agents.Agent;
import main.java.collectables.gencodes.Gencode;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class StepForgetTest {
    private Virologist virologist;

    @Given("^a virologist with agents in their collection$")
    public void createVirologistWithAgents() {
        virologist = new Virologist("Jozsi");
        virologist.addGencode(new Gencode(mock(Agent.class), new AminoAcid(), new NucleicAcid()));
        virologist.addGencode(new Gencode(mock(Agent.class), new AminoAcid(), new NucleicAcid()));
        virologist.addGencode(new Gencode(mock(Agent.class), new AminoAcid(), new NucleicAcid()));
    }

    @When("^the Forget effect is applied to the virologist$")
    public void applyForgetEffect() {
        Forget forget = new Forget();
        forget.applyEffect(virologist);
    }

    @Then("^the virologist's collection of agents should be empty$")
    public void verifyVirologistCollectionIsEmpty() {
        assertEquals(0, virologist.getGencodes().size());
    }
}

