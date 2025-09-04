package p1.java.topics.Conditionals.PracticeQuestions;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class LargestOfThreeNums {
    public static void main(String[] args) {
        /*
        Take 3 integer input from keyboard, Find Largest among them.
         */

     Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number ");
        int num3 = input.nextInt();

        System.out.println("The number's that you've entered "
                            +num1 +" "+num2+ " "+num3);

        if (num1>num2 && num1>num3){
            System.out.print("The largest number is " +num1);
        } else if (num2>num1 && num2 > num3) {
            System.out.print("The largest number is " +num2);

        } else if (num3>num1 && num3>num2) {
            System.out.print("The largest number is " +num3);
        } else {
            System.out.println("The all three number's are equal.");
        }

        //Approach 2 Assume that the max = num1,

        System.out.println("\n\nAPPROACH 2.");
        int max = num1;
        if (num2>max){
            max = num2;
        }
        if (num3>max) {
            max = num3;
        }

        System.out.println("The Larget number is "+ max);


        //Approach 3 with math
        System.out.println("\n\nAPPROACH 3 With math function.");
        int maximum = Math.max(num3, Math.max(num1,num2));
        System.out.println("The Largest number is " +maximum);
    }
}
