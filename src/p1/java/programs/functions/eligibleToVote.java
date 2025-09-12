package p1.java.programs.functions;

import java.util.Scanner;
public class eligibleToVote {
    public static void main(String[] args) {

        /*
            A person is eligible to vote if his/her age is greater than or equal to 18.
            Define a method to find out if he/she is eligible to vote.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : " );
        int age = sc.nextInt();

        boolean eligible = eligible(age);
        System.out.println(eligible);
    }

    static boolean eligible(int age){

        if (age<18){
            return false;
        }

        return true;
    }
}
