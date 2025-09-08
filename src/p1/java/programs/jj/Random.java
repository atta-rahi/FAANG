package p1.java.programs.jj;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        // Formula --> area of isosceles triangle if sides & base are given = ¼ × b√(4a2 - b2)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Side : ");
        int a = in.nextInt();
        System.out.print("Enter the Base : ");
        int b = in.nextInt();

        if (a <= 0 && b <= 0) {
            System.out.println("Sides & Base should be positive");
            return;
        }

        a = a * a; // a^2
        b = b * b; // b^2
        a = 4 * a; // 4a^2
        a = a - b; // 4a^2 - b^2

        double area = 0.25 * Math.sqrt(a) * Math.sqrt(b); // ¼ × b√(4a2 - b2)


        System.out.println("Area of Isosceles Triangle is: " + area);


    }
}


