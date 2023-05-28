package collectables.equipments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

public class GlovesTest {

    @Mock
    private main.java.agents.Agent agentMock;
    @Mock
    private main.java.virologist.Virologist virologist;
    @Mock
    private main.java.virologist.Virologist attacker;

    main.java.collectables.equipments.Gloves gloves;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        gloves = new main.java.collectables.equipments.Gloves();
    }


    @Test
    public void testDefenseAttacksBack() {
        int initialLife = gloves.getLife();

        gloves.defense(agentMock, virologist, attacker);

        // defender attacks back with the agent
        verify(virologist).useAgent(agentMock, attacker);

        int expectedLife = initialLife - 1;
        assertEquals(expectedLife, gloves.getLife());
    }

    @Test
    public void testDefenseAgainstCursedLab() {
        int initialLife = gloves.getLife();

        gloves.defense(agentMock, virologist, null);

        // life of the gloves is decreased
        int expectedLife = initialLife - 1;
        assertEquals(expectedLife, gloves.getLife());
    }

    @Test
    public void testDefense_LifeReachesZero_DiscardGloves() {
        gloves.setLife(1);

        gloves.defense(agentMock, virologist, attacker);

        assertEquals(0, gloves.getLife());
        verify(virologist).discard(gloves);
    }

    @Test
    public void testApplyEffect() {
        gloves.applyEffect(virologist);

        // verify that defense strategy is set on virologist
        verify(virologist).setDefenseStrategy(gloves);
    }

    @Test
    public void testRemoveEffect() {
        gloves.removeEffect(virologist);

        verify(virologist).removeDefenseStrategy(gloves);
    }
}