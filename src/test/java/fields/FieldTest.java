package fields;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

public class FieldTest {

    main.java.fields.Field field;

    @Mock
    main.java.virologist.Virologist virologist;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        field = new main.java.fields.Field();
    }

    @Test
    public void testAcceptVirologist() {
        // Accept virologist
        field.acceptVirologist(virologist);

        // Verify that the virologist was added to the field's virologists list
        assertEquals(1, field.getVirologists().size());
        assertEquals(virologist, field.getVirologists().get(0));

        // Verify that the virologist's setField method was called with the correct argument
        verify(virologist).setField(field);
    }

    @Test
    public void testRemoveVirologist() {
        // Add virologist
        field.acceptVirologist(virologist);

        // Remove virologist
        field.removeVirologist(virologist);

        // Verify that the virologist was removed from the field's virologists list
        assertEquals(0, field.getVirologists().size());
    }
}