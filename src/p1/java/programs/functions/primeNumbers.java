package p1.java.programs.functions;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {

        /*
            Write a function that returns all prime numbers between two given numbers.
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter the starting number : ");
        int end = sc.nextInt();

        for (int i = start; i<= end; i++){
            if (primeNum(i)){
                System.out.print(i +" ");
            }
        }

    }

    static boolean primeNum(int num){


        if (num<=1){
            return false;
        }
        for (int i=2; i<num; i++){
            if (num%i == 0){
                return false;
            }
        }

        return true;

    }

}
