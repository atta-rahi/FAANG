package p1.java.topics.Arrays.Practice;

import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        /*
            Swap the elements of the array.
         */

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nThe elements : ");
        for (int n : arr){
            System.out.print(n +" ");
        }

    }

    static void swap(int[] arr, int elem1, int elem2){

        int temp = arr[elem1];
        arr[elem1] = arr[elem2];
        arr[elem2] = arr[temp];

        }

    }
