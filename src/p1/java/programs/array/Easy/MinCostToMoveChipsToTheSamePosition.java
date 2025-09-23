package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class MinCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        /*
          Question:
             We have n chips, where the position of the ith chip is position[i].

             We need to move all the chips to the same position. In one step, we can change the position of the ith
             chip from position[i] to:

            position[i] + 2 or position[i] - 2 with cost = 0.
            position[i] + 1 or position[i] - 1 with cost = 1.
            Return the minimum cost needed to move all the chips to the same position.

           Example:
            Input: position = [1,2,3]
            Output: 1
            Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
            Second step: Move the chip at position 2 to position 1 with cost = 1.
            Total cost is 1.
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the chips : ");
        int size = sc.nextInt();

        int[] position = new int[size];
        System.out.print("Enter the "+size+" position the chips : ");
        for (int i = 0; i < size; i++) {

            position[i] = sc.nextInt();
        }

        System.out.print("\nThe Positions of the chips : "+ Arrays.toString(position));

        int ans = minCostToMoveChips(position);
        System.out.print("\nMinimum cost : "+ans);
    }


    static int minCostToMoveChips(int[] position){
        int even =0 ;
        int odd = 0;
        for (int j : position) {

            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
