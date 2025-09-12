package p1.java.programs.functions;

import java.util.Scanner;
public class grades {
    public static void main(String[] args) {

        /*
            Write a program that will ask the user to enter his/her marks (out of 100).
            Define a method that will display grades according to the marks entered as
            below:
                    Marks        Grade
                    91-100         AA
                    81-90          AB
                    71-80          BB
                    61-70          BC
                    51-60          CD
                    41-50          DD
                    <=40          Fail
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the marks (out of 100)  : ");
        int marks = sc.nextInt();

        grade(marks);

    }

    static void grade(int marks){
        
        if (marks < 0 || marks > 100){
            System.out.println("Please Enter the Marks out of 100");
            return;
        }
        
        if (marks > 90){
            System.out.println("The Grade is AA");
        } else if (marks > 80) {
            System.out.println("The Grade is AB");
        }else if (marks > 70) {
            System.out.println("The Grade is BB");
        }else if (marks > 60) {
            System.out.println("The Grade is BC");
        }else if (marks > 50 ) {
            System.out.println("The Grade is CD");
        }else if (marks > 40) {
            System.out.println("The Grade is DD");
        }else {
            System.out.println("Fail");
        }

    }

}
