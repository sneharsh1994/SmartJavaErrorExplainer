package Array;
public class ArrayTwoSum2 {
    public static void main(String[] args) {
        System.out.println("Two Sum");//Heading

        int[] arr = {2, 35, 3, 6, 1};//Array
        int target = 38;
        int result = ArrayTwoSum(arr, target); //  Method
        if (result == -1) {/* If it returns 1, it means a pair was found.
                                  If it returns -1, it means no pair was found. */
            System.out.println("No pair found for target " + target);// Print the target
        }
    }
    public static int ArrayTwoSum(int[] arr, int target) { //Method is being called
        int n = arr.length; //Stores the size of the array
        for (int i = 0; i < n; i++) { //Outer loop goes through each element.
            for (int j = i + 1; j < n; j++) { //Inner loop checks every element after i (
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found at indexes: " + i + " and " + j); //Print the indexes
                    System.out.println("Values are: " + arr[i] + " + " + arr[j] + " = " + target); //Print the values
                    return 1; // success
                }
            }
        }
        return -1; // no pair found
    }
}

