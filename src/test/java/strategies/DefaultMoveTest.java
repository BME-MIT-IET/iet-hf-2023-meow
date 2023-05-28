package strategies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class DefaultMoveTest {

    @Mock
    private main.java.virologist.Virologist virologist;

    @Mock
    private main.java.fields.Field nextField;

    private main.java.strategies.DefaultMove defaultMove;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        defaultMove = new main.java.strategies.DefaultMove();
    }

    @Test
    public void testMove() {
        main.java.fields.Field previousField = mock(main.java.fields.Field.class);
        when(virologist.getField()).thenReturn(previousField);
        when(previousField.getNeighbors()).thenReturn(Collections.singletonList(nextField));

        defaultMove.move(virologist, 0);

        verify(previousField).removeVirologist(virologist);
        verify(nextField).acceptVirologist(virologist);
        verify(virologist).getName();
    }
}