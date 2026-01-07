package Array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayAddingOne {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8};
        int[] arr2 = {9, 9, 9};
        System.out.println("Input: [5, 6, 7, 8]");
        System.out.println("Output: " + addOne(arr1));

        System.out.println("Input: [9, 9, 9]");
        System.out.println("Output: " + addOne(arr2));
    }
    public static ArrayList<Integer> addOne(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int carry = 1;  // because we want to add 1
        for (int i = n - 1; i >= 0; i--) {//Start from the last
            if (arr[i] + carry <= 9) {/*After adding the array element and the carry if the number is less than
            9 then print the number and return the carry as 0.*/
                ans.add(arr[i] + carry);
                carry = 0; // no more carry needed
            }
            else {/*And if after adding we get the number more than 9 then print the number as 0 and forward
              carry as 1*/
                ans.add(0); // since arr[i] + 1 = 10 → digit = 0
                carry = 1;  // carry forward
            }
        }
        if (carry == 1) {//if at the last the carry is equal to 1 then print the carry as 1
            ans.add(1);
        }
        Collections.reverse(ans);//Reverse the answer as we have start it from the last
        return ans;
    }
}
