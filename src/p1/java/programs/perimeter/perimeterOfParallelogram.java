package p1.java.programs.perimeter;

import java.util.Scanner;
public class perimeterOfParallelogram {
    public static void main(String[] args) {

        //FORMULA: P = 2(base+side)

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base : ");
        float base = input.nextFloat();

        System.out.print("Enter the side : ");
        float side = input.nextFloat();

        float perOfParallelogram = 2*(base+side);
        System.out.println("The perimeter of parallelogram is :" +perOfParallelogram);
    }
}
