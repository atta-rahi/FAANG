package p1.java.topics.switchStatement;

import java.util.Scanner;
public class neestedSwitchCase {
    public static void main(String[] args) {
        /*
        Means Switch case inside a switch case.

        Syntax:
            switch(expression){
                case 1:
                    //code block
                    break;
                case 2:
                    switch(expression){
                        case 1:
                            //code block
                            break;
                        case 2:
                            //code blcok
                            break;
                        default:
                            //code block
                    }
                    break;
               default:
                    //code block
            }

         */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee ID : ");
        int empID = sc.nextInt();
        System.out.print("Enter the department : ");
        String dep = sc.next();

        switch (empID){
            case 1:
                switch (dep){
                    case "IT":
                        System.out.println("IT Department.");
                        break;
                    case "Management":
                        System.out.println("Management Department.");
                        break;
                }
                break;
            case 2:
                System.out.println("Attaullah");
                break;
            case 3:
                System.out.println("Nawab");
                break;

            default:
                System.out.println("Wrong input.");
        }

    }
}
