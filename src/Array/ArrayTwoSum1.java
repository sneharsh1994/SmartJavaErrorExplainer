package Array;
public class ArrayTwoSum1 {
    public static void main(String[]args){
        int[] arr={2,35,3,6,1};
        int target=38;
        boolean result = ArrayTwoSum(arr, target);
        System.out.println("Found pair: " + result);
    }
    public static boolean ArrayTwoSum(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
