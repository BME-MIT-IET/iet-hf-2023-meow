package collectables.matters;

import main.java.collectables.matters.NucleicAcid;
import main.java.virologist.Virologist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class NucleicAcidTest {
    private NucleicAcid nucleicAcid;
    private Virologist virologist;

    @BeforeEach
    public void setup() {
        nucleicAcid = new NucleicAcid();
        virologist = mock(Virologist.class);
        when(virologist.getInventorySize()).thenReturn(10);
        when(virologist.getAminoAcid()).thenReturn(3);
        when(virologist.getNucleicAcid()).thenReturn(5);
        when(virologist.getName()).thenReturn("Ferenc");
    }

    @Test
    public void testCollectBy_InfiniteSource_InventoryNotFull() {
        nucleicAcid.collectBy(virologist);

        // Verify that setNucleicAcid method is called on the virologist with the expected value
        verify(virologist).setNucleicAcid(12);
}

    @Test
    public void testCollectBy_InfiniteSource_InventoryFull() {
        when(virologist.getInventorySize()).thenReturn(8);

        nucleicAcid.collectBy(virologist);

        // Verify that setNucleicAcid method is not called on the virologist (inventory is full)
        verify(virologist, never()).setNucleicAcid(anyInt());
}

    @Test
    public void testCollectBy_FiniteSource() {
        nucleicAcid = new NucleicAcid(2);

        nucleicAcid.collectBy(virologist);

        // Verify that setNucleicAcid method is called on the virologist with the expected value
        verify(virologist).setNucleicAcid(7);
}

}
