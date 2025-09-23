package p1.java.programs.array.Easy;

import java.util.Arrays;
import java.util.Scanner;
public class FlippingImage {
    public static void main(String[] args) {
        /*
          Question:
            Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

            To flip an image horizontally means that each row of the image is reversed.

            For example, flipping [1,1,0] horizontally results in [0,1,1].
            To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
            For example, inverting [0,1,1] results in [1,0,0].

            Example 1:
            Input: image = [[1,1,0],[1,0,1],[0,0,0]]
            Output: [[1,0,0],[0,1,0],[1,1,1]]
            Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
            Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

        */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size =  sc.nextInt();

        int[][] image = new int[size][size];

        System.out.print("Enter the "+size+" row's and "+size+" column's of the array input should be (0's and 1's): ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = sc.nextInt();
                if (image[i][j]>1){
                    System.out.println("Please Enter the input b/w 0's and 1's");
                    break;
                }
            }
        }

        System.out.println("\nThe elements of the array is :");
        for (int[] number : image){
            System.out.println(Arrays.toString(number));
        }


        int[][] flip = flipAndInvertImage(image);
        for (int[] ans : flip){
            System.out.print(Arrays.toString(ans));
        }

    }

    static int[][] flipAndInvertImage(int[][] image){

        int rows = image.length;
        int col = image[0].length;
        int[][] flip = new int[rows][col];


        for (int i = 0; i <rows; i++) {

            for (int j = 0; j < col ; j++) {

                flip[i][col -1 -j] = image[i][j];


            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (flip[i][j] == 1){
                    flip[i][j] = 0;
                }
                else {
                    flip[i][j] = 1;
                }

            }
        }


        return flip;
    }

}
