package p1.java.programs.array.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class CountItemsMatchingRule {
    public static void main(String[] args) {

        /*
            Question:
              You are given an array items, where each items[i] = [typei, colori, namei] describes the type,
              color, and name of the ith item.
              You are also given a rule represented by two strings, ruleKey and ruleValue.

              The ith item is said to match the rule if one of the following is true:

                ruleKey == "type" and ruleValue == typei.
                ruleKey == "color" and ruleValue == colori.
                ruleKey == "name" and ruleValue == namei.

                Return the number of items that match the given rule.



                Example 1:
                Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
                ruleKey = "color", ruleValue = "silver"
                Output: 1
                Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
        */




        Scanner sc = new Scanner(System.in);

       // System.out.print("Enter the length of the array lists: ");
        // int size = sc.nextInt();

        ArrayList<ArrayList<String>> list = new ArrayList<>();

        //initializing the array list:
        for (int i = 1; i <= 3; i++) {
            list.add(new ArrayList<>());
        }

        //input:
        System.out.print("Enter the type color and name : ");
        for (int i = 0; i < 3; i++) {
            System.out.print("\nEnter the type color and name for "+i+" : ");
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.next());
            }
        }


        System.out.print("Enter the rule key : ");
        String ruleKey = sc.next();
        System.out.print("Enter the rule Value : ");
        String ruleValue = sc.next();

        System.out.print("\nThe Type color and names are : "+list);

        int result = countMatches(list,ruleKey,ruleValue);
        System.out.println("\n" +result);

    }



    static int countMatches(ArrayList<ArrayList<String>> list, String ruleKey, String ruleValues){


        int count = 0;
        for (int i = 0; i < list.size(); i++) {
                if (ruleKey.equals("type")){
                    if (list.get(i).getFirst().equals(ruleValues)){
                        count++;
                    }
                } else if (ruleKey.equals("color")) {
                    if (list.get(i).get(1).equals(ruleValues)){
                        count++;
                    }


                } else if (ruleKey.equals("name")) {
                    if (list.get(i).get(2).equals(ruleValues)){
                        count++;
                    }
                }
            }

        return count;
    }
}
