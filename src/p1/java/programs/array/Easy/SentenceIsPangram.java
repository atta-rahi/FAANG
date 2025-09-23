package p1.java.programs.array.Easy;

import java.util.Scanner;
public class SentenceIsPangram {
    public static void main(String[] args) {
        /*
            Question:
            A pangram is a sentence where every letter of the English alphabet appears at least once.
            Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

       Example 1:
         Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
         Output: true
         Explanation: sentence contains at least one of every letter of the English alphabet.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String sen = sc.next();

        System.out.print("\nThe String is : "+sen);


        boolean isPang = isPangram(sen);
        System.out.print("\nIs Pangram : " +isPang);
    }


    static boolean isPangram(String sen) {
        boolean[] check = new boolean[26];

        if (sen.length() < 26) {
            return false;
        }

        for (int i = 0; i < sen.length(); i++) {
            char c = sen.charAt(i);

            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                check[index] = true;
            }
        }

        for (boolean b : check) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
}
