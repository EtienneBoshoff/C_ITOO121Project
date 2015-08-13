
package za.ac.pearson.cti.studentdpcalculator;

import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {

        System.out.println("Welcome to DP Calculator: ");
        System.out.print("What is your name: ");
        // This makes an object for the keyboard
        Scanner keyboardInput = new Scanner(System.in);
        // Then we assign what we receive from the keyboard to a variable userInput
        String userInput = keyboardInput.nextLine();
        // Now we greet the user by name
        System.out.println("Greetings "+ userInput);
        System.out.print("Please enter the percentage you received for your Assignment: ");
        userInput = keyboardInput.nextLine();
        Double assignmentMark = Double.parseDouble(userInput);
        
        
        
    }
    
}