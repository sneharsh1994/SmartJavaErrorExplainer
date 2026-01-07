package project1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmartJavaErrorReader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Smart Java Error Reader ===");
        System.out.println("Paste Java error or full stack trace below");
        System.out.println("Type 'exit' to quit\n");

        // Rule-based knowledge base (extended)
        Map<String, String> errorMap = new HashMap<>();

        // ===== Runtime Exceptions =====
        errorMap.put("NullPointerException",
                "Meaning: Object reference is null.\n" +
                        "Cause: Object not initialized.\n" +
                        "Solution: Initialize the object before using it.");

        errorMap.put("ArrayIndexOutOfBoundsException",
                "Meaning: Invalid array index accessed.\n" +
                        "Cause: Index outside array size.\n" +
                        "Solution: Check array length.");

        errorMap.put("StringIndexOutOfBoundsException",
                "Meaning: Invalid string index accessed.\n" +
                        "Cause: Index exceeds string length.\n" +
                        "Solution: Check string length.");

        errorMap.put("ArithmeticException",
                "Meaning: Illegal arithmetic operation.\n" +
                        "Cause: Division by zero.\n" +
                        "Solution: Ensure denominator is not zero.");

        errorMap.put("NumberFormatException",
                "Meaning: Invalid number format.\n" +
                        "Cause: Parsing non-numeric value.\n" +
                        "Solution: Validate input before parsing.");

        errorMap.put("ClassCastException",
                "Meaning: Invalid type casting.\n" +
                        "Cause: Casting object to incompatible type.\n" +
                        "Solution: Check object type before casting.");

        errorMap.put("IllegalArgumentException",
                "Meaning: Illegal or inappropriate argument passed.\n" +
                        "Cause: Invalid method parameter.\n" +
                        "Solution: Validate arguments before calling method.");

        errorMap.put("NegativeArraySizeException",
                "Meaning: Negative array size.\n" +
                        "Cause: Array created with negative length.\n" +
                        "Solution: Ensure array size is non-negative.");

        errorMap.put("NoSuchElementException",
                "Meaning: Element does not exist.\n" +
                        "Cause: Accessing element from empty collection.\n" +
                        "Solution: Check collection before accessing.");

        // ===== Input / Scanner Errors =====
        errorMap.put("InputMismatchException",
                "Meaning: Invalid input type entered.\n" +
                        "Cause: Input does not match expected data type.\n" +
                        "Solution: Enter correct data type.");

        // ===== File & I/O Errors =====
        errorMap.put("IOException",
                "Meaning: Input/Output operation failed.\n" +
                        "Cause: File read/write or stream error.\n" +
                        "Solution: Check file path, permissions, and streams.");

        errorMap.put("FileNotFoundException",
                "Meaning: File not found.\n" +
                        "Cause: Incorrect file path or missing file.\n" +
                        "Solution: Verify file location.");

        // ===== Class & JVM Errors =====
        errorMap.put("ClassNotFoundException",
                "Meaning: Class not found.\n" +
                        "Cause: Wrong class name or classpath.\n" +
                        "Solution: Verify classpath and class name.");

        errorMap.put("StackOverflowError",
                "Meaning: Stack memory exhausted.\n" +
                        "Cause: Infinite recursion.\n" +
                        "Solution: Add proper base condition.");

        errorMap.put("OutOfMemoryError",
                "Meaning: JVM ran out of memory.\n" +
                        "Cause: Large objects or memory leak.\n" +
                        "Solution: Optimize memory usage.");

        // ===== Program Loop =====
        while (true) {

            System.out.println("\nPaste Error:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program terminated.");
                break;
            }

            boolean detected = false;
            String lowerInput = input.toLowerCase();

            for (String error : errorMap.keySet()) {
                if (lowerInput.contains(error.toLowerCase())) {

                    System.out.println("\n--- Error Analysis ---");
                    System.out.println("Detected Error: " + error);
                    System.out.println(errorMap.get(error));

                    detected = true;
                    break;
                }
            }

            if (!detected) {
                System.out.println("\n--- Error Analysis ---");
                System.out.println("Error type not recognized.");
                System.out.println("Tip: Paste full stack trace or exception name.");
            }
        }

        scanner.close();
    }
}