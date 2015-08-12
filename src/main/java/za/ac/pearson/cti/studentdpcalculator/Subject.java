/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.pearson.cti.studentdpcalculator;

/**
 *
 * @author Wehan
 */
public class Subject {
    
    private String name;
    private Double semesterTest;
    private Double continuousMark;
    private Double assignmentMark;
    private Double weightAss;
    private Double weightCont;
    private Double weightTest;

    public Subject(String name, Double semesterTest, Double continuousMark, Double assignmentMark, Double weightTest, Double weightCont, Double weightAss) {
        this.name = name;
        this.semesterTest = semesterTest;
        this.continuousMark = continuousMark;
        this.assignmentMark = assignmentMark;
        this.weightAss = weightAss;
        this.weightCont = weightCont;
        this.weightTest = weightTest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSemesterTest() {
        return semesterTest;
    }

    public void setSemesterTest(Double semesterTest) {
        this.semesterTest = semesterTest;
    }

    public Double getContinuousMark() {
        return continuousMark;
    }

    public void setContinuousMark(Double continuousMark) {
        this.continuousMark = continuousMark;
    }

    public Double getAssignmentMark() {
        return assignmentMark;
    }

    public void setAssignmentMark(Double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public Double getWeightTest() {
        return weightTest;
    }

    public void setWeightTest(Double weightTest) {
        this.weightTest = weightTest;
    }

    public Double getWeightCont() {
        return weightCont;
    }

    public void setWeightCont(Double weightCont) {
        this.weightCont = weightCont;
    }

    public Double getWeightAss() {
        return weightAss;
    }

    public void setWeightAss(Double weightAss) {
        this.weightAss = weightAss;
    }

}
