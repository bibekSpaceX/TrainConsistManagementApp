import java.util.*;

public class TrainApp {
    public static void main(String[] args) {

        // UC1
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + bogies.size());
        System.out.println("Current Train Consist: " + bogies);

        // ================= UC2 =================
        System.out.println("\n=== UC2: Add Passenger Bogies to Train ===");

        // Add bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println(bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println(bogies);

        // Check if exists
        boolean exists = bogies.contains("Sleeper");

        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper: " + exists);

        // Final state
        System.out.println("Final Train Passenger Consist:");
        System.out.println(bogies);

        System.out.println("UC2 operations completed successfully...");
    }
}