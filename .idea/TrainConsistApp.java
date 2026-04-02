import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Train Consist Management App
 * UC2: Preserve Insertion Order of Bogies (LinkedHashSet)
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        // Step 1: Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create a LinkedHashSet to represent the train formation
        // This ensures uniqueness (Set) while maintaining insertion order (Linked)
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Attach bogies in a specific sequence
        System.out.println("Attaching bogies: Engine, Sleeper, Cargo, Guard");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Attempt to attach a duplicate bogie intentionally
        System.out.println("Attempting to re-attach: Sleeper (Duplicate)");
        trainFormation.add("Sleeper"); // This will be automatically ignored

        // Step 5: Display the final formation order
        // Notice that the order is preserved and duplicates are removed
        System.out.println("Final Train Formation: " + trainFormation);

        // Step 6: Display the total count of unique bogies
        System.out.println("Total Unique Bogies in Consist: " + trainFormation.size());
    }
}