/*
 *Paul Treurnicht 
 *DV2012-0003
 *Windows 8.1
 *2015/07/23
 */
package za.ac.pearson.cti.studentdpcalculator;

public class DPcalc {
    
    //Variable declarations
    private final Double assignment;
    private Double assignment2;
    private Double assignment3;
    private final Double semesterTest;
    private Double semesterTest2;
    private Double semesterTest3;
    private final Double continuous;
    private Double continuous2;
    private Double continuous3;
    private String subject;
    private String subject2;
    private String subject3;
    private String dvNum;
    private String name;
    private Double weightSem = 0.20;
    private Double weightAss = 0.60;
    private Double weightCont= 0.20;
    private Double weightSem2;
    private Double weightAss2;
    private Double weightCont2;
    private Double weightSem3;
    private Double weightAss3;
    private Double weightCont3;
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
    
    
    public DPcalc(Double assMark, Double assMark2, Double assMark3, Double semTestMark,Double semTestMark2,Double semTestMark3, Double contAssMark,Double contAssMark2,Double contAssMark3) {
        assignment = assMark;
        assignment2 = assMark2;
        assignment3 = assMark3;
        semesterTest = semTestMark;
        semesterTest2 = semTestMark2;
        semesterTest3 = semTestMark3;
        continuous = contAssMark;
        continuous2 = contAssMark2;
        continuous3 = contAssMark3;
    }
    /*
     * @param subName The subject name of the student
     * @param studNum The student number
     * @param studName The name of the student
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     * @param wSem The weight of the semester test
     * @param wAss The weight of the assignment 
     * @param wCont The weight of the continuous assessment
    */
    
    public DPcalc(Double assMark,Double assMark2,Double assMark3, Double semTestMark,Double semTestMark2,Double semTestMark3,
            Double contAssMark,Double contAssMark2, Double contAssMark3,String subName,String subName2,String subName3, String studNum,String studName, 
            Double wSem, Double wAss, Double wCont, Double wSem2, Double wAss2, Double wCont2, Double wSem3, Double wAss3, Double wCont3){
        assignment = assMark;
        assignment2 = assMark2;
        assignment3 = assMark3;
        semesterTest = semTestMark;
        semesterTest2 = semTestMark2;
        semesterTest3 = semTestMark3;
        continuous = contAssMark;
        continuous2 = contAssMark2;
        continuous3 = contAssMark3;
        subject = subName;
        subject2 = subName2;
        subject3 = subName3;
        dvNum = studNum;
        name = studName;
        weightSem = wSem;
        weightAss = wAss;
        weightCont = wCont;
        weightSem2 = wSem2;
        weightAss2 = wAss2;
        weightCont2 = wCont2;
        weightSem3 = wSem3;
        weightAss3 = wAss3;
        weightCont3 = wCont3;
    }
    
    
    //Print a report view of all the students information
    public String prettyPrintDPreport() {
        String formatedString = "Dear student you have attained:\n"
        +"Assignment: "+getAssignmentMark()+"%\n"
        +"Semester test: "+getSemesterMark()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
        +"Your DP is calculated as: "+calculateDP()+"%";
        
        return formatedString;
    }
    
    //Print a report view of all the students information   
    public String printFull() {
        String fullString = "Dear "+name+" "+dvNum+" you have attained the following mark for "+subject+":\n"
        +"\n"
        +"Assignment: "+getAssignmentMark()+"%\n"
        +"Assignment weight: "+getAssignmentWeight()+"%\n"
        +"Semester test: "+getSemesterMark()+"%\n"
        +"Semester test weight: "+getSemesterTestWeight()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark()+"%\n"       
        +"Continous Assessment weight: "+getContinuousWeight()+"%\n"
        +"\n"
        +"Your DP for "+subject+" is: "+calculateDP()/100+"%\n"
        +"\n"
        +"Your "+subject2+" information\n"
        +"\n"
        +"Assignment: "+getAssignmentMark2()+"%\n"
        +"Assignment weight: "+getAssignmentWeight2()+"%\n"
        +"Semester test: "+getSemesterMark2()+"%\n"
        +"Semester test weight: "+getSemesterTestWeight2()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark2()+"%\n" 
        +"Continous Assessment weight: "+getContinuousWeight2()+"%\n"
        +"\n"
        +"Your DP for "+subject2+" is: "+calculateDP2()/100+"%\n"
        +"\n"
        +"Assignment: "+getAssignmentMark3()+"%\n"
        +"Assignment weight: "+getAssignmentWeight3()+"%\n"
        +"Semester test: "+getSemesterMark3()+"%\n"
        +"Semester test weight: "+getSemesterTestWeight3()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark3()+"%\n" 
        +"Continous Assessment weight: "+getContinuousWeight3()+"%\n"
        +"\n"
        +"Your DP for "+subject3+" is: "+calculateDP3()/100+"%\n"

        ;
        return fullString;
    }
    
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
    //DP of the first subject
    public Double calculateDP() {
        
        double DP = (assignment*weightAss)+(semesterTest*weightSem)+(continuous*weightCont);
        
        return DP;
        
    }

    //DP of the second subject
    public Double calculateDP2() {
        
        double DP = (assignment2*weightAss2)+(semesterTest2*weightSem2)+(continuous2*weightCont2);
        
        return DP;
        
    }
    
    //DP of the third subject
    public Double calculateDP3() {
        
        double DP = (assignment3*weightAss3)+(semesterTest3*weightSem3)+(continuous3*weightCont3);
        
        return DP;
        
    }
    
    //Get attribute from object
    public String getSubject() {
        return subject;
    }
    
    //Get attribute from object
    public String getSubject2() {
        return subject2;
    }
    
    //Get attribute from object
    public String getSubject3() {
        return subject3;
    }
    
    //Get attribute from object
    public Double getAssignmentMark() {
        return assignment;
    }
    
    //Get attribute from object
    public Double getAssignmentMark2() {
        return assignment2;
    }
    
    //Get attribute from object
    public Double getAssignmentMark3() {
        return assignment3;
    }
    
    //Get attribute from object
    public Double getSemesterMark() {
        return semesterTest;
    }
    
    //Get attribute from object
    public Double getSemesterMark2() {
        return semesterTest2;
    }
    
    //Get attribute from object
    public Double getSemesterMark3() {
        return semesterTest3;
    }
    
    //Get attribute from object
    public Double getContinuousAssessmentMark() {
        return continuous;
    }
    
    //Get attribute from object
    public Double getContinuousAssessmentMark2() {
        return continuous2;
    }
    
    //Get attribute from object
    public Double getContinuousAssessmentMark3() {
        return continuous3;
    }
    
    //Get attribute from object
    public Double getAssignmentWeight(){
        return weightAss;
    }
    
    //Get attribute from object
    public Double getAssignmentWeight2(){
        return weightAss2;
    }
    
    //Get attribute from object
    public Double getAssignmentWeight3(){
        return weightAss3;
    }
    
    //Get attribute from object
    public Double getSemesterTestWeight(){
        return weightSem;
    }
    
    //Get attribute from object
    public Double getSemesterTestWeight2(){
        return weightSem2;
    }
    
    //Get attribute from object
    public Double getSemesterTestWeight3(){
        return weightSem3;
    }
    
    //Get attribute from object
    public Double getContinuousWeight(){
        return weightCont;
    }
    
    //Get attribute from object
    public Double getContinuousWeight2(){
        return weightCont2;
    }
    
    //Get attribute from object
    public Double getContinuousWeight3(){
        return weightCont3;
    }
   
    //Sets the new name variable
    public void setName(String newName) {
        name = newName;
    }
    
    //Sets the new subject variable
    public void setSubject(String newSubject) { 
        subject = newSubject;
    }
    
    //Sets the new subject variable
    public void setSubject2(String newSubject2) { 
        subject2 = newSubject2;
    }
    
    //Sets the new subject variable
    public void setSubject3(String newSubject3) { 
        subject3 = newSubject3;
    }
    
    //Sets the new DVnum variable
    public void setDvNum(String newDV) {
        dvNum = newDV;
    }
    
    //Sets the semester weight
    public void setWeightSem(Double newSemWeight) {   
        weightSem = newSemWeight;
    }
    
    //Sets the semester weight
    public void setWeightSem2(Double newSemWeight2) {   
        weightSem2 = newSemWeight2;
    }
    
    //Sets the semester weight
    public void setWeightSem3(Double newSemWeight3) {   
        weightSem3 = newSemWeight3;
    }
    

    //Sets the assignment weight
    public void setWeightAss(Double newAssWeight) {
        weightAss = newAssWeight;
    }
    
    //Sets the second assignment weight
    public void setWeightAss2(Double newAssWeight2) {
        weightAss2 = newAssWeight2;
    }
    
    //Sets the third assignment weight
    public void setWeightAss3(Double newAssWeight3) {
        weightAss3 = newAssWeight3;
    }
    //Sets the continuous weight
    public void setWeightCont(Double newContWeight) {  
        weightCont = newContWeight;
    }
    
    //Sets the second continuous weight
    public void setWeightCont2(Double newContWeight2) {  
        weightCont2 = newContWeight2;
    }
    
    //Sets the second continuous weight
    public void setWeightCont3(Double newContWeight3) {  
        weightCont3 = newContWeight3;
    }
    
    //Checks if student can write exams
    public Boolean canWriteExams() {
        return calculateDP() >= 0.40;
    }
    
    //public Boolean verifyDvNum(String dvNum){

    //}
}
//dvNum.contains("DV")&& dvNum.contains(number)&& dvNum.contains("-") 