package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class ConcatenationOfArray {
    public static void main(String[] args) {
        /*
          Concatenation of array:
                   Array concatenation is the process of combining two or more arrays into a single, larger array.
                   This operation creates a new array that contains all the elements from the original arrays,
                   typically in the order they were provided.
                   The original arrays usually remain unchanged.

          Example:
                nums = [1, 2, 3]
                Concatenation = [1, 2, 3, 1, 2, 3]


           Question:
                    Given an integer array nums of length n, you want to create an array ans of length 2n
                    where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int size  = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.print("\nThe elements of the array are : "+ Arrays.toString(arr));


        //Getting the concatenation array:
        int[] concat = getConcatenation(arr);
        System.out.print("\nConcatenation : "+Arrays.toString(concat));


    }


    static int[] getConcatenation(int[] arr){

        int size = 2*arr.length;
        int[] ans = new int[size];
        for (int i = 0; i < arr.length; i++) {

            ans[i] = arr[i];
            ans[i+arr.length] = arr[i];
        }

        return ans;
    }
}
