import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=======================================\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // ----- ADD bogies -----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // ----- INSERT at position -----
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // ----- REMOVE first and last -----
        trainConsist.remove(0); // remove first
        trainConsist.remove(trainConsist.size() - 1); // remove last

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}