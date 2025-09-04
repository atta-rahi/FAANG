package p1.java.topics.Loops;

public class WhileLoop {
    public static void main(String[] args) {
        /*
            The while loop is used when we don't know how many times the loop will be iterate.

                Syntax:
                    while(condition){
                        //code to be executed
                        //increment / decrement
                    }

         */

        //Print number's from 1-7

        int num = 1;
        while(num<=7){
            System.out.println(num);
            num+=1;
        }
    }
}
