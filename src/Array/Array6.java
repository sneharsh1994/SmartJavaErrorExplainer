package Array;
import java.util.*;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {   // start from i=0 (not 1)
                if (arr[i] >= floor) {
                    System.out.print("*\t");  // print star if column height >= current floor
                } else {
                    System.out.print("\t");   // otherwise print space
                }
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
