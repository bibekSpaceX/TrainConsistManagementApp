import java.util.*;
import java.util.regex.*;

public class UC11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC11: Validate Train ID & Cargo Code ===");

        // Input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Validation
        boolean trainValid = isValidTrainId(trainId);
        boolean cargoValid = isValidCargoCode(cargoCode);

        // Output
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);

        System.out.println("\nUC11 validation completed...");
    }

    // 🔥 VALIDATION METHODS (for testing)
    public static boolean isValidTrainId(String trainId) {
        return Pattern.matches("TRN-\\d{4}", trainId);
    }

    public static boolean isValidCargoCode(String cargoCode) {
        return Pattern.matches("PET-[A-Z]{2}", cargoCode);
    }
}