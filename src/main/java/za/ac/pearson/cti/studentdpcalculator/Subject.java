
package za.ac.pearson.cti.studentdpcalculator;

/*
 * Author: Paul Treurnicht
 * Date created: 2015/08/12
 * Operating system: Windows 8.1
 * DV2012-0003
 */

public class subject {

    private String name;
    private Double assignment;
    private Double semesterTest;
    private Double continuous;
    private Double weightSem;
    private Double weightAss;
    private Double weightCont;

    public subject(String name, Double assignment, Double semesterTest, Double continuous, Double weightSem, Double weightAss, Double weightCont) {
        this.name = name;
        this.assignment = assignment;
        this.semesterTest = semesterTest;
        this.continuous = continuous;
        this.weightSem = weightSem;
        this.weightAss = weightAss;
        this.weightCont = weightCont;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAssignmentMark() {
        return assignment;
    }

    public void setAssignment(Double assignment) {
        this.assignment = assignment;
    }

    public Double getSemesterMark() {
        return semesterTest;
    }

    public void setSemesterTest(Double semesterTest) {
        this.semesterTest = semesterTest;
    }

    public Double getContinuousAssessmentMark() {
        return continuous;
    }

    public void setContinuous(Double continuous) {
        this.continuous = continuous;
    }

    public Double getWeightSem() {
        return weightSem;
    }

    public void setSemesterTestWeight(Double weightSem) {
        this.weightSem = weightSem;
    }

    public Double getWeightAss() {
        return weightAss;
    }

    public void setAssignmentWeight(Double weightAss) {
        this.weightAss = weightAss;
    }

    public Double getWeightCont() {
        return weightCont;
    }

    public void setContinuousAssessmentWeight(Double weightCont) {
        this.weightCont = weightCont;
    }
}
