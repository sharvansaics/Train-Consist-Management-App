import java.util.HashSet;
import java.util.Set;

/**
 * Train Consist Management App
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create a HashSet for bogie IDs to ensure uniqueness
        // The Set interface is used for abstraction, and HashSet provides the implementation.
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add unique and duplicate bogie IDs intentionally
        System.out.println("Registering Bogie IDs: BG101, BG102, BG101 (Duplicate), BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // This duplicate will be automatically ignored
        bogieIds.add("BG103");

        // Step 3: Observe that duplicates are removed automatically
        System.out.println("Bogie IDs registered in the system: " + bogieIds);

        // Step 4: Display the final unique count
        System.out.println("Total Unique Bogies: " + bogieIds.size());
    }
}