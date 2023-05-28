package agents;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForgetTest {

    @Test
    public void testApplyEffect() {
        main.java.virologist.Virologist virologist = new main.java.virologist.Virologist("Béla");

        main.java.agents.Forget agent = new main.java.agents.Forget();

        main.java.collectables.gencodes.Gencode gencodeMock1 = Mockito.mock(main.java.collectables.gencodes.Gencode.class);
        main.java.collectables.gencodes.Gencode gencodeMock2 = Mockito.mock(main.java.collectables.gencodes.Gencode.class);

        virologist.getGencodes().add(gencodeMock1);
        virologist.getGencodes().add(gencodeMock2);

        agent.applyEffect(virologist);

        // forget hatására a virologist kollekciója üres
        assertEquals(0, virologist.getGencodes().size());
    }
}