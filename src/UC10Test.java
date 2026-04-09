import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UC10Test {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<UC10.Bogie> list = Arrays.asList(
                new UC10.Bogie("A", 50),
                new UC10.Bogie("B", 70)
        );

        int result = UC10.calculateTotalCapacity(list);

        assertEquals(120, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<UC10.Bogie> list = Arrays.asList(
                new UC10.Bogie("A", 10),
                new UC10.Bogie("B", 20),
                new UC10.Bogie("C", 30)
        );

        int result = UC10.calculateTotalCapacity(list);

        assertEquals(60, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<UC10.Bogie> list = Arrays.asList(
                new UC10.Bogie("A", 99)
        );

        int result = UC10.calculateTotalCapacity(list);

        assertEquals(99, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<UC10.Bogie> list = new ArrayList<>();

        int result = UC10.calculateTotalCapacity(list);

        assertEquals(0, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<UC10.Bogie> list = Arrays.asList(
                new UC10.Bogie("A", 5),
                new UC10.Bogie("B", 15),
                new UC10.Bogie("C", 25)
        );

        int result = UC10.calculateTotalCapacity(list);

        assertEquals(45, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<UC10.Bogie> list = new ArrayList<>();
        list.add(new UC10.Bogie("A", 10));

        List<UC10.Bogie> copy = new ArrayList<>(list);

        UC10.calculateTotalCapacity(list);

        assertEquals(copy.size(), list.size());
    }
}
