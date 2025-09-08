package p1.java.programs.volume;

import java.util.Scanner;

public class volumeOfCone {
    public static void main(String[] args) {

        //FORMULA: V = pi*radius^2*height/3

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float rad = input.nextFloat();

        System.out.print("Enter the height : ");
        float height = input.nextFloat();

        float volumeOfCone = 3.1416f*rad*rad*(height/3);
        System.out.println("The area of code is :"+volumeOfCone);
    }
}
