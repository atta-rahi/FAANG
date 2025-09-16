package p1.java.programs.jj;

import java.util.Arrays;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        /*
            Question:
            Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
            Return the array in the form [x1,y1,x2,y2,...,xn,yn].

            Example:
                Input: nums = [2,5,1,3,4,7], n = 3
                Output: [2,3,5,4,1,7]
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];

        System.out.print("Enter " + (2 * n) + " elements: ");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] ans = shuffle(nums, n);
        System.out.println("Shuffled array: " + Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];       // x-part
            ans[2 * i + 1] = nums[i+n]; // y-part
        }
        return ans;
    }
}
