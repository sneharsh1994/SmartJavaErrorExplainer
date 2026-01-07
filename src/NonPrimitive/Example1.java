package NonPrimitive;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] Args) {
        //String a="SNEHA";
        //System.out.println(a);
        //String lowercase=a.toLowerCase();
        //System.out.println(lowercase);
        // }
//}
     // User Input//
        Scanner sc = new Scanner(System.in);//
        System.out.println("Enter a String:");
        String input = sc.nextLine();
        String lowercaseString = input.toLowerCase();
        System.out.println("Lowercase string:" + lowercaseString);
        sc.close();
    }
}
