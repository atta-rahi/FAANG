package p1.java.programs.area;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {

        /*When is height is not giving. we will calculate height,
           FORMULA = height = h = √(a2 − b2/4)
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the equal sides : ");
        float side = input.nextFloat();
        System.out.print("Enter the base : ");
        float base = input.nextFloat();

        //Now we will calculate the height = √(side2 − base2/4)

        double height = Math.sqrt(side*side - base*base/4);

        double area = 1/2d * height*base ;
        System.out.println("The Area Of Isosceles Triangle is: "+area);



    }
}
