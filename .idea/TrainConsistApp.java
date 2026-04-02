import java.util.*;

public class TrainConsistApp {
    // Basic Data Model
    static class Asset {
        String id;
        String type;
        double weight;
        boolean isHazmat;

        Asset(String id, String type, double weight, boolean isHazmat) {
            this.id = id;
            this.type = type;
            this.weight = weight;
            this.isHazmat = isHazmat;
        }
    }

    private static List<Asset> consist = new ArrayList<>();
    private static final double MAX_WEIGHT = 2000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("========================================");
        System.out.println("   RAIL-LINK CONSIST MANAGEMENT v1.0    ");
        System.out.println("========================================");

        while (running) {
            printDashboard();
            System.out.println("\n[1] Add Locomotive | [2] Add Boxcar | [3] Add Hazmat Tanker | [4] Clear | [0] Exit");
            System.out.print("Select Action: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addAsset("LOCO-" + (100 + consist.size()), "Locomotive", 200.0, false);
                case "2" -> addAsset("BOX-" + (500 + consist.size()), "Freight", 80.0, false);
                case "3" -> addAsset("TANK-" + (800 + consist.size()), "Tanker", 110.0, true);
                case "4" -> consist.clear();
                case "0" -> running = false;
                default -> System.out.println("!! Invalid Input !!");
            }
        }
        System.out.println("Shutting down system...");
    }

    private static void addAsset(String id, String type, double weight, boolean hazmat) {
        // Validation Logic (The "Brain" of the entry page)
        if (calculateTotalWeight() + weight > MAX_WEIGHT) {
            System.err.println("\n>>> ERROR: Weight limit exceeded! Consist rejected.");
            return;
        }

        if (consist.isEmpty() && hazmat) {
            System.err.println("\n>>> SAFETY VIOLATION: Hazmat cannot be the lead car!");
            return;
        }

        consist.add(new Asset(id, type, weight, hazmat));
    }

    private static void printDashboard() {
        double currentWeight = calculateTotalWeight();

        System.out.println("\n--- LIVE CONSIST DASHBOARD ---");
        System.out.printf("STATUS: %s | TOTAL WEIGHT: %.1f / %.1f Tons%n",
                (currentWeight > 0 ? "BUILDING" : "EMPTY"), currentWeight, MAX_WEIGHT);

        if (consist.isEmpty()) {
            System.out.println("[ Yard Track Empty ]");
        } else {
            // Visual String Representation
            for (Asset a : consist) {
                String icon = a.type.equals("Locomotive") ? "[🚂]" : "[icon]";
                if (a.isHazmat) icon = "[☢️]";
                System.out.print(icon + "-" + a.id + " ");
            }
            System.out.println();
        }
    }

    private static double calculateTotalWeight() {
        return consist.stream().mapToDouble(a -> a.weight).sum();
    }
}