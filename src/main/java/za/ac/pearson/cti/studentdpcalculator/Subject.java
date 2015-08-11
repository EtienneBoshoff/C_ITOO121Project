/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.pearson.cti.studentdpcalculator;

/**
 *
 * @author uboshet
 */
public class Subject {
    
    private String name;
    private Double semesterTestMark;
    private Double continuousAssessmentMark;
    private Double assessmentMark;
    private Double semesterTestWeight;
    private Double continuousAssessmentWeight;
    private Double assessmentWeight;

    public Subject(String name, Double semesterTestMark, Double continuousAssessmentMark, Double assessmentMark, Double semesterTestWeight, Double continuousAssessmentWeight, Double assessmentWeight) {
        this.name = name;
        this.semesterTestMark = semesterTestMark;
        this.continuousAssessmentMark = continuousAssessmentMark;
        this.assessmentMark = assessmentMark;
        this.semesterTestWeight = semesterTestWeight;
        this.continuousAssessmentWeight = continuousAssessmentWeight;
        this.assessmentWeight = assessmentWeight;
    }

    public String getName() {
        return name;
    }//method to get the name of the student

    public void setName(String name) {
        this.name = name;
    }//method to set the name to a veriable
   
    public Double getSemesterTestMark() {
        return semesterTestMark;
    }//method to get the semester test mark of the student

    public void setSemesterTestMark(Double semesterTestMark) {
        this.semesterTestMark = semesterTestMark;
    }//method to set the semester test mark to a veriable

    public Double getContinuousAssessmentMark() {
        return continuousAssessmentMark;
    }//method to get the continuous assessment mark of the student

    public void setContinuousAssessmentMark(Double continuousAssessmentMark) {
        this.continuousAssessmentMark = continuousAssessmentMark;
    }//method to set the continuous assessment mark to a veriable

    public Double getAssessmentMark() {
        return assessmentMark;
    }//method to get the assessment mark of the student

    public void setAssessmentMark(Double assessmentMark) {
        this.assessmentMark = assessmentMark;
    }//method to set the assessment mark to a veriable

    public Double getSemesterTestWeight() {
        return semesterTestWeight;
    }//method to get the semester test weight
    
    public void setSemesterTestWeight(Double semesterTestWeight) {
        this.semesterTestWeight = semesterTestWeight;
    }///method to set the semester test weight to a veriable

    public Double getContinuousAssessmentWeight() {
        return continuousAssessmentWeight;
    }//method to get the continuous assessment weight

    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        this.continuousAssessmentWeight = continuousAssessmentWeight;
    }//method to set the continuos assessment weight to a veriable

    public Double getAssessmentWeight() {
        return assessmentWeight;
    }//method to get the assessment weight

    public void setAssessmentWeight(Double assessmentWeight) {
        this.assessmentWeight = assessmentWeight;
    }//method to set the assessment weight to a veriable
    
}
