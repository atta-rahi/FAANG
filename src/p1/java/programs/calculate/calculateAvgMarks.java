package p1.java.programs.calculate;

import java.util.Scanner;
public class calculateAvgMarks {
    public static void main(String[] args) {

        //Formula: avgMarks = sum of all subject marks / total subjects

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total subject's : ");
        int subjects = sc.nextInt();

        int totalMarks = 0;
        float avg = 0;

        System.out.println("Enter the marks of all subjects");
        for (int i = 1; i <= subjects; i++){
            System.out.print("Enter the marks of subject "+ i +" : ");
            int marks = sc.nextInt();

            totalMarks +=marks;
            avg = (float) totalMarks/subjects;
        }

        System.out.println("Total subject's : " +subjects);
        System.out.println("Total marks : " +totalMarks);
        System.out.println("The Average is : "+avg);

    }
}
