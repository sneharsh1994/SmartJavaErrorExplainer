package Array;
public class Array7 {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        printArray(new int[]{10,20,30,40});//That array reference is passed directly to printArray.
    }
}
