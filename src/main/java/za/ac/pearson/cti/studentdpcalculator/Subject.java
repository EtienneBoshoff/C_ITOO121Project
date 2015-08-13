/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.pearson.cti.studentdpcalculator;

/**
 *
 * @author Zenith
 */
public class Subject {
    
    //Declarations
    public String subjectName;
    public Double assignmentMark;
    public Double semesterTestMark;
    public Double continuousAssMark;
    public Double assWeight;
    public Double semWeight;
    public Double contWeight;
    public Double calculatedDV;
    
    //Constructor

    public Subject(String subjectName, Double assignmentMark, Double semesterTestMark, Double continuousAssMark, Double assWeight, Double semWeight, Double contWeight) {
        this.subjectName = subjectName;
        this.assignmentMark = assignmentMark;
        this.semesterTestMark = semesterTestMark;
        this.continuousAssMark = continuousAssMark;
        this.assWeight = assWeight;
        this.semWeight = semWeight;
        this.contWeight = contWeight;
        this.calculatedDV = calculatedDV;
    }
    
    //2nd constructor

    public Subject(Double assignmentMark, Double semesterTestMark, Double continuousAssMark) {
        this.assignmentMark = assignmentMark;
        this.semesterTestMark = semesterTestMark;
        this.continuousAssMark = continuousAssMark;
    }
    
    
    //Setters

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setAssignmentMark(Double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public void setSemesterTestMark(Double semesterTestMark) {
        this.semesterTestMark = semesterTestMark;
    }

    public void setContinuousAssMark(Double continuousAssMark) {
        this.continuousAssMark = continuousAssMark;
    }

    public void setAssWeight(Double assWeight) {
        this.assWeight = assWeight;
    }

    public void setSemWeight(Double semWeight) {
        this.semWeight = semWeight;
    }

    public void setContWeight(Double contWeight) {
        this.contWeight = contWeight;
    }

    public void setCalculatedDV(Double calculatedDV) {
        this.calculatedDV = calculatedDV;
    }

    //Getters
    
    public String getSubjectName() {
        return subjectName;
    }

    public Double getAssignmentMark() {
        return assignmentMark;
    }

    public Double getSemesterTestMark() {
        return semesterTestMark;
    }

    public Double getContinuousAssMark() {
        return continuousAssMark;
    }

    public Double getAssWeight() {
        return assWeight;
    }

    public Double getSemWeight() {
        return semWeight;
    }

    public Double getContWeight() {
        return contWeight;
    }

    public Double getCalculatedDV() {
        return calculatedDV;
    }
    
}
