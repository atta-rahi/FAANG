package p1.java.programs.calculate;

import java.util.Scanner;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        /*
        FORMULA:
            if two points are:
                P1(x1,y1) and P2(x2,y2)
            then the distance(D) is:
                 D = √((x₂ - x₁)² + (y₂ - y₁)²)
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of point A : ");
        System.out.print("x1 : ");
        int x1 = sc.nextInt();
        System.out.print("y1 : ");
        int y1 = sc.nextInt();

        System.out.println("Enter the values of point B : ");
        System.out.print("x2 : ");
        int x2 = sc.nextInt();
        System.out.print("y2 : ");
        int y2 = sc.nextInt();

        double distance = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1)));
        System.out.println("The distance between A and B is : " +distance);
    }

}
