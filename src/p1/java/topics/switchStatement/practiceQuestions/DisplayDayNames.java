package p1.java.topics.switchStatement.practiceQuestions;

import java.util.Scanner;
public class DisplayDayNames {
    public static void main(String[] args) {
        /*
        Dsiplay the name of days 1-7
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 1-7. ");
        int day = sc.nextInt();

        System.out.println("With old switch case.");
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter valid input");
        }

        System.out.println("\nWith Enhanced Switch Case");
        switch (day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case  7-> System.out.println("Sunday");
            default -> System.out.println("Please enter valid input");
        }


    }
}
