package p1.java.topics.Loops.PracticeQuestions;

import java.util.Scanner;
public class FabonacciNumber {
    public static void main(String[] args) {
        /*
            a series of number's in which each number is the sum of the two preceding numbers.

            Q. Find the nth Fabonacci number.
            Given 3 input num1,num3, n. num1 is starting number num2 is next number after num1,
            n is the number to find the nth Fabonacci number.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number ");
        int num2 = input.nextInt();
        System.out.print("Enter the nth Number ");
        int n = input.nextInt();

        int count = 2;
        while(count <= n){
            int temp = num2;
            num2 = num1+num2;
            num1 = temp;

            count++;
        }

        System.out.println(num2);

    }
}
