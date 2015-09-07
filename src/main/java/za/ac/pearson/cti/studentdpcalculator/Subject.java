
package za.ac.pearson.cti.studentdpcalculator;


public class Subject {
     
    private Double assignment;
    private Double semesterTest;
    private Double continuous;
    
    private Double assignmentWeight;
    private Double semesterWeight;
    private Double continuousWeight;
    
    private String subject;
    private Double calculatedDP;
    //private String dvNumber;
    //private String name;
    

    public Subject(String subject, Double assignment, Double semesterTest, Double continuous, Double assignmentWeight, Double semesterWeight, Double continuousWeight) {

        this.assignment = assignment;
        this.semesterTest = semesterTest;
        this.continuous = continuous;
        this.assignmentWeight = assignmentWeight;
        this.semesterWeight = semesterWeight;
        this.continuousWeight = continuousWeight;
        this.subject = subject;
        this.calculatedDP =-1.0;
    }
    
//**************************************The Setters******************************************************************    

    public void setAssignment(Double assignment) {
        this.assignment = assignment;
    }

    public void setSemesterTest(Double semesterTest) {
        this.semesterTest = semesterTest;
    }

    public void setContinuous(Double continuous) {
        this.continuous = continuous;
    }

    public void setAssignmentWeight(Double assignmentWeight) {
        this.assignmentWeight = assignmentWeight;
    }

    public void setSemesterWeight(Double semesterWeight) {
        this.semesterWeight = semesterWeight;
    }

    public void setContinuousWeight(Double continuousWeight) {
        this.continuousWeight = continuousWeight;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void setcelculatedDP(Double calculatedDP){
        this.calculatedDP = calculatedDP;
    }
    
//**************************************The Getters***************************************************      

    public Double getAssignment() {
        return assignment;
    }

    public Double getSemesterTest() {
        return semesterTest;
    }

    public Double getContinuous() {
        return continuous;
    }

    public Double getAssignmentWeight() {
        return assignmentWeight;
    }

    public Double getSemesterWeight() {
        return semesterWeight;
    }

    public Double getContinuousWeight() {
        return continuousWeight;
    }

    public String getSubject() {
        return subject;
    }

    public Double getcalculatedDP(){
        return calculatedDP;
    } 
}


