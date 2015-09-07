/*
 * This is the starting program for CTI students in Object Orientated 
 * Programming.  To run this program click on the Run button in the toolbar
 * above (The one that looks like a play button).  In each class you will find
 * instructions on what needs to be done to complete this homework assignment
 * 
 * This is homework assignment: 1
 * It is due: Week of 13 July 2015
 * Remember to hand in all you need to do is upload a picture of all of your
 * JUnit tests passing.
 */
package za.ac.pearson.cti.studentdpcalculator;

import java.util.Scanner;

/**
 * Remember that all programs will be compiled through Maven.
 * If Maven is not used then you will receive 0 for this task
 * @author Etienne Boshoff - Lecturer CTI Education Group
 */
public class Main {
    
    /**
     * This is your main method.  Each program you write requires a main method.
     * The main method is where the Java Virtual Machine starts the program.
     * @param args These are extra arguments to start your program.
     * 
     * Task Required.  Pass all tests and submit the screen shot to e-Active
     * before the deadline
     * 
     * Bonus Credit: ensure that the program can run with input from the command line
     * when the program is called.
     */
    public static void main(String[] args) {
        
        DPcalcGUIFrame calcframe = new DPcalcGUIFrame();
        //Bonus credit part
        /**
         * Write a check here to see if the following conditions are met
         * 1. There has to be 3 inputs given with the command line
         * they are: The assignmentMark, semesterTestMark, contAssessmentMark
         */
        //End of bonus credit part
        
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
         System.out.print("Please enter the percentage you received for your Semester Test: ");
        userInput = keyboardInput.nextLine();
        Double semesterTestMark = Double.parseDouble(userInput);
         System.out.print("Please enter the percentage you received for your Continuous Assessment: ");
        userInput = keyboardInput.nextLine();
        Double contAssessmentMark = Double.parseDouble(userInput);

        Double assWeight = .60;
        Double semWeight = .20;
        Double contWeight = .20; 
        Double calcDP;
        
        calcDP = (assignmentMark *assWeight) + (semesterTestMark*semWeight) + (contAssessmentMark*contWeight);
        System.out.printf("Dear student you have attained: \n Assignment:\t%3.2f\n Semester Test:\t%3.2f\n Continuous Assessment:\t%3.2f\n Your DP is calculated as:\t%3.2f\n", assignmentMark, semesterTestMark, contAssessmentMark, calcDP);
   
        Double result = calcDP;
        boolean canWrite = true;
        String pass = "";
        if (result < 40.0) {  
            canWrite = false;
            System.out.printf("Did you make Due Performance: %B\n", canWrite);
            }
        System.out.printf("Did you make Due Performance: %B\n", canWrite);
        }
    
}
