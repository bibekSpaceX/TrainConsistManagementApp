import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC14Test {

    @Test
    void testException_ValidCapacityCreation() throws UC14.InvalidCapacityException {
        UC14.PassengerBogie b = new UC14.PassengerBogie("Sleeper", 72);

        assertEquals("Sleeper", b.type);
        assertEquals(72, b.capacity);
    }

    @Test
    void testException_NegativeCapacityThrowsException() {
        Exception e = assertThrows(UC14.InvalidCapacityException.class, () -> {
            new UC14.PassengerBogie("AC", -10);
        });

        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {
        assertThrows(UC14.InvalidCapacityException.class, () -> {
            new UC14.PassengerBogie("AC", 0);
        });
    }

    @Test
    void testException_ExceptionMessageValidation() {
        Exception e = assertThrows(UC14.InvalidCapacityException.class, () -> {
            new UC14.PassengerBogie("AC", 0);
        });

        assertTrue(e.getMessage().contains("greater than zero"));
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws UC14.InvalidCapacityException {
        UC14.PassengerBogie b = new UC14.PassengerBogie("First Class", 24);

        assertNotNull(b);
        assertEquals("First Class", b.type);
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws UC14.InvalidCapacityException {
        UC14.PassengerBogie b1 = new UC14.PassengerBogie("Sleeper", 72);
        UC14.PassengerBogie b2 = new UC14.PassengerBogie("AC Chair", 56);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}
