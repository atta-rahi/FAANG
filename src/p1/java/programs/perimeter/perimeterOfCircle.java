package p1.java.programs.perimeter;

import java.util.Scanner;

public class perimeterOfCircle {
    public static void main(String[] args) {

        //Formula: P(circumference) = 2*pi*radius;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        float rad = input.nextFloat();

        float perOfCircle = 2*3.1416f*rad;
        System.out.println("The perimeter of circle : " +perOfCircle);
    }
}
