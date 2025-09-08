package p1.java.programs.volume;

import javax.crypto.spec.PSource;
import java.util.Scanner;
public class volumeOfCylinder {
    public static void main(String[] args) {

        //FORMULA: V = pi*radius*radius*height

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float rad = sc.nextFloat();

        System.out.print("Enter the height : ");
        float height = sc.nextFloat();

        float volOfCylinder = 3.1416f*(rad*rad)*height;
        System.out.println("The volume of Cylinder is : "+volOfCylinder);
    }
}
