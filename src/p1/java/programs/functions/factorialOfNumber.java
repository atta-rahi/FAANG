package p1.java.programs.functions;

import java.util.Scanner;
public class factorialOfNumber {
    public static void main(String[] args) {

        /*
        Write a program to print the factorial of a number by defining a method named
       'Factorial'.
        Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
            E.g:
                4! = 1 * 2 * 3 * 4 = 24
                3! = 3 * 2 * 1 = 6
                2! = 2 * 1 = 2
                Also,
                1! = 1
                0! = 1
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        factorial(num);


    }

    static void factorial(int n){

        int fac = 1;
        System.out.print(n +"! = ");
        for (int i = 1; i <= n; i++){
            fac = fac*i;

            if (i < n) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }


        }

        System.out.print(" = " +fac);

    }

}
