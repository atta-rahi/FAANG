package p1.java.programs.find;

import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        /*
        Leap Year Rules:

        Ek year Leap Year tab hota hai agar:
            Divisible by 4 ho,
            Lekin agar wo divisible by 100 bhi ho to Leap Year nahi hoga,
            Except agar wo divisible by 400 ho, tab wo Leap Year hoga.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            }
            else {
                System.out.println("Leap Year");
            }

        } else if (year % 100 == 0) {
            if (year % 400 == 0){
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Not Leap Year");
            }
        }

    }
}
