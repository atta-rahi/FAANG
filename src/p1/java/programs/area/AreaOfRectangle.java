package p1.java.programs.area;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        //FORMULA A = length*width

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length: ");
        float len = input.nextFloat();

        System.out.print("Enter the width: ");
        float wid = input.nextFloat();

        float areaOfRec = len*wid;
        System.out.println("The are of rectangle is: " +areaOfRec);
    }

}
