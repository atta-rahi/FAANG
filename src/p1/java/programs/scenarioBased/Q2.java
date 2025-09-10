package p1.java.programs.scenarioBased;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        /*
        Write a program to print the sum of negative numbers, sum of positive even numbers
        and the sum of positive odd numbers from a list of numbers (N) entered by the user.
        The list terminates when the user enters a zero.
         */

        Scanner sc = new Scanner(System.in);
        int sumOfNegative = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;

        System.out.print("Enter the number's (enter 0 to terminate) : ");
        while (true){
            int input = sc.nextInt();

            if (input == 0){
                break;
            }

            if (input < 0){
                sumOfNegative +=input;
            } else if (input % 2 == 0 ) {
                sumOfEven += input;
            }
            else {
                sumOfOdd += input;
            }
        }

        System.out.println("Sum of Negative numbers = " +sumOfNegative);
        System.out.println("Sum of Even numbers = " +sumOfEven);
        System.out.println("Sum of Odd numbers = " +sumOfOdd);

    }
}
