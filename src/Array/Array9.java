package Array;
public class Array9 {
    public static void main(String[]args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};//Creates 2D array with 3 rows and 3 columns
        for(int i=0;i<3;i++){
        for (int j=0;j<3;j++){//------For each row i, this loop runs through all columns (j = 0,1,2)
        System.out.print(arr[i][j]+" ");//----arr[i][j] accesses each element one by one.
        }
        System.out.println();
        }
    }
}
//i = 0 → prints row {1,2,3}
//→ 1 2 3
//
//i = 1 → prints row {4,5,6}
//→ 4 5 6
//
//i = 2 → prints row {7,8,9}
//→ 7 8 9
