package p1.java.programs.perimeter;

import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {

        //FORMULA: A = 3*side;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        float side = input.nextFloat();

        float perOfEquilateralTriangle = 3*side;

        System.out.println("The perimter of equilateral triangle is : "+perOfEquilateralTriangle);
    }
}
