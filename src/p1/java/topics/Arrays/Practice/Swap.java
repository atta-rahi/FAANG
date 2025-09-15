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
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nThe elements : ");
        for (int n : arr){
            System.out.print(n +" ");
        }

        int index1, index2;
        System.out.print("\nEnter the index 1 : ");
        index1 = sc.nextInt();
        System.out.print("\nEnter the index 2 : ");
        index2 = sc.nextInt();

        swap(arr,index1,index2);

        for (int swap : arr){
             System.out.print(swap +" ");
        }

    }

    static void swap(int[] arr, int elem1, int elem2){

        int temp = arr[elem1];
        arr[elem1] = arr[elem2];
        arr[elem2] = temp;



        }

    }
