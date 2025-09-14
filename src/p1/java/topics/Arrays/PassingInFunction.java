package p1.java.topics.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums  = {10,20,30,40,50};
        System.out.println("Before Calling the change the array is: ");
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println("After calling the Change Functions, It will change the value of array.");// Because the array is mutable.
        System.out.println(Arrays.toString(nums));



    }

    static void change(int[] arr){
        arr[1] = 60;
    }
}
