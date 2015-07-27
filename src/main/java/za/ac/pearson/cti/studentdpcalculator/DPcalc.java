/*
 *Paul Treurnicht 
 *DV2012-0003
 *Windows 8.1
 *2015/07/23
 */
package za.ac.pearson.cti.studentdpcalculator;

public class DPcalc {
    
    //Variable declarations
    Double assignment;
    Double semesterTest;
    Double continuous;
    String subject;
    String dvNum;
    String name;
    Double weightSem = 0.20;
    Double weightAss = 0.60;
    Double weightCont= 0.20;
    //End of variable declarations
    
    /**
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        assignment = assMark;
        semesterTest = semTestMark;
        continuous = contAssMark;
            
    }
    
    public Double calculateDP() {
        
        double DP = (assignment*weightAss)+(semesterTest*weightSem)+(continuous*weightCont);
        
        return DP;
        
    }

    public String prettyPrintDPreport() {
        String formatedString = "Dear student you have attained:\n"
        +"Assignment: "+assignment+"%\n"
        +"Semester test: "+semesterTest+"%\n"
        +"Continous Assessment: "+continuous+"%\n"
        +"Your DP is calculated as: "+calculateDP()+"%";
        
        return formatedString;
    }
    
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
    
    //Get attribute from object
    public Double getAssignmentMark() {
        return assignment;
    }
    
    //Get attribute from object
    public Double getSemesterMark() {
        return semesterTest;
    }
    //Get attribute from object
    public Double getContinuousAssessmentMark() {
        return continuous;
    }
   
    //Sets the new name variable
    public void setName(String newName) {
        name = newName;
    }
    
    //Sets the new subject variable
    public void setSubject(String newSubject) { 
        subject = newSubject;
    }
    
    //Sets the new DVnum variable
    public void setDvNum(String newDV) {
        dvNum = newDV;
    }
    
    //Sets the new semester weight
    public void setWeightSem(Double newSemWeight) {   
        weightSem = newSemWeight;
    }
    
    //Sets the new assignment weight
    public void setWeightAss(Double newAssWeight) {
        weightSem = newAssWeight;
    }
    
    //Sets the new continuous weight
    public void setWeightCont(Double newContWeight) {  
        weightSem = newContWeight;
    }
    
    //Checks if student can write exams
    public Boolean canWriteExams() {
        if (calculateDP() >= 40);
            return true;
    }
}
