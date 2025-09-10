package p1.java.programs.calculate;

import java.util.Scanner;
public class calculateBattingAvg {
    public static void main(String[] args) {

        //FORMULA: BA = totalRuns/No of times out

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of matches were played: ");
        int noOfMatch = sc.nextInt();

        int totalScore = 0;
        for (int i=1; i<=noOfMatch; i++){
            System.out.print("Enter the score of match "+ i +" : ");
            int score = sc.nextInt();

            totalScore = totalScore+score;
        }
        System.out.print("How many times got out : ");
        int out = sc.nextInt();

        if (out == 0){
            System.out.println("Batting average cannot be calculated (never out).");
        }
        else {

            float battingAvg = (float) totalScore / out;
            System.out.println("The total score of the " + noOfMatch + " matches is : " + totalScore);
            System.out.println("Total out : " + out);
            System.out.println("The batting avg is : " + battingAvg);

        }

    }
}
