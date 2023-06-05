package agents;

import io.cucumber.java.en.*;
import main.java.agents.Paralyzed;
import main.java.virologist.Virologist;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CucParalyzedTest {
    private main.java.virologist.Virologist virologist;
    private main.java.agents.Paralyzed paralyzed;

    @Given("^a Virologist$")
    public void givenAVirologist() {
        virologist = new main.java.virologist.Virologist("Jozsi");
    }

    @When("^the Paralyzed effect is applied$")
    public void paralyzeApplication() {
        paralyzed = new Paralyzed();
        paralyzed.applyEffect(virologist);
    }

    @Then("^the Virologist should be paralyzed$")
    public void virologistGetsParalyzed() {
        assertTrue(virologist.getRoundRunStrategy() instanceof Paralyzed);
    }

    @Given("^a Virologist with the Paralyzed effect$")
    public void givenAVirologistAlreadyParalyzed() {
        virologist = new Virologist("Jozsi");
        paralyzed = new Paralyzed();
        paralyzed.applyEffect(virologist);
    }

    @When("^the Paralyzed effect is removed$")
    public void removeParalyzeEffect() {
        paralyzed.removeEffect(virologist);
    }

    @Then("^the Virologist should no longer be paralyzed$")
    public void virologistCanMove() {
        assertNull(virologist.getRoundRunStrategy());
    }
}

