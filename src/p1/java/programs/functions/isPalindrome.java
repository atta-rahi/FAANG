package p1.java.programs.functions;

import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {

        /*
            Number = 121 → reverse = 121 → Palindrome ✅

            123 → reverse = 321 → Not Palindrome ❌
       */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        isPal(num);
    }

    static void isPal(int n){

        System.out.print("The number that you've entered = " +n);

        int original = n;

        int rev = 0;
        while (n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n /= 10;
        }

        System.out.print("\nAfter reverse the number  = " +rev);

        if (rev == original){
            System.out.println("\nPalindrome ");
        }
        else {
            System.out.println("\n\nNot Palindrome ");
        }
    }
}
