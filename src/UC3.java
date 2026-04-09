import java.util.*;

public class UC3 {
    public static void main(String[] args) {

        System.out.println("=== UC3: Track Unique Bogie IDs ===");

        // Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // Add IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");

        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Print result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);

        System.out.println("Note: Duplicates are automatically removed by HashSet");

        System.out.println("UC3 completed...");
    }
}
