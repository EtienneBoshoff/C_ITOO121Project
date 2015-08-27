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
 * @author Barend Van Der Berg DV2015-0020
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
        
        String userDV = "";
        //Bonus credit part
        /**
         * Write a check here to see if the following conditions are met
         * 1. There has to be 3 inputs given with the command line
         * they are: The assignmentMark, semesterTestMark, contAssessmentMark
         */
        //End of bonus credit part
        
        //This part asks the user for his name and marks while welcoming him to the program
        System.out.println("Welcome to DP Calculator: ");
        System.out.print("What is your name: ");
        // This makes an object for the keyboard
        Scanner keyboardInput = new Scanner(System.in);
        // Then we assign what we receive from the keyboard to a variable userInput
        String userInput = keyboardInput.nextLine();
        // Now we greet the user by name
        System.out.println("Greetings "+ userInput);
        
        //Here you get the users DV number
        System.out.print("Please enter yout dv number: ");
        userDV = keyboardInput.nextLine();
        
        
        //Here you get your assignment mark
        System.out.print("Please enter the percentage you received for your Assignment: ");
        userInput = keyboardInput.nextLine();
        Double assignmentMark = Double.parseDouble(userInput);
       
        //Here you get semester test mark
        System.out.print("Please enter the percentage you received for your Semester test: ");
        userInput = keyboardInput.nextLine();
        Double semTestMark = Double.parseDouble(userInput);
        
        //Here you get continuous assesment mark
        System.out.print("Please enter the percentage you received for your Continual assessment: ");
        userInput = keyboardInput.nextLine();
        Double contAssMark = Double.parseDouble(userInput);
        
        DPcalc calc = new DPcalc (assignmentMark,semTestMark,contAssMark);
        System.out.println (calc.prettyPrintDPreport());
        
        //This method deterrmines wheter the DV that has been inputted is valid
        if (calc.verifyDVnum())
        {
            //message if DV valid
            System.out.println("This DV number is valid");
        }
        else
        {
            //message if DV not valid
            System.out.println("That DV number is not valid");
        }
        
        //This method determines wheter the user can write exams or not
        if (calc.canWriteExams())
        {
            //message if allowe to write
            System.out.println("You are allowed to write exams, Congradulations!");
        }
        else
                {
                    //message if not allowed to write
                    System.out.println("You are not allowed to write exams.");          
                }
        
        
    }
    
}
