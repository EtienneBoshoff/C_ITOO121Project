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
import java.util.Calendar;
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
     * car can be different colors.  The color blue would then be an attribute
     * of the class car.  This means that its variable for color may look as 
     * follows:
     * 
     * String color = "blue"; 
     * OR
     * String color; if we leave it undefined till a later time
     */
    //Variable declarations here
    //Task: Complete the variable declarations
    private String nameOfStudent;
    private String dvNumber;
    private ArrayList<Subject> subject = new ArrayList<>();
    //End of variable declarations
    
    /**
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param conAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double conAssMark) {
        this.subject.add(new Subject("general dp", assMark, semTestMark, conAssMark, 0.6, 0.2, 0.2));
        /*Hard coding of default Weights*/
        this.nameOfStudent = "Student";
        this.dvNumber = "DV2015-0000";
    }
    /**
     * This is the second constructor for DPcalc.
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param conAssMark The continual assessment mark of the student in percentage
     * @param nameOfStudent The name of the student
     * @param dvNumber The DV number of the student
     * @param subject The subject which you need to calculate the dp for it
     * @param assWeight The weight which the assignment counts
     * @param semWeight The weight which the semester test counts
     * @param conWeight The weight which the continuous assessment counts
     */
    public DPcalc(Double assMark, Double semTestMark, Double conAssMark, String nameOfStudent, String dvNumber, String subject, Double assWeight, Double semWeight, Double conWeight) {
        this.subject.add(new Subject(subject, assMark, semTestMark, conAssMark, assWeight, semWeight, conWeight));
        this.nameOfStudent = nameOfStudent;
        this.dvNumber = dvNumber;
    }
    
    /**
     * This method calculates the students DP for the semester with the values
     * gathered from the constructor.  A method is the behavior of an object
     * it can be seen as doing a specific task.  In the comments I will describe
     * the task and you are required to complete the method such that it passes
     * the java unit test.
     * 
     * Method: DP is calculated by taking assignment*assWeight + semesterTest*semWeight + continuous*contWeight
     * 
     * @return The DP of the student as a double floating point value
     */
    //Task: complete this method as described in the comments and to pass the unit test
    public Double calculateDP() {
        
        return getAssignmentMark()*getAssignmentWeight() + 
                getSemesterMark()*getSemesterTestWeight() + 
                getContinuousAssessmentMark()*getContinuousAssessmentWeight();
    }
    //calculates the dp for a set subject
    public Double calculateDP(String subject) {
        
        return getAssignmentMark(subject)*getAssignmentWeight(subject) +
                getSemesterTestMark(subject)*getSemesterTestWeight(subject) +
                getContinuousAssessmentMark(subject)*getContinuousAssessmentWeight(subject);
    }
    
    
    public void addSubject(Subject subject) {
        this.subject.add(subject);
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
        return "Dear student you have attained:\n"
                + "Assignment: " + getAssignmentMark() + "%\n"
                + "Semester test: " + getSemesterMark() + "%\n"
                + "Continous Assessment: " + getContinuousAssessmentMark() + "%\n"
                + "Your DP is calculated as: " + calculateDP() + "%";
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
     * @param subject
     * @return A formatted string
     */
    public String prettyFullPrint(String subject) {
        
        //this sets the message so a user can know whether or not he/she may write exams
        String examsMessage;
        if (canWriteExams()){
            examsMessage = "Good news, You are allowed to write the exams.";
        } else {
            examsMessage = "Unfortunatly, you may not write exams this semester.";
        }
        //returns the formatted string
        return "Dear " + nameOfStudent + " (" + dvNumber + ") you have attained:\n"
                + "Assignment: " + getAssignmentMark(subject) + "%\n"
                + "Semester test: " + getSemesterTestMark(subject) + "%\n"
                + "Continous Assessment: " + getContinuousAssessmentMark(subject) + "%\n"
                + "For " + subject + "\n"
                + "Your DP is calculated as: " + calculateDP() + "%\n"
                + examsMessage;
    }
    
    /**
     * This method is known as an setter.  It allows you to 
     * set an attribute from an object.  In this case the Assignment Weight 
     * within the calculator
     * @param dvNum
     */
    
    public void setDVNum(String dvNum){
        this.dvNumber = dvNum;
    }
    
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
    public Boolean canWriteExams() {
        return calculateDP() >= 40.0;
    }
    
    /**
     * This method checks if you have entered a valid DV number
     * e.g. DV2015-0048
     * DV number starts with DV
     * 4 numbers follow which indicates the year the user first enrolled for
     * dash separate the 8 numbers
     * 4 numbers indicating the amount of students and how manyth you were registered
     * @return True if it is a valid DV number else will return false
     */
    public Boolean verifyDVnum() {
        Boolean validDV = false;
        if (dvNumber.length() == 11){
            Pattern p = Pattern.compile("[Dd]{1}[Vv]{1}[0-9]{4}[\\-]{1}[0-9]{4}");
            Matcher m = p.matcher(dvNumber);
            if (m.find()){
                Integer yearDV = Integer.parseInt(dvNumber.substring(2, 6));
                Integer yearCur = Calendar.getInstance().get(Calendar.YEAR);
                if (yearDV <= yearCur && yearDV >= 1980){
                    validDV = true;
                }
            }
        }
        return validDV;
    }
    
    
    //Getters for Storage Class
    public Double getAssignmentMark() {
        return subject.get(0).getAssignmentMark();
    }
    public Double getSemesterMark() {
        return subject.get(0).getSemesterTestMark();
    }
    public Double getContinuousAssessmentMark() {
        return subject.get(0).getContinuousAssessmentMark();
    }
    public Double getAssignmentWeight() {
        return subject.get(0).getAssignmentWeight();
    }
    public Double getSemesterTestWeight() {
        return subject.get(0).getSemesterTestWeight();
    }
    public Double getContinuousAssessmentWeight() {
        return subject.get(0).getContinuousAssessmentWeight();
    }
    
    //Setters for Storage Class
    public void setAssignmentMark(Double assignmentMark) {
        subject.get(0).setAssignmentMark(assignmentMark);
    }
    public void setSemesterTestMark(Double semesterTestMark) {
        subject.get(0).setSemesterTestMark(semesterTestMark);
    }
    public void setContinuousAssessmentMark(Double continuousAssessmentMark) {
        subject.get(0).setContinuousAssessmentMark(continuousAssessmentMark);
    }
    public void setAssignmentWeight(Double assignmentWeight) {
        subject.get(0).setAssignmentWeight(assignmentWeight);
    }
    public void setSemesterTestWeight(Double semesterTestWeight) {
       subject.get(0).setSemesterTestWeight(semesterTestWeight);
    }
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        subject.get(0).getSemesterTestWeight();
    }
    
    //Creates an array with all the subjects in the list
    public String[] getAllSubjects(){
        String[] a = new String[subject.size()];
        for(int i = 0; i < this.subject.size(); i++){
            a[i] = this.subject.get(i).getSubjectName();
        }
        return a;
    }
    //Steps through list to find the storage values for subject
    private Integer stepThroughList(String subject){
        for (int i = 0; i < this.subject.size(); i++) {
            if(this.subject.get(i).getSubjectName().equalsIgnoreCase(subject)){
                return i;
            }
        }
        return -1;
    }
    
    //Getters for specific item in Storage Class
    public Double getAssignmentMark(String subject) {
        return this.subject.get(stepThroughList(subject)).getAssignmentMark();
    }
    public Double getSemesterTestMark(String subject) {
        return this.subject.get(stepThroughList(subject)).getSemesterTestMark();
    }
    public Double getContinuousAssessmentMark(String subject) {
        return this.subject.get(stepThroughList(subject)).getContinuousAssessmentMark();
    }
    public Double getAssignmentWeight(String subject) {
        return this.subject.get(stepThroughList(subject)).getAssignmentWeight();
    }
    public Double getSemesterTestWeight(String subject) {
        return this.subject.get(stepThroughList(subject)).getSemesterTestWeight();
    }
    public Double getContinuousAssessmentWeight(String subject) {
        return this.subject.get(stepThroughList(subject)).getContinuousAssessmentWeight();
    }

    //Setters for specific item in Storage Class
    public void setAssignmentMark(Double assignmentMark, String subject) {
        this.subject.get(stepThroughList(subject)).setAssignmentMark(assignmentMark);
    }
    public void setSemesterTestMark(Double semesterTestMark, String subject) {
        this.subject.get(stepThroughList(subject)).setSemesterTestMark(semesterTestMark);
    }
    public void setContinuousAssessmentMark(Double continuousAssessmentMark, String subject) {
        this.subject.get(stepThroughList(subject)).setContinuousAssessmentMark(continuousAssessmentMark);
    }
    public void setAssignmentWeight(Double assignmentWeight, String subject) {
        this.subject.get(stepThroughList(subject)).setAssignmentWeight(assignmentWeight);
    }
    public void setSemesterTestWeight(Double semesterTestWeight, String subject) {
        this.subject.get(stepThroughList(subject)).setSemesterTestWeight(semesterTestWeight);
    }
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight, String subject) {
        this.subject.get(stepThroughList(subject)).setContinuousAssessmentWeight(continuousAssessmentWeight);
    }
}
