package p1.java.programs.perimeter;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
public class perimeterOfRhombus {
    public static void main(String[] args) {


        //FORMULA: P = 4*sides

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        float side = input.nextFloat();

        float perOfRhombus = 4*side;
        System.out.println("The perimeter of Rhombus is : "+perOfRhombus);
    }
}
