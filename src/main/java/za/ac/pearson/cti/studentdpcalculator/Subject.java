//Stephan Malan DV2015-00723

package za.ac.pearson.cti.studentdpcalculator;

public class Subject {
    
    //Global variables
    private String subjectName;
    private Double assignmentMark;
    private Double semesterTestMark;
    private Double continuousMark;
    private Double assignmentWeight;
    private Double semesterTestWeight;
    private Double continuousWeight;
    private Double calculatedDP;

    /*
        ########## Constructors ##########
    */
    
    //Constructor
    public Subject(String subjectName, Double assignmentMark, Double semesterTestMark, Double continuousMark, Double assignmentWeight, Double semesterTestWeight, Double continuousWeight) {
        this.subjectName = subjectName;
        this.assignmentMark = assignmentMark;
        this.semesterTestMark = semesterTestMark;
        this.continuousMark = continuousMark;
        this.assignmentWeight = assignmentWeight;
        this.semesterTestWeight = semesterTestWeight;
        this.continuousWeight = continuousWeight;
        calculatedDP = -1.0;
    }

    /*
        ########## Accessors ##########
    */
    
    //Returns subject name
    public String getSubjectName() {
        return subjectName;
    }

    //Returns assignment mark
    public Double getAssignmentMark() {
        return assignmentMark;
    }

    //Returns semester test mark
    public Double getSemesterTestMark() {
        return semesterTestMark;
    }

    //Returns continuous assessment mark
    public Double getContinuousMark() {
        return continuousMark;
    }

    //Returns assignment weight
    public Double getAssignmentWeight() {
        return assignmentWeight;
    }

    //Returns semester test weight
    public Double getSemesterTestWeight() {
        return semesterTestWeight;
    }

    //Returns continuous assessment weight
    public Double getContinuousWeight() {
        return continuousWeight;
    }

    //Returns calculated DP
    public Double getCalculatedDP() {
        return calculatedDP;
    }

    //Sets the value of the subject name
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //Sets the value of the assignment mark
    public void setAssignmentMark(Double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    //Sets the value of the semester test mark
    public void setSemesterTestMark(Double semesterTestMark) {
        this.semesterTestMark = semesterTestMark;
    }

    //Sets the value of the continuous assessment mark
    public void setContinuousMark(Double continuousMark) {
        this.continuousMark = continuousMark;
    }

    //Sets the value of the assignment weight
    public void setAssignmentWeight(Double assignmentWeight) {
        this.assignmentWeight = assignmentWeight;
    }

    //Sets the value of the semester test weight
    public void setSemesterTestWeight(Double semesterTestWeight) {
        this.semesterTestWeight = semesterTestWeight;
    }

    //Sets the value of the continuous assessment weight
    public void setContinuousWeight(Double continuousWeight) {
        this.continuousWeight = continuousWeight;
    }

    //Sets the value of the calculated DP
    public void setCalculatedDP(Double calculatedDP) {
        this.calculatedDP = calculatedDP;
    }
    
}
