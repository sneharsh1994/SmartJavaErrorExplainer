package Array;
public class ArraySearch1 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 27, 53, 18, 62, 88, 6, 53};
        int target = 1;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Element found");
        } else {
            System.out.println("Element missing");
        }
    }
}
