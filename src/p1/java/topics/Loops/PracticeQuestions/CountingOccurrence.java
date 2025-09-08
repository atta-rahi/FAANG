package p1.java.topics.Loops.PracticeQuestions;

import java.util.Scanner;

import java.util.Scanner;
public class CountingOccurrence {
    public static void main(String[] args) {
        /*
            Input two numbers, find that how many times the second
            number digit is present int the first.

            Ex. firstNumber = 14458
                secondNumber = 4

                output = 2, bcz 4 is present 2 times in firstNumber
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number ");
        int num2 = input.nextInt();

        int count = 0;
        while(num1>0){
            int rem = num1 % 10;
            if (rem == num2){
                count++;
            }
            num1 = num1/10;
        }
        System.out.println(count);

    }
}
