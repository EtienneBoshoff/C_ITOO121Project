/*/*
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
//jaco lintvelt Dv2015-0449
package za.ac.pearson.cti.studentdpcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program description: This class will calculate a students due performance or
 * DP.
 * UPDATED
 * gets the subjects 
 * and weights of the subjects in the DP 
 *
 * @author Etienne Boshoff - Lecturer CTI Education Group
 *  & Jaco Lintvelt Dv2015-0449
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
    
     
//***************************************Variable declarations here**************************************
    //Task: Complete the variable declarations 
    // vaiables aka attributes
    
    private List<Subject> subjects = new ArrayList<>();
    // name of the studant
    private String name;
    private String dvNumber;

//**************************************End of variable declarations**************************************
    
    
    /**
     * This is the constructor for DPcalc. A constructor is used to create an
     * object and give it its default values.
     *
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in
     * percentage
     */
    
//**************************************Constructor*******************************************************
    
    //Constructer DPcalc :weights defualt 0.2,0.2,0.6
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        subjects.add(new Subject("Subject", assMark, semTestMark, contAssMark, 0.6, 0.2, 0.2));
    }

// constructer DPcalc :weights are changeble 
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark, String name, String dvNumber, String subject, Double assWeight, Double semTestWeight, Double contAssWeight) {
        subjects.add(new Subject(subject, assMark, semTestMark, contAssMark, assWeight, semTestWeight, contAssWeight));

        //the dv number and name from the paramaters
        this.dvNumber = dvNumber;
        this.name = name;
    }

//**************************************End of Constructor****************************************************
    
//**************************************Verify the DV*********************************************************  
    
    public Boolean verifyDVnum() {
        boolean dvtest = false;   //makes the default of dvtest false 
        
        if (dvNumber.length() == 11) {                  //checks if the dv number is 11 carecters long
            Pattern dv = Pattern.compile("[Dd]{1}[Vv]{1}[0-9]{4}[//-]{1}[0-9]{4}"); // creates the spesification for the dv number 
            Matcher check = dv.matcher(dvNumber);       //compares the dv number to the spesifications
            dvtest = check.find();                      //makes dvtest true if it is the same as spesification
        }
        return dvtest;
    }
 
//**************************************end of Verify the DV**************************************************
    
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
    
//**************************************Calculate the DP*******************************************************    
    public Double calculateDP() {
        return ((getAssignmentMark() * getAssignmentWeight()) + (getSemesterMark() * getSemesterTestWeight()) + (getContinuousAssessmentMark() * getContinuousWeight()));
        // this returnes the answer of the calculation e.g: ( mark x 0.2 + mark x 0.2 + mark x 0.6 )
    }
    
//**************************************End Calculate the DP***************************************************
    
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
    //Returns formatted text of student's results
    
//**************************************Printing the results***************************************************    
    
    //Prints out the report card of the studant 
    public String prettyPrintDPreport() {
        return "Dear student you have attained:\nAssignment: "+ getAssignmentMark() 
                + "%\nSemester test: " + getSemesterMark() 
                + "%\nContinous Assessment: " + getContinuousAssessmentMark() 
                + "%\nYour DP is calculated as: " + calculateDP() + "%";
    }

    //Prints out the report card with the name and DV Number  
    public String prettyFullPrint() {
        return "Dear " 
                + getStudentSubject() + " you have attained:\nDV number: " + getDvNum()      //Name and dv number 
                + "\nSubject: " + getStudentSubject()                                        //The subject
                + "\nAssignment: " + getAssignmentMark()                                     // *mark 1
                + "%\nSemester test: " + getSemesterMark()                                   // *mark 2
                + "%\nContinous Assessment: " + getContinuousAssessmentMark()                // *mark 3
                + "%\nYour DP is calculated as: " + calculateDP() + "%";                     // =The DP
    }
    
//**************************************End of Printing the results*************************************************** 
    
    /**
     * This method is known as an accessor method or getter. It allows you to
     * get an attribute from an object. In this case the Assignment mark stored
     * within the calculator
     *
     * @return The assignment mark stored within the calculator
     */
    
//**************************************The Getters***************************************************  
    
    public void setDVnum(String dvnum) {
        this.dvNumber = dvnum;
    }

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
        return name;
    }

    public String getDvNum() {
        return dvNumber;
    }
    
    public String getStudentSubject() {
        return subjects.get(0).getSubject();
    }

//**************************************The Setters******************************************************************    
    
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
    
//**************************************End of Getters and Setters***************************************************   

    /**
     * This method checks if you have eligibility to write the exams Remember
     * you need at least a 40% DP to get exam eligibility
     *
     * @return True if you can write exams. False otherwise
     */
    
//**************************************Can The studant write exams************************************************** 
    
    public Boolean canWriteExams() {

        return calculateDP() >= 40.0;   //checks if the dp is 40% or more and returnes true or false

    }

//**************************************End Can The studant write exams********************************************** 
    
//**************************************Entering subject list******************************************************** 
    
    //Adds Subject to the list
    public void addSubject(Subject s) {
        subjects.add(s);
    }

    //Returns index of element in subjects list from inputted subject
    public Integer getListIndex(String subject) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getSubject().equalsIgnoreCase(subject)) {
                return i;
            }
        }
        return -1;
    }
}
