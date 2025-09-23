package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        /*
            Question:
                Given a square matrix mat, return the sum of the matrix diagonals.
                Only include the sum of all the elements on the primary diagonal and all the elements on the
                secondary diagonal that are not part of the primary diagonal.

            Example:
                Input: mat =
                [[1,2,3],
                [4,5,6],
                [7,8,9]]
                Output: 25
                Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
                Notice that element mat[1][1] = 5 is counted only once.
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];
        System.out.print("Enter the " +size*size +" element's of the matrix : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nThe matrix is : \n");
        for(int[] elem : matrix){
            System.out.println(Arrays.toString(elem));
        }


        int ans = diagonalSum(matrix);
        System.out.print("\nSum of Primary and Secondry Diagonal of the matrix : "+ans);

    }


    static int diagonalSum(int[][] mat){

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (i == j){
                    if (i == mat.length-1-i) {
                        primaryDiagonal += mat[i][mat.length-1-i];
                    }else{
                        primaryDiagonal += mat[i][j];
                        secondaryDiagonal += mat[i][mat[i].length-1 -j];
                    }
                }



            }
        }


        return secondaryDiagonal+primaryDiagonal;

    }

}
