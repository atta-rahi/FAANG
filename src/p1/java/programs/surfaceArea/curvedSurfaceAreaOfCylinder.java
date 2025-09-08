package p1.java.programs.surfaceArea;

import java.util.Scanner;
public class curvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {

        //FORMULA: CSA = 2*π*radius*height


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float rad = sc.nextFloat();

        System.out.print("Enter the height : ");
        float hei = sc.nextFloat();

        float CSA = 2*3.1416f*(rad*hei);
        System.out.println("The curved surface area of cylinder is : "+CSA);


    }
}
