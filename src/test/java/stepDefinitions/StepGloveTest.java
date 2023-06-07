package stepDefinitions;

import io.cucumber.java.en.*;
import main.java.collectables.equipments.Gloves;
import main.java.virologist.Virologist;
import main.java.agents.Agent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class StepGloveTest {
    private Gloves gloves;
    private Virologist virologist;
    private Agent agent;
    private Virologist attackerVirologist;
    private int initialLife;

    @Given("a virologist wearing gloves")
    public void createVirologistWithGloves() {
        gloves = new main.java.collectables.equipments.Gloves();
        virologist = new main.java.virologist.Virologist("Jozsi");
        initialLife = gloves.getLife();
        gloves.applyEffect(virologist);
    }

    @Given("an attacking agent")
    public void createAttackingAgent() {
        agent = mock(main.java.agents.Agent.class);
    }

    @Given("an attacker virologist")
    public void createAttackerVirologist() {
        attackerVirologist = new main.java.virologist.Virologist("Pali");
    }

    @When("the gloves defend against the attacker")
    public void glovesDefendAgainstAttacker() {
        gloves.defense(agent, virologist, attackerVirologist);
    }

    @Then("the gloves' life is decreased by 1")
    public void glovesLifeDecreased() {
        assertEquals(initialLife-1, gloves.getLife());
    }
}
