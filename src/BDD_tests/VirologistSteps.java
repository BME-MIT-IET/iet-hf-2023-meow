import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VirologistSteps {

    private Virologist virologistA;
    private Virologist virologistB;

    @Given("there are two virologists named {string} and {string}")
    public void createVirologists(String nameA, String nameB) {
        virologistA = new Virologist(nameA);
        virologistB = new Virologist(nameB);
    }

    @When("{string} attacks {string}")
    public void attackVirologist(String attackerName, String targetName) {
        Virologist attacker = getVirologistByName(attackerName);
        Virologist target = getVirologistByName(targetName);
        attacker.attack(new Agent(), target);
    }

    @Then("{string} should be affected by the attack")
    public void checkAttackEffect(String targetName) {
        Virologist target = getVirologistByName(targetName);
        assertTrue(target.isUnderAttack);
    }

    private Virologist getVirologistByName(String name) {
        if (virologistA.getName().equals(name)) {
            return virologistA;
        } else if (virologistB.getName().equals(name)) {
            return virologistB;
        }
        throw new IllegalArgumentException("No virologist found with the given name: " + name);
    }
}
