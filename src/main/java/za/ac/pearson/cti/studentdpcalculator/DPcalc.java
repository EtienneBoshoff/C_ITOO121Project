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

/**
 * Program description:  This class will calculate a students due performance
 * or DP.  
 * @author Etienne Boshoff - Lecturer CTI Education Group
 * 
 * Task: Complete the methods such that the tests pass.  Note you are not
 * allowed to change the tests in any way.
 */
public class DPcalc {
    
    /**
     * Variables are your attributes associated with your class. For example a
     * car can be different colours.  The colour blue would then be an attribute
     * of the class car.  This means that its variable for colour may look as 
     * follows:
     * 
     * String colour = "blue"; 
     * OR
     * String colour; if we leave it undefined till a later time
     */
    //Variable declarations here
    //Task: Complete the variable declarations
    private final Double assignment;
    private final Double semesterTest;
    private final Double continuous;
    private Double assignmentWeight;
    private Double semesterTestWeight;
    private Double continousAssessmentWeight;
    private final String studentName;
    private final String subject;
    private final String studentDVnumber;
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
        assignmentWeight = 0.6;
        semesterTestWeight = 0.2;
        continousAssessmentWeight = 0.2;
        studentName = "Default Student";
        subject = "Default Subject";
        studentDVnumber = "N/A";
    }

    /**
     * This is the secondary constructor for DPcalc
     * @param assignment The assignment mark of the student in percentage
     * @param semesterTest The semester test mark of the student in percentage
     * @param continuous The continual assessment mark of the student in percentage
     * @param studentName The name of the student for whom we are calculating the DP
     * @param subject The subject the DP is calculated for
     * @param studentDVnumber The student's DV number
     * @param assignmentWeight The weight as a floating point percentage
     * @param semesterTestWeight The weight as a floating point percentage
     * @param continousAssessmentWeight The weight as a floating point percentage
     */
    public DPcalc(Double assignment, Double semesterTest, Double continuous, String studentName, String subject, String studentDVnumber, Double assignmentWeight, Double semesterTestWeight, Double continousAssessmentWeight) {
        this.assignment = assignment;
        this.semesterTest = semesterTest;
        this.continuous = continuous;
        this.assignmentWeight = assignmentWeight;
        this.semesterTestWeight = semesterTestWeight;
        this.continousAssessmentWeight = continousAssessmentWeight;
        this.studentName = studentName;
        this.subject = subject;
        this.studentDVnumber = studentDVnumber;
    }
    
    
    
    /**
     * This method calculates the students DP for the semester with the values
     * gathered from the constructor.  A method is the behaviour of an object
     * it can be seen as doing a specific task.  In the comments I will describe
     * the task and you are required to complete the method such that it passes
     * the java unit test.
     * 
     * Method: DP is calculated by taking assignment*assWeight + semesterTest*semWeight * continuous*contWeight
     * 
     * @return The DP of the student as a double floating point value
     */
    //Task: complete this method as described in the comments and to pass the unit test
    public Double calculateDP() {
        return ((getAssignmentMark()*getAssignmentWeight()) + (getContinuousAssessmentMark() * getContinousAssessmentWeight()) +(getSemesterMark()*getSemesterTestWeight()));
    }
    
    /**
     * This method returns a string that is formatted to look like a nice report
     * when printed with System.out.println
     * 
     * A few things to take note of:
     * \n gives you a new line
     * \t gives you a tab
     * All students received marks and then his calculated DP must be displayed 
     * as follows
     * 
     * Dear student you have attained:
     * Assignment: -studentmark-% 
     * SemesterTest: -studentmark-% 
     * Continuous Assessment: -studentmark-% 
     * Your DP is calculated as: -calculatedDP-%
     * 
     * @return A formatted string
     */
    public String prettyPrintDPreport() {
        return "Dear student you have attained:\n"
                + "Assignment: "+getAssignmentMark()+"%\n"
                + "Semester test: "+getSemesterMark()+"%\n"
                + "Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: "+ calculateDP()+"%";
    }


    
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
    
    
    public Double getAssignmentMark() {
        return assignment;
    }

    public Double getSemesterMark() {
        return semesterTest;
    }


    public Double getAssignmentWeight() {
        return assignmentWeight;
    }

    public Double getSemesterTestWeight() {
        return semesterTestWeight;
    }

    public Double getContinousAssessmentWeight() {
        return continousAssessmentWeight;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }

    public String getStudentDVnumber() {
        return studentDVnumber;
    }
    
    public Double getSemesterTestMark(String subject) {
        return semesterTest;       
    }
    
    public Double getAssignmentMark(String subject) {
        return assignment;
    }
    
    public Double getContinuousAssessmentMark(String subject) {
        return continuous;
    }
    
    public Double getContinuousAssessmentMark() {
        return continuous;
    }
    
    public void setAssignmentWeight(Double assignmentWeight) {
        this.assignmentWeight = assignmentWeight;
    }
    
    public void setSemesterTestWeight(Double semesterTestWeight) {
        this.semesterTestWeight = semesterTestWeight;
    }
    
    public void setContinuousAssessmentWeight(Double continuousAssessmentWeight) {
        this.continousAssessmentWeight = continuousAssessmentWeight;
    }
    
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
    public Boolean canWriteExams() {
        return (calculateDP()>=40);
    }
    
    /**
     * This method checks if you have a valid DV student number
     * A student number must be in the following pattern
     * "DV[yearEnrolled]-[fourDigits]"
     * @return 
     */
    public Boolean verifyDVnum() {
        Boolean varify= false;
        if (getStudentDVnumber().length() == 11) {
            if (getStudentDVnumber().substring(0, 2).equalsIgnoreCase("DV")){
                if (Integer.parseInt(getStudentDVnumber().substring(2, 6)) <= 2015) {
                    if (getStudentDVnumber().charAt(6) == ('-')) {
                        if (Integer.parseInt(getStudentDVnumber().substring(7, 11)) >= 0) {
                            varify = true;
                        }
                    }
                }   
            }
        }
        return varify;
    }

    public void addSubject(Subject subject) {
        Subject sub = new Subject(getSubject().toLowerCase(), semesterTest, continuous, assignment, semesterTestWeight, continousAssessmentWeight, assignmentWeight);
    }
}
