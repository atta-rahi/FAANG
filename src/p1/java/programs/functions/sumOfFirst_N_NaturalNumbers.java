package p1.java.programs.functions;

import java.util.Scanner;
public class sumOfFirst_N_NaturalNumbers {
    public static void main(String[] args) {

        /*
            First n natural numbers = 1 + 2 + 3 + ... + n
                Input: n = 3
                Output: 6
                Explanation: 1 + 2 + 3 = 6

                Input: n = 5
                Output: 15
                Explanation:  1 + 2 + 3 + 4 + 5 = 15
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int sum = sumOfNaturalNumbers(num);
        System.out.println("The Sum is = " +sum);

    }

    static int sumOfNaturalNumbers(int n){

        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum+i;
        }

        return sum;
    }

}
