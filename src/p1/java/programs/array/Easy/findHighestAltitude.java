package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class findHighestAltitude {
    public static void main(String[] args) {
        /*
        There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
        The biker starts his trip on point 0 with altitude equal 0.

        You are given an integer array gain of length n where gain[i] is the net gain in altitude between
        points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.



        Example 1:
        Input: gain = [-5,1,5,0,-7]
        Output: 1
        Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();


        int[] gain = new int[size];
        System.out.print("Enter the element's of the array :");
        for (int i = 0; i < size; i++) {
            gain[i] = sc.nextInt();
        }


        System.out.print("\nThe elements of the array is : "+ Arrays.toString(gain));


        int largestAltitude = largetAltitude(gain);
        System.out.print("\nThe highest altitude is : "+largestAltitude);

    }



    static int largetAltitude(int[] gain){

        int altitude = 0;
        int largestAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude = altitude+gain[i];

            if (altitude>largestAltitude){
                largestAltitude = altitude;
            }
        }

        return largestAltitude;
    }

}
