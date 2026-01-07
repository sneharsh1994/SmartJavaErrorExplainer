package project1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class JavaErrorExplainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("=== AI-Based Java Error Explanation System ===");
            System.out.println("Paste your Java error below:");
            System.out.println("(Type 'exit' to quit)");

        Map<String, String> errorMap = getStringStringMap();

        while (true) {
                System.out.print("\nEnter Error: ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Program terminated.");
                    break;
                }

                boolean found = false;

                for (String key : errorMap.keySet()) {
                    if (input.contains(key)) {
                        System.out.println("\n--- Explanation ---");
                        System.out.println(errorMap.get(key));
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("\n--- Explanation ---");
                    System.out.println("Unknown error. Please check syntax or documentation.");
                }
            }
            scanner.close();
    }

    private static Map<String, String> getStringStringMap() {
        Map<String, String> errorMap = new HashMap<>();

        errorMap.put("NullPointerException",
                "Meaning: You are using an object that is not initialized.\n" +
                        "Cause: Object reference is null.\n" +
                        "Solution: Initialize the object before use.");

        errorMap.put("ArrayIndexOutOfBoundsException",
                "Meaning: Invalid array index accessed.\n" +
                        "Cause: Index is outside array size.\n" +
                        "Solution: Check array bounds.");

        errorMap.put("ArithmeticException",
                "Meaning: Illegal arithmetic operation.\n" +
                        "Cause: Division by zero.\n" +
                        "Solution: Avoid dividing by zero.");

        errorMap.put("NumberFormatException",
                "Meaning: Invalid number format.\n" +
                        "Cause: Non-numeric input.\n" +
                        "Solution: Validate input.");

        errorMap.put("ClassNotFoundException",
                "Meaning: Class not found.\n" +
                        "Cause: Classpath issue.\n" +
                        "Solution: Check class name and path.");
        return errorMap;
    }
}