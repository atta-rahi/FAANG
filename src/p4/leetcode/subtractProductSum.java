package p4.leetcode;

import java.util.Scanner;
public class subtractProductSum {

    //https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int prod = 1;
        int sum = 0;
        int result = 0;

        while (num>0){
            int rem = num%10;
            prod = prod*rem;
            sum = rem+sum;
            num = num/10;
            result = prod-sum;

        }
        System.out.println("The result : "+result);

    }
}
