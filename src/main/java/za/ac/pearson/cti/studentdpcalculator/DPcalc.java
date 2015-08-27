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
 * @author Barend Van Der Berg DV2015-0020
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
    //private final Double assignment;
    //private final Double semesterTest;
    //private final Double continuous;
    //private Double assignmentWeight;
   // private Double semesterTestWeight;
    //private Double continousAssessmentWeight;
   //private final String studentName;
    //private final String subject;
    //private final String studentDVnumber;
    private String DVnum;
    private String studentName;
    List<Subject> courses; 
//End of variable declarations
    
    
    //This is the first constructor
    public DPcalc (Double assMark, Double semTestMark, Double contAssMark,String name ,String DV ,String Subject ,Double assWeigh, Double semWeigh, Double contWeigh){
        DVnum = DV;
        studentName = name;
        Subject cour = new Subject (Subject, assMark,semTestMark, contAssMark,  assWeigh,semWeigh,  contWeigh);
        courses = new ArrayList<>();
        courses.add(cour);
    }

    //This is the second constructor
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        
        courses = new ArrayList<>();
        Subject cour = new Subject (assMark, semTestMark, contAssMark);
        courses.add(cour);
       
        courses.get(0).setAssWeight(0.6);
        courses.get(0).setContWeight(0.2);
        courses.get(0).setSemWeight(0.2);
    }
    
    public boolean verifyDVnum ()
    {
        System.out.println(DVnum);
        //This method ensures that the DV inputted is not too long
        if (DVnum.length() > 11)
        {
            return false;
        }
        else 
        {
            if (DVnum.length() < 11)
            {
                return false;
            }
            else
            {
                Pattern pattern = Pattern.compile ("[D]{1}[V]{1}[0-9]{4}[\\-]{1}[0-9]{4}");
                Matcher matcher = pattern.matcher (DVnum);
                return matcher.find();
            }
        
        }
       
        
    }
    
    public String prettyFullPrint ()
    {
        String output = "";
        return output;
        
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
        
        Double DP = getAssignmentMark() * courses.get(0).getAssWeight()  + getSemesterMark() * courses.get(0).getSemWeight() + getContinuousAssessmentMark() * courses.get(0).getContWeight()  ;
        return DP; 
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
        //This mehod prints the result
         String result = "Dear student you have attained:\n"
                + "Assignment: "+getAssignmentMark()+"%\n"
                + "Semester test: "+getSemesterMark()+"%\n"
                + "Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: " +calculateDP () +"%";
         
        return result;
    }
    
    public Double getAssignmentMark() {
        return courses.get(0).getAssignmentMark();
        //This Method returns assignmentMark;
    }
    
    
    public Double getSemesterMark() {
        return courses.get(0).getSemesterTestMark();
        //This Method returns SemesterTestMark;
    }
    
    public Double getContinuousAssessmentMark() {
       return courses.get(0).getContinuousAssMark();
        //This Method returns ContinuousAssMark;
    }
    
         
    //Below the weights are set (Setters)
    
    public void setAssignmentWeight(Double ass) {
        Subject c = courses.get (0);
        c.setAssWeight(ass);
        courses.set(0, c);
    }
    
    public void setSemesterTestWeight(Double sem) {
        Subject c = courses.get (0);
        c.setSemWeight(sem);
        courses.set(0, c);
    }
    
    public void setContinuousAssessmentWeight(Double cont) {
        Subject c = courses.get (0);
        c.setContWeight(cont);
        courses.set(0, c);
    }
    
    public double getAssignmentMark(String sub){
        Subject c = courses.get (getSubjectIndex (sub));
        return c.getAssignmentMark();
    }
    
    public double getSemesterTestMark (String sub){
        Subject c = courses.get (getSubjectIndex (sub));
        return c.getSemesterTestMark();
    }
    
    public double getContinuousAssessmentMark  (String sub){
        Subject c = courses.get (getSubjectIndex (sub));
        return c.getContinuousAssMark();
    }
    
    
    
    
    
    private int getSubjectIndex (String sub){
       
        for (int x = 0; x < courses.size(); x++){
            Subject c = courses.get (x);
            if (c.getSubjectName().equalsIgnoreCase(sub)){
                return x;
            }
            }
        return -1;
    }
    
    
    public void addSubject (Subject sub)
    {
        courses.add(sub);
    }
    
    
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
    public Boolean canWriteExams() {
        return calculateDP() >= 40;
    }
      
}
