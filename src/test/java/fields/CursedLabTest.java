package test.java.fields;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.Mockito.verify;

public class CursedLabTest {

    @Test
    public void testAcceptVirologist() {
        ArrayList<main.java.collectables.Collectable> gencodes = new ArrayList<>();
        main.java.fields.CursedLab cursedLab = new main.java.fields.CursedLab(gencodes);
        main.java.virologist.Virologist virologist = Mockito.mock(main.java.virologist.Virologist.class);

        // Accept virologist
        cursedLab.acceptVirologist(virologist);

        // Verify that the virologist was attacked with the BearDance
        ArgumentCaptor<main.java.agents.BearDance> b = ArgumentCaptor.forClass(main.java.agents.BearDance.class);
        verify(virologist).attack(b.capture(), Mockito.any());
        Assertions.assertEquals(main.java.agents.BearDance.class, b.getValue().getClass());
    }
}
