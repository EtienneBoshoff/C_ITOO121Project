//Stephan Malan DV2015-0073

package za.ac.pearson.cti.studentdpcalculator;

//Imports
import java.util.ArrayList;
import java.util.List;

public class DPcalc {

    //Global variables
    private String studentName;
    private String dvNum;
    private List<Subject> subjects = new ArrayList<>();

    /*
        ##########  Constructors ##########
    */
    
    //Constructor
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark) {
        subjects.add(new Subject("Subject", assMark, semTestMark, contAssMark, 0.6, 0.2, 0.2));
        studentName = "Default";
        dvNum = "Default";
    }

    //Secondary constructor
    public DPcalc(Double assMark, Double semTestMark, Double contAssMark, String name, String dvNumber, String subject, Double assWeight, Double semTestWeight, Double contAssWeight) {
        subjects.add(new Subject(subject, assMark, semTestMark, contAssMark, assWeight, semTestWeight, contAssWeight));
        studentName = name;
        dvNum = dvNumber;
    }

    /*
        ##########  Accessors ##########
     */
    
    //Returns assignment mark
    public Double getAssignmentMark() {
        return subjects.get(0).getAssignmentMark();
    }

    //Returns assignment mark of certain subject
    public Double getAssignmentMark(String subject) {
        return subjects.get(getListIndex(subject)).getAssignmentMark();
    }

    //Returns semester test mark
    public Double getSemesterMark() {
        return subjects.get(0).getSemesterTestMark();
    }

    //Returns semester test mark of certain subject
    public Double getSemesterTestMark(String subject) {
        return subjects.get(getListIndex(subject)).getSemesterTestMark();
    }

    //Returns continuous assesment mark
    public Double getContinuousAssessmentMark() {
        return subjects.get(0).getContinuousMark();
    }

    //Returns continuous assessment mark of certain subject
    public Double getContinuousAssessmentMark(String subject) {
        return subjects.get(getListIndex(subject)).getContinuousMark();
    }
    
    //Returns assignment weight
    public Double getAssignmentWeight() {
        return subjects.get(0).getAssignmentWeight();
    }

    //Returns assignment weight of certain subject
    public Double getAssignmentWeight(String subject) {
        return subjects.get(getListIndex(subject)).getAssignmentWeight();
    }
    
    //Returns semester test weight
    public Double getSemesterTestWeight() {
        return subjects.get(0).getSemesterTestWeight();
    }

    //Returns semester test weight of certain subject
    public Double getSemesterTestWeight(String subject) {
        return subjects.get(getListIndex(subject)).getSemesterTestWeight();
    }

    //Returns continuous assessment weight
    public Double getContinuousWeight() {
        return subjects.get(0).getContinuousWeight();
    }
    
    //Returns continuous assessment weight for certain subject
    public Double getContinuousWeight(String subject) {
        return subjects.get(getListIndex(subject)).getContinuousWeight();
    }

    //Returns student name
    public String getStudentName() {
        return studentName;
    }

    //Returns student dv number
    public String getDvNum() {
        return dvNum;
    }

    //Returns student subject
    public String getStudentSubject() {
        return subjects.get(0).getSubjectName();
    }
    
    //Sets value of assignment weight
    public void setAssignmentWeight(Double assWeight) {
        subjects.get(0).setAssignmentWeight(assWeight);
    }
    
    //Sets value of assignment weight of certain subject
    public void setAssignmentWeight(Double assWeight, String subject) {
        subjects.get(getListIndex(subject)).setAssignmentWeight(assWeight);
    }
    
    //Sets value of semester test weight
    public void setSemesterTestWeight(Double semesterWeight) {
        subjects.get(0).setSemesterTestWeight(semesterWeight);
    }
    
    //Sets value of semester test weight
    public void setSemesterTestWeight(Double semesterWeight, String subject) {
        subjects.get(getListIndex(subject)).setSemesterTestWeight(semesterWeight);
    }
    
    //Sets value of continuous assessment weight
    public void setContinuousAssessmentWeight(Double contWeight) {
        subjects.get(0).setContinuousWeight(contWeight);
    }
    
    //Sets value of continuous assessment weight
    public void setContinuousAssessmentWeight(Double contWeight, String subject) {
        subjects.get(getListIndex(subject)).setContinuousWeight(contWeight);
    }

    /*
        ########## Methods ##########
    */
    
    //Returns formatted text of student's results
    public String prettyPrintDPreport() {
        return "Dear student you have attained:\nAssignment: " + getAssignmentMark() + "%\nSemester test: " + getSemesterMark()+ "%\nContinous Assessment: " + getContinuousAssessmentMark()+ "%\nYour DP is calculated as: " + calculateDP() + "%";
    }
    
    //Returns formatted text of all the student's results and information
    public String prettyFullPrint() {
        return "Dear " + getStudentSubject() + " you have attained:\nDV number: " + getDvNum() + "\nSubject: " + getStudentSubject() + "\nAssignment: " + getAssignmentMark() + "%\nSemester test: " + getSemesterMark()+ "%\nContinous Assessment: " + getContinuousAssessmentMark()+ "%\nYour DP is calculated as: " + calculateDP() + "%";
    }
    
    //Returns the student's DP
    public Double calculateDP() {
        return ((getAssignmentMark() * getAssignmentWeight()) + (getSemesterMark()* getSemesterTestWeight()) + (getContinuousAssessmentMark()* getContinuousWeight()));
    }
    
    //Verifies the student's DV number
    public Boolean verifyDVnum() {
        if (getDvNum().length() != 11) {
            return false;
        }
        if (!getDvNum().substring(0, 2).equalsIgnoreCase("dv")) {
            return false;
        }
        for (int i = 2; i < 6; i++) {
            if (!Character.isDigit(getDvNum().charAt(i))) {
                return false;
            }
        }
        for (int i = 7; i < 11; i++) {
            if (!Character.isDigit(getDvNum().charAt(i))) {
                return false;
            }
        }
        return getDvNum().charAt(6) == '-';
    }
    
    //Returns if student can write exam
    public Boolean canWriteExams() {
        return calculateDP() >= 40;
    }

    //Adds Subject from parameter to subjects list
    public void addSubject(Subject s) {
        subjects.add(s);
    }

    //Returns index of element in subjects list from inputted subject
    public Integer getListIndex(String subject) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getSubjectName().equalsIgnoreCase(subject)) {
                return i;
            }
        }
        return -1;
    }
}
