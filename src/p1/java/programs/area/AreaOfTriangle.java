package p1.java.programs.area;

import java.util.Scanner;
public class AreaOfTriangle {

    public static void main(String[] args) {

        //FORMULA: A = 1/2*base*height

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base ");
        float base = input.nextFloat();

        System.out.print("Enter the height: ");
        float height = input.nextFloat();

        float areaOfTriangle = 1/2f*base*height;
        System.out.println("The Area of triangle is "+areaOfTriangle);
    }
}
