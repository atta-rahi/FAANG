package p1.java.topics.methods;

import java.util.Scanner;
public class returnType {
    public static void main(String[] args) {

        /*
        Return type of the methode specifies the type of values that the methode will send back
        to the code that called it.

        Here are the different categories of return types in Java:
            1. Primitive Data Types: Methods can return primitive data types such as int, double,
               boolean, char, byte, short, long, and float.

            2. Class Types (Objects): Methods can return instances of classes,
               including built-in Java classes like String or custom classes you define.

            3. void: If a method does not return any value, its return type is declared
            as void. These methods typically perform an action or side effect without
            producing a result that needs to be used by the caller.

         */

        voidMethod();

        int sumOfInteger = intMethode(5,5);
        System.out.println(sumOfInteger);

        boolMethode();


        float floatMethode = floatMethode(10.10f, 20.10f);
        System.out.println(floatMethode);

        String stringMethode = stringMethode("Attaullah");
        System.out.println(stringMethode);

    }

    //Example 1. void -> return nothing
    static void voidMethod(){
        System.out.println("This is the Void method that is return nothing.");
    }

    //Example 2. int -> return integer type.
    static int intMethode(int num1, int num2){
        System.out.println("This is integer return type that returning the integer values");
        return num1+num2;
    }

    //Example 3. bool -> return true or false
    static boolean boolMethode(){
        System.out.println("This is boolean return type");
        int num1 = 5;
        int num2 = 3;

        return num1>num2;
    }

    //Example 4. float
    static float floatMethode(float num1, float num2){
        System.out.println("This is the float return type.");
        return num1*num2;
    }

    //Example 5. String a class type (Object) -> return string type;
    static String stringMethode(String name){
        System.out.println("This is string return type (Object)");
        return name;

    }

}
