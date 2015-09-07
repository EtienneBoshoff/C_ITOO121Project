//Stephan Malan DV2015-0073
package za.ac.pearson.cti.studentdpcalculator;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //Welcomes user and retrieves information
        /*
        System.out.println("Welcome to DP Calculator: ");
        System.out.print("What is your name: ");
        Scanner keyboardInput = new Scanner(System.in);
        String name = keyboardInput.nextLine();
        System.out.println("Greetings "+ name);
        System.out.print("Please enter your subject: ");
        String subject = keyboardInput.nextLine();
        System.out.print("Please enter your DV number: ");
        String dvNum = keyboardInput.nextLine();
        System.out.print("Please enter the weight of the Assignment: ");
        Double assignmentMarkWeight = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter the percentage you received for your Assignment: ");
        Double assignmentMark = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter the weight of the Semester test: ");
        Double semesterTestWeight = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter the percentage you received for your Semester Test: ");
        Double semesterTest = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter the weight of the Continuous assessment mark: ");
        Double continuousAssessmentWeight = Double.parseDouble(keyboardInput.nextLine());
        System.out.print("Please enter the percentage you received for your Continious Assessment: ");
        Double continiousAssessment = Double.parseDouble(keyboardInput.nextLine());
        
        //Declares object and displays results
        DPcalc dp = new DPcalc(assignmentMark, semesterTest, continiousAssessment, name, dvNum, subject, assignmentMarkWeight, semesterTestWeight, continuousAssessmentWeight);
        System.out.println(dp.prettyPrintDPreport());
        System.out.println("");
        System.out.println(dp.prettyFullPrint());
        System.out.println("");
        System.out.println(dp.verifyDVnum());
                */
        DPCalcGUIFrame.main(null);
    }
}
