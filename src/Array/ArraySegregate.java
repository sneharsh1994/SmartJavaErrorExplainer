package Array;
public class ArraySegregate {
    public static void main(String[]args){
        int[]arr={1,0,0,1,0};
        int NumberofZeros=0;
        int NumberofOnes=0;
        for(int ele:arr){//Traverse
            if(ele==0){
                NumberofZeros++;
            }
            else{
                NumberofOnes++;
            }
        }
        int index = 0;//keeps track of the position in the array where we put numbers
        for (int i = 0; i < NumberofZeros; i++) {//Fills the first part with 0
            arr[index++] = 0;
        }
        for (int i = 0; i < NumberofOnes; i++) {//Remaining part with 1
            arr[index++] = 1;
        }

        // Print segregated array
        System.out.print("Segregated Array: ");//Printing
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
