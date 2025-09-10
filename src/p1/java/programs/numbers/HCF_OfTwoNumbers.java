package p1.java.programs.numbers;

import java.util.Scanner;
public class HCF_OfTwoNumbers {
    public static void main(String[] args) {
        /*
        HCF(Highest Common Factor):
            Do numbers ka HCF wo sabse bada number hota hai jo dono ko completely divide kare.
            Eg:
                Numbers = 12, 18
                Factors of 12 → 1, 2, 3, 4, 6, 12
                Factors of 18 → 1, 2, 3, 6, 9, 18
                Common factors → 1, 2, 3, 6
                Largest common = 6
                So HCF = 6
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        int highest = 0;
        System.out.println("The Common Factors of " +num1+ " and " +num2 +"\n");
        for (int i = 1; i<=Math.min(num1,num2); i++){
            if (num1%i == 0 && num2%i == 0){
                System.out.print(i+ " ");

                if (i>=highest){
                    highest = i;
                }
            }


        }
        System.out.println("\nThe Highest Common Factor(HCF) of "+num1+" and "+num2+" is : "+highest);

        int lcm = (num1*num2)/highest;
        System.out.println("The least Common Factor of "+num1+" and "+num2+" is : " +lcm);

    }
}
