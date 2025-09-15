package p1.java.topics.Arrays.Practice;

import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        /*
            Array = 1 2 3 4 5;
            reverse = 5 4 3 2 1;
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nThe elements of array : ");
        for (int numbers : arr){
            System.out.print(numbers +" ");
        }

        rev(arr);

    }

    static void rev(int[] arr){

        System.out.print("\nReverse : ");
        for (int i = arr.length; i > 0; i--) {
            System.out.print(i+" ");
        }

    }
}
