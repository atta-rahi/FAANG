package p1.java.programs.calculate;

import java.util.Scanner;
public class calculateCommissionPercentage {
    public static void main(String[] args) {
        /*
        FORMULA:
            If Commission Amount is known:

                Commission% = (CommissionAmount/TotalSales)*100

            If Commission % is given and you want to find Commission Amount:

                CommissionAmount = (Commission% * TotalSales)/100
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("To find the commission% press (1), " +
                        "or to find the commission amount press(2)");
        int userInput = sc.nextInt();

        if (userInput == 1){
            System.out.print("Enter the Commission Amount : ");
            float ca = sc.nextFloat();
            System.out.print("Enter the Total Sales : ");
            float ts = sc.nextFloat();

            float cp = (ca/ts)*100;
            System.out.println("The Commission% is : "+cp);
        } else if (userInput == 2) {
            System.out.print("Enter the Total Sales : ");
            float ts = sc.nextFloat();
            System.out.print("Enter the Commission% : ");
            float cp = sc.nextFloat();

            float ca = (cp*ts)/100;
            System.out.println("The Commission Amount is : "+ca);

        }

    }
}
