package p1.java.programs.calculate;

import java.util.Scanner;
public class calculateElectricityBill {
    public static void main(String[] args) {

        //Calculating Electricity bill.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Unit's : ");
        int units = sc.nextInt();

        int totalPrice = 0;
        
        if (units>=1 && units<=100){
            totalPrice = units*10;
        } else if (units>100 && units <=200) {
            totalPrice = units*20;
        } else if (units>200 && units <=300) {
            totalPrice = units*30;
        }else if(units>300) {
            totalPrice = units*40;
        }else {
            System.out.println("Entered wrong input." +units);
        }

        System.out.println("Total Price : "+totalPrice);
    }
}
