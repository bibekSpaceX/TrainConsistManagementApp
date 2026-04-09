import java.util.*;
import java.util.stream.Collectors;

public class UC9 {

    // Reuse Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC9: Group Bogies by Type ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // Display all
        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // 🔥 GROUPING
        Map<String, List<Bogie>> grouped = groupBogies(bogies);

        // Display grouped
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity -> " + b.capacity);
            }
        }

        System.out.println("\nUC9 grouping completed...");
    }

    // 🔥 METHOD FOR TESTING
    public static Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }
}
