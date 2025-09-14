package p1.java.topics.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Input_MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];


        Scanner sc = new Scanner(System.in);

        //Taking input using nested for loop:
        System.out.println("Enter the elements of 2D Array : ");
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }

        }

        //Output:

        //Using nested for loop
        System.out.println("Output using nested for loops : ");
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }

            System.out.println();
        }


        //Using For each loop:
        System.out.println("Output using for each loop : ");
        for (int[] numbers : arr){
            System.out.println(Arrays.toString(numbers));
        }

    }
}
