
import org.junit.Assert;
import org.junit.Test;

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
import za.ac.pearson.cti.studentdpcalculator.DPcalc;
/**
 *
 * @author Etienne Boshoff - Lecturer CTI Education Group
 */
public class DPcalcTests {
    
    /**
     * This is a test of the calculateDP method.
     * Scenario 1: The student received 50% for
     * his assignment and 55% for his semester test and continuous assessment 
     * respectively
     * 
     * Expected Test Result: Student received 52% as a DP
     */
    @Test
    public void testCalculateDPwithPassingMarks() {
        // Set up variables needed for the test
        // Scenario 1:
        Double testAss = 50.0;
        Double testSem = 55.0;
        Double testCont = 55.0;
        // End of variable creation
        // Create objects needed for test
        // Scenario 1:
        DPcalc calculator = new DPcalc(testAss, testSem, testCont);
        // End of object creation
        // END OF SETUP FOR SCENARIO 1
        // Do the test
        Double testResult1 = testAss * 0.6 + testSem * 0.2 + testCont * 0.2;
        // Test the results
        Assert.assertEquals(52.0, testResult1, 2);
    }
    
    /**
     * Scenario 2: The student received 30% for
     * his assignment and 35% for his semester test and 23% for
     * his continuous assessment. 
     * 
     * Expected Test Result: Student received 29.6% as a DP
     */
    @Test
    public void testCalculateDPwithFailingMarks() {
        // Scenario 2:
        Double testAss = 30.0;
        Double testSem = 35.0;
        Double testCont = 23.0;
        // End of variable creation
        // create objects needed for thest
        DPcalc calc2 = new DPcalc(testAss, testSem, testCont);
        // End of object creation
        // END OF SETUP FOR SCENARIO 2
        // Do the test
        Double testResult2 = (testAss * 0.6) + (testSem * 0.2) + (testCont * 0.2);
        // Test the results
        Assert.assertEquals(29.6, testResult2, 2);
    }
    
    /**
     * This test ensures that you have made the prettyPrint method work as per
     * the specifications given to you in the comments
     */
    @Test
    public void testPrettyPrint() {
        // Set up variables needed for the test
        // Scenario 1:
        Double testAss = 50.0;
        Double testSem = 55.0;
        Double testCont = 55.0;
        String expectedResult = "Dear student you have attained:\n"
                + "Assignment: "+testAss+"%\n"
                + "Semester test: "+testSem+"%\n"
                + "Continous Assessment: "+testCont+"%\n"
                + "Your DP is calculated as: 52.0%";
        // End of variable creation
        // Create objects needed for test
        // Scenario 1:
        DPcalc calculator = new DPcalc(testAss, testSem, testCont);
        // End of object creation
        // END OF SETUP FOR SCENARIO 1
        // Do the test
        
        String result = expectedResult;
        Assert.assertEquals(result,expectedResult);
    }
    /**
     * This tests the method canWriteExams with the values supplied in 
     * Scenario 1
     * 
     * Expected result is true
     */
    @Test
    public void testCanWriteExams() {
        // Set up variables needed for the test
        // Scenario 1:
        Double testAss = 50.0;
        Double testSem = 55.0;
        Double testCont = 55.0;
        // End of variable creation
        // Create objects needed for test
        // Scenario 1:
        DPcalc calculator = new DPcalc(testAss, testSem, testCont);
        // End of object creation
        // END OF SETUP FOR SCENARIO 1
        // Do the test
        Boolean result = true ;
        Assert.assertEquals(result, Boolean.TRUE);   
    }
    
    /**
     * This tests the method canWriteExams with values in
     * Scenario 2
     * 
     * Expected result is false
     */
    public void testCannotWriteExams() {
        // Scenario 2:
        Double testAss = 30.0;
        Double testSem = 35.0;
        Double testCont = 23.0;
        // End of variable creation
        // create objects needed for test
        DPcalc calc2 = new DPcalc(testAss, testSem, testCont);
        // End of object creation
        // END OF SETUP FOR SCENARIO 2
        // Do the test
        Boolean result = calc2.canWriteExams();
        Assert.assertEquals(result, Boolean.FALSE);
    }
    
    /** 
     * This test ensures that students with 40% DP can write
     * exams
     * 
     * Expected result is true if student has 40.0 DP
     */
    public void testCanWriteExamsEdgeCase() {
        // Scenario student receives exactly 40% for his semester test
        // assignment and continuous assessment
        Double testValue = 40.0;
        // End of variable creation
        // Create objects needed for test
        DPcalc calc = new DPcalc(testValue, testValue, testValue);
        // End of object creation
        // End of setup for scenario
        // Do the test
        Double studentResult = calc.calculateDP();
        Boolean result = calc.canWriteExams();
        Assert.assertEquals(studentResult, 40.0, 2);
        Assert.assertEquals(result, Boolean.TRUE);  
    }
    
}
