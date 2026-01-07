package Array;
public class ArrayQues4 {
    public static void main(String[]args){
        int[] arr={2,4,2,4,5,7};
        long product=1;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println("Product of an array:"+product);
    }
}
