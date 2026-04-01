import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=======================================\n");

        // Create HashSet for unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // ----- ADD IDs (including duplicates) -----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display bogie IDs
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies + "\n");

        // Note about duplicates
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}