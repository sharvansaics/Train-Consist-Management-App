import java.util.HashMap;
import java.util.Map;

/**
 * Train Consist Management App
 * UC6: Map Bogie to Capacity (HashMap)
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        // Step 1: Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create a HashMap<String, Integer> to store bogie-capacity mapping
        // String is the Key (Bogie Name), Integer is the Value (Capacity)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 3: Use the put() method to map each bogie to its capacity
        System.out.println("Registering bogie capacities...");
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);

        // Step 4: Display the capacity mapping summary
        System.out.println("Bogie-Capacity Mapping Summary:");

        // Step 5: Iterate over the map using entrySet() to display both keys and values
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        // Step 6: Program continues
        System.out.println("Total types of bogies registered: " + bogieCapacityMap.size());
    }
}