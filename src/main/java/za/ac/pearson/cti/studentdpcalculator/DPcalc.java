/*
 * Author: Paul Treurnicht
 * Date created: 2015/08/12
 * Operating system: Windows 8.1
 * DV2012-0003
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
    private List<subject> subject = new ArrayList<>();
    //End of variable declarations
    
    /*
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        this.subject.add(new subject("DP", semTestMark,contAssMark, assMark, 0.2, 0.2, 0.6));
        name = "Default Student";
        dvNum = "N/A";
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
    /*
    
    */
   public DPcalc(Double assignment,Double semesterTest,Double continuous, String studName, String studNum, String subject, Double weightSem, Double weightAss, Double weightCont) {
       this.subject.add(new subject(subject, semesterTest, continuous, assignment, weightSem, weightCont, weightAss));
       this.name = studName;
       this.dvNum = studNum;
    }
   
    public Double calculateDP() {
        
        double DP = getAssignmentMark()*getWeightAss()+getSemesterMark()*getWeightSem()+getContinuousAssessmentMark()*getWeightCont();
        
        return DP;
        
    }
    
    //@return A formatted string
    public String prettyPrintDPreport() {
        String formatedString = "Dear student you have attained:\n"
        +"Assignment: "+getAssignmentMark()+"%\n"
        +"Semester test: "+getSemesterMark()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
        +"Your DP is calculated as: "+calculateDP()+"%";
        return formatedString;
    }
    
    public String printFull() {
        String fullString = "Dear "+name+" "+dvNum+" you have attained the following mark for "+subject+":\n"
        +"\n"
        +"Assignment: "+getAssignmentMark()+"%\n"
        +"Assignment weight: "+getWeightAss()+"%\n"
        +"Semester test: "+getSemesterMark()+"%\n"
        +"Semester test weight: "+getWeightSem()+"%\n"
        +"Continous Assessment: "+getContinuousAssessmentMark()+"%\n"       
        +"Continous Assessment weight: "+getWeightCont()+"%\n"
        +"\n"
        +"Your DP for "+subject+" is: "+calculateDP()/100+"%\n"

        ;
        return fullString;
    }
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */

    public Double getAssignmentMark() {
        return subject.get(0).getAssignmentMark();
    }
    
    public Double getSemesterMark() {
        return subject.get(0).getSemesterMark();
    }
    
    public Double getContinuousAssessmentMark() {
       return subject.get(0).getContinuousAssessmentMark();
    }
        
    public Double getWeightAss(){
        return this.subject.get(0).getWeightAss();
    }

    public Double getWeightSem(){
        return this.subject.get(0).getWeightSem();
    }
    
    public Double getWeightCont(){
        return this.subject.get(0).getWeightCont();
    }
    
    public Double getSemesterTest(String subject) {
        return this.subject.get(collectSubject(subject)).getSemesterMark();
    }
    
    public Double getAssignment(String subject) {
        return this.subject.get(collectSubject(subject)).getAssignmentMark();
    }
    
    public Double getContinuous(String subject) {
        return this.subject.get(collectSubject(subject)).getContinuousAssessmentMark();
    }
    
    public void setAssignmentWeight(Double weightAss) {
       subject subs = subject.get(0);
       subs.setAssignmentWeight(weightAss);
       subject.set(0, subs);
    }
    
    public void setSemesterTestWeight(Double weightSem) {
        subject subs = subject.get(0);
        subs.setSemesterTestWeight(weightSem);
        subject.set(0,subs);
    }
    
    public void setContinuousAssessmentWeight(Double weightCont) {
        subject subs = subject.get(0);
        subs.setContinuousAssessmentWeight(weightCont);
        subject.set(0,subs);
    }
    

    private Integer collectSubject(String sub){
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getName().equalsIgnoreCase(sub))
            {
                return i;
            }
        }    
        return -10;
    }
    //Checks if student can write exams
    public Boolean canWriteExams() {
        return calculateDP()>= 40.0;
    }

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

    public void addSubject(subject subject) {
        this.subject.add(subject);
    } 
}
