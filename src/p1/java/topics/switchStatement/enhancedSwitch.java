package p1.java.topics.switchStatement;

import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {
        /*
        Working like Switch but the Syntax is change

        Syntax:
            Switch(expression) {
                 case x: -->// do this

                 case y:// do this

                 default: -->// do this

             }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit : ");
        String fr = sc.next();

        switch (fr){
            case "mango"-> System.out.println("King of fruits.");
            case "orange"-> System.out.println("Round fruit.");
            case "apple" -> System.out.println("Red sweet fruit");
            default -> System.out.println("Please enter valid input." +
                    "");
        }

    }
}
