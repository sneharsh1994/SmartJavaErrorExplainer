package Array;
public class Array12 {
    public static void main(String[]args) {
        int[][] jaggedArray = new int[4][];//------(Declaration)Creates an array that can hold 4 row references
        jaggedArray[0] = new int[1];//---Initialization
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[4];

        int value = 1;//-----start numbering from 1
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value;//-------the element at row i, column j.
                value++;//------Increament of the value by 1
            }
        }
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();

        }
    }
}
