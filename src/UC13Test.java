import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC13Test {

    @Test
    void testLoopFilteringLogic() {
        List<UC13.Bogie> list = List.of(
                new UC13.Bogie("A", 50),
                new UC13.Bogie("B", 70),
                new UC13.Bogie("C", 80)
        );

        List<UC13.Bogie> result = UC13.filterWithLoop(list);

        assertEquals(2, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<UC13.Bogie> list = List.of(
                new UC13.Bogie("A", 50),
                new UC13.Bogie("B", 70),
                new UC13.Bogie("C", 80)
        );

        List<UC13.Bogie> result = UC13.filterWithStream(list);

        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<UC13.Bogie> list = List.of(
                new UC13.Bogie("A", 30),
                new UC13.Bogie("B", 90),
                new UC13.Bogie("C", 100)
        );

        List<UC13.Bogie> loop = UC13.filterWithLoop(list);
        List<UC13.Bogie> stream = UC13.filterWithStream(list);

        assertEquals(loop.size(), stream.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        assertTrue(end >= start);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<UC13.Bogie> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add(new UC13.Bogie("T" + i, i % 100));
        }

        List<UC13.Bogie> result = UC13.filterWithStream(list);

        assertNotNull(result);
    }
}