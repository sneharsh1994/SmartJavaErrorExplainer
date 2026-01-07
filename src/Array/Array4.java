package Array;
import java.util.*;
public class Array4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//------The program will wait for the user to type input when nextInt() is called.
        int arr[]=new int[n];//-----Creates an integer array arr with length n.
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();//------Each iteration reads the next integer from input and stores it in arr[i].
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int span=max-min;
        System.out.println(span);

    }
}
