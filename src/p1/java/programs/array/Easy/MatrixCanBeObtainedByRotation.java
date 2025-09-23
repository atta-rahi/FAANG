package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixCanBeObtainedByRotation {
    public static void main(String[] args) {

        /*
            Question:
                Given two n x n binary matrices mat and target, return true if it is possible to make mat
                equal to target by rotating mat in 90-degree increments, or false otherwise.


            Example:
                Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
                Output: true
                Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
        */



        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the matrix : ");
        int size = sc.nextInt();

        int[][] matrix = new int[size][size];
        int[][] target = new int[size][size];

        System.out.print("Enter the "+size*size+" elements of Binary Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the "+size*size+" elements of the target matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                target[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nOriginal Matrix: \n");
        for (int[] mat : matrix) {
            System.out.println(Arrays.toString(mat));
        }

        System.out.print("\nTarget Matrix: \n");
        for (int[] mat : target) {
            System.out.println(Arrays.toString(mat));
        }


        boolean ans = findRotation(matrix, target);
        System.out.println(ans);
    }

    static boolean findRotation(int[][] mat, int[][] target){

        if (Arrays.deepEquals(mat, target)){
            return true;
        }

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(target, mat)){
                return true;
            }
            mat = rotate(mat);
        }

        return false;
    }


    static int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }

        return rotated;
    }
}
