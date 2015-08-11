/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.pearson.cti.studentdpcalculator;

//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author uboshet
 */
public class Subject {
    
    private String name;
    private Double semesterTestMark;
    private Double continuousAssessmentMark;
    private Double assignmentMark;
    private Double semesterTestWeight;
    private Double continuousAssessmentWeight;
    private Double assignmentWeight;
//    private final List <Subject> subjects;

    public Subject(String name, Double semesterTestMark, Double continuousAssessmentMark, Double assignmentMark, Double semesterTestWeight, Double continuousAssessmentWeight, Double assessmentWeight) {
        this.name = name;
        this.semesterTestMark = semesterTestMark;
        this.continuousAssessmentMark = continuousAssessmentMark;
        this.assignmentMark = assignmentMark;
        this.semesterTestWeight = semesterTestWeight;
        this.continuousAssessmentWeight = continuousAssessmentWeight;
        this.assignmentWeight = assessmentWeight;
  
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

    public Double getAssignmentMark() {
        return assignmentMark;
    }

    public void setAssignmentMark(Double assignmentMark) {
        this.assignmentMark = assignmentMark;
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

    public Double getAssignmentWeight() {
        return assignmentWeight;
    }

    public void setAssignmentWeight(Double assignmentWeight) {
        this.assignmentWeight = assignmentWeight;
    }
    
    
}
