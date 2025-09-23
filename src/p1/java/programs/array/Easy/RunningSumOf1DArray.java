package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        /*
            k naya array banana jisme har element apne se pehle ke sabhi elements ka sum hoga.

            Example:
                    Input:  [1, 2, 3, 4]
                    Output: [1, 3, 6, 10]


           Question:
                Given an array nums. We define a running sum of an array as
                runningSum[i] = sum(nums[0]…nums[i]).
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("\nEnter the elements of array : ");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.print("\nThe elements of the array : " + Arrays.toString(arr));

        int[] sum = runningSum(arr);
        System.out.print("\nThe running sum of the array is : "+ Arrays.toString(sum));


    }

    static int[] runningSum(int[] arr){

        int size = arr.length;
        int[] runningSum = new int[size];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum+arr[i];
            runningSum[i] = sum;
        }


        return runningSum;
    }
}
