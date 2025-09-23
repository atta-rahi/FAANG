package p1.java.programs.array.Medium;

import java.util.Arrays;
import java.util.Scanner;
public class MaximumSubArray {
    public static void main(String[] args) {
        /*
          Question:
            Given an integer array nums, find the subarray with the largest sum, and return its sum.

            Example 1:
            Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
            Output: 6
            Explanation: The subarray [4,-1,2,1] has the largest sum 6.
       */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();


        int[] nums = new int[size];
        System.out.print("Enter the elemetns of the array : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Array : "+ Arrays.toString(nums));

        int maxSum = maxSubArray(nums);
        System.out.print("\nSub array with largest sum By brute-force (O(n²)) : "+maxSum);

        int maxSumByAlgorithm = maxSubArrayByKadane(nums);
        System.out.print("\nSub array with largest sum By Kadane Algorithm (O(n)) : "+maxSum);

    }


    static int maxSubArray(int[] nums){

        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            for (int j = i; j < nums.length; j++) {

                if (i == j){
                    sum = sum+nums[i];
                }else {
                    sum = sum+nums[j];
                }

                if (sum>maxSum){
                    maxSum = sum;
                }
            }

        }

        return maxSum;
    }


    //Kadane’s Algorithm
    static int maxSubArrayByKadane(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
