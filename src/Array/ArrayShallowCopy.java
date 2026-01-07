package Array;
public class ArrayShallowCopy {
    public static void main(String[]args){
        int[]arr={1,2,5,8};
        int[]x=arr;    //x is shallow of arr
        x[1]=7;
        System.out.println(x[1]);
    }
}
//By shallow copy we can access the original array using other variable name.
