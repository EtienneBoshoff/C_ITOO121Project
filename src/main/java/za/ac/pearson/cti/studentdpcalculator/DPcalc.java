package za.ac.pearson.cti.studentdpcalculator;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Program description:  This class will calculate a students due performance
 * or DP.  
 * @author Pinto Manuel - Student
 * 
 * Task: Complete the methods such that the tests pass.  Note you are not
 * allowed to change the tests in any way.
 */
public class DPcalc {
    
 
    //Variable declarations here
    //Task: Complete the variable declarations
    private final Double assignment;
    private final Double semesterTest;
    private final Double continuous;
    private Double assignmentWeight;
    private Double semesterTestWeight;
    private Double continousAssessmentWeight;
    private final String studentName;
    private final String subjects;
    private final String DVnumber;
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
        subjects = "Default Subject";
        DVnumber = "N/A";
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
        this.studentName = studentName;
        this.subjects = subject;
        this.DVnumber = studentDVnumber;
    }
    
    
   
    //Task: complete this method as described in the comments and to pass the unit test
    public Double calculateDP() {
        Double my_answer;
        my_answer =(assignment * 0.6)+(semesterTest * 0.2)+(continuous*0.2);
        return my_answer;
    }
    
    
    public String prettyPrintDPreport() {
       String printer = "Dear student your Final result is:\n"
                + "Assignment: "+assignment+"%\n"
                + "Semester test: "+semesterTest+"%\n"
                + "Continous Assessment: "+continuous+"%\n"
                + "Your DP is calculated as: " + calculateDP() +"%";
         
         System.out.println(printer);
         return printer;
    }

    public Double getAssignmentMark() {
        return assignment;
    } 
    // Task create the other accessors
    public Double getSemesterMark() {
        return semesterTest;
    }
    
    public Double getSemesterTestMark(String subject) {
        return semesterTest;    
    }
    
    public Double getAssignmentMark(String subject) {
         return assignment;
    }
    
    public Double getContinuousAssessmentMark(String subject) {
       return continuous;
    }
    
    public Double getContinuousAssessmentMark() {
      return continuous;
    }
    
    public void setAssignmentWeight(Double assignmentWeight) {
         this.assignmentWeight = assignmentWeight;
    }
    
    public void setSemesterTestWeight(Double semesterTestWeight) {
        this.semesterTestWeight = semesterTestWeight;
    }
    
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
         this.continousAssessmentWeight = continousAssessmentWeight;
    }
    
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
    public Boolean canWriteExams() {
        Boolean  canWrite = false;
      
      if(calculateDP() >= 40){
        System.out.println("You may write exams: ");
        canWrite = true;
    }
      else if(calculateDP() <= 40){
          System.out.println("You do not qualify to write exams: ");
          canWrite = false;
      }
      
      return canWrite;
    }
    
    /**
     * This method checks if you have a valid DV student number
     * A student number must be in the following pattern
     * "DV[yearEnrolled]-[fourDigits]"
     * @return 
     */
    public Boolean verifyDVnum() {
        Boolean ver = false;
       
       if(DVnumber.length() <= 11){
           
           System.out.println("The DV-number is too short");
           return ver = false;
       }
       else if(DVnumber.substring(0, 2) != "DV"){
           System.out.println("The DV-number should start with DV");
           return ver = false;
       }
       else if(DVnumber.substring(6, 7) != "-") {
           System.out.println("The dash is missung or misplaced: ");
           return ver = false;
       }
       return ver;
    }

    public void addSubject(Subject subject) {
       
        List<Subject>  sub  = new ArrayList<>();
        
        sub.get(semesterTestWeight.intValue());
        
       // Subject S = new Subject (  sub, semesterTest, continousAssessmentWeight, assignment, semesterTestWeight, continousAssessmentWeight, assignmentWeight);
        
       // sub.add(S);
    }
}
