package p1.java.topics.Conditionals;

import java.security.KeyStore;

public class If_Else {
    public static void main(String[] args) {

    /*Let's us ro control the flow of program, it deciding which code runs and which is skipped.

        Syntax:
        if(boolean expression T/F){
            //Body
            //do this
        }
        else{
            //Body
            //Otherwise do this
        }
     */


        boolean boolCond = true;
        if (boolCond) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        /*We can add multiple if-else statement's if we want / required */
        int sal = 10000;
        if (sal > 10000 && sal < 20000){
            sal = sal+1000;
        } else if (sal > 20000 ) {
            sal += 2000;
        }else{
            sal += 500;
        }
        System.out.println("New salary is= "+sal);


    }
}