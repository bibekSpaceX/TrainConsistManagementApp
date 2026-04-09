import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC12Test {

    @Test
    void testSafety_AllBogiesValid() {
        List<UC12.GoodsBogie> list = List.of(
                new UC12.GoodsBogie("Cylindrical", "Petroleum"),
                new UC12.GoodsBogie("Box", "Coal")
        );

        assertTrue(UC12.isSafe(list));
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<UC12.GoodsBogie> list = List.of(
                new UC12.GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(UC12.isSafe(list));
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<UC12.GoodsBogie> list = List.of(
                new UC12.GoodsBogie("Open", "Coal"),
                new UC12.GoodsBogie("Box", "Grain")
        );

        assertTrue(UC12.isSafe(list));
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<UC12.GoodsBogie> list = List.of(
                new UC12.GoodsBogie("Cylindrical", "Petroleum"),
                new UC12.GoodsBogie("Cylindrical", "Coal") // invalid
        );

        assertFalse(UC12.isSafe(list));
    }

    @Test
    void testSafety_EmptyBogieList() {
        List<UC12.GoodsBogie> list = new ArrayList<>();

        assertTrue(UC12.isSafe(list));
    }
}