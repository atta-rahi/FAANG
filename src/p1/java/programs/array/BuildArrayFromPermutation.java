package p1.java.programs.array;

import java.util.Arrays;
import java.util.Scanner;
public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        /*
          Array from 0 based permutation:
               0 Based Permutation:
                      A 0-based permutation is an arrangement of the distinct integers from 0 to n-1, where n is the length of the permutation.
                      For example, if n=3, a 0-based permutation could be (0, 1, 2) or (1, 0, 2).
                      The term "0-based" refers to the fact that the sequence starts with the integer 0,
                      rather than 1, which is a common convention in computer science and mathematics for indexing arrays and other data structures.                                     Key Characteristics:
                      Distinct Integers: Each number in the permutation must be unique.
                      Range: The numbers will span from 0 up to, but not including, n.
                      Length: The total number of elements in the permutation is n.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array from 0 to " + arr.length +
                "With no duplicate and should be <= " + arr.length +" : ");

        for (int i = 0; i < size; i++) {
             arr[i] = sc.nextInt();
        }

        //Printing values:
        System.out.print("\nValues : ");
        for (int number : arr) {
            System.out.print(number + " ");
        }


        int[] ans = buildArray(arr);
        System.out.print("Output : " +Arrays.toString(ans));


    }

    static int[] buildArray(int[] arr){

        int length = arr.length;
        int[] ans = new int[length];

        for (int i = 0; i < arr.length; i++) {

            ans[i] = arr[arr[i]];
        }

        return ans;
    }
}
