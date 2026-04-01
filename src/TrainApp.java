import java.util.*;

public class TrainApp {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty list
        List<String> bogies = new ArrayList<>();

        // Display initial state
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + bogies.size());
        System.out.println("Current Train Consist: " + bogies);

        System.out.println("System ready for operations...");
    }
}