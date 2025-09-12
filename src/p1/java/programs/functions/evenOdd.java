package p1.java.programs.functions;

import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        evenOrOdd(num);

    }

    static void evenOrOdd(int num){

        if (num%2 == 0){
            System.out.println("The given number is even. ");
        }
        else {
            System.out.println("The given number is odd. ");
        }
    }
}
