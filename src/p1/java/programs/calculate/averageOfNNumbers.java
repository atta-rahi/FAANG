package p1.java.programs.calculate;

import java.util.Scanner;
public class averageOfNNumbers {
    public static void main(String[] args) {

        //Average Of Number's
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number's do what to enter.");
        int n = sc.nextInt();

        int sum = 0;
        float avg  = 0;
        for (int i=1; i<=n; i++){
            System.out.print("Enter the number  "+ i +" : ");
            int num = sc.nextInt();

            sum = sum+num;
        }
        avg = (float) sum/n;
        System.out.println("The avg is : "+avg);
    }
}
