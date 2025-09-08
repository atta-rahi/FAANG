package p1.java.programs.volume;

import java.util.Scanner;
public class volumeOfPrism {
    public static void main(String[] args) {

        //FORMULA: V = base * height

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        float base = sc.nextFloat();

        System.out.print("Enter the height : ");
        float height = sc.nextFloat();

        float volOfPrism = base*height;
        System.out.println("The volume of prism is : "+volOfPrism);


    }
}
