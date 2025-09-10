package p1.java.programs.numbers;

import java.util.Scanner;

public class armStrongNumber {
    public static void main(String[] args) {
        /*
        Sum of each digit raised to the power of total number of digit = Original Number
        Example:
            Number = 153
            Digits = 3 (1, 5, 3)
            Calculation:
                        1^3 + 5^3 + 3^3 = 1+125+27 = 153 -->Yes
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        //let suppose initially it is an Arm Strong number
        int armStrongNumber = number;

        //Count Digits;
        int digits = String.valueOf(number).length();

        int sum = 0;
        while (number>0){
            int rem = number % 10;
            double armStrong = Math.pow(rem,digits);
            sum +=(int) armStrong;
            number = number/10;
        }
        if (sum == armStrongNumber){
            System.out.println(armStrongNumber+" Is an Arm Strong number");
        }
        else {
            System.out.println(armStrongNumber +" Is not an Arm Strong number");
        }




    }
}
