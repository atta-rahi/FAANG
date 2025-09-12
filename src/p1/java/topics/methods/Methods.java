package p1.java.topics.methods;

import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {

        /*

        Methode is a block of code which only runs when it is called.
        We use methods to reduce the repeatation of code. -->Define once use it again and again

        Syntax:
                access_modifier return_type methodeName(){
                        //Body

                      return statement;
                }
         */


        //Print the sum of two number's 5 times;

        /*
        int num1,num2,sum;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println(sum);

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println(sum);

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println(sum);

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println(sum);

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println(sum);

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();
        sum = num1+num2;
        System.out.println(sum);

        //So Actually we are coping that code and paste same code again and again.
        //To reduce the repeatation we use the concept of Methods.

        */




        //Calling the methode inside main function.
        sum();
        sum();
        sum();
        sum();
        sum();

    }

    //Declaring the methode outside the main function and inside class
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num2 : ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println(sum);
    }

}
