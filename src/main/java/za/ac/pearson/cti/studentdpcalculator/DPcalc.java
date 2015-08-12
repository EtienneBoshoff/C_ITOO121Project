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

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.Assert;

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
    
    String number;
    String nameStud;
    String subject;
    //Double DP;
    //Double assignment;
    //Double semesterTest;
    //Double continuous;
    //Double weightSem;
    //Double weightAss;
    //Double weightCont;
    //private Subject aSubject;
    List<Subject> subjects = new ArrayList<>();
    
    
    
    //End of variable declarations
    
    /**
     * This is the constructor for DPcalc.  A constructor is used to create an
     * object and give it its default values. 
     * @param assMark The assignment mark of the student in percentage
     * @param semTestMark The semester test mark of the student in percentage
     * @param contAssMark The continual assessment mark of the student in percentage
     */
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        /*assignment = assMark;
        semesterTest = semTestMark;
        continuous = contAssMark;*/
        subjects.add(new Subject("DP", semTestMark, contAssMark, assMark, 0.2, 0.2, 0.6));
        nameStud = "Default Student";
        //subject = "Default Subject";
        number = "N/A";
        
    }
    
    public DPcalc(Double assignment, Double semesterTest, Double continuous, String studName, String studNumber, String name, Double weightAss, Double weightSem, Double weightCont) {
        //assignment = assMark;
        //semesterTest = semTestMark;
        //continuous = contAssMark;
        nameStud = studName;
        //subject = studSubject;
        number = studNumber;
        //weightSem = semWeight;
        //weightAss = assWeight;
        //weightCont = contWeight;
        
        
        subjects.add(new Subject(name, assignment, semesterTest, continuous, weightSem, weightAss, weightCont));
        nameStud = studName;
        number = studNumber;

        
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
        
        /*Double semWeight = 0.2;
        Double assWeight = 0.6;
        Double contWeight = 0.2;*/
                
        Double DP = getAssignmentMark()*getAssignmentWeight() + getSemesterMark()*getSemesterTestWeight() + getContinuousAssessmentMark()*getContinuousAssessmentWeight();
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
                String expectedResult = "Dear student you have attained:\n"
                + "Assignment: "+getAssignmentMark()+"%\n"
                + "Semester test: "+getSemesterMark()+"%\n"
                + "Continous Assessment: "+getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: "+calculateDP()+"%";
        

               return expectedResult;
        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    
    /**
     * This method is known as an accessor method or getter.  It allows you to 
     * get an attribute from an object.  In this case the Assignment mark stored
     * within the calculator
     * @return The assignment mark stored within the calculator
     */
    
    
    
    
    /**
     * This method checks if you have eligibility to write the exams
     * Remember you need at least a 40% DP to get exam eligibility
     * @return True if you can write exams. False otherwise
     */
    public Boolean canWriteExams() {
        boolean write = false;
        
        if(calculateDP() >= 40){
         write = true;   
        }
        return write;

        //throw new UnsupportedOperationException("You still need to complete this method");
    }
    //get the users name       
    public void setName(String studName) {
    System.out.print("Enter your name: ");
    Scanner userInput = new Scanner(System.in);
    String firstName = userInput.nextLine();
    System.out.print("Name : "+firstName+" ");
    }
    //get the users subject
    public void setSubject(String studSubject) {
    System.out.print("Enter the subject name: ");
    Scanner userInput = new Scanner(System.in);
    String subjectName = userInput.nextLine();
    System.out.print("Subject Name : "+subjectName+" ");
    }
    //get the users dv number
    public void setDVnum(String studNumber) {
    System.out.print("Enter your DV number: ");
    Scanner userInput = new Scanner(System.in);
    String DVNum = userInput.nextLine();
    System.out.print("DV Number : "+DVNum+" ");
    }
    
    public Double getSemesterMark() {
    return subjects.get(0).getSemesterTestMark();
    }
    
    public Double getAssignmentWeight(){
    return this.subjects.get(0).getWeightAss();
    }
    
    public Double getSemesterTestWeight(){
    return this.subjects.get(0).getWeightSem();
    }
    
    public Double getContinuousAssessmentWeight(){
    return this.subjects.get(0).getWeightCont();
    }
    
    public Double getSemesterTestMark(String subject) {
    return this.subjects.get(getSubject(subject)).getSemesterTestMark();
    }
    
    public Double getAssignmentMark(String subject) {
    return this.subjects.get(getSubject(subject)).getAssignmentMark();
    }
    
    public Double getContinuousAssessmentMark(String subject) {
    return this.subjects.get(getSubject(subject)).getContinuousAssessmentMark();
    }
     
    public Double getContinuousAssessmentMark() {
    return subjects.get(0).getContinuousAssessmentMark();
    }
    
    public Double getAssignmentMark() {
    return subjects.get(0).getAssignmentMark();
    }
    
    public void setWeightAss(Double weightAss) {
    Subject subs = subjects.get(0);
    subs.setWeightAss(weightAss);
    subjects.set(0, subs);
    }
    
    public void setWeightTest(Double weightTest) {
    Subject subs = subjects.get(0);
    subs.setWeightSem(weightTest);
    subjects.set(0,subs);
    }
     
    public void setWeightCont(Double weightCont) {
    Subject subs = subjects.get(0);
    subs.setWeightCont(weightCont);
    subjects.set(0,subs);
    }
        
    
    private Integer getSubject(String sub){
    for (int i = 0; i < subjects.size(); i++) {
    if (subjects.get(i).getName().equalsIgnoreCase(sub))
    {
    return i;
          }
        }    
        return -10;
        }

        
    
    //if statement to check if DVnum meets all the requirements (length, starts with DV, dash, contains numeric values in string)
    
                
        public Boolean verifyDVnum() {
        if (number.length() == 11){
            String d = number.charAt(0)+"";
            String v = number.charAt(1)+"";
            String year = number.substring(2, 6);
            String dash = number.charAt(6)+"";
            String lastNum = number.substring(7);
            
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
     

        
        public void addSubject(Subject subject) {
        subjects.add(subject);
        }

        
            
                                                                        
                  //print all the users information
        /*public String printFull() {
            String fullResult = ("Dear student, your information is:\n"
                + "Name: "+nameStud+"\n"
                + "Subject: "+subject"\n"
                + "DV number: "+number+"\n"
                + "Weight of assignment mark: "+getAssignmentWeight()+"\n"
                + "Weight of semester mark: "+getSemesterTestWeight()+"\n"
                + "Weight of continuous assessment mark: "+getContinuousAssessmentWeight()+"\n"
                + "Assignment mark: "+getAssignmentMark()+"%\n"
                + "Semester test mark: "+getSemesterMark()+"%\n"
                + "Continous Assessment mark: "+getContinuousAssessmentMark()+"%\n"
                + "Your DP is calculated as: "+calculateDP()+"%");
              
                return fullResult;
                }
                */

                
                                     
      
                }

