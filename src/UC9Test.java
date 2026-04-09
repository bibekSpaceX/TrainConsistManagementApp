import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UC9Test {

    @Test
    void testGrouping_BogiesGroupedByType() {
        List<UC9.Bogie> list = Arrays.asList(
                new UC9.Bogie("Sleeper", 72),
                new UC9.Bogie("Sleeper", 70)
        );

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(list);

        assertEquals(1, result.size());
        assertEquals(2, result.get("Sleeper").size());
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {
        List<UC9.Bogie> list = Arrays.asList(
                new UC9.Bogie("AC Chair", 56),
                new UC9.Bogie("AC Chair", 60)
        );

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(list);

        assertEquals(2, result.get("AC Chair").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        List<UC9.Bogie> list = Arrays.asList(
                new UC9.Bogie("Sleeper", 72),
                new UC9.Bogie("AC Chair", 56)
        );

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(list);

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyList() {
        List<UC9.Bogie> list = new ArrayList<>();

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {
        List<UC9.Bogie> list = Arrays.asList(
                new UC9.Bogie("First Class", 24)
        );

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(list);

        assertEquals(1, result.size());
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {
        List<UC9.Bogie> list = Arrays.asList(
                new UC9.Bogie("Sleeper", 72),
                new UC9.Bogie("AC Chair", 56),
                new UC9.Bogie("First Class", 24)
        );

        Map<String, List<UC9.Bogie>> result = UC9.groupBogies(list);

        assertTrue(result.containsKey("Sleeper"));
        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    @Test
    void testGrouping_OriginalListUnchanged() {
        List<UC9.Bogie> list = new ArrayList<>();
        list.add(new UC9.Bogie("Sleeper", 72));

        List<UC9.Bogie> copy = new ArrayList<>(list);

        UC9.groupBogies(list);

        assertEquals(copy.size(), list.size());
    }
}