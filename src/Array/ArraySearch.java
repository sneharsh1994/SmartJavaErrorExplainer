package Array;
public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {5, 23, 6, 34, 78, 56, 21, 52, 67, 54, 57};
        int search = -1;
        int find = 52;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                search = i;
                //System.out.print("Element is found in " + search);
            }
        }
        if (search != -1) {//----if the element is  found search is not equal to -1
            System.out.println("Element is found in index " + search);
        } else {
            System.out.println("Element not found");
        }
    }
}
