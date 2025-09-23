package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class FindNumberWithEvenNumberOfDigits {

    public static void main(String[] args) {
        /*
            Question:
                Given an array nums of integers, return how many of them contain an even number of digits.

            Example 1:
            Input: nums = [12,345,2,6,7896]
            Output: 2
            Explanation:
            12 contains 2 digits (even number of digits).
            345 contains 3 digits (odd number of digits).
            2 contains 1 digit (odd number of digits).
            6 contains 1 digit (odd number of digits).
            7896 contains 4 digits (even number of digits).
            Therefore only 12 and 7896 contain an even number of digits.
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array  :");
        int size = sc.nextInt();


        int[] numbers = new int[size];

        System.out.print("Enter the "+size+" element's of the array : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }


        System.out.print("\nThe elements of the array : "+ Arrays.toString(numbers));


        int ans = findNumbers(numbers);
        System.out.print("\nThe array contain "+ans+" number's of even ");

    }


    static int findNumbers(int[] nums){

        int even = 0;
        for (int i = 0; i < nums.length; i++) {

            int count = 0;
            while (nums[i]>0) {
                int rem = nums[i] % 10;
                nums[i] /= 10;
                count++;
            }

            if (count%2 == 0) {
                even++;
            }
        }

        return even;
    }
}
