package p1.java.programs.calculate;

import java.util.Scanner;

public class calculateDiscountOfProduct {
    public static void main(String[] args) {

        /*
        Formula:
            Discount = Discount% * OrigonalPrice/100
            Final = OrigonalPrice - Discount
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price : ");
        int originalPrice = sc.nextInt();
        System.out.print("Enter the discount in : ");
        float dis = sc.nextFloat();

        float discount = (dis*originalPrice)/100;
        System.out.println("The discount is : "+discount);

        float finalPrice = originalPrice-discount;
        System.out.println("The final price is : "+finalPrice);

    }
}
