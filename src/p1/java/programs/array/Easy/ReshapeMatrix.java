package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class ReshapeMatrix {
    public static void main(String[] args) {
        /*
           Question:
                In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one
                with a different size r x c keeping its original data.

                You are given an m x n matrix mat and two integers r and c representing the number of rows and the number
                of columns of the wanted reshaped matrix.

                The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing
                order as they were.

                If the reshape operation with given parameters is possible and legal, output the new reshaped matrix;
                Otherwise, output the original matrix

            Example:
                Input: mat = [[1,2],[3,4]], r = 1, c = 4
                Output: [[1,2,3,4]]
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Original matrix length (Row's and Columns): ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();


        int[][] matrix = new int[rows][columns];
        System.out.print("Enter the "+rows*columns+" element's of the original matrix : ");

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                matrix[row][col] = sc.nextInt();

            }
        }

        System.out.print("\nThe Original Matrix : \n");
        for(int[] nums : matrix){
            System.out.println(Arrays.toString(nums));
        }

        System.out.print("Enter the rows and columns for the new reshape matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

       int[][] ans =  reshapMatrix(matrix, r, c);

        System.out.print("\nAns : \n");
        for (int[] nums : ans){
            System.out.println(Arrays.toString(nums));
        }



    }


    static int[][] reshapMatrix(int[][] mat, int r, int c){

        int[][] reshapeMat = new int[r][c];

        int Rows = mat.length;
        int Cols = mat[0].length;
        int index = 0;

        if (Cols*Rows == r*c) {

            for (int row = 0; row < r; row++) {

                for (int col = 0; col < c; col++) {

                   reshapeMat[row][col] = mat[index/Cols][index%Cols];
                   index++;

                }
            }

        }else {
            return mat;
        }




      return reshapeMat;
    }
}
