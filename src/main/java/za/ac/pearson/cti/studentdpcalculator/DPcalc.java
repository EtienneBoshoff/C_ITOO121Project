/*
 * This is the starting program for CTI students in Object Orientated 
 * Programming.  To run this program click on the Run button in the toolbar
 * above (The one that looks like a play button).  In each class you will find
 * instructions on what needs to be done to complete this homework assignment
 * 
 * This is homework assignment: 1
 * It is due: Week of 13 July 2015
 * Remember to hand in all you need to do is upload a picture of all of your
 * JUnit tests passing.
 */
package za.ac.pearson.cti.studentdpcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program description:  This class will calculate a students due performance
 * or DP.  
 * @author Etienne Boshoff - Lecturer CTI Education Group, Keanu Joseph DV2014-0905
 *  
 * Task: Complete the methods such that the tests pass.  Note you are not
 * allowed to change the tests in any way.
 */
public class DPcalc {
    
    
    //Variable declarations here
    private List<Subject> subjects = new ArrayList<>();
    private String nameOfStudent; // name of the studant
    private String dvNumber;
    //End of variable declarations
    
    /**
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        subjects.add(new Subject("Subject", assMark, semTestMark, contAssMark, 0.6, 0.2, 0.2));
    }
    
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark, String name, String dvNumber, String subject, Double assWeight, Double semTestWeight, Double contAssWeight) {
        subjects.add(new Subject(subject, assMark, semTestMark, contAssMark, assWeight, semTestWeight, contAssWeight));

        //the dv number and name from the paramaters
        this.dvNumber = dvNumber;
        this.nameOfStudent = nameOfStudent;
    }
    
    
    
     //This method calculates the students DP for the semester with the values

    public Double calculateDP() {
        return ((getAssignmentWeight() * getAssignmentMark()) + (getSemesterMark() * getSemesterTestWeight()) + (getContinuousAssessmentMark() * getContinuousWeight()));
    }
   
    public String prettyPrintDPreport() { //Prints a report for student's obtained results
        return "Dear student you have attained:\n"
                + "Assignment: "+getAssignmentMark()+"%\n"
                + "Semester test: "+getSemesterMark()+"%\n"
                + "Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: "+calculateDP()+"%";
    }
    
    //Prints a report for student's obtained results, with the name and DV Number included  
    public String prettyFullPrint() {
        return "Dear " 
                + getStudentSubject() + " you have attained:\nDV number: " + getDvNum()      //Name and dv number 
                + "\nSubject: " + getStudentSubject()                                        //The subject
                + "\nAssignment: " + getAssignmentMark()                                     // *mark 1
                + "%\nSemester test: " + getSemesterMark()                                   // *mark 2
                + "%\nContinous Assessment: " + getContinuousAssessmentMark()                // *mark 3
                + "%\nYour DP is calculated as: " + calculateDP() + "%";                     // =The DP
    }
    
    //Getters As listed below
    
    public Double getAssignmentMark() {
        return subjects.get(0).getAssignment();
    }
    
    public Double getAssignmentMark(String subject) {
        return subjects.get(getListIndex(subject)).getAssignment();
    }
    
    public Double getSemesterMark() {
        return subjects.get(0).getSemesterTest();
     }
    
    public Double getSemesterTestMark(String subject) {
         return subjects.get(getListIndex(subject)).getSemesterTest();       
    }
    
    public Double getContinuousAssessmentMark() {
        return subjects.get(0).getContinuous();
     }
    
    public Double getContinuousAssessmentMark(String subject) {
        return subjects.get(getListIndex(subject)).getContinuous();
    }
    
    public Double getAssignmentWeight() {
        return subjects.get(0).getAssignmentWeight();
     }
    
    public Double getAssignmentWeight(String subject) {
        return subjects.get(getListIndex(subject)).getAssignmentWeight();
    }
    
     public Double getSemesterTestWeight() {
        return subjects.get(0).getSemesterWeight();
    }

    public Double getSemesterTestWeight(String subject) {
        return subjects.get(getListIndex(subject)).getSemesterWeight();
    }

    public Double getContinuousWeight() {
        return subjects.get(0).getContinuousWeight();
    }

    public Double getContinuousWeight(String subject) {
        return subjects.get(getListIndex(subject)).getContinuousWeight();
    }

    public String getName() {
        return nameOfStudent;
    }

    public String getDvNum() {
        return dvNumber;
     }
    
    public String getStudentSubject() {
        return subjects.get(0).getSubject();
     }
    
    //Setters As listed below
    
    public void setAssignmentWeight(Double assWeight) {
        subjects.get(0).setAssignmentWeight(assWeight);
    }

    public void setAssignmentWeight(Double assWeight, String subject) {
        subjects.get(getListIndex(subject)).setAssignmentWeight(assWeight);
    }

    public void setSemesterTestWeight(Double semesterWeight) {
        subjects.get(0).setSemesterWeight(semesterWeight);
    }

    public void setSemesterTestWeight(Double semesterWeight, String subject) {
        subjects.get(getListIndex(subject)).setSemesterWeight(semesterWeight);
    }

    public void setContinuousAssessmentWeight(Double contWeight) {
       subjects.get(0).setContinuousWeight(contWeight);
    }

    public void setContinuousAssessmentWeight(Double contWeight, String subject) {
        subjects.get(getListIndex(subject)).setContinuousWeight(contWeight);
     }
    
    
     //This method checks if you have eligibility to write the exams
    public Boolean canWriteExams() {
         return calculateDP() >= 40.0;   //returns boolean value to determine whether DP is greater than 40%
    }
    
     //This method checks if you have a valid DV student number
    public Boolean verifyDVnum() {
        if (dvNumber.length() == 11){
            String d = dvNumber.charAt(0)+"";
            String v = dvNumber.charAt(1)+"";
            String year = dvNumber.substring(2, 6);
            String dash = dvNumber.charAt(6)+"";
            String endNum = dvNumber.substring(7);
            
            if(d.equalsIgnoreCase("d") && 
                    v.equalsIgnoreCase("v") && 
                   year.matches("^\\d+$") && 
                   dash.equals("-") && 
                   endNum.matches("^\\d+$"))
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

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    
    //Returns index of inputted element in subjects list
    public Integer getListIndex(String subject) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getSubject().equalsIgnoreCase(subject)) {
                return i;
            }
        }
        return -1;
     }
 }
