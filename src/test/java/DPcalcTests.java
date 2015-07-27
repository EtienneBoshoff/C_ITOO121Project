/*
 *Paul Treurnicht 
 *DV2012-0003
 *Windows 8.1
 *2015/07/23
 */
import org.junit.Assert;
import org.junit.Test;
import sun.rmi.runtime.Log;

import za.ac.pearson.cti.studentdpcalculator.DPcalc;

public class DPcalcTests {
   
    @Test
    public void testCalculateDPwithPassingMarks() {
        // Set up variables needed for the test
        Double testAss = 50.0;
        Double testSem = 55.0;
        Double testCont = 55.0;
        // End of variable creation

        // Create objects needed for test
        DPcalc calculator = new DPcalc(testAss, testSem, testCont);
        // End of object creation
        
        // Do the test
        Double testResult1 = calculator.calculateDP();
        
        // Test the results
        Assert.assertEquals(52.0, testResult1, 2);
    }
    
    @Test
    public void testCalculateDPwithFailingMarks() {
        // Set up variables needed for the test
        Double testAss = 30.0;
        Double testSem = 35.0;
        Double testCont = 23.0;
        // End of variable creation
        
        // create objects needed for the test
        DPcalc calc2 = new DPcalc(testAss, testSem, testCont);
        // End of object creation

        // Do the test
        Double testResult2 = calc2.calculateDP();
        
        // Test the results
        Assert.assertEquals(29.6, testResult2, 2);
    }
    
    @Test
    public void testPrettyPrint() {
        // Set up variables needed for the test
        Double testAss = 50.0;
        Double testSem = 55.0;
        Double testCont = 55.0;
        // End of variable creation
        
        // create objects needed for the test
        DPcalc calculator = new DPcalc(testAss, testSem, testCont);
        // End of object creation

        
        String expectedResult = "Dear student you have attained:\n"
                + "Assignment: "+testAss+"%\n"
                + "Semester test: "+testSem+"%\n"
                + "Continous Assessment: "+testCont+"%\n"
                + "Your DP is calculated as: 52.0%";

        //Assigns prettyPrintDPreport to result variable
        String result = calculator.prettyPrintDPreport();
        //Test values assigned against prettyPrintDPreport
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testCanWriteExams() {
        // Set up variables needed for the test
        Double testAss = 50.0;
        Double testSem = 55.0;
        Double testCont = 55.0;
        // End of variable creation
        
        // Create objects needed for test
        DPcalc calculator = new DPcalc(testAss, testSem, testCont);
        // End of object creation

        // Do the test
        Boolean result = calculator.canWriteExams();
        Assert.assertEquals(result, Boolean.TRUE);   
    }

    //Expected result is false
    public void testCannotWriteExams() {
        // Set up variables needed for the test
        Double testAss = 30.0;
        Double testSem = 35.0;
        Double testCont = 23.0;
        // End of variable creation

        // create objects needed for test
        DPcalc calc2 = new DPcalc(testAss, testSem, testCont);
        // End of object creation

        // Do the test
        Boolean result = calc2.canWriteExams();
        Assert.assertEquals(result, Boolean.FALSE);
    }
    
    public void testCanWriteExamsEdgeCase() {
        // assignment and continuous assessment
        Double testValue = 40.0;
        // End of variable creation
        
        // Create objects needed for test
        DPcalc calc = new DPcalc(testValue, testValue, testValue);
        // End of object creation

        // Do the test
        Double studentResult = calc.calculateDP();
        Boolean result = calc.canWriteExams();
        Assert.assertEquals(studentResult, 40.0, 2);
        Assert.assertEquals(result, Boolean.TRUE);  
    }
}
