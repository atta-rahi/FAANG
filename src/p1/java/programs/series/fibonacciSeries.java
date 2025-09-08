package p1.java.programs.series;

import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {

        //Series like: 0 1 2 3 5 8 .....

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int lim = sc.nextInt();

        int firstDigit = 0;
        int secondDigit = 1;
        int nextDigit = 0;

        for (int i=0; i<lim; i++){

            System.out.print(firstDigit+ " ");
            nextDigit = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = nextDigit;


        }
    }
}
