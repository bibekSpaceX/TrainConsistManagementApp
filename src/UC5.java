import java.util.*;

public class UC5 {
    public static void main(String[] args) {

        System.out.println("=== UC5: Preserve Insertion Order of Bogies ===");

        // LinkedHashSet (order + no duplicates)
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Try adding duplicate
        formation.add("Sleeper"); // duplicate (ignored)

        // Print result
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote: LinkedHashSet preserves order and removes duplicates automatically.");

        System.out.println("UC5 formation setup completed...");
    }
}
