package p1.java.programs.surfaceArea;

import java.nio.channels.FileLock;
import java.util.Scanner;
public class totalSurfaceAreaOfCube {

    public static void main(String[] args) {

        //FORMULA: TSA = 6*sides^2

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        float side = sc.nextFloat();

        float TSA = 6*(side*side);
        System.out.println("The total surface area of cube : "+TSA);
    }
}
