package p1.java.programs.functions;

import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {

        /*
        Write two methods to find min and max among 3 numbers entered by user.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number  : ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the first number  : ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter the first number  : ");
        int thirdNumber = sc.nextInt();

        int min = smallest(firstNumber,secondNumber,thirdNumber);
        System.out.print("\nThe smallest number is : " +min);

        int max = largest(firstNumber,secondNumber,thirdNumber);
        System.out.print("\nThe largest number is : " +max);
    }

    static int smallest(int num1, int num2, int num3){

        int min  = num1;
        if (num2 < min){

            min = num2;
        }
        if (num3 < min){
            min = num3;
        }
        return min;
    }

    static int largest(int num1, int num2, int num3){

        int largest = num1;

        if (num2 > largest){
            largest = num2;
        }
        if (num3 > largest){
            largest = num3;
        }

        return largest;
    }

}
