package java.agents;

import main.java.agents.BearDance;
import main.java.fields.Field;
import main.java.virologist.Virologist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.List;


public class BearDanceTest {

    @Test
    public void testMove() {
        Virologist virologist = Mockito.mock(Virologist.class);
        Virologist other = Mockito.mock(Virologist.class);

        Field field = Mockito.mock(Field.class);
        Field newField = Mockito.mock(Field.class);

        Mockito.when(virologist.getField()).thenReturn(field, field, field, newField);
        Mockito.when(newField.getVirologists()).thenReturn(List.of(other));
        Mockito.when(field.getNeighbors()).thenReturn(List.of(newField));
        Mockito.when(virologist.getName()).thenReturn("Attila");
        Mockito.when(other.getName()).thenReturn("Józsi");


        BearDance bearDance = new BearDance();

        // bear dance lépés: csak egy szomszéd van
        bearDance.move(virologist, 0);

        Mockito.verify(newField).acceptVirologist(virologist);
        Mockito.verify(newField).destroy();
        ArgumentCaptor<BearDance> b = ArgumentCaptor.forClass(BearDance.class);
        ArgumentCaptor<Virologist> v = ArgumentCaptor.forClass(Virologist.class);

        // a virologist ágenst használ a másik virologisten
        Mockito.verify(virologist).useAgent(b.capture(), v.capture());

        Assertions.assertEquals(BearDance.class, b.getValue().getClass());
        Assertions.assertEquals(other, v.getValue());
    }
}
