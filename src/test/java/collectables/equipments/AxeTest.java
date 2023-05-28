package test.java.collectables.equipments;


import main.java.collectables.equipments.Axe;
import main.java.fields.Field;
import main.java.virologist.Virologist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AxeTest {

    @Mock
    Virologist murderer;
    @Mock
    Virologist victim;

    Axe axe;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        axe = new Axe();
    }

    @Test
    public void testApplyEffect() {
        axe.applyEffect(murderer);

        verify(murderer).setMurderStrategy(axe);
    }

    @Test
    public void testRemoveEffect() {
        axe.removeEffect(murderer);

        verify(murderer).removeMurderStrategy(axe);
    }

    @Test
    public void testMurder_Successful() {
        main.java.fields.Field f = new main.java.fields.Field();
        // egy mezőn állnak
        when(victim.getField()).thenReturn(f);
        when(murderer.getField()).thenReturn(f);

        // gyilkosság
        axe.murder(murderer, victim);

        // áldozat meghalt?
        verify(victim).die();

        assertEquals(0, axe.getLife());
    }

    @Test
    public void testMurder_Unsuccessful_NotNeighbors() {
        main.java.fields.Field f1 = new main.java.fields.Field();
        Field f2 = new Field();

        //nem egy mezőn állnak!
        when(murderer.getField()).thenReturn(f1);
        when(victim.getField()).thenReturn(f2);

        axe.murder(murderer, victim);

        verify(victim, never()).die();

        // life nem csökkent
        assertEquals(1, axe.getLife());
    }

    @Test
    public void testMurder_UnSuccessful_NoLife() {
        // axe már elhasználódott
        axe.setLife(0);

        Field f = new Field();
        // egy mezőn állnak
        when(victim.getField()).thenReturn(f);
        when(murderer.getField()).thenReturn(f);

        // gyilkosság
        axe.murder(murderer, victim);

        // áldozat nem halt meg
        verify(victim, never()).die();

        assertEquals(0, axe.getLife());
    }

}

