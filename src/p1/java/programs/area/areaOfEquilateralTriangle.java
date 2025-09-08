package p1.java.programs.area;

import java.util.Scanner;
public class areaOfEquilateralTriangle {
    public static void main(String[] args) {

        //Formula: √3 a2/ 4

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        float side =  input.nextFloat();

        double areaOfEquilateralTriangle = Math.sqrt(3)/4*(side*side);

        System.out.println("The Area Of Equilateral Triangle : "+areaOfEquilateralTriangle);
    }
}
