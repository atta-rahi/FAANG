package p1.java.topics.methods;
import java.util.Arrays;
import java.util.Scanner;
public class varArgs {
    public static void main(String[] args) {

        /*
            Take a variable number of argument's. A Method that takes a variable number of
            argument's is a varargs method.
         */

        fun(1,2,3,4,5,6,7,8,9,10);

        multiple(2, 3, "GM", "Nawab", "Attaullah","Amjad");

        }


        static void multiple ( int a, int b, String ...v){
            System.out.println(Arrays.toString(v));
            System.out.println(a);
            System.out.println(b);
        }

        static void fun (int ...v){
            System.out.println(Arrays.toString(v));
        }
}

