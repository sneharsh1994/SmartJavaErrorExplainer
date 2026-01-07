package PrimitiveDataTypes;
import java.util.Scanner;
public class Example4 {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " +name+ ",have a great day");
        scanner.close();

    }
}
