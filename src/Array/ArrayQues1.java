package Array;
import java.util.*;
public class ArrayQues1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements:");
        //input
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        //print
        for(int i=0;i<5;i++){
            if(arr[i]<0) {
                System.out.println(arr[i] + " ");
            }

        }
    }

}
