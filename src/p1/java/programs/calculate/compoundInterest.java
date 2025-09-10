package p1.java.programs.calculate;

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {

        /*
        FORMULA:
                A = P*(1+r/100)^t
            where:
            P = Principle amount
            r = rate of interest
            t = Time (in years)
            A = Total amount after interest
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle amount : ");
        int principleAmount = sc.nextInt();

        System.out.print("Enter the rate of interest : ");
        int rateOfInterest = sc.nextInt();

        System.out.print("Enter the time in years : ");
        int timeInYears = sc.nextInt();

        double totalAmountAfterInterest = principleAmount * Math.pow((1+(float)rateOfInterest/100),timeInYears);

        double compoundInterest =totalAmountAfterInterest - principleAmount;

        System.out.println("Compound Interest : "+compoundInterest);
        System.out.println("Total Amount : " +totalAmountAfterInterest);

    }
}
