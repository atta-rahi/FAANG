package p1.java.programs.area;

import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {

        // FORMULA A = pi*rad^2

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Raduis: ");
        float rad = input.nextFloat();

        double Area = 3.141599*(rad*rad);

        System.out.println("The Area Of Circle= " +Area);

    }
}
