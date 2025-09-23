package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class N_UniqueIntegerSumUpto0 {
    public static void main(String[] args) {

        /*
            Question:
                Given an integer n, return any array containing n unique integers such that they add up to 0.

            Example 1:
            Input: n = 5
            Output: [-7,-1,1,3,4]
            Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.print("\nThe number is : "+n);



        int[] ans = sumZero(n);
        System.out.print("\nResult : "+ Arrays.toString(ans));
    }



    static int[] sumZero(int n){

        int[] array = new int[n];
        int index = 0;
        if (n==1){
            array[index] = 0;
        }

        if (n%2 == 0){

            for (int i = 1; i <=n/2; i++) {
                array[index++] = i;
                array[index++] = -i;
            }
        }

        if (n%2 == 1){

            array[index++] = 0;
            for (int i = 1; i <= n/2; i++) {
                array[index++] = i;
                array[index++] = -i;
            }

        }


        return array;
    }
}
