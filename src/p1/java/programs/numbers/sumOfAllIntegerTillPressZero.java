package p1.java.programs.numbers;

import java.util.Scanner;
public class sumOfAllIntegerTillPressZero {
    public static void main(String[] args) {

        //Sum of all integer's till user enter's 0.
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while (true){
            System.out.print("Enter the number's (enter 0 to stop): ");
            int num = sc.nextInt();

            result = result+num;

            if (num == 0){
                break;
            }
        }

        System.out.println("Sum of all number's : "+result);
    }
}
