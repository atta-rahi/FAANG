package p1.java.topics.Conditionals.PracticeQuestions;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class AlphabetCaseCheck {
    public static void main(String[] args) {
        /*
        Take an input character from keyboard and check whether it is Upper case or lower case alphabet.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the character: ");
        char ch = input.next().trim().charAt(0);     //The trim() will remove the extra spaces.
                                                    // and charAt(0) will be gives us character at index 0

        System.out.println("\nWith ASCII:");
        if (ch >= 97 && ch <= 122){
            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper Case");
        }


        System.out.println("\nWithout ASCII");
        if (ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper Casea");
        }
    }
}
