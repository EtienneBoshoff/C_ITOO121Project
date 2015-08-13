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
 * @author Etienne Boshoff - Lecturer CTI Education Group
 * 
 * Task: Complete the methods such that the tests pass.  Note you are not
 * allowed to change the tests in any way.
 */

//You Know nothing etienne
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
    
    //private Double assignment;
   // private Double semesterTest;
   // private Double continuous;
   // private Double assWeight;         
   // private Double semWeight;         
   // private Double continuousWeight;  
    private String DVnum;
   // private String sub;
    private String studentName;
    List<Subject> courses; 
    
    //main class calls DP calc with relevant values. DP calc then calls Course class in its constructor
    //and populates it with the called values.
    
    //End of variable declarations
    
    /**
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    
    //First constructor (Accepts more erguments)
    public DPcalc (Double assMark, Double semTestMark, Double contAssMark,String name ,String DV ,String Subject ,Double assWeigh, Double semWeigh, Double contWeigh)
    {
      //  assignment = assMark;
      //  semesterTest = semTestMark;
       // continuous = contAssMark;
       // assWeight = assWeigh;
       // semWeight = semWeigh;
       // continuousWeight = contWeigh;
        DVnum = DV;
       // sub = Subject;
        studentName = name;
        
        //String subjectName, Double assignmentMark, Double semesterTestMark, Double continuousAssMark, Double assWeight, Double semWeight, Double contWeight, Double calculatedDV
        Subject cour = new Subject (Subject, assMark,semTestMark, contAssMark,  assWeigh,semWeigh,  contWeigh);
        courses = new ArrayList<>();
        courses.add(cour);
        
    }
    
  
    
    //Second constructor
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
       
      //  assignment = assMark;
      //  continuous = contAssMark;
      //  semesterTest = semTestMark;
        courses = new ArrayList<>();
        Subject cour = new Subject (assMark, semTestMark, contAssMark);
        courses.add(cour);
       // courses.get(0).setAssignmentMark(assMark);
        //Courses.get(0).setSemesterTestMark(semTestMark);
        //Courses.get(0).setContinuousAssMark(contAssMark);
        courses.get(0).setAssWeight(0.6);
        courses.get(0).setContWeight(0.2);
        courses.get(0).setSemWeight(0.2);
        //assWeight = 0.6;        //Currently defined in class
        //continuousWeight = 0.2;        //Currently defined in class
        //semWeight = 0.2;            //Currently Defined in class
       
    }
    
     //Create a DV verify method that verifies that it is a DV number : public Boolean verifyDVnum()
    
    public boolean verifyDVnum ()
    {
        System.out.println(DVnum);
        //make sure it is not too long
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
                Pattern pat = Pattern.compile ("[D]{1}[V]{1}[0-9]{4}[\\-]{1}[0-9]{4}");
                Matcher mat = pat.matcher (DVnum);
                return mat.find();
            }
        
        }
       
        
    }
    
    public String prettyFullPrint ()
    {
        //New print method
        String output = "Temp";
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
        //Calculate DP 
       Double DP = getAssignmentMark() * courses.get(0).getAssWeight()  + getSemesterMark() * courses.get(0).getSemWeight() + getContinuousAssessmentMark() * courses.get(0).getContWeight()  ;
       
       return DP; 
        
       // throw new UnsupportedOperationException("You still need to complete this method");
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
    
    //This method prints out data to the user
    public String prettyPrintDPreport() {
        //Present results
         String out = "Dear student you have attained:\n"
                + "Assignment: "+getAssignmentMark()+"%\n"
                + "Semester test: "+getSemesterMark()+"%\n"
                + "Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: " +calculateDP () +"%";
         
        return out;
        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    
    
    
    //Accessors :
    
    public Double getAssignmentMark() {
       // return assignment;
        return courses.get(0).getAssignmentMark();
    }
    
    
    public Double getSemesterMark() {
        
       // return semesterTest;
       return courses.get(0).getSemesterTestMark();
       // throw new UnsupportedOperationException("You still need to complete this method");
    }
    
    public Double getContinuousAssessmentMark() {
        //return continuous;
       return courses.get(0).getContinuousAssMark();
        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    
         
    //Accessors are cusing errors and need to be fixed. 
    //Set weights
    
    public void setAssignmentWeight(Double ass) {
       
        //assWeight = ass;
        
        Subject c = courses.get (0);
        c.setAssWeight(ass);
        courses.set(0, c);
      
        
        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    
    public void setContinuousAssessmentWeight(Double cont) {
       //continuousWeight = cont;
        Subject c = courses.get (0);
        c.setContWeight(cont);
        courses.set(0, c);
        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    
    public void setSemesterTestWeight(Double sem) {
      // semWeight = sem;
        Subject c = courses.get (0);
        c.setSemWeight(sem);
        courses.set(0, c);
        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    
    
    //Subject Specific accessors
    public double getAssignmentMark(String sub)
    {
    
        Subject c = courses.get (getSubjectIndex (sub));
     
        return c.getAssignmentMark();
        
    }
    
    public double getSemesterTestMark (String sub)
    {
        
        Subject c = courses.get (getSubjectIndex (sub));
     
        return c.getSemesterTestMark();
        
    }
    
    public double getContinuousAssessmentMark  (String sub) 
    {
      
        Subject c = courses.get (getSubjectIndex (sub));
        return c.getContinuousAssMark();
    
    }
    
    
    //End Accessors
    
    
    //Method that goes through list and checks if list element's subject mathes the argument subject and returns the index of that object inside the list array.
    private int getSubjectIndex (String sub) 
    {
       
        for (int x = 0; x < courses.size(); x++)
        {
                
           Subject c = courses.get (x);
                
            if (c.getSubjectName().equalsIgnoreCase(sub))
            {
                
                return x;
            }
            
           
                
            
        }
        return -1;
    }
    
    //Method for adding subjects to the list
    public void addSubject (Subject sub)
    {
       // Subject cour = new Subject (Sub, assMark,semTestMark, contAssMark,  assWeigh,semWeigh,  contWeigh);
       // courses = new ArrayList<>();
        courses.add(sub);
      
    }
    
    public Boolean canWriteExams() {
        
        
        return calculateDP() >= 40;
    }
}
