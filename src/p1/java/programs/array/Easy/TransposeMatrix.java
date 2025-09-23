package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args) {
        /*
          Question:
                Given a 2D integer array matrix, return the transpose of matrix.
                The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's
                row and column indices.

            Example:
                Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
                Output: [[1,4,7],[2,5,8],[3,6,9]]
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the length of the columns: ");
        int columns = sc.nextInt();


        int[][] matrix = new int[rows][columns];

        System.out.print("Enter the "+ rows * columns +" elements of the array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nThe elements of the array is : ");
        for (int[] numbers : matrix){
            System.out.println(Arrays.toString(numbers));
        }

        System.out.print("The Transpose of the matrix is : \n");
        int[][] transpose = transpose(matrix);
        for (int[] trans : transpose){
            System.out.println(Arrays.toString(trans));
        }

    }


    static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }
}

