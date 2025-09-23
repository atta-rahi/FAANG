package p1.java.programs.array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        /*
           Question:
                The array-form of an integer num is an array representing its digits in left to right order.

                For example, for num = 1321, the array form is [1,3,2,1].
                Given num, the array-form of an integer, and an integer k,
                return the array-form of the integer num + k.

            Example 1:

            Input: num = [1,2,0,0], k = 34
            Output: [1,2,3,4]
            Explanation: 1200 + 34 = 1234
        */

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] num = new int[size];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();


        System.out.print("\nThe elements of the array : "+ Arrays.toString(num));
        System.out.print("\nThe value of k : "+k);


        ArrayList<Integer> ans = addToArrayForm(num,k);
        System.out.println("\nOutput"+ans);

    }


    static ArrayList<Integer> addToArrayForm(int[] num, int k){

        ArrayList<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;

        while (i >= 0 || k > 0 || carry > 0) {
            int digitNum = 0;
            if (i >= 0) {
                digitNum = num[i];
            }

            int digitK = k % 10;
            int sum = digitNum + digitK + carry;

            result.add(sum % 10);
            carry = sum / 10;

            i--;
            k = k / 10;
        }
        Collections.reverse(result);
        return result;
    }
}
