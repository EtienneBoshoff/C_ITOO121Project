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
import static java.util.Collections.list;
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
    private final String studentName;
    private final String subject;
    private final String studentDVnumber;
    private double calcDP;
    private Subject aSubject;   
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
        studentName = "Default Student";
        subject = "Default Subject";
        studentDVnumber = "N/A";
    Subject aSubject = new Subject(subject, semesterTest, continuous, assignment, semesterTestWeight, continousAssessmentWeight, assignmentWeight);
        subjects.add(aSubject);
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
    public DPcalc(Double assignment, Double semesterTest, Double continuous, String studentName, String studentDVnumber, String subject, Double assignmentWeight, Double semesterTestWeight, Double continousAssessmentWeight) {
       this.assignment = assignment;
        this.semesterTest = semesterTest;
        this.continuous = continuous;
        this.assignmentWeight = assignmentWeight;
        this.semesterTestWeight = semesterTestWeight;
        this.continousAssessmentWeight = continousAssessmentWeight;
        this.studentName = studentName;  
        this.subject = subject;
        this.studentDVnumber = studentDVnumber;
        Subject aSubject = new Subject(subject, semesterTest, continuous, assignment, semesterTestWeight, continousAssessmentWeight, assignmentWeight);
        subjects.add(aSubject);
        
      
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
       calcDP= (getAssignmentMark()*subjects.get(0).getAssessmentWeight())
           + (getSemesterMark()*subjects.get(0).getSemesterTestWeight()) 
           + (getContinuousAssessmentMark()*subjects.get(0).getContinuousAssessmentWeight());
       System.out.print(subjects.get(0).getContinuousAssessmentMark());
        return calcDP;
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
              String studentPrintResult = "Dear student you have attained:\n"
                + "Assignment: "+subjects.get(0).getAssessmentMark()+"%\n"
                + "Semester test: "+subjects.get(0).getSemesterTestMark()+"%\n"
                + "Continous Assessment: "+subjects.get(0).getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: "+calculateDP()+"%";
        System.out.print(studentPrintResult);
              return studentPrintResult;
        
    }
    
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
   public void newList (Subject aSubject){
       subjects.add(aSubject);
               }
    
    
    public Double getAssignmentMark() {
        if (subjects.size() > 0) {
            return subjects.get(0).getAssessmentMark();
        }
        return 0.0;
    }
        
    // Task create the other accessors
        public Double getSemesterMark() {
          if (subjects.size() > 0) {
            return subjects.get(0).getSemesterTestMark();
    }
          return 0.0;
        }
    
    public Double getContinuousAssessmentMark() {
      if (subjects.size() > 0) {
            return subjects.get(0).getContinuousAssessmentMark();
    }
          return 0.0;    
    }
    
    public void setAssignmentWeight(Double assessmentWeight) {
            subjects.get(0).getAssessmentWeight();
    }
          
    
    
    public void setSemesterTestWeight(Double semesterTestWeight) {
       
            subjects.get(0).getSemesterTestWeight();
        
    }
    
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
            subjects.get(0).getContinuousAssessmentWeight();
    }
    
    public Double getSemesterTestMark(String subject){
        Double retSTM=subjects.get(0).getSemesterTestMark();
        for (int i = 0; i < subjects.size();i++) {
            if (subjects.get(i).getName().equalsIgnoreCase(subject)) {
                retSTM= subjects.get(i).getSemesterTestMark();
            }
         
        }
    return retSTM;
            
        }
    
      public Double getAssignmentMark(String subject){
        Double retAss=subjects.get(0).getAssessmentMark();
        for (int i = 0; i < subjects.size();i++) {
            if (subjects.get(i).getName().equalsIgnoreCase(subject)) {
                retAss= subjects.get(i).getAssessmentMark();
            }
         
        }
    return retAss;
            
        }
      public Double getContinuousAssessmentMark(String subject){
        Double retCont=subjects.get(0).getContinuousAssessmentMark();
        for (int i = 0; i < subjects.size();i++) {
            if (subjects.get(i).getName().equalsIgnoreCase(subject)) {
                retCont= subjects.get(i).getContinuousAssessmentMark();
            }
         
        }
    return retCont;
            
        }
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
     public Boolean canWriteExams() {
                Double write = calculateDP ();
        boolean canWrite=false;
         
       if (write >= 40.0) {
           canWrite=true;}
       return canWrite;
    }
    /**
     * This method checks if you have a valid DV student number
     * A student number must be in the following pattern
     * "DV[yearEnrolled]-[fourDigits]"
     * @return 
     */
  
    public Boolean verifyDVnum() {
      // two boolean varibles to distinguise between valid an invalid.
        boolean testInvalid= true;
         boolean testValid= false;
         //if to test invalid forms of dv number.
        if (studentDVnumber.length() != 11 || studentDVnumber.substring(6, 7).matches(".*[a-z1-9].*")|| 
                !studentDVnumber.contains("-")||studentDVnumber.substring(2,6).matches(".*[a-zA-z].*")||studentDVnumber.substring(7).matches(".*[a-zA-z].*")
                || studentDVnumber.substring(2,6).contains("-"))
           
        {
           
          testInvalid = false;
          return testInvalid;
          
          //if to test valid entry of a DV number.
        } else { if (studentDVnumber.startsWith("DV")){
                     if (studentDVnumber.substring(6,7).equals("-"))
                    if (studentDVnumber.substring(2,6).matches(".*[1-9].*")) 
                        if (studentDVnumber.substring(7).matches(".*[1-9].*"))
                       System.out.print(studentDVnumber.substring(0,2));
                        System.out.print(studentDVnumber.substring(2,6));
                        System.out.print(studentDVnumber.substring(6,7));
                        System.out.print(studentDVnumber.substring(7));
            
        }
      testValid = true;
      return testValid;  }
        
   
    }

    
    
    public String printFull(){
        String fullPrint= "Dear " +studentName +"\n"
        +"DV Number:" +studentDVnumber +"\n"
                + "Assignment: "+getAssignmentMark()+"%\n"
                + "Semester test: "+getSemesterMark()+"%\n"
                + "Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: "+calculateDP()+"%\n"
                + "For "+ subject;
        System.out.print(fullPrint);
            return fullPrint  ;
    }
    public void addSubject(Subject subject) {
    subjects.add(subject);
    
    }
    
}
