/*
 * This is the starting program for CTI students in Object Orientated 
 * Programming.  To run this program click on the Run button in the toolbar
 * above (The one that looks like a play button).  In each class you will find
 * instructions on what needs to be done to complete this homework assignment
 * 
 */
package za.ac.pearson.cti.studentdpcalculator;

import java.util.ArrayList;
/**
 * Program description:  This class will calculate a students due performance
 * or DP.  
 * @author Etienne Boshoff - Lecturer CTI Education Group
 */
public class DPcalc {
    
    private String nameOfStudent;
    private String dvNumber;
    private ArrayList<Subject> subjects = new ArrayList<>();
    //Declaration of Variables
    
    
    
    
    public DPcalc(Double assMark, Double semTestMark, Double conAssMark) {
        this.subjects.add(new Subject("general dp", assMark, semTestMark, conAssMark, 0.6, 0.2, 0.2));
        this.nameOfStudent = "Student";
        this.dvNumber = "DV2015-0000";
    }
    //Constructor 1
    
    
    
    
    
    public DPcalc(Double assMark, Double semTestMark, Double conAssMark, String nameOfStudent, String dvNumber, String subject, Double assWeight, Double semWeight, Double conWeight) {
        this.subjects.add(new Subject(subject, assMark, semTestMark, conAssMark, assWeight, semWeight, conWeight));
        this.nameOfStudent = nameOfStudent;
        this.dvNumber = dvNumber;
    }
    //Constructor 2
    
    
    
    
    public void setDVNum(String dvNum){
        this.dvNumber = dvNum;
    }
    //Setter for DVnum
    
    
    
    
    
    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    //Adds new subject to Array
    
    
    
    
     
    public String[] getAllSubjects(){
        String[] a = new String[subjects.size()];
        for(int i = 0; i < this.subjects.size(); i++){
            a[i] = this.subjects.get(i).getSubjectName();
        }
        return a;
    }
    //Creates an array with all the subjects in
    
    
    
    
    
    public Double calculateDP() {
        return getAssignmentMark()*getAssignmentWeight() + 
               getSemesterMark()*getSemesterTestWeight() + 
               getContinuousAssessmentMark()*getContinuousAssessmentWeight();
    }
    //Calculate the DP mark

    
    
    
    
    public Double calculateDP(String subject) {       
        return getAssignmentMark(subject)*getAssignmentWeight(subject) +
                getSemesterTestMark(subject)*getSemesterTestWeight(subject) +
                getContinuousAssessmentMark(subject)*getContinuousAssessmentWeight(subject);
    }
    //Calculates DP marks for each subject
    
    
    
    
    
    
    public String prettyPrintDPreport() {
        return "Dear student you have attained:\n"
                + "Assignment: " + getAssignmentMark() + "%\n"
                + "Semester test: " + getSemesterMark() + "%\n"
                + "Continous Assessment: " + getContinuousAssessmentMark() + "%\n"
                + "Your DP is calculated as: " + calculateDP() + "%";
    }
    //toString method 1
    
    
    
    
    
    
    public String prettyFullPrint(String subject) {
        if (canWriteExams()){
            return "Dear " + nameOfStudent + " (" + dvNumber + ") you have attained:\n"
                + "Assignment: " + getAssignmentMark(subject) + "%\n"
                + "Semester test: " + getSemesterTestMark(subject) + "%\n"
                + "Continous Assessment: " + getContinuousAssessmentMark(subject) + "%\n"
                + "For " + subject + "\n"
                + "Your DP is calculated as: " + calculateDP() + "%\n"
                + "You qualify to write the exams.";
        } else {
            return "Dear " + nameOfStudent + " (" + dvNumber + ") you have attained:\n"
                + "Assignment: " + getAssignmentMark(subject) + "%\n"
                + "Semester test: " + getSemesterTestMark(subject) + "%\n"
                + "Continous Assessment: " + getContinuousAssessmentMark(subject) + "%\n"
                + "For " + subject + "\n"
                + "Your DP is calculated as: " + calculateDP() + "%\n"
                + "Unfortunatly, you do not qualify to write exams.";
        }
    }
    //use the canWriteExams method and determain which toString to return and then return then the toString

    
    
    
    
    public Boolean canWriteExams() {
        return calculateDP() >= 40.0;
    }
    //determain if the student can Write Exams
    
    
    
    
    
    public Boolean verifyDVnum() {
        //Length
        if (dvNumber.length() != 11) {
            return false;
        }
        //First caracters
        if (!dvNumber.substring(0, 2).equalsIgnoreCase("dv")) {
            return false;
        }
        //First set of numbers (Year)
        for (int i = 2; i < 6; i++) {
            if (!Character.isDigit(dvNumber.charAt(i))) {
                return false;
            }
        }
        //Second set of numbers 
        for (int i = 7; i < 11; i++) {
            if (!Character.isDigit(dvNumber.charAt(i))) {
                return false;
            }
        }
        //All tests pass then returns true
        return dvNumber.charAt(6) == '-';
    }
    //verifiy if the DV number is correct
    
    
    
    
    
    private Integer Index(String subject){
        for (int i = 0; i < this.subjects.size(); i++) {
            if(this.subjects.get(i).getSubjectName().equalsIgnoreCase(subject)){
                return i;
            }
        }
        return -1;
    }
    //Loop through list to find Index of subject
    
    
    
    
    
    public Double getAssignmentMark(String subject) {
        return this.subjects.get(Index(subject)).getAssignmentMark();
    }
    
    public Double getAssignmentWeight(String subject) {
        return this.subjects.get(Index(subject)).getAssignmentWeight();
    }
    
    public Double getSemesterTestMark(String subject) {
        return this.subjects.get(Index(subject)).getSemesterTestMark();
    }
    
    public Double getSemesterTestWeight(String subject) {
        return this.subjects.get(Index(subject)).getSemesterTestWeight();
    }
    
    public Double getContinuousAssessmentMark(String subject) {
        return this.subjects.get(Index(subject)).getContinuousAssessmentMark();
    }
    
    public Double getContinuousAssessmentWeight(String subject) {
        return this.subjects.get(Index(subject)).getContinuousAssessmentWeight();
    }
    //Setter by Index
    
    
    
    
    public void setAssignmentMark(Double assignmentMark, String subject) {
        this.subjects.get(Index(subject)).setAssignmentMark(assignmentMark);
    }
    public void setAssignmentWeight(Double assignmentWeight, String subject) {
        this.subjects.get(Index(subject)).setAssignmentWeight(assignmentWeight);
    }
    
    public void setSemesterTestMark(Double semesterTestMark, String subject) {
        this.subjects.get(Index(subject)).setSemesterTestMark(semesterTestMark);
    }
    
    public void setSemesterTestWeight(Double semesterTestWeight, String subject) {
        this.subjects.get(Index(subject)).setSemesterTestWeight(semesterTestWeight);
    }
    
    public void setContinuousAssessmentMark(Double continuousAssessmentMark, String subject) {
        this.subjects.get(Index(subject)).setContinuousAssessmentMark(continuousAssessmentMark);
    }
    
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight, String subject) {
        this.subjects.get(Index(subject)).setContinuousAssessmentWeight(continuousAssessmentWeight);
    }
    //Getters by Index
    
    
    
    
    
    public Double getAssignmentMark() {
        return subjects.get(0).getAssignmentMark();
    }
    
    public Double getAssignmentWeight() {
        return subjects.get(0).getAssignmentWeight();
    }
    
    public Double getSemesterMark() {
        return subjects.get(0).getSemesterTestMark();
    }
    
    public Double getSemesterTestWeight() {
        return subjects.get(0).getSemesterTestWeight();
    }
    
    public Double getContinuousAssessmentMark() {
        return subjects.get(0).getContinuousAssessmentMark();
    }
    
    public Double getContinuousAssessmentWeight() {
        return subjects.get(0).getContinuousAssessmentWeight();
    }
    //Default Getters
        
    
    
    
    
    public void setAssignmentMark(Double assignmentMark) {
        subjects.get(0).setAssignmentMark(assignmentMark);
    }
    
    public void setAssignmentWeight(Double assignmentWeight) {
        subjects.get(0).setAssignmentWeight(assignmentWeight);
    }
    
    public void setSemesterTestMark(Double semesterTestMark) {
        subjects.get(0).setSemesterTestMark(semesterTestMark);
    }
    
    public void setSemesterTestWeight(Double semesterTestWeight) {
       subjects.get(0).setSemesterTestWeight(semesterTestWeight);
    }
    
    public void setContinuousAssessmentMark(Double continuousAssessmentMark) {
        subjects.get(0).setContinuousAssessmentMark(continuousAssessmentMark);
    }
    
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        subjects.get(0).getSemesterTestWeight();
    }
    //Default setters 
    
}