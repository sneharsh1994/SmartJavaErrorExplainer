package Array;
import java.util.*;
public class ArrayQues2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        //input
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        //print
            System.out.println("Sum of array:"+sum);
    }
}
