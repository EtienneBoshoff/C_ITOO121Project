/*
 *Author: Paul Treurnicht
 *Operating System: Windows 8.1
 *Description: This is a student DP calulator that calculates the DP for a student and then tests it against certain validations.
 *DV2012-0003 
 */
package za.ac.pearson.cti.studentdpcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DPcalc {
    
    //Variable declarations here
    private String name;
    private String dvNum;
    private List<Subject> subject = new ArrayList<>(); 
    //End of variable declarations
   
    
    /*
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
    
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
       this.subject.add(new Subject("DP", semTestMark, contAssMark, assMark, 0.2, 0.2, 0.6));
        name = "Default Student";
        dvNum = "N/A";
    }

    /*
     * This is the secondary constructor for DPcalc
    
     * @param assignment The assignment mark of the student in percentage
     * @param semesterTest The semester test mark of the student in percentage
     * @param continuous The continual assessment mark of the student in percentage
     * @param studName The name of the student for whom we are calculating the DP
     * @param subject The subject the DP is calculated for
     * @param studNum The student's DV number
     * @param assignmentWeight The weight as a floating point percentage
     * @param semesterTestWeight The weight as a floating point percentage
     * @param continousAssessmentWeight The weight as a floating point percentage
     */
    public DPcalc(Double assignment, Double semesterTest, Double continuous, String studName, String studNum, String subject, Double assignmentWeight, Double semesterTestWeight, Double continousAssessmentWeight) {
        this.subject.add(new Subject(subject, semesterTest, continuous, assignment, semesterTestWeight, continousAssessmentWeight, assignmentWeight));
        this.name = studName;
        this.dvNum = studNum;
    }
 
    //@return A formatted string
    public String prettyPrintDPreport() {
        String report = "Dear student you have attained:\n"
                + "Assignment: "+getAssignmentMark()+"%\n"
                + "Semester test: "+getSemesterMark()+"%\n"
                + "Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: "+calculateDP()+"%";
        return report;
    }
    
   public String printFull() {
        String fullString = "Dear "+name+" "+dvNum+" you have attained the following mark for "+subject+":\n"
        +"\n"
        +"Assignment: "+getAssignmentMark()+"%\n"
        +"Assignment weight: "+getAssignmentWeight()+"%\n"
        +"Semester test: "+getSemesterMark()+"%\n"
        +"Semester test weight: "+getSemesterTestWeight()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark()+"%\n"       
        +"Continous Assessment weight: "+getContinuousAssessmentWeight()+"%\n"
        +"\n"
        +"Your DP for "+subject+" is: "+calculateDP()/100+"%\n";
        return fullString;
    }
   
    //@return The DP of the student as a double floating point value
    public Double calculateDP() {
        
        Double DP = getAssignmentMark()*getAssignmentWeight() + getSemesterMark()*getSemesterTestWeight() + getContinuousAssessmentMark()*getContinuousAssessmentWeight();
        return DP;
    }
    
    /*
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
    
     * @return The assignment mark stored within the calculator
     */
   
    public Double getAssignmentMark() {
        return subject.get(0).getAssessmentMark();
    }
    
    //@return The semester mark stored within the calculator
    public Double getSemesterMark() {
        return subject.get(0).getSemesterTestMark();
    }
    
    //@return The assignment weight stored within the calculator
    public Double getAssignmentWeight(){
        return this.subject.get(0).getAssessmentWeight();
    }
    
    //@return The semester test weight stored within the calculator
    public Double getSemesterTestWeight(){
        return this.subject.get(0).getSemesterTestWeight();
    }
    
    //@return The continuous assessment weight stored within the calculator
    public Double getContinuousAssessmentWeight(){
        return this.subject.get(0).getContinuousAssessmentWeight();
    }
    
    public Double getSemesterTestMark(String subject) {
        return this.subject.get(getSubject(subject)).getSemesterTestMark();
    }
    
    public Double getAssignmentMark(String subject) {
        return this.subject.get(getSubject(subject)).getAssessmentMark();
    }
    
    public Double getContinuousAssessmentMark(String subject) {
        return this.subject.get(getSubject(subject)).getContinuousAssessmentMark();
    }
    
    public Double getContinuousAssessmentMark() {
       return subject.get(0).getContinuousAssessmentMark();
    }
    
    public void setAssignmentWeight(Double assignmentWeight) {
       Subject subs = subject.get(0);
       subs.setAssessmentWeight(assignmentWeight);
       subject.set(0, subs);
    }
    
    public void setSemesterTestWeight(Double semesterTestWeight) {
        Subject subs = subject.get(0);
        subs.setSemesterTestWeight(semesterTestWeight);
        subject.set(0,subs);
    }
    
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        Subject subs = subject.get(0);
        subs.setContinuousAssessmentWeight(continuousAssessmentWeight);
        subject.set(0,subs);
    }
    
    private Integer getSubject(String sub){
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getName().equalsIgnoreCase(sub))
            {
                return i;
            }
        }    
        return -10;
    }
    
    //@return True if you can write exams. False otherwise
    public Boolean canWriteExams() {
        return calculateDP()>= 40.0;
    }
    
    
    //This method checks if you have a valid DV student number
    public Boolean verifyDVnum() {
        if (dvNum.length() == 11){
            String d = dvNum.charAt(0)+"";
            String v = dvNum.charAt(1)+"";
            String year = dvNum.substring(2, 6);
            String dash = dvNum.charAt(6)+"";
            String lastNum = dvNum.substring(7);
            
            if(d.equalsIgnoreCase("d") && 
                   v.equalsIgnoreCase("v") && 
                   year.matches("^\\d+$") && 
                   dash.equals("-") && 
                   lastNum.matches("^\\d+$"))
            {
                return true;
            }
            else 
            {
                return false;
            }
        } 
        else 
        {
        return false;
        }
    }
    //method adds a subject
    public void addSubject(Subject subject) {
        this.subject.add(subject);
    }
}
