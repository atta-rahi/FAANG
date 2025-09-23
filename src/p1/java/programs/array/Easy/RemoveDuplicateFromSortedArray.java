package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        /*
          Question:
            Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

            Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

            Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
            Return k.

            Example 1:

            Input: nums = [1,1,2]
            Output: 2, nums = [1,2,_]
            Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
            It does not matter what you leave beyond the returned k (hence they are underscores).
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.print("Enter the "+size+" elements the array : ");
        for (int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();

        }

        System.out.print("\nThe elements of the array : "+ Arrays.toString(nums));


        int ans = removeDuplicate(nums);
        System.out.print("\n"+ans);

    }


    static int removeDuplicate(int[] nums){

        int k = 1;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }

        }


    return k;
    }
}
