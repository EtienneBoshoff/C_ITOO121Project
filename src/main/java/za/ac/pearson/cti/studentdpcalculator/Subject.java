/*
 * Storage Class
 */
package za.ac.pearson.cti.studentdpcalculator;

/**
 *
 * @author Philip
 */
public class Subject {
    
    private String subjectName;
    private Double assignmentMark;
    private Double semesterTestMark;
    private Double continuousAssessmentMark;
    private Double assignmentWeight;
    private Double semesterTestWeight;
    private Double continuousAssessmentWeight;
    private Double calculatedDP;

    public Subject(String subjectName, Double assignmentMark, Double semesterTestMark, Double continuousAssessmentMark, Double assignmentWeight, Double semesterTestWeight, Double continuousAssessmentWeight) {
        this.subjectName = subjectName;
        this.assignmentMark = assignmentMark;
        this.semesterTestMark = semesterTestMark;
        this.continuousAssessmentMark = continuousAssessmentMark;
        this.assignmentWeight = assignmentWeight;
        this.semesterTestWeight = semesterTestWeight;
        this.continuousAssessmentWeight = continuousAssessmentWeight;
        this.calculatedDP = -1.0;
    }

    //Getters for Storage Class
    public String getSubjectName() {
        return subjectName;
    }
    public Double getAssignmentMark() {
        return assignmentMark;
    }
    public Double getSemesterTestMark() {
        return semesterTestMark;
    }
    public Double getContinuousAssessmentMark() {
        return continuousAssessmentMark;
    }
    public Double getAssignmentWeight() {
        return assignmentWeight;
    }
    public Double getSemesterTestWeight() {
        return semesterTestWeight;
    }
    public Double getContinuousAssessmentWeight() {
        return continuousAssessmentWeight;
    }
    public Double getCalculatedDP() {
        return calculatedDP;
    }

    //Setters for Storage Class
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public void setAssignmentMark(Double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }
    public void setSemesterTestMark(Double semesterTestMark) {
        this.semesterTestMark = semesterTestMark;
    }
    public void setContinuousAssessmentMark(Double continuousAssessmentMark) {
        this.continuousAssessmentMark = continuousAssessmentMark;
    }
    public void setAssignmentWeight(Double assignmentWeight) {
        this.assignmentWeight = assignmentWeight;
    }
    public void setSemesterTestWeight(Double semesterTestWeight) {
        this.semesterTestWeight = semesterTestWeight;
    }
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        this.continuousAssessmentWeight = continuousAssessmentWeight;
    }
    public void setCalculatedDP(Double calculatedDP) {
        this.calculatedDP = calculatedDP;
    }
}