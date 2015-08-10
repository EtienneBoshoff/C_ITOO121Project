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

import java.util.ArrayList;
import java.util.List;

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
    private final Double assignment;
    private final Double semesterTest;
    private final Double continuous;
    private Double assignmentWeight;
    private Double semesterTestWeight;
    private Double continousAssessmentWeight;
    private String name;
    private String subject;
    private String dvNum;
    private List<Subject> subjects = new ArrayList<>();
    
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
        assignmentWeight = 0.6;
        semesterTestWeight = 0.2;
        continousAssessmentWeight = 0.2;
        name = "Default Student";
        subject = "Default Subject";
        dvNum = "N/A";
    }

    /**
     * This is the secondary constructor for DPcalc
     * @param assignment The assignment mark of the student in percentage
     * @param semesterTest The semester test mark of the student in percentage
     * @param continuous The continual assessment mark of the student in percentage
     * @param studentName The name of the student for whom we are calculating the DP
     * @param subject The subject the DP is calculated for
     * @param studentDVnumber The student's DV number
     * @param assignmentWeight The weight as a floating point percentage
     * @param semesterTestWeight The weight as a floating point percentage
     * @param continousAssessmentWeight The weight as a floating point percentage
     */
    public DPcalc(Double assignment, Double semesterTest, Double continuous, String studentName, String subject, String studentDVnumber, Double assignmentWeight, Double semesterTestWeight, Double continousAssessmentWeight) {
        
        this.assignment = assignment;
        this.semesterTest = semesterTest;
        this.continuous = continuous;
        this.assignmentWeight = assignmentWeight;
        this.semesterTestWeight = semesterTestWeight;
        this.continousAssessmentWeight = continousAssessmentWeight;
        this.name = studentName;
        this.subject = subject;
        this.dvNum = studentDVnumber;
    }
    /*
        semesterTest = semTestMark;
        continuous = contAssMark;
        subject = subName;
        name = studName;
        dvNum = studNum;
        weightSem = wSem;
        weightAss = wAss;
        weightCont = wCont;
    */
    
    
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
        
        double DP = (assignment*assignmentWeight)+(semesterTest*semesterTestWeight)+(continuous*continousAssessmentWeight);
        
        return DP;
    
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
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
    }
    public String prettyPrintDPreport() {
        String formatedString = "Dear student you have attained:\n"
        +"Assignment: "+getAssignmentMark()+"%\n"
        +"Semester test: "+getSemesterMark()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
        +"Your DP is calculated as: "+calculateDP()+"%";
        
        return formatedString;
    }
    public String printFull() {
        String fullString = "Dear "+name+" "+dvNum+" you have attained the following mark for "+subject+":\n"
        +"\n"
        +"Assignment: "+getAssignmentMark()+"%\n"
        +"Assignment weight: "+getAssignmentWeight()+"%\n"
        +"Semester test: "+getSemesterMark()+"%\n"
        +"Semester test weight: "+getSemesterTestWeight()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark()+"%\n"       
        +"Continous Assessment weight: "+getContinuousWeight()+"%\n"
        +"\n"
        +"Your DP for "+subject+" is: "+calculateDP()/100+"%\n"

        ;
        return fullString;
    }
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */


    public String getSubject() {
        return subject;
    }

    //Get attribute from object
    public Double getSemesterMark() {
        subjects.get(0).getSemesterTestMark();
        return semesterTest;
    }

    //Get attribute from object
    public Double getContinuousAssessmentMark() {
        subjects.get(0).getContinuousAssessmentMark();
        return continuous;
    }
    public Double getAssignmentMark() {
        subjects.get(0).getAssignmentMark();
        return assignment;
    }
    public Double getAssignmentWeight(){
          subjects.get(0).getAssignmentWeight();
        return assignmentWeight;
    }

    //Get attribute from object
    public Double getSemesterTestWeight(){
        subjects.get(0).getSemesterTestWeight();
        return semesterTestWeight;
    }

    
    //Get attribute from object
    public Double getContinuousWeight(){
        subjects.get(0).getContinuousAssessmentWeight();
        return continousAssessmentWeight;
    }

    //Sets the new name variable
    public void setName(String newName) {
        subjects.get(0).setName(newName);
        name = newName;
    }
    
    //Sets the new subject variable
    public void setSubject(String newSubject) { 
        subjects.get(0).setSubject(newSubject);
        subject = newSubject;
    }
    

    //Sets the new DVnum variable
    public void setdvNum(String newDV) {
        subjects.get(0).setdvNum(newDV);
        dvNum = newDV;
    }
    
    //Sets the semester weight
    public void setSemesterTestWeight(Double newSemWeight,String subject) {   
        subjects.get(0).setSemesterTestWeight(newSemWeight);
        semesterTestWeight = newSemWeight;
    }
    

    //Sets the assignment weight
    public void setAssignmentWeight(Double newAssWeight) {
        subjects.get(0).setAssignmentWeight(newAssWeight);
        assignmentWeight = newAssWeight;
    }
    

    //Sets the continuous weight
    public void setContinuousAssessmentWeight(Double newContWeight) {  
        subjects.get(0).getContinuousAssessmentMark();
        continousAssessmentWeight = newContWeight;
    }

    //Checks if student can write exams
    public Boolean canWriteExams() {
        return calculateDP()>= 40;
    }

    public Boolean verifyDVnum() {


        if(dvNum.length() != 11){
            return false;
        }else{
            if (dvNum.substring(0,2) == "DV"){
                if(dvNum.substring(2,4) == ("([0-9][0-9][0-9][0-9])")){
                    if(dvNum.substring(6, 1) == "-"){
                        if(dvNum.substring(7,4) == ("([0-9][0-9][0-9][0-9]")){
                    }
                }
            }                
        }
        return true;
        }

    }   
}
    
    /**
     * This method checks if you have a valid DV student number
     * A student number must be in the following pattern
     * "DV[yearEnrolled]-[fourDigits]"
     * @return 
     */

