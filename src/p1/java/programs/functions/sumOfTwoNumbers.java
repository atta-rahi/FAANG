package p1.java.programs.functions;

import java.util.Scanner;
import java.util.SortedMap;

public class sumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter the second number : ");
        double n2 = sc.nextDouble();

        double sum = sum(n1, n2);
        System.out.print("The sum of two number's is : " +sum);


    }

    static double sum(double num1, double num2){
        return num1+num2;
    }
}
