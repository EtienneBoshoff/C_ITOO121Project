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
import javax.swing.JOptionPane;



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
    private List<Subject> subject = new ArrayList<>(); 
    private final String studName;
    private final String dvNum;
    //End of variable declarations
    
    /**
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        this.subject.add(new Subject("DP", semTestMark, contAssMark, assMark, 0.2, 0.2, 0.6));
        studName = "Default Student";
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
        this.subject.add(new Subject(subject, semesterTest, continuous, assignment, semesterTestWeight, continousAssessmentWeight, assignmentWeight));
        this.studName = studentName;
        this.dvNum = studentDVnumber;
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
                double dp = (getAssignmentMark() * 0.6) + (getContinuousAssessmentMark() * 0.2) + (getSemesterMark() * 0.2);
        return dp;
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
                String print = "Dear student you have attained:\n"
                        + "Assignment: " + getAssignmentMark() + "%\n"
                        + "Semester test: " + getSemesterMark() + "%\n"
                        + "Continous Assessment: " + getContinuousAssessmentMark() + "%\n"
                        + "Your DP is calculated as: " + calculateDP() + "%";
        System.out.println(print);
        
        return print;
    }
    
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
        private Integer getSubject(String get){
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getName().equalsIgnoreCase(get))
            {
                return i++;
            }
        }    
        return -10;
}
    
    public Double getAssignmentMark() {
        return subject.get(0).getAssessmentMark();
    }
    
    // Task create the other accessors
public Double getSemesterMark() {
        return subject.get(0).getSemesterTestMark();
    }
    
    public Double getAssignmentWeight(){
        return this.subject.get(0).getAssessmentWeight();
    }
    
    public Double getSemesterTestWeight(){
        return this.subject.get(0).getSemesterTestWeight();
    }
    
    public Double getContinuousAssessmentWeight(){
        return this.subject.get(0).getContinuousAssessmentWeight();
    }
    
    public Double getSemesterTestMark(String subject) {
        return this.subject.get(getSubject(subject)).getSemesterTestMark();
    }
    
    public Double getAssignmentMark(String subject) {
        return this.subject.get(getSubject(subject)).getAssessmentMark();
    }
    
    public Double getContinuousAssessmentMark(String subject) {
        return this.subject.get(getSubject(subject)).getContinuousAssessmentMark();
    }
    
    public Double getContinuousAssessmentMark() {
       return subject.get(0).getContinuousAssessmentMark();
    }
    
    public void setAssignmentWeight(Double assignmentWeight) {
       Subject sub = subject.get(0);
       sub.setAssessmentWeight(assignmentWeight);
       subject.set(0, sub);
    }
    
    public void setSemesterTestWeight(Double semesterTestWeight) {
        Subject sub = subject.get(0);
        sub.setSemesterTestWeight(semesterTestWeight);
        subject.set(0,sub);
    }
    
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        Subject sub = subject.get(0);
        sub.setContinuousAssessmentWeight(continuousAssessmentWeight);
        subject.set(0,sub);
    }
    
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
    public Boolean canWriteExams() {
        boolean b = false;
        if(calculateDP() >= 40 && calculateDP() <= 100)
            {
                b = true;
                //System.out.println("You qualify to  the exam.");  
            }else
            {
                b = false;
                //System.out.println("You do not qualify to write");  
            }
        return b;
    }
    
    /**
     * This method checks if you have a valid DV student number
     * A student number must be in the following pattern
     * "DV[yearEnrolled]-[fourDigits]"
     * @return 
     */
    public Boolean verifyDVnum() {
        
        String d = dvNum.substring(0, 1).toUpperCase();
        String v = dvNum.substring(0, 1).toUpperCase();
          //System.out.println(x);
        char dash = (dvNum.substring(6, 7)).charAt(0); //-
          //System.out.println(y);
        String year = dvNum.substring(2, 6); //1999/2014
          //System.out.println(a);
        
       String lastDigits = studName.substring(7);
       
       if(studName.length() == 11)
       {
           if(d.equals("D"))
           {
               if(v.equals("V"))
               {
                   if(dash == '-')
                   {
                       if(year.matches("^\\d+$"))
                       {
                           if(lastDigits.matches("^\\d+$"))
                           {
                               return true;
                           }
                       }
                   }
               }
           }
       }
        return false;
    }

    public void addSubject(Subject subject)
    {
         this.subject.add(subject);
    }
    

}
