import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First test")
    public void test1()
    {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals("",computerRepairRequest.getOwnerAddress());
        assertEquals("",computerRepairRequest.getOwnerName());
    }

    @Test
    @DisplayName("Second test")
    public void test2()
    {
        assertEquals(2,2,"Numerele ar trebui sa fie egale!");
    }
}
