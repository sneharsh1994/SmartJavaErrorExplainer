package Array;
import java.util.Arrays;
public class ArraySort1 {
    public static void main(String[]args){
        int[]arr={2,56,24,-1,-5,242};//--------------Declare and initalization
        print(arr);//--------(Method first call)
        /*Calls the print method (defined later) and passes the reference to the arr array.
        The method will iterate and print the elements in their current (unsorted) order.*/
        Arrays.sort(arr);//-----------Sort the array in ascending numberic order
        print(arr);//-------(Method second call)
        /*Prints the array again — now you’ll see the sorted order */
    }
    public static void print(int[]arr){//------This method accepts an int[], loops through it, and prints each element followed by a space.
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
