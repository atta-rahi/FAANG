package p1.java.topics.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class InputArray {
    public static void main(String[] args) {


        //1. Array of primitives:
        System.out.println("Array of Primitives:");
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

      //System.out.print(arr[0]);

        //It is easy to take input of small size of an index by index.


        //So what if we have an array of 1000 size, then we use loop for that
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //Print the array elements;
        System.out.println("Printing using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        //for each loop --> To Print the array
        System.out.println("\nPrinting using for each loop: ");
        for (int num : arr){  //for every element in the array
            System.out.print(num +" "); //print that elements
        }

        //Another way to print the array is to used --> Array.toString Method
        System.out.println("\nPrinting using toString Method: ");
        System.out.println(Arrays.toString(arr));





        //2. Array of Objects:
        System.out.println("\n\nArray of Objects: ");
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println("Printing the array of object with toString Method only: ");
        System.out.println(Arrays.toString(str));


        //Modify:
        str[2] = "Qasim";
        System.out.println("After Modify the array: \n"+Arrays.toString(str)) ;


    }
}
