package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class PlusOne {
    public static void main(String[] args) {
        /*
          Question:
           You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
           The digits are ordered from most significant to least significant in left-to-right order. The large integer
           does not contain any leading 0's.

           Increment the large integer by one and return the resulting array of digits.

           Example 1:

            Input: digits = [1,2,3]
            Output: [1,2,4]
            Explanation: The array represents the integer 123.
            Incrementing by one gives 123 + 1 = 124.
            Thus, the result should be [1,2,4].
        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the array : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.print("Enter the "+size+" element's of the array : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("\nArray Elements = "+ Arrays.toString(numbers));




        //By Approach 1.
        //int[] ans = plusOne(numbers);
        //System.out.print("\nResult Array : "+Arrays.toString(ans));


        //By Approach 2.
        int[] ans = onePlus(numbers);
        System.out.print("\nResult Array: "+Arrays.toString(ans));

    }




    //Approach 1: Only work for small input like that contain digits that are in rang for int.
    static int[] plusOne(int[] digits){

        int numbers = 0;
        for (int i = 0; i <=digits.length-1; i++) {

            int rem = digits[i]%10;
            numbers = numbers*10+rem;
            digits[i] /= 10;

        }

        numbers = numbers+1;
        int length = (int)Math.log10(numbers)+1; //to get the length of the numbers;

        int[] resultArray = new int[length];

        for (int i = 0; i <=resultArray.length-1; i++) {
            int rem = numbers%10;
            resultArray[resultArray.length-1-i] = rem;
            numbers /= 10;

        }

        return resultArray;

    }


    //Approach 2: Direct adding in the array this will work for all size of the array
    static int[] onePlus(int[] numbers){

        int[] resultArray = new int[numbers.length+1]; //If carry exceed

        for (int i = numbers.length-1; i >= 0; i--) {

            if (numbers[i] < 9){
                numbers[i]++;
                return numbers;

            }else if (numbers[i] == 9){
                numbers[i] = 0;
            }

        }
        resultArray[0] = 1;
        return resultArray;
    }
}
