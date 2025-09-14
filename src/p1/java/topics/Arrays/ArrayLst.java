package p1.java.topics.Arrays;

import java.util.ArrayList;

public class ArrayLst {
    public static void main(String[] args) {

    /*
        The array list like a resizable array:

        The size of the array is fixed not changeable after created it.

        While the ArrayList has no fix size we can add many elements as we want.
        and it can be created using objects and wrapper classes.

    SYNTAX:
           ArrayList<Integer> list = new ArrayList<Integer>
    */


        //Create an Array List:
        ArrayList<Integer> list = new ArrayList<>();


        //Now you can use methods like add(), get(), set(), and remove() to manage your list of elements.

        //add()
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.print("Added elements to the list  by add() : "+list);


        //You can also add an element at a specified position by referring to the index number:
        list.add(5,50);
        System.out.print("\n\nAdded element 50 at position(index) 5 by add() : "+list);


        //Access an Element:
        //To access an element in the ArrayList, use the get() method and refer to the index number:
        System.out.print("\n\nAccessing the element of Array by get() : "+list.get(5));//Access the element of Array List that is present at index 5


        //Change an Element:
        //To modify an element, use the set() method and refer to the index number:
        list.set(3,30); //Setting element 30 at index 3;
        System.out.print("\n\nSet the index 30 at index 3 by set() : "+list);


        //To know the size of array list --> list.size
        System.out.print("\n\nThe size of the array list is : "+list.size());


        //And there are many methods that can be applied on the array list.



        //Loop Through an ArrayList:
        //Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
        System.out.print("\n\nLoop Through an ArrayList : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) +" ");
        }

        //for each loop:
        System.out.print("\n\nFor each loop : ");
        for (Integer number: list){
            System.out.print(number +" ");
        }



        /*
          Other Types:
                     Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String".
                     Remember that a String in Java is an object (not a primitive type).
                     To use other types, such as int, you must specify an equivalent wrapper class:
                     Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
        */


    }
}
