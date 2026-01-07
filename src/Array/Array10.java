package Array;
import java.util.Scanner;
public class Array10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Define the dimensions of the array
            System.out.print("Enter the number of rows:");
            int rows = scanner.nextInt();  //reading number of rows from the user
            System.out.print("Enter the number of columns:");
            int columns = scanner.nextInt();  //reading number of columns from the user
            // Initialize the 2D array
            int[][] array = new int[rows][columns];
            //reading array elements from the user
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < rows; i++)    //loop for rows
            {
                for (int j = 0; j < columns; j++)   //loop for columns
                {
                    System.out.print("Enter element for position (" + i + ", " + j + "): ");
                    //reading array elements one by one
                    array[i][j] = scanner.nextInt();
                }
            }
            // Printing the 2D array
            System.out.println("The entered 2D array is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            scanner.close();
        }

}
