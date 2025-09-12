package p1.java.topics.methods.practice;

import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {

        /*
            Prime Number's:
                A prime number is a natural number greater than 1 that has only two distinct positive divisors: 1 and itself.
                Examples of prime numbers include 2, 3, 5, 7, and 11.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        isPrime(n);
    }

    static void isPrime(int n){
        if (n<0){
            System.out.println("Not Prime.");
        }
            for (int i = 2; i<n; i++){
                if (n%i == 0){
                    System.out.println("Not Prime");
                    break;
                }
                else {
                    System.out.println("Prime");
                    break;
                }
            }


    }

}
