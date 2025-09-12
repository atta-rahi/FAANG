package p1.java.programs.functions;

import java.util.Scanner;
public class pythagoreanTriplet {
    public static void main(String[] args) {

        /*
            Pythagorean Triplet definition:
              Agar 3 numbers a,b,c diye gaye hain (jahan c sabse bada number hai), to agar:
                    a^2+b^2 = c^2
             to wo Pythagorean Triplet hoga
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        if (isPythagorean(num1,num2,num3)){
            System.out.println("Pythagorean");
        }
        else {
            System.out.println("Not Pythagorean");
        }

    }


    static boolean isPythagorean(int a, int b, int c){

        int max = a;
        if(b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }


        if (max == a){
            return (Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2));
        }else if (max == b){
            return (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2));
        }
        else{
            return (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2));
        }

    }



}
