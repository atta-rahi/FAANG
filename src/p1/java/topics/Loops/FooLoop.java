package p1.java.topics.Loops;

import java.util.Scanner;
import java.util.SortedMap;

public class FooLoop {
    public static void main(String[] args) {
        /*
            Loops are used to iterate the part of program serval times

            The For loop is used when we exactly know How many times the loop will iterate
         */

        /*1. For Loop
            Syntax:
            for(initializing, condition, increment, decrement){
                //Body
            }
         */

        //Print number from 1-5
        for (int i = 0; i<=5; i++){
            System.out.println(i);
        }

        //Print number's from 1-n
        Scanner input = new Scanner(System.in);

        System.out.print("PLease enter the number: " );
        int n = input.nextInt();

        System.out.println("The number you entered = "+ n);
        for (int i=0; i<=n; i++){
            System.out.println(i);
        }

    }
}
