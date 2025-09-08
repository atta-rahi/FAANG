package p1.java.programs.numbers;

import java.util.Scanner;
public class factorsOfNumber {
    public static void main(String[] args) {
        /*
        A whole number that divides that number evenly, leaving no remainder.

            Eg: 12 are 1, 2, 3, 4, 6, and 12, because each of these numbers divides into 12 with no remainder
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Factor's of : "+num + " Using for loop");
        for(int i=1; i<=num; i++){
            if (num%i == 0){
                System.out.print(i +" ");
            }
        }

        System.out.println("\n\nFactor's of : "+num + " Using for while loop");
        int fac = 1;
        while (fac<=num){
            if (num%fac == 0){
                System.out.print(fac + " ");
            }
            fac++;
        }
    }
}
