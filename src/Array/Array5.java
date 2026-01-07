package Array;
import java.util.*;
public class Array5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//------The program will wait for the user to type input when nextInt() is called.
        int arr[]=new int[n];//-----Creates an integer array arr with length n.
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();//------Each iteration reads the next integer from input and stores it in arr[i].
        }
        int data=sc.nextInt();//-----Reads another integer from input, which is the number we want to search inside the array.
        int index=-1;//----Default
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
    }