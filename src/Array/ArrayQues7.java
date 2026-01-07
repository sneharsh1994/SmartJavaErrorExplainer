package Array;
public class ArrayQues7 {
    public static void main(String [] args){
        int[] arr={10,20,30,40,50,60,70,80,90};//----Declare and initilization
        System.out.println("Original Array:");
        printArray(arr);//----Method to print original array
        for(int i=0;i<arr.length;i++){//-------Modify each element of the array using the given conditions
            if(i%2==0){//-------Condition to modify the array into new one
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
            }
        }
        System.out.println("Updated Array:");
        printArray(arr);//------Method to print modify array
    }
    public static void printArray(int[]arr){//------This is a helper method to print all elements in the array
       for(int i=0;i<arr.length;i++){//-----Using to print the array when the method is call
           System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
