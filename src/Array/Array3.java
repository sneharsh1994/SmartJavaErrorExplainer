package Array;
public class Array3 {
    static void min(int arr[]) { /*-----Int array parameter in static method .Static means you
    can call it without creating an object of the class */
        int min = arr[0];//----Assume array only have one element which is minimum
        for (int i = 1; i < arr.length; i++)//----Loop starts with i=1 as we have use int i=0 to initialize min
            if (min > arr[i])//-----If current element is smaller than min then update min to that value
                min = arr[i];
        System.out.println(min);
    }

    public static void main(String[] args) {
        int arr[] = {33,3,4,5};//------Declaration and initialization
        min(arr);//------Passing array to method
    }
}

