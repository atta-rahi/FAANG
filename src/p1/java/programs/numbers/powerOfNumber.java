package p1.java.programs.numbers;

import javax.crypto.spec.PSource;
import java.util.Scanner;
public class powerOfNumber {
    public static void main(String[] args){

        //Example: 2^5 = 2*2*2*2*2 = 32

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.print("Enter the power : ");
        int pow = sc.nextInt();

        //Using Loop;
        System.out.println("USING FOR LOOP : ");
        int res = 1;
        for (int i = 1; i<=num; i++){
            res = res*pow;
            System.out.print(pow + " * ");
        }
        System.out.println("\nAnswer : "+res);


        //Using Math function:
        System.out.println("\nUSING MATH FUNCTIONS: ");
        double result = Math.pow(pow,num);
        System.out.println("Answer : "+result);
    }


}
