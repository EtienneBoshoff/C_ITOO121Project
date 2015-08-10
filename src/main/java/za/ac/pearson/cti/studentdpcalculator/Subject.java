/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.pearson.cti.studentdpcalculator;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JimmeH
 */
public class Subject {
       
    String name;
    Double assignment;
    Double semesterTest;
    Double continuous;
    Double weightSem;
    Double weightAss;
    Double weightCont;
    
         
            

    public String getName() {
        String aName = ("Test subject"); 
       name = aName;
        return name;
        
        
    }
    

    public void setName(String name) {
        this.name = name;
        
    }

    public Double getAssignmentMark() {
    
        return assignment;
    }

    public void setAssignment(Double assignment) {
        this.assignment = assignment;
    }

    public Double getSemesterTestMark() {
        return semesterTest;
    }

    public void setSemesterTest(Double semesterTest) {
        this.semesterTest = semesterTest;
    }

    public Double getContinuousAssessmentMark() {
        return continuous;
    }

    public void setContinuous(Double continuous) {
        this.continuous = continuous;
    }

    public Double getWeightSem() {
        return weightSem;
    }

    public void setWeightSem(Double weightSem) {
        weightSem = 0.2; 
        this.weightSem = weightSem;
    }

    public Double getWeightAss() {
        return weightAss;
    }

    public void setWeightAss(Double weightAss) {
        weightAss = 0.6;
        this.weightAss = weightAss;
    }

    public Double getWeightCont() {
        return weightCont;
    }

    public void setWeightCont(Double weightCont) {
        weightCont = 0.2;
        this.weightCont = weightCont;
    }
           
    
    
}
