package strategies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class DefaultDefenseTest {

    @Mock
    private main.java.agents.Agent agent;

    @Mock
    private main.java.virologist.Virologist attackedVirologist;

    @Mock
    private main.java.virologist.Virologist attackerVirologist;

    private main.java.strategies.DefaultDefense defaultDefense;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        defaultDefense = new main.java.strategies.DefaultDefense();
    }

    @Test
    public void testDefense() {
        defaultDefense.defense(agent, attackedVirologist, attackerVirologist);

        verify(agent).applyEffect(attackedVirologist);
        verify(attackedVirologist).storeAgent(agent);
    }
}
