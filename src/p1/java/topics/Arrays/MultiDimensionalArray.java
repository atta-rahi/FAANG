package p1.java.topics.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
            2D ARRAY: -->like matrix:
                    1,2,3
                    4,5,6
                    7,8,9

             SYNTAX:
                   data_type[][] ref_var = new data_type[rows][columns];
         */

        //Declare 2D Array
        int[][] numbers; //Declare 2D array of integer's
        String[][] names; //Declare 2D array of String.


        //Initializing OR Allocating memory
        int[][] matrix = new int[3][4]; //Create a 3*4 matrix(3 rows, 4 columns).

        //OR initializing directly
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        //Accessing the elements.
        int value = arr[1][2]; // Access the element of array that is present at row 1, column 2 = 6
        System.out.println(value);

        //Assign value
        arr[0][0] = 10; //Assign value to the array at row 0, col 0, (1 replace with 10)

    }
}
