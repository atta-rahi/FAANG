package p1.java.topics.Loops.PracticeQuestions;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        /*
            A number i input from the keyboard and show the output as reverse of that number.

            Ex. input= 12345
                output= 54321
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number ");
        int num = input.nextInt();

        int result = 0;
        while (num>0){
            int rem = num % 10;
            num /=10;
            result = result*10+rem;
        }

        System.out.println(result);
    }
}
