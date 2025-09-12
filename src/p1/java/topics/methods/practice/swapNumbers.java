package p1.java.topics.methods.practice;

import java.util.Scanner;
public class swapNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a : ");
        int a = sc.nextInt();
        System.out.print("Enter the b : ");
        int b = sc.nextInt();

        swap(a,b);

    }

    static void swap(int num1, int num2){

        System.out.println("Before Swap : " +
                "\n a = "+ num1 +
                "\n b = "+ num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swap : " +
                "\n a = "+ num1 +
                "\n b = "+ num2);

    }
}
