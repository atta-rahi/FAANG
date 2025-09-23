package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        /*
         Question:
            You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
            Return the wealth that the richest customer has.

            A customer's wealth is the amount of money they have in all their bank accounts.
            The richest customer is the customer that has the maximum wealth.

         Example:
                Input: accounts = [[1,2,3],[3,2,1]]
                Output: 6
                Explanation:
                1st customer has wealth = 1 + 2 + 3 = 6
                2nd customer has wealth = 3 + 2 + 1 = 6
                Both customers are considered the richest with a wealth of 6 each, so return 6.
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of row: ");
        int rows = sc.nextInt();
        System.out.print("Enter the length of column : ");
        int cols = sc.nextInt();

        int[][] account = new int[rows][cols];

        System.out.print("Enter the elements of array : ");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                account[row][col] = sc.nextInt();
            }
        }

        System.out.print("\nThe elements of the array: \n");
        for(int[] money : account){
            System.out.println(Arrays.toString(money));
        }

        int rich = maximumWealth(account);
        System.out.print("The richest customer wealth is : "+rich);


    }


    static int maximumWealth(int[][] accounts){

        int[] amount  = new int[accounts.length];
        int sum = 0;
        for (int row = 0; row < accounts.length; row++) {

            for (int col = 0; col < accounts[row].length ; col++) {
                sum = sum+accounts[row][col];
            }

            amount[row] = sum;
            sum = 0;
        }

        int richest = amount[0];
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > richest){
                richest = amount[i];
            }
        }
        return richest;
    }

}
