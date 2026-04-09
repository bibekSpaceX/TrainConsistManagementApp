import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC15Test {

    @Test
    void testCargo_SafeAssignment() {
        UC15.GoodsBogie b = new UC15.GoodsBogie("Cylindrical");

        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        UC15.GoodsBogie b = new UC15.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        assertNull(b.cargo); // should NOT be assigned
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        UC15.GoodsBogie b = new UC15.GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        assertNotEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {
        UC15.GoodsBogie b1 = new UC15.GoodsBogie("Rectangular");
        UC15.GoodsBogie b2 = new UC15.GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // error
        b2.assignCargo("Coal");      // should still work

        assertEquals("Coal", b2.cargo);
    }

    @Test
    void testCargo_FinallyBlockExecution() {
        UC15.GoodsBogie b = new UC15.GoodsBogie("Rectangular");

        // if no crash → finally executed
        assertDoesNotThrow(() -> b.assignCargo("Petroleum"));
    }
}