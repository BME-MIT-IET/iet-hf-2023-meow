package agents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ParalyzedTest {

    main.java.virologist.Virologist virologist;
    main.java.agents.Paralyzed agent;

    @BeforeEach
    public void initVirologist() {
        virologist = new main.java.virologist.Virologist("Józsi");
        agent = new main.java.agents.Paralyzed();
        agent.applyEffect(virologist);
    }

    @Test
    public void testApplyEffect() {
        // round run strategy paralyzed kell legyen
        assertEquals(agent, virologist.getRoundRunStrategy());

        // bele került az ágensek listájába
        assertTrue(virologist.getAgentlist().contains(agent));
    }

    @Test
    public void testRemoveEffect() {
        agent.removeEffect(virologist);

        // a round run strategy már nem paralyzed
        assertNotEquals(agent, virologist.getRoundRunStrategy());
    }

    @Test
    public void testHandleSteal() {
        main.java.collectables.Collectable collectableMock = mock(main.java.collectables.Collectable.class);

        // lopás végrehajtása
        main.java.collectables.Collectable stolenCollectable = agent.handleSteal(collectableMock, virologist);

        verify(collectableMock).discard(virologist);

        assertEquals(collectableMock, stolenCollectable);

    }
}
