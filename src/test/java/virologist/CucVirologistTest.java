package virologist;

import io.cucumber.java.en.*;
import main.java.virologist.Virologist;
import main.java.agents.Agent;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class CucVirologistTest {

    private Virologist virologist1;
    private Virologist virologist2;

    @Given("there are two virologists named {string} and {string}")
    public void createVirologists(String name1, String name2) {
        virologist1 = new Virologist(name1);
        virologist2 = new Virologist(name2);
    }

    @When("{string} attacks {string}")
    public void attackVirologist(String attackerName, String targetName) {
        Agent agent = mock(Agent.class);
        Virologist attacker = getVirologistByName(attackerName);
        Virologist target = getVirologistByName(targetName);
        attacker.attack(agent, target);
    }

    @Then("{string} should be affected by the attack")
    public void checkAttackEffect(String targetName) {
        Virologist target = getVirologistByName(targetName);
        assertTrue(target.getAgentlist().isEmpty());
    }

    private Virologist getVirologistByName(String name) {
        if (virologist1.getName().equals(name)) {
            return virologist1;
        } else if (virologist2.getName().equals(name)) {
            return virologist2;
        }
        throw new IllegalArgumentException("No virologist found with the given name: " + name);
    }
}
