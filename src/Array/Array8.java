package Array;
public class Array8 {
    static int[] getArray(){//------int[] means this method will return an array
        return new int[]{10,20,30,40};//-------Anonymous array
    }
    public static void main(String[]args){
        int arr[]=getArray();//-----Method calling
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
