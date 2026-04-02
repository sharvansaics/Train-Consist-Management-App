import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * UC2: Add Passenger Bogies to Train (ArrayList Operations)
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Initialize an ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("Adding passenger bogies: Sleeper, AC Chair, First Class");

        // Step 3: Print the list after insertion to show current composition
        System.out.println("Current Consist: " + passengerBogies);

        // Step 4: Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Removing AC Chair...");

        // Step 5: Use contains() to check if 'Sleeper' exists
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Is 'Sleeper' still in the consist? " + exists);

        // Step 6: Print final list state
        System.out.println("Final Consist Summary: " + passengerBogies);
        System.out.println("Total Bogies: " + passengerBogies.size());
    }
}