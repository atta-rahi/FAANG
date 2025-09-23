package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class NumberOfGoodPairs {
    public static void main(String[] args) {

        /*
        Good pair tab banta hai jab do elements equal ho aur unka index i < j ho.

           Question:
                Given an array of integers nums, return the number of good pairs.
                A pair (i, j) is called good if nums[i] == nums[j] and i < j.

                Example 1:

                Input: nums = [1,2,3,1,1,3]
                Output: 4
                Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();


        int[] arr = new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nThe elements of the array : "+ Arrays.toString(arr));


        int gdPairs = numIdenticalPairs(arr);
        System.out.print("\nGood Pairs : "+gdPairs);


    }


    static int numIdenticalPairs(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i<j){
                    count++;
                }
            }

        }

        return count;
    }

}
