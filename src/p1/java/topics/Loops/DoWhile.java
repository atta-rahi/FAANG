package p1.java.topics.Loops;

public class DoWhile {
    public static void main(String[] args) {
        /*
            When we want to execute our statement at least one time.

                Syntax:
                    do{
                        //code to be executed,
                        //increment / decrement
                    }while(condition)
         */

        //Print number from 1-5
        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<5);


    }
}
