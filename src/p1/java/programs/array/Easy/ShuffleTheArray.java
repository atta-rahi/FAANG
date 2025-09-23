package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {

        /*
         Question:
                Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
                Return the array in the form [x1,y1,x2,y2,...,xn,yn].

           Example 1:

                    Input: nums = [2,5,1,3,4,7], n = 3
                    Output: [2,3,5,4,1,7]
                    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();

        int[] nums = new int[n*2];

        System.out.print("Enter the " +2*n+ " elements of the array : ");
        for (int i = 0; i < n*2; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("\nThe elements of the array are : "+ Arrays.toString(nums));

        int[] ans = shuffle(nums,n);
        System.out.println("\nShuffled array : "+Arrays.toString(ans));


    }


    static int[] shuffle(int[] nums, int n){

        int[] ans = new int[n*2];
        for (int i = 0; i < n; i++) {

            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];

        }


        return ans;
    }

}
