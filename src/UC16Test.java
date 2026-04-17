import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC16Test {

    @Test
    void testSort_BasicSorting() {
        int[] input = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        assertArrayEquals(expected, UC16.sortCapacities(input));
    }

    @Test
    void testSort_AlreadySorted() {
        int[] input = {24, 56, 60, 70, 72};
        int[] expected = {24, 56, 60, 70, 72};

        assertArrayEquals(expected, UC16.sortCapacities(input));
    }

    @Test
    void testSort_DuplicateValues() {
        int[] input = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        assertArrayEquals(expected, UC16.sortCapacities(input));
    }

    @Test
    void testSort_SingleElement() {
        int[] input = {50};
        int[] expected = {50};

        assertArrayEquals(expected, UC16.sortCapacities(input));
    }

    @Test
    void testSort_AllEqualValues() {
        int[] input = {40, 40, 40};
        int[] expected = {40, 40, 40};

        assertArrayEquals(expected, UC16.sortCapacities(input));
    }
}