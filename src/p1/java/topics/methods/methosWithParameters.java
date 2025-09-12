package p1.java.topics.methods;

public class methosWithParameters {
    public static void main(String[] args) {

        /*
        Act as variable inside the Methode -->Like --> methodeName(parameter1, parameter2, ....)

         */

        myMethode("Attaullah");
        myMethode("Nawab");

        mulParam(1,2,3,4);
        mulParam(2,2,3,4);
    }

    static void myMethode(String name){ //Here string name is parameter
        System.out.println("Hello "+name);
    }

    //Multiple parameter's
    static void mulParam(int a, int b, int c, int d){
        int sum = a+b+c+d;
        System.out.println("Sum : " +sum);
        int product = a*b*c*d;
        System.out.println("Product : "+product);
    }
}
