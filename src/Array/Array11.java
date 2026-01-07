package Array;
public class Array11 {
    public static void main(String[]args){
        int[][] jaggedArray={{1,2,3},{4,5},{6,7,8,9}};//------Declaration and Initialization
        for(int i=0;i<jaggedArray.length;i++){//-------jaggedArray.length=3(rows)
            for(int j=0;j<jaggedArray[i].length;j++){//-------jaggedArray[i].length → number of elements in the ith row
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
