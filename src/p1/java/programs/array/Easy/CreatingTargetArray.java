package p1.java.programs.array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CreatingTargetArray {
    public static void main(String[] args) {

        /*
          Question:
            Given two arrays of integers nums and index.
            Your task is to create target array under the following rules:

               Initially target array is empty.
               From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
               Repeat the previous step until there are no elements to read in nums and index.
               Return the target array.

               It is guaranteed that the insertion operations will be valid.

           Example:
                Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
                Output: [0,4,1,3,2]
                Explanation:
                nums       index     target
                0            0        [0]
                1            1        [0,1]
                2            2        [0,1,2]
                3            2        [0,1,3,2]
                4            1        [0,4,1,3,2]
        */


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        int[] index = new int[size];

        System.out.print("Please Enter the " +size +" elements of the array : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Please enter the "+size+" index the the array : ");
        for (int i = 0; i < size; i++) {
            index[i] = sc.nextInt();
        }

        System.out.print("\nThe elements of the array : "+ Arrays.toString(nums));
        System.out.print("\nThe index of the array : "+ Arrays.toString(index));


        System.out.print("\n\nUSING ARRAY : ");
        int[] result = creatingTargetArray(nums,index);
        System.out.print("\nTarget array is : "+Arrays.toString(result));

        ArrayList<Integer> ans = targetArray(nums,index);

        System.out.print("\n\nUSING ARRAY LIST : ");
        System.out.print("\nTarget array is : "+ans);


    }


    //USING ARRAY (Array mein hmain shifting karni padti hai)
    static int[] creatingTargetArray(int[] nums, int[] index){

        int[] targetArray = new int[nums.length];

        int size = 0;
        for(int i = 0; i < nums.length; i++) {
            int pos = index[i];
            int val = nums[i];

            for (int j = size - 1; j >= pos; j--) {
                targetArray[j + 1] = targetArray[j];
            }
            targetArray[pos] = val;
            size++;
        }


        return targetArray;

    }


    //USING ARRAY LIST
    static ArrayList<Integer> targetArray(int[] nums, int[] index){

        ArrayList<Integer> targetArray= new ArrayList<>();

        for (int i=0; i<nums.length; i++){

            int ind = index[i];
            targetArray.add(ind,nums[i]); // Es mein shifting automatically hooti hai.

        }

        return targetArray;
    }


}
