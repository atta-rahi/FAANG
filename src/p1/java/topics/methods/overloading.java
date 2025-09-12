package p1.java.topics.methods;

import java.util.Scanner;
public class overloading {
    public static void main(String[] args) {

        /*
        With method overloading, multiple methods can have the same name with different parameters:
         */

        fun(67);
        fun("Kunal Kushwaha");
        int ans = sum(3, 4, 78);
        System.out.println(ans);
        ans = sum(1,2);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        System.out.println("sum Function with two integer a,b : ");
        return a + b;
    }

    static int sum(int a, int b, int c) {
        System.out.println("sum Function with three integer a,b,c : ");
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("fun() Function with integer : ");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("fun() Function with String : ");
        System.out.println(name);
    }

}
