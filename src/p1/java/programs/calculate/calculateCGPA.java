package p1.java.programs.calculate;

import java.util.Scanner;
public class calculateCGPA {
    public static void main(String[] args) {
        //CGPA = CGPA = (Total Quality Points Earned) / (Total Credit Hours for All Courses)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of courses were cleared : ");
        int noOfCourses = sc.nextInt();

        int maxCourse = 180;
        float quilPoints = 1;
        float totalQP = 0;
        float totalCH = 0;
        if (noOfCourses <= 180){

            System.out.println("Enter the Grade point and CRH of Courses");
            for (int i = 1; i<= noOfCourses; i++){
                System.out.print("Course "+ i + " : ");
                float course = sc.nextFloat();
                float CRH = sc.nextFloat();


                quilPoints = course*CRH;
                totalQP +=quilPoints;
                totalCH +=CRH;


            }

            System.out.println("Total Courses : "+noOfCourses);
            System.out.println("Total Quility Points  : "+totalQP);
            System.out.println("Total Credit Hours : "+totalCH);

            float CGPA = (float) totalQP/totalCH;
            System.out.println("The CGPA is : "+CGPA);
        }
        else {
            System.out.println("The no of courses are out of rang.");
        }
    }
}
