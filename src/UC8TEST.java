import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UC8Test {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<UC8.Bogie> list = Arrays.asList(
                new UC8.Bogie("Sleeper", 72),
                new UC8.Bogie("AC Chair", 56),
                new UC8.Bogie("General", 90)
        );

        List<UC8.Bogie> result = UC8.filterBogies(list);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<UC8.Bogie> list = Arrays.asList(
                new UC8.Bogie("Test", 60)
        );

        List<UC8.Bogie> result = UC8.filterBogies(list);

        assertEquals(0, result.size());
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<UC8.Bogie> list = Arrays.asList(
                new UC8.Bogie("Low", 30)
        );

        List<UC8.Bogie> result = UC8.filterBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_MultipleMatchingBogies() {
        List<UC8.Bogie> list = Arrays.asList(
                new UC8.Bogie("A", 80),
                new UC8.Bogie("B", 70),
                new UC8.Bogie("C", 90)
        );

        List<UC8.Bogie> result = UC8.filterBogies(list);

        assertEquals(3, result.size());
    }

    @Test
    void testFilter_NoMatchingBogies() {
        List<UC8.Bogie> list = Arrays.asList(
                new UC8.Bogie("A", 10),
                new UC8.Bogie("B", 20)
        );

        List<UC8.Bogie> result = UC8.filterBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_EmptyList() {
        List<UC8.Bogie> list = new ArrayList<>();

        List<UC8.Bogie> result = UC8.filterBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<UC8.Bogie> list = new ArrayList<>();
        list.add(new UC8.Bogie("Sleeper", 72));
        list.add(new UC8.Bogie("AC Chair", 56));

        List<UC8.Bogie> copy = new ArrayList<>(list);

        UC8.filterBogies(list);

        assertEquals(copy.size(), list.size());
    }
}
