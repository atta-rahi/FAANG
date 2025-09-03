package p1.java.topics.inputoutput;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int rollNo = input.nextInt(); //Take input as integer
        System.out.println("Your roll no is = " +rollNo);

        float floating = input.nextFloat(); //Take input as float
        System.out.println("Floating = "+floating);

        System.out.print("Please Enter the Byte: ");
        byte b = input.nextByte(); //Take input as byte of integer
        System.out.println("The Byte is = " +b);

        System.out.print("Please Enter the string: ");//Take input as String
        String str = input.next();
        System.out.print("The String: "+str);


    }
}
