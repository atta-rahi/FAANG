package p1.java.topics.methods;
import java.util.Arrays;

import java.util.Scanner;
public class passingByValueAndRefrence {
    public static void main(String[] args) {
        // Primitive data types
        /*
            In Java, when you pass a primitive data type (like int, float, char, etc.) to a method, you're passing the value by copy.
            This means that any changes made to the parameter inside the method do not affect the original variable outside the method.
         */
        int a = 10;
        int b = 20;
        System.out.println("Before swap in main: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap in main: a = " + a + ", b = " + b);

        /*
            In Java, Strings are immutable. When you pass a String to a method, you're passing the reference by value.
            This means that if you try to change the String inside the method, it won't affect the original String outside the method.
            This is because you're only changing the local copy of the reference, not the actual object that the reference points to.
            To actually change the value of a String, you would need to return the new String from the method and assign it back to the original variable.
         */
        String name = "Alice";
        System.out.println("Before swap in main: name = " + name);
        changeName(name);
        System.out.println("After changeName in main: name = " + name);

        // If you want to modify an object inside a method and have that change reflected outside the method, you can use mutable objects like an array or custom objects.
        /*
            Here, we are passing the reference of the array to the method. Inside the method, we modify the contents of the array.
            Since arrays are mutable, the changes made inside the method will be reflected outside the method as well.
         */
        int arr[] = {1, 2, 3};
        System.out.println("Before swap in main: arr = " + Arrays.toString(arr));
        modifyArray(arr);
        System.out.println("After modifyArray in main: arr[0] = " + Arrays.toString(arr));

    }

    public static void swap(int a, int b) {
        a = 20;
        b = 30;
        System.out.println("Inside swap: a = " + a + ", b = " + b);
    }

    public static void changeName(String name) {
        name = "Bob";
        System.out.println("Inside Change Name, " + name);
    }

    public static void modifyArray(int arr[]) {
        arr[0] = 10;
        System.out.println("Inside modifyArray: arr[0] = " + arr[0]);
    }

}

