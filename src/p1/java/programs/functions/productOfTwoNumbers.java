package p1.java.programs.functions;

import java.util.Scanner;
public class productOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the first number : ");
        float num2 = sc.nextFloat();

        float prod = product(num1,num2);
        System.out.println("The product is : "+prod);

    }

    static float product(float num1, float num2){
        return num1*num2;
    }
}
