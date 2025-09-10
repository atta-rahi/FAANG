package p1.java.programs.find;

import java.math.BigInteger;
import java.util.Scanner;
public class findNCR_NPR {
    public static void main(String[] args) {
        /*
        Formula:
            nPr = n!/(n-r)!
            nCr = n!/r!(n-r)!
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Permutation and Combination.");
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();


        //n!
        int nFac = 1;
        for (int i=1; i<=n; i++){
            nFac = nFac*i;
        }


        //(n-r)!
        int n_r = n-r;
        int n_rFac = 1;
        for (int j = 1; j<= n_r; j++){
            n_rFac = n_rFac *j;
        }

        //r!
        int rFac = 1;
        for (int i=1; i<=r; i++){
            rFac = rFac*i;
        }

        //Permutation
        int per =nFac/ n_rFac;
        System.out.println("The Permutation(nPr) is : "+per);

        //Combination
        int com = nFac/(rFac*n_rFac);
        System.out.println("The Combination(nCr) is : " +com);

    }
}
