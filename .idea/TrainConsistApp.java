import java.util.LinkedList;

/**
 * Train Consist Management App
 * UC4: Maintain Ordered Bogie IDs (LinkedList Operations)
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create a LinkedList for the consist to model physical chaining
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Add initial bogies to the train
        System.out.println("Building initial consist: Engine, Sleeper, AC, Cargo, Guard");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 3: Insert a Pantry Car at position 2 (0-indexed)
        System.out.println("Inserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        // Step 4: Display current ordered consist
        System.out.println("Current Ordered Consist: " + trainConsist);

        // Step 5: Remove the first and last bogies
        System.out.println("Detaching first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 6: Display the final ordered train consist
        System.out.println("Final Ordered Consist: " + trainConsist);
        System.out.println("Total Bogies: " + trainConsist.size());
    }
}