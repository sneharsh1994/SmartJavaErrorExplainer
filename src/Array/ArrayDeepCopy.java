package Array;
import java.util.Arrays;
public class ArrayDeepCopy {
    public static void main(String[]args){
        int[]arr={1,32,23,67,2};
        int[]brr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[i];
        }
        //int[]y=Arrays.copyOf(arr,arr.length);
        //y[0]=5;
        brr[1]=45;
        System.out.println(brr[1]);
        System.out.println(arr[1]);
    }
}
//By deep copy the original array will not get affected it will form a new array of same data and then get access
