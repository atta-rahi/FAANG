package p1.java.programs.numbers;

import java.util.Scanner;
public class sumOfADigitsOfNumber {
    public static void main(String[] args) {
        /*
        Example:
        Number = 1234
        Digits: 1, 2, 3, 4
        Sum = 1 + 2 + 3 + 4 = 10
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  :");
        int num = sc.nextInt();

        int sum = 0;
        while (num > 0){
            int rem = num%10;
            sum = sum+rem;
            num /=10;

        }
        System.out.println("The Sum is = " +sum);
    }
}
