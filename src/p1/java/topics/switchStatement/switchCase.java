package p1.java.topics.switchStatement;

import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {

        /*
        Instead of writing many if..else statements, you can use the switch statement.
        The switch statement selects one of many code blocks to be executed:

        Syntax:
                switch(expression) {
                 case x:
                       // code block
                       break;
                 case y:
                      // code block
                      break;
                default:
                     // code block
             }

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fruit : ");
        String fruit = sc.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of fruits.");
                break;
            case "apple":
                System.out.println("A sweet red fruit.");
                break;
            case "orange":
                System.out.println("Round fruit.");
                break;
            default:
                System.out.println("Please enter valid input.");
        }

    }
}
