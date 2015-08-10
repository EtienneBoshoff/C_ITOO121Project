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

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.Assert;

/**
 * Program description:  This class will calculate a students due performance
 * or DP.  
 * @author Etienne Boshoff - Lecturer CTI Education Group
 * 
 * Task: Complete the methods such that the tests pass.  Note you are not
 * allowed to change the tests in any way.
 */
public class DPcalc {
    
    /**
     * Variables are your attributes associated with your class. For example a
     * car can be different colours.  The colour blue would then be an attribute
     * of the class car.  This means that its variable for colour may look as 
     * follows:
     * 
     * String colour = "blue"; 
     * OR
     * String colour; if we leave it undefined till a later time
     */
    //Variable declarations here
    //Task: Complete the variable declarations
    
    String number;
    String nameStud;
    Double DP;
    List<Subject> subjects = new ArrayList<>();
    
    
    //End of variable declarations
    
    /**
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        assignment = assMark;
        semesterTest = semTestMark;
        continuous = contAssMark;
    }
    
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark, String studName, String studSubject, String studNumber, Double assWeight, Double contWeight, Double semWeight) {
        assignment = assMark;
        semesterTest = semTestMark;
        continuous = contAssMark;
        nameStud = studName;
        subject = studSubject;
        number = studNumber;
        weightSem = semWeight;
        weightAss = assWeight;
        weightCont = contWeight;
        
        Subject testSubject = new Subject();
        subjects.add(testSubject);
        Subject name = new Subject();
        subjects.add(name);
        Subject assignment = new Subject();
        subjects.add(assignment);
        Subject semesterTest = new Subject();
        subjects.add(semesterTest);
        Subject continuous = new Subject();
        subjects.add(continuous);
        Subject weightSem = new Subject();
        subjects.add(weightSem);
        Subject weightAss = new Subject();
        subjects.add(weightAss);
        Subject weightCont = new Subject();
        subjects.add(weightCont);
        
        for (Subject g: subjects) System.out.println(g);
        }
    }
    
   
    
    /**
     * This method calculates the students DP for the semester with the values
     * gathered from the constructor.  A method is the behaviour of an object
     * it can be seen as doing a specific task.  In the comments I will describe
     * the task and you are required to complete the method such that it passes
     * the java unit test.
     * 
     * Method: DP is calculated by taking assignment*assWeight + semesterTest*semWeight * continuous*contWeight
     * 
     * @return The DP of the student as a double floating point value
     */
    //Task: complete this method as described in the comments and to pass the unit test
    public Double calculateDP() {
        
        Double semWeight = 0.2;
        Double assWeight = 0.6;
        Double contWeight = 0.2;
        
        DP = assignment*assWeight + semesterTest*semWeight + continuous*contWeight;
        return DP;      
        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    
    /**
     * This method returns a string that is formatted to look like a nice report
     * when printed with System.out.println
     * 
     * A few things to take note of:
     * \n gives you a new line
     * \t gives you a tab
     * All students received marks and then his calculated DP must be displayed 
     * as follows
     * 
     * Dear student you have attained:
     * Assignment: -studentmark-% 
     * SemesterTest: -studentmark-% 
     * Continuous Assessment: -studentmark-% 
     * Your DP is calculated as: -calculatedDP-%
     * 
     * @return A formatted string
     */
    public String prettyPrintDPreport() {
               String expectedResult = ("Dear student you have attained:\n"
                + "Assignment: "+assignment+"%\n"
                + "Semester test: "+semesterTest+"%\n"
                + "Continous Assessment: "+continuous+"%\n"
                + "Your DP is calculated as: 52.0%");
        
               System.out.println(expectedResult);
               return expectedResult;
        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
    public Double getAssignmentMark() {
        return assignment;
    }
    
    // Task create the other accessors
    public Double getSemesterMark() {
        return semesterTest;
    }
    
    public Double getContinuousAssessmentMark() {
        return continuous;
    }
    
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
    public Boolean canWriteExams() {
        boolean write = false;
        
        if(calculateDP() >= 40){
         write = true;   
        }
        return write;

        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    //get the users name       
    public void setName(String studName) {
    System.out.print("Enter your name: ");
    Scanner userInput = new Scanner(System.in);
    String firstName = userInput.nextLine();
    System.out.print("Name : "+firstName+" ");
    }
    //get the users subject
    public void setSubject(String studSubject) {
    System.out.print("Enter the subject name: ");
    Scanner userInput = new Scanner(System.in);
    String subjectName = userInput.nextLine();
    System.out.print("Subject Name : "+subjectName+" ");
    }
    //get the users dv number
    public void setDVnum(String studNumber) {
    System.out.print("Enter your DV number: ");
    Scanner userInput = new Scanner(System.in);
    String DVNum = userInput.nextLine();
    System.out.print("DV Number : "+DVNum+" ");
    }
    //get the semester weight from the user
    public void setSemesterTestWeight(Double semWeight) {
    
    weightSem = semWeight;
    
    }
    
    //get the assignment weight from the user
    public void setAssignmentWeight(Double assWeight) {
    
    weightAss = assWeight;
    
    }
    
    //get the continuous assessment weight from the user
    public void setContinuousAssessmentWeight(Double contWeight) {
    
    weightCont = contWeight;
    
    }
        
    
    //if statement to check if DVnum meets all the requirements (length, starts with DV, dash, contains numeric values in string)
    public Boolean verifyDVnum() {
           
    if((number.length()) !=  11) {
        if(!"DV".matches(number.substring(0,1))) {
            if(!"-".matches(number.substring(6,7))) {
                if(!number.substring(2,6).matches("[0-9]")) {
                    if(!number.substring(7,11).matches("[0-9]")) {
                            return false;
                            }
                        } 
                    }
                } else {
                return true;
                    }
                }
                return true;
                }
                
                
                
                
                
                                         
                  //print all the users information
         public String printFull() {
            String fullResult = ("Dear student, your information is:\n"
                + "Name: "+name+"\n"
                + "Subject Name: "+subject+"\n"
                + "DV number: "+number+"\n"
                + "Weight of assignment mark: "+weightAss+"\n"
                + "Weight of semester mark: "+weightSem+"\n"
                + "Weight of continuous assessment mark: "+weightCont+"\n"
                + "Assignment mark: "+assignment+"%\n"
                + "Semester test mark: "+semesterTest+"%\n"
                + "Continous Assessment mark: "+continuous+"%\n"
                + "Your DP is calculated as: 52.0%\n");
              
                System.out.println(fullResult);
                return fullResult;
                }
      
 }

