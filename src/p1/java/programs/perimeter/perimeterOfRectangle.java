package p1.java.programs.perimeter;

import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {

        //FORMULA: P = 2(length + width)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length : ");
        float len = input.nextFloat();

        System.out.print("Enter the width : ");
        float wid = input.nextFloat();

        float perOfRectangle = 2*(len+wid);
        System.out.println("The perimeter of Rectangle is : " +perOfRectangle);
    }
}
