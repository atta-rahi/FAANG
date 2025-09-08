package p1.java.programs.area;

import java.util.Scanner;
public class areaOfParallelogram {
    public static void main(String[] args) {

        //FORMULA: A = base*height;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base : ");
        float base = input.nextFloat();

        System.out.print("Enter the height : ");
        float height = input.nextFloat();

        float areaOfParallelogram = base*height;
        System.out.println("The area of parallelogram is : "+areaOfParallelogram);

    }
}
