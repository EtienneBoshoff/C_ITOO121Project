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
        System.out.print("Enter your "+subject+" assignment weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightAss variable
        Double weightAss = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input semester test weight
        System.out.print("Enter your "+subject+" semester test weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightSem variable
        Double weightSem = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks user to inpput continuous assessment weight
        System.out.print("Enter your "+subject+" continuous assessment weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightCont variable
        Double weightCont = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input assignment mark
        System.out.print("Please enter the percentage you received for "+subject+" Assignment: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the assignmentMark variable
        Double assMark = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks the user to input semester test mark
        System.out.print("Please enter the percentage you received for "+subject+" Semester Test: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the semesterTestMark variable
        Double semTestMark = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks the user to enter continuous assessment mark
        System.out.print("Please enter the percentage you received for "+subject+" continuous assessment: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the continuousAssMark variable
        Double contAssMark = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        System.out.print("Enter your second subject name: ");
        //Assign keyboard input to variable subject
        String subject2 = keyboardInput.nextLine();
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input assignment weight
        System.out.print("Enter your "+subject2+" assignment weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightAss variable
        Double weightAss2 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input semester test weight
        System.out.print("Enter your "+subject2+" semester test weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightSem variable
        Double weightSem2 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks user to inpput continuous assessment weight
        System.out.print("Enter your "+subject2+" continuous assessment weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightCont variable
        Double weightCont2 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input assignment mark
        System.out.print("Please enter the percentage you received for "+subject2+" Assignment: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the assignmentMark variable
        Double assMark2 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks the user to input semester test mark
        System.out.print("Please enter the percentage you received for "+subject2+" Semester Test: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the semesterTestMark variable
        Double semTestMark2 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks the user to enter continuous assessment mark
        System.out.print("Please enter the percentage you received for "+subject2+" continuous assessment: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the continuousAssMark variable
        Double contAssMark2 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        System.out.print("Enter your third subject name: ");
        //Assign keyboard input to variable subject
        String subject3 = keyboardInput.nextLine();
        //Prints a blank line
        System.out.println("");

        //Asks user to input assignment weight
        System.out.print("Enter your "+subject3+" assignment weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightAss variable
        Double weightAss3 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks user to input semester test weight
        System.out.print("Enter your "+subject3+" semester test weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightSem variable
        Double weightSem3 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks user to inpput continuous assessment weight
        System.out.print("Enter your "+subject3+" continuous assessment weight: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the weightCont variable
        Double weightCont3 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        System.out.print("Please enter the percentage you received for "+subject3+" Assignment : ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the assignmentMark variable
        Double assMark3 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
                //Asks the user to input semester test mark
        System.out.print("Please enter the percentage you received for "+subject3+" Semester Test: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the semesterTestMark variable
        Double semTestMark3 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Asks the user to enter continuous assessment mark
        System.out.print("Please enter the percentage you received for "+subject3+" continuous assessment: ");
        //Re-assigns keyboard input to userInput variable
        userInput = keyboardInput.nextLine();
        //Saves the users input to the continuousAssMark variable
        Double contAssMark3 = Double.parseDouble(userInput);
        //Prints a blank line
        System.out.println("");
        
        //Calls the DPcalc constructor from the DPcalc Class
        DPcalc dPcalc = new DPcalc(assMark, assMark2, assMark3, semTestMark, semTestMark2, semTestMark3, contAssMark, contAssMark2, contAssMark3);
        
        //Sets keyboardInput value to variable
        dPcalc.setName(name);
        dPcalc.setDvNum(dvNum);
        dPcalc.setSubject(subject);
        dPcalc.setWeightAss(weightAss);
        dPcalc.setWeightSem(weightSem);
        dPcalc.setWeightCont(weightCont);
        dPcalc.setSubject2(subject2);
        dPcalc.setWeightAss2(weightAss2);
        dPcalc.setWeightSem2(weightSem2);
        dPcalc.setWeightCont2(weightCont2);
        dPcalc.setSubject3(subject3);
        dPcalc.setWeightAss3(weightAss3);
        dPcalc.setWeightSem3(weightSem3);
        dPcalc.setWeightCont3(weightCont3);
        //Prints blank line
        System.out.println("");
        //Prints prettyPrintDPreport
        System.out.print(dPcalc.printFull());
    }
    
}
