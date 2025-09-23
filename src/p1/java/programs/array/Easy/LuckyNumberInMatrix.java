package p1.java.programs.array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        /*
            Question:
                Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

                A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

                Example 1:
                Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
                Output: [15]
                Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row's : ");
        int rows = sc.nextInt();

        System.out.print("Enter the length of the column's : ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.print("Enter the "+rows*cols+" elements for the matrix : ");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = sc.nextInt();
            }
        }

        System.out.print("\nMatrix \n");
        for (int[] elements : matrix){
            System.out.println(Arrays.toString(elements));
        }


        ArrayList<Integer> luckyNumber = luckyNumbers(matrix);
        System.out.println("\nThe Lucky Number : "+luckyNumber);


    }

    static ArrayList<Integer> luckyNumbers(int[][] matrix){

        ArrayList<Integer> luckyNumber = new ArrayList<>();

        int lucky = 0;
        int min = 0;

        for (int r = 0; r < matrix.length; r++) {

            min = matrix[r][0];
            int columnIndex = 0;
            for (int c = 1; c < matrix[r].length; c++) {

                if (matrix[r][c] < min) {
                    min = matrix[r][c];
                    columnIndex = c;
                }
            }

            boolean isLucky = true;
            for (int i = 0; i < matrix.length; i++) {

                if (matrix[i][columnIndex] > min) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky){
                lucky = min;
                luckyNumber.add(lucky);
            }


        }

        return luckyNumber;
    }
}
