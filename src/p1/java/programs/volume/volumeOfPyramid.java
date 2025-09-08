package p1.java.programs.volume;

import java.util.Scanner;
public class volumeOfPyramid{
    public static void main(String[] args) {

        //FORMULA: V = length*width*height/3

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        float len = sc.nextFloat();
        System.out.print("Enter the width : ");
        float wid = sc.nextFloat();
        System.out.print("Enter the height : ");
        float hei = sc.nextFloat();

        float volOfPyramid = (len*wid*hei)/3;
        System.out.println("The volume of pyramid is : "+volOfPyramid);

    }
}
