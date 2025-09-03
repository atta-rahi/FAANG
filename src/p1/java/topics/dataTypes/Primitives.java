package p1.java.topics.dataTypes;

public class Primitives {
    public static void main(String[] args) {

            byte b = 10;          // 8-bit signed integer 1 byte
            short s = 1000;      // 16-bit signed integer 2 bytes
            int rollNO = 100000;      // 32-bit signed integer 4 bytes
            float marks = 10.5f;     // 32-bit floating point 4 bytes
            long largeInteger = 100000L;    // 64-bit signed integer 8 bytes
            double largeFloatNumber = 20.99;    // 64-bit floating point 8 bytes
            char letter = 'A';        // single 16-bit Unicode character
            boolean bool = true;     //Only True/False

            System.out.println("Primitive Data Types in Java:");
            System.out.println("byte: " + b);
            System.out.println("short: " + s);
            System.out.println("int: " + rollNO);
            System.out.println("long: " + largeInteger);
            System.out.println("float: " + marks);
            System.out.println("double: " + largeFloatNumber);
            System.out.println("char: " + letter);
            System.out.println("boolean: " + bool);
    }
}
