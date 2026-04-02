import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * UC1: Initialize Train and Display Consist Summary
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        // 1. Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Train consist is initialized using ArrayList
        // This dynamic list will store our bogies as the program progresses.
        List<String> trainConsist = new ArrayList<>();

        // 3. Application status message
        System.out.println("System initialized...");

        // 4. Initial bogie count is displayed using size()
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // 5. Program continues
        System.out.println("Ready to receive bogie attachments.");
    }
}