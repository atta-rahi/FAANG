package p1.java.programs.numbers;

import java.util.Scanner;

public class palindromeOrNot {
    public static void main(String[] args) {
        /*
        Palindrome Number Kya Hota Hai?
        Aisa number jo ulta padhne par bhi same ho, jaise:
            121 → Palindrome
            123 → Not Palindrome
            1221 → Palindrome
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int originalNumber = num;

        int rev = 0;
        while (num>0){
            int rem = num % 10;
            rev = rev*10+rem;
            num /=10;
        }

        if (rev == originalNumber){
            System.out.println("The "+ originalNumber + " is palindrome.");
        }
        else {
            System.out.println("The "+ originalNumber + " is not palindrome");
        }


    }

}
