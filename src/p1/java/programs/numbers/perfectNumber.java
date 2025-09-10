package p1.java.programs.numbers;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        /*
        Perfect Number Kya Hota Hai?
            Koi bhi number Perfect Number tab kehlata hai jab uske saare proper divisors (excluding the number itself) ka sum us number ke barabar ho.
                Proper Divisors = wo numbers jo us number ko completely divide karte hain (except the number itself).

            Eg.
                ✅ Example 1: 6
                Divisors of 6 → 1, 2, 3 (exclude 6)
                Sum = 1 + 2 + 3 = 6
               👉 6 is a Perfect Number
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int originalNumber = num;
        int sum = 0;


        System.out.print("\nDivisor's of "+num+" are : ");
        for (int i=1; i<num; i++){
            if (num%i == 0){
                System.out.print(i+" ");
                sum = sum+i;
            }
        }

        System.out.println("\nOriginal number = "+originalNumber);
        System.out.println("SUM = "+sum);

        if (sum == originalNumber){
            System.out.println("\nThe number is Perfect.");
        }
        else{
            System.out.println("\nThe number is not perfect. ");
        }

    }
}
