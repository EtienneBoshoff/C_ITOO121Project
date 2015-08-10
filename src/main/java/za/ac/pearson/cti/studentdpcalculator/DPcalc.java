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
import java.util.Set;

/**
 * Program description: This class will calculate a students due performance or
 * DP.
 *
 * @author Etienne Boshoff - Lecturer CTI Education Group
 *
 * Task: Complete the methods such that the tests pass. Note you are not allowed
 * to change the tests in any way.
 */
public class DPcalc {

    /**
     * Variables are your attributes associated with your class. For example a
     * car can be different colours. The colour blue would then be an attribute
     * of the class car. This means that its variable for colour may look as
     * follows:
     *
     * String colour = "blue"; OR String colour; if we leave it undefined till a
     * later time
     */
    //Variable declarations here
    //Task: Complete the variable declarations
   
    private final String studentName;
    private final String studentDVnumber;
    
    
    private Subject aSubject;
    
    List<Subject> subjects = new ArrayList<>();
    //End of variable declarations

    /**
     * This is the constructor for DPcalc. A constructor is used to create an
     * object and give it its default values.
     *
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in
     * percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        
        studentName = "Default Student";
        studentDVnumber = "N/A";
        
        //Set<Subject> aSubject = set<Subject>();
    }

    /**
     * This is the secondary constructor for DPcalc
     *
     * @param assignment The assignment mark of the student in percentage
     * @param semesterTest The semester test mark of the student in percentage
     * @param continuous The continual assessment mark of the student in
     * percentage
     * @param studentName The name of the student for whom we are calculating
     * the DP
     * @param subject The subject the DP is calculated for
     * @param studentDVnumber The student's DV number
     * @param assignmentWeight The weight as a floating point percentage
     * @param semesterTestWeight The weight as a floating point percentage
     * @param continousAssessmentWeight The weight as a floating point
     * percentage
     */
    public DPcalc(Double assignment, Double semesterTest, Double continuous, String studentName, String subject, String studentDVnumber, Double assignmentWeight, Double semesterTestWeight, Double continousAssessmentWeight) {
        
        this.studentName = studentName;
        this.studentDVnumber = studentDVnumber;
    }

    /**
     * This method calculates the students DP for the semester with the values
     * gathered from the constructor. A method is the behaviour of an object it
     * can be seen as doing a specific task. In the comments I will describe the
     * task and you are required to complete the method such that it passes the
     * java unit test.
     *
     * Method: DP is calculated by taking assignment*assWeight +
     * semesterTest*semWeight * continuous*contWeight
     *
     * @return The DP of the student as a double floating point value
     */
    //Task: complete this method as described in the comments and to pass the unit test
    public Double calculateDP() {

       Double DPmark = (getAssignmentMark() * aSubject.getAssessmentWeight()) + (getSemesterMark() * aSubject.getSemesterTestWeight()) + (getContinuousAssessmentMark() * aSubject.getContinuousAssessmentWeight());
        return DPmark;
    }

    /**
     * This method returns a string that is formatted to look like a nice report
     * when printed with System.out.println
     *
     * A few things to take note of: \n gives you a new line \t gives you a tab
     * All students received marks and then his calculated DP must be displayed
     * as follows
     *
     * Dear student you have attained: Assignment: -studentmark-% SemesterTest:
     * -studentmark-% Continuous Assessment: -studentmark-% Your DP is
     * calculated as: -calculatedDP-%
     *
     * @return A formatted string
     */
    public String prettyPrintDPreport() {
        String studentResult = "Dear student you have attained:\n"
                + "Assignment: " + getAssignmentMark() + "%\n"
                + "Semester test: " + getSemesterMark() + "%\n"
                + "Continous Assessment: " + getContinuousAssessmentMark() + "%\n"
                + "Your DP is calculated as: " + calculateDP() + "%";
        return studentResult;

    }
    
    public String fullPrint() {
        
            String finalResult = "Student, these are your following marks:/n"
                                + "Name: "+studentName+"/n"
                                + "DV Number: "+studentDVnumber+"/n"
                                + "Subjet Name: "+aSubject.getName()+"/n"
                                + "Assignment: "+getAssignmentMark()+"/n"
                                + "Semster Test: "+getSemesterMark()+"/n"
                                + "Continuous Assessment: "+getContinuousAssessmentMark()+"/n"
                                + "Your DP result is: "+calculateDP()+"%";
            return finalResult;
    }

    /**
     * This method is known as an accessor method or getter. It allows you to
     * get an attribute from an object. In this case the Assignment mark stored
     * within the calculator
     *
     * @return The assignment mark stored within the calculator
     */
    public Double getAssignmentMark() {
       Double assignmentMk = aSubject.getAssessmentMark();
        return assignmentMk;
    }

    // Task create the other accessors
    public Double getSemesterMark() {
        return aSubject.getSemesterTestMark();
    }

    public Double getContinuousAssessmentMark() {
        return aSubject.getContinuousAssessmentMark();
    }

    public void setAssignmentWeight(Double assignmentWeight) {
        aSubject.getAssessmentWeight();
    }

    public void setSemesterTestWeight(Double semesterTestWeight) {
        aSubject.getSemesterTestWeight();
    }

    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        aSubject.setContinuousAssessmentWeight(continuousAssessmentWeight);
    }

    /**
     * This method checks if you have eligibility to write the exams Remember
     * you need at least a 40% DP to get exam eligibility
     *
     * @return True if you can write exams. False otherwise
     */
    public Boolean canWriteExams() {
        Boolean writeExam = false;
        if (calculateDP() >= 40) {
            writeExam = true;
        }
        return writeExam;
    }

    /**
     * This method checks if you have a valid DV student number A student number
     * must be in the following pattern "DV[yearEnrolled]-[fourDigits]"
     *
     * @return
     */
    public Boolean verifyDVnum() {
        Boolean studDV = false;

        if (studentDVnumber.length() != 11) {
            return studDV;
        } else {
                if (studentDVnumber.substring(0, 2) != "DV") {
                    return studDV;
        } else {
                if (studentDVnumber.substring(6, 7) != "-") {
                    return studDV;
        } else {
                if (studentDVnumber.substring(2, 6) != String.valueOf(studentDVnumber.substring(2, 6))) {
                    return studDV;
        } else {
                if (Integer.parseInt(studentDVnumber.substring(2, 6)) < 1000) {
                    return studDV;
        } else {
                if (studentDVnumber.substring(7, 11) != String.valueOf(studentDVnumber.substring(7, 11))) {
                    return studDV;
        } else {
                    return studDV = true;
                            }
                        }
                    }
                }
            }
        }
    }
    
     public void addSubject(Subject subject) {
        
        subjects.get(0).getAssessmentMark();
        subjects.get(1).getContinuousAssessmentMark();
        subjects.get(2).getSemesterTestMark();
        subjects.get(3).getName();
        
    }    
}


