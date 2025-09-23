package p1.java.programs.array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        /*
           Question:
                There are n kids with candies. You are given an integer array candies,
                where each candies[i] represents the number of candies the ith kid has,
                and an integer extraCandies, denoting the number of extra candies that you have.

                Return a boolean array result of length n, where result[i] is true if,
                after giving the ith kid all the extraCandies, they will have the greatest
                number of candies among all the kids, or false otherwise.
            Example:
                    Input: candies = [2,3,5,1,3], extraCandies = 3
                    Output: [true,true,true,false,true]
                    Explanation: If you give all extraCandies to:
                    - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
                    - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
                    - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
                    - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
                    - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of kids : ");
        int kids = sc.nextInt();

        int[] candies = new int[kids];
        System.out.print("Enter the Candies of kids: ");
        for (int i = 0; i< kids; i++){
            candies[i] = sc.nextInt();
        }

        System.out.print("Enter the extra candies that you have : ");
        int extraCandies = sc.nextInt();

        System.out.print("\nCandies : "+ Arrays.toString(candies) +",  Extra Candies : " +extraCandies);


        ArrayList<Boolean> bool = kidsWithCandies(candies, extraCandies);
        System.out.print("\nOutput : " +bool);


    }


    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies){

        ArrayList<Boolean> result = new ArrayList<>();

        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] >= max){
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {

            if (candies[i]+extraCandies >= max){
                result.add(true);
            }
            else {
                result.add(false);
            }

        }

        return result;


    }

}
