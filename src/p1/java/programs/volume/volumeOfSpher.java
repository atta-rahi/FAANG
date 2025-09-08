package p1.java.programs.volume;

import java.util.Scanner;
public class volumeOfSpher {
    public static void main(String[] args) {

        //FORMULA: V = 4/2*pi*(radius*radius*radius)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float rad = sc.nextFloat();

        float volOfSphere = 4/3f*3.1416f*(rad*rad*rad);
        System.out.println("The volume of sphere is : " +volOfSphere);


    }
}
