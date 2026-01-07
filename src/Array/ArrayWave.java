package Array;
public class ArrayWave {
    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};//Array
        System.out.println("Original Array:");
        printArray(arr);//Method call to print original array
        convertToWave(arr);//Method call to convert the array into wave
        System.out.println("Wave Array:");
        printArray(arr);//Method call to print the converted array
    }
    public static void convertToWave(int[] arr) {//Method to convert the array into wave
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {//for loop to n less than 1 index
            int temp = arr[i];//Swaping the array
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void printArray(int[] arr) {//Method to print the array
        for (int ele : arr) {//Traverse the array
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
