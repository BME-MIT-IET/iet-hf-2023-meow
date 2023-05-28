package virologist;

import main.java.virologist.Virologist;
import main.java.agents.Agent;
import main.java.fields.Field;
import main.java.collectables.Collectable;
import main.java.strategies.RoundRunStrategyInterface;
import main.java.strategies.DefenseStrategyInterface;
import main.java.strategies.MoveStrategyInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class VirologistTest {

    private main.java.virologist.Virologist virologist;

    @Mock
    private DefenseStrategyInterface defenseStrategy;
    @Mock
    private RoundRunStrategyInterface roundRunStrategy;
    @Mock
    private MoveStrategyInterface moveStrategy;
    @Mock
    private Field field;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        virologist = new Virologist("Johnny");
        virologist.setDefenseStrategy(defenseStrategy);
        virologist.setRoundRunStrategy(roundRunStrategy);
        virologist.setMoveStrategy(moveStrategy);
    }

    @Test
    void testAttack() {
        Agent agent = mock(Agent.class);
        Virologist attackerVirologist = mock(Virologist.class);

        virologist.attack(agent, attackerVirologist);

        verify(defenseStrategy).defense(agent, virologist, attackerVirologist);
    }

    @Test
    void testCollect_WhenNoCollectablesPresent() {
        when(field.getCollectable()).thenReturn(null);

        virologist.collect(field);

        assertEquals(0, virologist.getEquipments().size());
        assertEquals(0, virologist.getAminoAcid());
        assertEquals(0, virologist.getNucleicAcid());
    }

    @Test
    public void testSteal_Successful() {
        Collectable coll = mock(Collectable.class);
        Virologist targetVirologist = mock(Virologist.class);
        Collectable stolen = mock(Collectable.class);

        when(targetVirologist.handleSteal(coll)).thenReturn(stolen);

        virologist.steal(coll, targetVirologist);

        // Verify that handleSteal method is called on the targetVirologist with the given collectable
        verify(targetVirologist).handleSteal(coll);

        // Verify that collectBy method is called on the stolen collectable
        verify(stolen).collectBy(virologist);
    }

    @Test
    public void testSteal_Unsuccessful() {
        Collectable coll = mock(Collectable.class);
        Virologist targetVirologist = mock(Virologist.class);

        when(targetVirologist.handleSteal(coll)).thenReturn(null);

        virologist.steal(coll, targetVirologist);

        // Verify that handleSteal method is called on the targetVirologist with the given collectable
        verify(targetVirologist).handleSteal(coll);

        // Verify that no method is called on the stolen collectable (null case)
        verifyNoInteractions(coll);
    }

    @Test
    public void testRefreshAgents() {
        Agent agent1 = mock(Agent.class);
        Agent agent2 = mock(Agent.class);
        ArrayList<Agent> agentlist = new ArrayList<>();
        agentlist.add(agent1);
        agentlist.add(agent2);

        virologist.setAgentlist(agentlist);

        when(agent1.getTTL()).thenReturn(1);
        when(agent2.getTTL()).thenReturn(0);

        virologist.refreshAgents();

        // Verify that decreaseTTL method is called on agent1
        verify(agent1).decreaseTTL(virologist);

        // Verify that agentlist does not contain agent2 (ha ttl = 0 volt remove)
        assertFalse(virologist.getAgentlist().contains(agent2));
    }

}