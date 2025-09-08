package p1.java.programs.area;

import java.util.Scanner;
public class areaOfRhombus {
    public static void main(String[] args) {

        //FORMULA: A = (diagonal1 * diagonal2)/2

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the diagonal 1 : ");
        float d1 = input.nextFloat();

        System.out.print("Enter the diagonal 2 : ");
        float d2 = input.nextFloat();

        float areaOfRhombus = (d1*d2)/2;
        System.out.println("The area of Rhombus is : "+areaOfRhombus);
    }
}
