/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.pearson.cti.studentdpcalculator;

/**
 *
 * @author User
 */
public class Subject {
     private Double assignment;
    private  Double semesterTest;
    private  Double continuous;
    private Double assignmentWeight;
    private Double semesterTestWeight;
    private Double continousAssessmentWeight;
    private double dpResult;
    private  String studentName;
    private  String subject;
    private  String studentDVnumber; 

    public Double getAssignment() {
        return assignment;
    }

    public void setAssignment(Double assignment) {
        this.assignment = assignment;
    }

    public Double getSemesterTest() {
        return semesterTest;
    }

    public void setSemesterTest(Double semesterTest) {
        this.semesterTest = semesterTest;
    }

    public Double getContinuous() {
        return continuous;
    }

    public void setContinuous(Double continuous) {
        this.continuous = continuous;
    }

    public Double getAssignmentWeight() {
        return assignmentWeight;
    }

    public void setAssignmentWeight(Double assignmentWeight) {
        this.assignmentWeight = assignmentWeight;
    }

    public Double getSemesterTestWeight() {
        return semesterTestWeight;
    }

    public void setSemesterTestWeight(Double semesterTestWeight) {
        this.semesterTestWeight = semesterTestWeight;
    }

    public Double getContinousAssessmentWeight() {
        return continousAssessmentWeight;
    }

    public void setContinousAssessmentWeight(Double continousAssessmentWeight) {
        this.continousAssessmentWeight = continousAssessmentWeight;
    }

    public double getDpResult() {
        return dpResult;
    }

    public void setDpResult(double dpResult) {
        this.dpResult = dpResult;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStudentDVnumber() {
        return studentDVnumber;
    }

    public void setStudentDVnumber(String studentDVnumber) {
        this.studentDVnumber = studentDVnumber;
    }

    public Subject(Double assignment, Double semesterTest, Double continuous, Double assignmentWeight, Double semesterTestWeight, Double continousAssessmentWeight, double dpResult, String studentName, String subject, String studentDVnumber) {
        this.assignment = assignment;
        this.semesterTest = semesterTest;
        this.continuous = continuous;
        this.assignmentWeight = assignmentWeight;
        this.semesterTestWeight = semesterTestWeight;
        this.continousAssessmentWeight = continousAssessmentWeight;
        this.dpResult = dpResult;
        this.studentName = studentName;
        this.subject = subject;
        this.studentDVnumber = studentDVnumber;
    }
    
    
}
