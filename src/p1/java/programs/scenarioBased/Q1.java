package p1.java.programs.scenarioBased;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        /*
        Kunal is allowed to go out with his friends only on the even days of a given month.
         Write a program to count the number of days he can go out in the month of August.
         */

        int august = 31;

        int count = 0;
        for (int i = 1; i <= august; i++){
            if (i%2 == 0){
                count++;
            }
        }
        System.out.println("Kunal can go with his friend on : '"+count +"' no of days in August.");
    }
}
