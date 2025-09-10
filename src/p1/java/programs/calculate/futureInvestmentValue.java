package p1.java.programs.calculate;

import java.util.Scanner;
public class futureInvestmentValue {
    public static void main(String[] args) {
        /*
        FORMULA:
                FV = P*(1+r/n)^n*t

            Where:
                 FV = Future Value (jo paisa future me hoga)
                 P = Present Value (initial investment)
                 r = Annual interest rate (in decimal, e.g. 10% → 0.10)
                 n = Number of times interest is compounded per year
                 t = Time in years
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial investment :");
        int initialInvestment = sc.nextInt();
        System.out.print("Enter the Annual interest rate (in decimal, e.g. 10% → 0.10) :");
        float annualInterestRate = sc.nextFloat();
        System.out.print("Enter the number of times interest is compounded per year :");
        int not = sc.nextInt();
        System.out.print("Enter the Time in Year : ");
        int timeInYear = sc.nextInt();

        int power = not*timeInYear;

        double FV = initialInvestment  * Math.pow(1+annualInterestRate/not,power);
        System.out.println("The Future Investment value is : "+FV);
    }
}
