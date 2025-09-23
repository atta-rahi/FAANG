package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        /*
          Question:
             Given an array of integers nums and an integer target, return indices of the two numbers
             such that they add up to target.

             You may assume that each input would have exactly one solution,
             and you may not use the same element twice.

             You can return the answer in any order.

            Example 1:
            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.print("Enter the "+size+" element's of the array : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target elements : ");
        int k = sc.nextInt();

        System.out.print("\nThe elemetns of the arary : "+ Arrays.toString(nums) +",    Target = "+k);


        int[] ans = twoSum(nums,k);
        System.out.print("\nAnswer : "+Arrays.toString(ans));


    }


    static int[] twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (nums[i]+nums[j] == target && i!=j){
                    return new int[]{i, j};
                }

            }

        }
        return new int[] { };
    }
}
