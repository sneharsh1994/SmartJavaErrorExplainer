package Array;
public class ArrayQues3 {
    public static void main(String[]args){
        int[] arr={2,4,-1,7,-8,3,1,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of an array:"+sum);

    }
}
