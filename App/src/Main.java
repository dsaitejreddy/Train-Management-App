import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Welcome Banner
        System.out.println("==================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("==================================\n");

        // Create empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Initialization message
        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display current consist
        System.out.println("Current Train Consist : " + trainConsist);

        // Ready message
        System.out.println("\nSystem ready for operations...");
    }
}