package p1.java.topics.methods.practice;

import java.util.Scanner;
public class armStrong {
    public static void main(String[] args) {
        /*
            Print all the three digit armStrong number.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number. ");
        int n = sc.nextInt();
        isAmrStrong(n);
    }

    static void isAmrStrong(int n){

        int original = n;

        int digits = String.valueOf(n).length();

        double sum= 0;
        while (n>0){
            int rem = n%10;
            sum = sum+Math.pow(rem,digits);
            n /= 10;
        }

        if (sum == original){
            System.out.println("Arm Strong.");
        }
        else{
            System.out.println("Not Arm Strong");
        }


    }
}
