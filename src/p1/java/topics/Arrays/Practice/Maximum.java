package p1.java.topics.Arrays.Practice;

import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        /*
            Maximum value in array.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of array : ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The elements of the array is : ");
        for (int numbers : arr){
            System.out.print(numbers +" ");
        }

        int max = max(arr);
        System.out.print("\nThe maximum value in array is : "+max);

    }

    static int max(int[] arr){

       int max = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
