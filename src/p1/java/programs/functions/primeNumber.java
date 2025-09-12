package p1.java.programs.functions;

import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {

        /*
        Prime Number:
            If the number > 1 is divisible by 1 and itself = Prime Number.
            The 1 is not a prime number.
            2 is only even prime number.

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is prime or not: ");
        int n  =sc.nextInt();

        boolean bool = isPrime(n);
        System.out.println(bool);

    }

    static boolean isPrime(int num){


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
