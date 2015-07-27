/*
 *Paul Treurnicht 
 *DV2012-0003
 *Windows 8.1
 *2015/07/23
 */
package za.ac.pearson.cti.studentdpcalculator;

import java.util.Scanner;

public class Main {
    

    // @param args These are extra arguments to start your program.
    public static void main(String[] args) {  
        
        //Welcomes the user to the program
        System.out.println("Welcome to DP Calculator: ");
        //Prints a blank line
        System.out.println("");
        
        //Asks the user whats his/her name
        System.out.print("What is your name: ");
        // This makes an object for the keyboard
        Scanner keyboardInput = new Scanner(System.in);
        //Create userInput variable
        String userInput;
        // Assign keyboard input to variable name
        String name = keyboardInput.nextLine();
        //Print blank line
        System.out.println("");
        
        //Asks user for DV number
        System.out.print("Enter your DV number: ");
        //Assign keyboard input to variable dvNum
        String dvNum = keyboardInput.nextLine();
        //Prints a blank line
        System.out.println("");
        
        //Asks user to enter subject name
        System.out.print("Enter your subject name: ");
        //Assign keyboard input to variable subject
        String subject = keyboardInput.nextLine();
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input assignment weight
        System.out.print("Enter your assignment weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightAss variable
        Double weightAss = Double.parseDouble(userInput);
        //Makes value liable to multiply
        weightAss = weightAss / 100;
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input semester test weight
        System.out.print("Enter your semester test weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightSem variable
        Double weightSem = Double.parseDouble(userInput);
        //Makes value liable to multiply
        weightSem = weightSem / 100;
        //Prints a blank line
        System.out.println("");
        
        //Asks user to inpput continuous assessment weight
        System.out.print("Enter your continuous assessment weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightCont variable
        Double weightCont = Double.parseDouble(userInput);
        //Makes value liable to multiply
        weightCont = weightCont / 100;
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input assignment mark
        System.out.print("Please enter the percentage you received for your Assignment: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the assignmentMark variable
        Double assignmentMark = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks the user to input semester test mark
        System.out.print("Please enter the percentage you received for your Semester Test: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the semesterTestMark variable
        Double semesterTestMark = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks the user to enter continuous assessment mark
        System.out.print("Please enter the percentage you received for continuous assessment: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the continuousAssMark variable
        Double continuousAssMark = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Calls the DPcalc constructor from the DPcalc Class
        DPcalc dPcalc = new DPcalc(assignmentMark, semesterTestMark, continuousAssMark);
        
        //Sets keyboardInput value to variable
        dPcalc.setName(name);
        dPcalc.setDvNum(dvNum);
        dPcalc.setSubject(subject);
        dPcalc.setWeightAss(weightAss);
        dPcalc.setWeightSem(weightSem);
        dPcalc.setWeightCont(weightCont);
        
        //Prints blank line
        System.out.println("");
        //Prints prettyPrintDPreport
        System.out.print(dPcalc.prettyPrintDPreport());
    }
    
}
