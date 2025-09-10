package p1.java.topics.switchStatement.practiceQuestions;

import java.util.Scanner;
public class weekdayAndWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1-7 : ");
        int day = sc.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Enter valid input.");
        }

        System.out.println("\nWith Enhanced Switch case");
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Enter valid input");
        }
    }
}
