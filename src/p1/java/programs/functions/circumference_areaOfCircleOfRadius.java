package p1.java.programs.functions;

import java.util.Scanner;

public class circumference_areaOfCircleOfRadius {
    public static void main(String[] args) {

    /*
        FORMULA'S:
            1. Circumference:
               C = 2πr (Circumference = 2 * pi * radius)
            2. Area Of Circle Of Radius:
               A=πr^2 (Area = pi * radius^2)
     */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float radius = sc.nextFloat();

        float cir = circumference(radius);
        System.out.print("\nThe circumference of Circle is : "+cir);

        double area = areaOfCircle(radius);
        System.out.print("\nThe Area of Circle is  : "+area);

    }

    static float circumference(float radius){
        return 2*3.1416f*radius;
    }


    static double areaOfCircle(double radius){
        return 3.1416d*Math.pow(radius,2);
    }

}
