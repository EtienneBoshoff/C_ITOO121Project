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

import java.io.IOException;

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
        try {
            new DPcalcGUIframe().setVisible(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
