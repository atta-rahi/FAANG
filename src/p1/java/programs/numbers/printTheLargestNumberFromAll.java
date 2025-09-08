package p1.java.programs.numbers;

import java.util.Scanner;

public class printTheLargestNumberFromAll {
    public static void main(String[] args) {

        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner sc = new Scanner(System.in);

        int largest = 0;
        System.out.println("Enter the number's (enter 0 to stop)");
        while (true){
            int num = sc.nextInt();


            if (num == 0) {
                break;
            }

            if (num>largest){
                largest = num;
            }
        }
        System.out.println("Largest number is : "+largest);

    }
}
