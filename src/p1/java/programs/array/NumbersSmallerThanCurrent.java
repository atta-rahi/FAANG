package p1.java.programs.array;

import java.util.Arrays;
import java.util.Scanner;
public class NumbersSmallerThanCurrent {
    public static void main(String[] args) {

        /*
          Question:
          Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
          That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
          Return the answer in an array.

            Example 1:

            Input: nums = [8,1,2,2,3]
            Output: [4,0,1,1,3]
            Explanation:
            For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
            For nums[1]=1 does not exist any smaller number than it.
            For nums[2]=2 there exist one smaller number than it (1).
            For nums[3]=2 there exist one smaller number than it (1).
            For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("\nThe elements of the array : " + Arrays.toString(nums));


        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println("\nResult : "+Arrays.toString(ans));


    }


    static int[] smallerNumbersThanCurrent(int[] nums){


        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]){
                    count++;
                }

            }
            ans[i] = count;
        }

        return ans;
    }
}
