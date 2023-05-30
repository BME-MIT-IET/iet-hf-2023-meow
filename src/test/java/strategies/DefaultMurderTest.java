package strategies;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class DefaultMurderTest {

    @Test
    public void testMurder() {
        main.java.virologist.Virologist murderer = mock(main.java.virologist.Virologist.class);
        main.java.virologist.Virologist victim = mock(main.java.virologist.Virologist.class);

        when(murderer.getName()).thenReturn("Attila");
        when(victim.getName()).thenReturn("Kecske");

        main.java.fields.Field f = new main.java.fields.Field();
        // egy mezőn állnak
        when(victim.getField()).thenReturn(f);
        when(murderer.getField()).thenReturn(f);

        main.java.strategies.DefaultMurder strategy = new main.java.strategies.DefaultMurder();

        // Perform the murder
        strategy.murder(murderer, victim);

        // az áldozat nem halt meg
        verify(victim, never()).die();
    }
}