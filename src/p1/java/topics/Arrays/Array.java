package p1.java.topics.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        /*
            Arrays is a data structure that is used to store collection of data.

        */

        //Q1. Let suppose we want to store a roll number.
        int rollNo = 1234;

        //Q2. Want to store a name
        String name  = "Attaullah";

        /*Q3. Now let suppose we want to store 5 / 5000 roll number.
              to create 5 / 5000 variables we just create an array and store all roll number
              in array
         */

        int rollNo1 = 1234;
        int rollNo2 = 4321;
        int rollNo3 = 1122;
        int rollNo4 = 2211;
        int rollNo5 = 2233;





        //So now it is not possible to use 5000 variables, now we use concept of array.

        /*
            Syntax:
                   data_type[] variable_name = new data_type[size];
         */

        //Q Now let suppose we want to store 5 roll number's
        int[] rollNumbers = new int[5];

        //OR directly
        int[] rollNums = {1,2,3,4,5};


        //Declaration of array
        int[] arr; // --> arr are getting defined in stack memory (happens at compile time)

        //Initialization of arr;
        arr = new int[5]; // --> Actual memory allocation happens here, Object is being created in heap memory
                         // --> and this thing happens at runtime (Dynamic memory allocation)



        /*
            Indexes of an array -->Position of the array element's

            starts from 0 to n-1.

         */

        int[] arr1 = new int[4];
        arr1[0] = 1; //-->store 1 at index position 0.
        arr1[1] = 2; //-->store 2 at index position 1.
        arr1[2] = 3; //-->store 3 at index position 2.
        arr1[3] = 4; //-->store 4 at index position 3.

        System.out.print(arr1[0]);
        System.out.print(arr1[1]);
        System.out.print(arr1[2]);
        System.out.print(arr1[3]);



    }
}
