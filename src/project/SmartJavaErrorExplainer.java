package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SmartJavaErrorExplainer {

    private static final Map<String, String> errorMap = new HashMap<>();

    static {

        errorMap.put("nullpointerexception",
                "NullPointerException\n" +
                        "Cause: Using an object that is null.\n" +
                        "Fix: Initialize the object before use.");

        errorMap.put("arrayindexoutofboundsexception",
                "ArrayIndexOutOfBoundsException\n" +
                        "Cause: Accessing invalid array index.\n" +
                        "Fix: Check array bounds.");

        errorMap.put("arithmeticexception",
                "ArithmeticException\n" +
                        "Cause: Division by zero.\n" +
                        "Fix: Validate denominator.");

        errorMap.put("numberformatexception",
                "NumberFormatException\n" +
                        "Cause: Invalid numeric conversion.\n" +
                        "Fix: Validate input before parsing.");

        errorMap.put("classnotfoundexception",
                "ClassNotFoundException\n" +
                        "Cause: Class not found at runtime.\n" +
                        "Fix: Check classpath.");

        errorMap.put("ioexception",
                "IOException\n" +
                        "Cause: File or I/O error.\n" +
                        "Fix: Check file path and permissions.");

        errorMap.put("sqlexception",
                "SQLException\n" +
                        "Cause: Database error.\n" +
                        "Fix: Check SQL query and DB connection.");

        errorMap.put("stackoverflowerror",
                "StackOverflowError\n" +
                        "Cause: Infinite or deep recursion.\n" +
                        "Fix: Add proper base condition.");

        errorMap.put("outofmemoryerror",
                "OutOfMemoryError\n" +
                        "Cause: JVM heap exhausted.\n" +
                        "Fix: Optimize memory or increase heap size.");

        errorMap.put("classcastexception",
                "ClassCastException\n" +
                        "Cause: Invalid object casting.\n" +
                        "Fix: Use instanceof before casting.");

        errorMap.put("noclassdeffounderror",
                "NoClassDefFoundError\n" +
                        "Cause: Class missing at runtime.\n" +
                        "Fix: Check JARs and classpath.");

        errorMap.put("nosuchmethoderror",
                "NoSuchMethodError\n" +
                        "Cause: Method missing due to version mismatch.\n" +
                        "Fix: Rebuild and fix dependencies.");

        errorMap.put("concurrentmodificationexception",
                "ConcurrentModificationException\n" +
                        "Cause: Modifying collection while iterating.\n" +
                        "Fix: Use Iterator or concurrent collections.");

        errorMap.put("illegalstateexception",
                "IllegalStateException\n" +
                        "Cause: Method called at wrong time.\n" +
                        "Fix: Follow correct object lifecycle.");

        errorMap.put("unsupportedoperationexception",
                "UnsupportedOperationException\n" +
                        "Cause: Operation not supported.\n" +
                        "Fix: Use mutable collection.");

        errorMap.put("assertionerror",
                "AssertionError\n" +
                        "Cause: Assertion failed.\n" +
                        "Fix: Correct logic or disable assertions.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SMART JAVA ERROR EXPLAINER ===");
        System.out.println("Paste Java error / stack trace");
        System.out.println("Type 'exit' to quit");

        while (true) {
            System.out.print("\nEnter Error: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program terminated.");
                break;
            }

            explainError(input);
        }

        sc.close();
    }

    private static void explainError(String input) {

        input = input.toLowerCase();
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
            System.out.println(
                    "Error not recognized.\n" +
                            "Tip: Paste full stack trace including exception name."
            );
        }
    }
}
