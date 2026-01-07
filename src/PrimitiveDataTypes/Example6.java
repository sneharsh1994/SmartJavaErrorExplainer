package PrimitiveDataTypes;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered an integer: " + number);
        } else {
            System.out.println("The input is NOT an integer.");
        }
        scanner.close();
    }
}
