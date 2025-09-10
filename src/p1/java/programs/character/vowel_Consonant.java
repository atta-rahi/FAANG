package p1.java.programs.character;

import java.util.Scanner;
public class vowel_Consonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char input = sc.next().trim().charAt(0);

        if (input>='a' && input<='z' || input >='A' && input <='Z'){
            if (input == 'a' || input == 'e'|| input == 'i' || input == 'o'|| input == 'u' ||
                input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U'){
                System.out.println("The '"+input+"' is Vowel.");
            }
            else {
                System.out.println("The '"+input+ "' is Constant.");
            }
        }
        else {
            System.out.println("Wrong input : '" +input+ "' Please enter the character.");
        }




    }
}
