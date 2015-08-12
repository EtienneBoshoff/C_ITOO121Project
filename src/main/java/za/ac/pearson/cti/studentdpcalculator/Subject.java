/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.pearson.cti.studentdpcalculator;

import java.util.ArrayList;
import java.util.List;

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

    Subject(Subject subject, Double semesterTest, Double continousAssessmentWeight, Double assignment, Double semesterTestWeight, Double continousAssessmentWeight0, Double assignmentWeight) {
        
         //List<Subject> subjects  = new ArrayList<>(); 
         
         Subject aSubject = new Subject (subject, assignment, semesterTest, 
                 continousAssessmentWeight0, assignmentWeight, semesterTestWeight, 
                  continousAssessmentWeight); 
         subject.Add(aSubject); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSemesterTestMark() {
        return semesterTestMark;
    }

    public void setSemesterTestMark(Double semesterTestMark) {
        this.semesterTestMark = semesterTestMark;
    }

    public Double getContinuousAssessmentMark() {
        return continuousAssessmentMark;
    }

    public void setContinuousAssessmentMark(Double continuousAssessmentMark) {
        this.continuousAssessmentMark = continuousAssessmentMark;
    }

    public Double getAssessmentMark() {
        return assessmentMark;
    }

    public void setAssessmentMark(Double assessmentMark) {
        this.assessmentMark = assessmentMark;
    }

    public Double getSemesterTestWeight() {
        return semesterTestWeight;
    }

    public void setSemesterTestWeight(Double semesterTestWeight) {
        this.semesterTestWeight = semesterTestWeight;
    }

    public Double getContinuousAssessmentWeight() {
        return continuousAssessmentWeight;
    }

    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        this.continuousAssessmentWeight = continuousAssessmentWeight;
    }

    public Double getAssessmentWeight() {
        return assessmentWeight;
    }

    public void setAssessmentWeight(Double assessmentWeight) {
        this.assessmentWeight = assessmentWeight;
    }

    void Add(Subject aSubject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
