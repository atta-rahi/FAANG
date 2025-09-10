package p1.java.programs.numbers;

import java.util.Scanner;

public class factorialOfNumber {
    public static void main(String[] args) {

        /*Factorial of a number.
        eg. 5! = 5*4*3*2*1 = 120
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find it's factorial : ");
        int num = sc.nextInt();

        int fac = 1;

        System.out.print("Using for loop : ");
        for (int i=1; i<=num; i++){
            fac = fac*i;
            System.out.print(fac +" ");

        }

        System.out.print("\n\nUsig while loop : ");
        int fac1 = 1;
        while (num>0){
            fac1 = fac1*num;
            num--;
        }
        System.out.print(fac1);


    }
}
