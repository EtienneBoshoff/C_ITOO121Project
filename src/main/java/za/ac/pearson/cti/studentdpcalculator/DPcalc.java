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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private String studentName;
    private String studentDVnumber;
    private ArrayList <Subject> subjects = new ArrayList<>();
    
    /**
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        Subject aSubject  = new Subject("Default Subject", semTestMark,contAssMark,assMark, 0.2, 0.2, 0.6);
        studentName = "Default Student";
        studentDVnumber = "N/A";
        this.subjects.add(aSubject);
        //String name, Double semesterTestMark, Double continuousAssessmentMark, Double assignmentMark, Double semesterTestWeight, Double continuousAssessmentWeight, Double assessmentWeight
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
     * @param continuousAssessmentWeight The weight as a floating point percentage
     */
    public DPcalc(Double assignment, Double semesterTest, Double continuous, String studentName, String studentDVnumber, String subject, Double assignmentWeight, Double semesterTestWeight, Double continuousAssessmentWeight) {
        Subject aSubject  = new Subject(subject,semesterTest,continuous, assignment,semesterTestWeight,continuousAssessmentWeight, assignmentWeight);
        this.studentName = studentName;
        this.studentDVnumber = studentDVnumber;
        this.subjects.add(aSubject);
        //String name, Double semesterTestMark, Double continuousAssessmentMark, Double assignmentMark, Double semesterTestWeight, Double continuousAssessmentWeight, Double assessmentWeight
 
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
        return (getAssignmentMark()*getAssignmentWeight()) + (getSemesterMark()*getSemesterTestWeight()) + (getContinuousAssessmentMark()*getContinuousAssessmentWeight());
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
       String output = "Dear student you have attained:\n"
            + "Assignment: "+getAssignmentMark()+"%\n"
            + "Semester test: "+getSemesterMark()+"%\n"
            + "Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
            + "Your DP is calculated as: "+calculateDP()+"%";
        return output;
    }
    
    public String prettyFullPrint() {
        String output = "Dear user this is Pretty Ful Print";
        return output;
    }
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
    public Double getAssignmentMark() {
        return subjects.get(0).getAssignmentMark();
    }
    
    // Task create the other accessors
     public Double getSemesterMark() {
        return subjects.get(0).getSemesterTestMark();
    }
    
    public Double getAssignmentWeight() {
        return subjects.get(0).getAssignmentWeight();
    }
    
    public Double getContinuousAssessmentWeight() {
        return subjects.get(0).getContinuousAssessmentWeight();
    }
    public Double getSemesterTestWeight() {
        return subjects.get(0).getSemesterTestWeight();
    } 
    public Double getContinuousAssessmentMark() {
        return subjects.get(0).getContinuousAssessmentMark();
    }
    
    public void setAssignmentWeight(Double assignmentWeight) {
        Subject s = subjects.get(0);
        s.setAssignmentWeight(assignmentWeight);
        subjects.set(0, s);
    }
    
    public void setSemesterTestWeight(Double semesterTestWeight) {
        Subject s = subjects.get(0);
        s.setSemesterTestWeight(semesterTestWeight);
        subjects.set(0, s);
    }
    
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        Subject s = subjects.get(0);
        s.setContinuousAssessmentWeight(continuousAssessmentWeight);
        subjects.set(0, s);
    }
    
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
 public Boolean canWriteExams() {
        return calculateDP()>=40.0;
    }
 
    /**
     * This method checks if you have a valid DV student number
     * A student number must be in the following pattern
     * "DV[yearEnrolled]-[fourDigits]"
     * @return 
     */
    public Boolean verifyDVnum() {
        if (studentDVnumber.length() == 11){
        Pattern p = Pattern.compile("[Dd]{1}[Vv]{1}[0-9]{4}[\\-]{1}[0-9]{4}");
        Matcher m = p.matcher(studentDVnumber);
            return m.find();
        }
        return false;
        
        

            
        /**return pass == TRUE;
        
        Pattern p = Pattern.compile("[D]{1}[V]{1}[yearEnrolled]{4}[\\-]{1}[fourDigits]{4}");
        Matcher m = p.matcher(studentDVnumber);
        boolean pass = m.find();
        
        if (studentDVnumber.length() == 11 && pass == true){
            return pass;
        }
        else if(studentDVnumber.length() < 11 || studentDVnumber.length() > 11)
        {
            pass = false;
            return pass;
        }
       */     
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    } 
    
    private Integer GetTheHoesSubject(String subject) {
        /**for (int i = 0; i < subjects.size(); i++) {
            if (this.subjects.get(i).getName().equalsIgnoreCase(subject)) {
                return i;    
            }
   
        }
        */
        Integer index = 0;
        for (Subject s:this.subjects) {
            if(s.getName().equalsIgnoreCase(subject)){
                return index;
            }
            index++;
        }
        return -1;
    }
    
    public Double getAssignmentMark(String subject) {
        return subjects.get(GetTheHoesSubject(subject)).getAssignmentMark();
    }
    
    public Double getSemesterTestMark(String subject) {
        return subjects.get(GetTheHoesSubject(subject)).getSemesterTestMark();
    }
    
    public Double getContinuousAssessmentMark(String subject) {
        return subjects.get(GetTheHoesSubject(subject)).getContinuousAssessmentMark();
    }
    
    public Double getAssignmentWeight(String subject) {
    return subjects.get(GetTheHoesSubject(subject)).getAssignmentWeight();
    }
        
    public Double getSemesterTestWeight(String subject) {
    return subjects.get(GetTheHoesSubject(subject)).getSemesterTestWeight();
    }
    
    public Double getContinuousAssessmentWeight(String subject) {
    return subjects.get(GetTheHoesSubject(subject)).getContinuousAssessmentWeight();
    }
    
    public void setAssignmentWeight(Double assignmentWeight, String subject) {
        Integer index = GetTheHoesSubject(subject);
        Subject s = subjects.get(index);
        s.setAssignmentWeight(assignmentWeight);
        subjects.set(index, s);
    }
        
    public void setSemesterTestWeight(Double semesterTestWeight, String subject) {
        Integer index = GetTheHoesSubject(subject); 
        Subject s = subjects.get(index);
        s.setSemesterTestWeight(semesterTestWeight);
        subjects.set(index, s);
    }
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight, String subject) {
        Integer index = GetTheHoesSubject(subject);   
        Subject s = subjects.get(index);
        s.setContinuousAssessmentWeight(continuousAssessmentWeight);
        subjects.set(index, s);
    }
    
}
