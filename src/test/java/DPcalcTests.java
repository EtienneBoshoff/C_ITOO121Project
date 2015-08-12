
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
import za.ac.pearson.cti.studentdpcalculator.Subject;
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
        Double testResult1 = calculator.calculateDP();
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
        Double testResult2 = calc2.calculateDP();
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
        
        String result = calculator.prettyPrintDPreport();
        Assert.assertEquals(expectedResult, result);
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
        Boolean result = calculator.canWriteExams();
        Assert.assertEquals(Boolean.TRUE, result);   
    }
    
    /**
     * This tests the method canWriteExams with values in
     * Scenario 2
     * 
     * Expected result is false
     */
    @Test
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
        Assert.assertEquals(Boolean.FALSE, result);
    }
    
    /** 
     * This test ensures that students with 40% DP can write
     * exams
     * 
     * Expected result is true if student has 40.0 DP
     */
    @Test
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
        Assert.assertEquals(Boolean.TRUE, result);  
    }
    
    /**
     * This test will take a valid DV number and verify it to be true
     * 
     * Test DV Number: DV2015-0123
     */
    @Test
    public void testValidDVnum() {
        //Set up data
        String testDVnumber = "DV2015-0123";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject";
        Double testWeightValues = 10.0;
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        
        //Test value
        Boolean result = calc.verifyDVnum();
        
        //Check results
        //Expected result value of true
        Assert.assertEquals(Boolean.TRUE, result); 
    }
    
    /**
     * This tests an invalid DV number where the date portion of the 
     * DV number is incorrect
     * 
     * Test DV number = "DV-200-0123"
     * 
     * Expected Result = false
     */
    @Test
    public void testInvalidDVnumWithDatePartThatIsWrong() {
        //Set up data
        String testDVnumber = "DV-200-0123";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject";
        Double testWeightValues = 10.0;
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        //Test value
        Boolean result = calc.verifyDVnum();
        
        //Check results
        //Expected result value of false
        Assert.assertEquals(Boolean.FALSE, result);
    }
    
    /**
     * This tests an Invalid DV number where the last 4 digits of the
     * DV number are incorrect
     * 
     * Test DV number = DV2015-ab23
     * 
     * Expected Result is false
     */
    @Test
    public void testInvalidDVnumWithLast4DigitsThatIsWrong() {
        //Set up data
        String testDVnumber = "DV2015-ab23";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject";
        Double testWeightValues = 10.0;
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        //Test value
        Boolean result = calc.verifyDVnum();
        
        //Check results
        //Expected result value of false
        Assert.assertEquals(Boolean.FALSE, result);
    }
    
    /**
     * This tests an Invalid DV number where the DV number is too short
     * 
     * Test DV number = DV1999-123
     * 
     * Expected result is false
     */
    @Test
    public void testInvalidDVnumThatIsTooShort() {
        //Set up data
        String testDVnumber = "DV1999-123";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject";
        Double testWeightValues = 10.0;
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        //Test value
        Boolean result = calc.verifyDVnum();
        
        //Check results
        //Expected result value of false
        Assert.assertEquals(Boolean.FALSE, result); 
    }
    
    /**
     * This test checks an Invalid DV number that is too long
     * 
     * Test DV number = DV1999-12335
     * 
     * Expected Result is false
     */
    @Test
    public void testInvalidDVnumThatIsTooLong() {
        //Set up data
        String testDVnumber = "DV1999-12335";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject";
        Double testWeightValues = 10.0;
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        //Test value
        Boolean result = calc.verifyDVnum();
        
        //Check results
        //Expected result value of false
        Assert.assertEquals(Boolean.FALSE, result);
    }
    
    /**
     * This tests an Invalid DV number that is missing the "-"
     * 
     * Test DV number = DV199901123
     * 
     * Expected result is false
     */
    @Test
    public void testInvalidDVnumThatIsMissingTheDash() {
        //Set up data
        String testDVnumber = "DV199901123";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject";
        Double testWeightValues = 10.0;
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        //Test value
        Boolean result = calc.verifyDVnum();
        
        //Check results
        //Expected result value of false
        Assert.assertEquals(Boolean.FALSE, result);
    }
    
    /**
     * This tests an Invalid DV number that has the "-" in the wrong
     * place for the DV number
     * 
     * Test DV number = DV19993-123
     * 
     * Expected result is false
     */
    @Test
    public void testInvalidDVnumThatHasAdashInTheWrongPlace() {
        //Set up data
        String testDVnumber = "DV19993-123";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject";
        Double testWeightValues = 10.0;
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        //Test value
        Boolean result = calc.verifyDVnum();
        
        //Check results
        //Expected result value of false
        Assert.assertEquals(Boolean.FALSE, result);
    }
    
    /**
     * Simple test that just ensures that you have all the accessors required
     * 
     * Should pass without a "You still need to complete this method" error
     */
    @Test
    public void testThatYouHaveAllAccessors() {
        //Set up data
        String testDVnumber = "DV1999-123";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject";
        Double testWeightValues = 10.0;
        Double newTestWeightValueForAssessment = 0.50;
        Double newTestWeightValueForSemesterTest = 0.25;
        Double newTestWeightValueForContinuousAssessment = 0.25;
                
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        //Test values
        calc.setAssignmentWeight(newTestWeightValueForAssessment);
        calc.setContinuousAssessmentWeight(newTestWeightValueForContinuousAssessment);
        calc.setSemesterTestWeight(newTestWeightValueForSemesterTest);
        
        Double result1 = calc.getAssignmentMark();
        Double result2 = calc.getContinuousAssessmentMark();
        Double result3 = calc.getSemesterMark();
        
        //Check things have been retrieved 
        Assert.assertEquals(result1, result2);
        Assert.assertEquals(result1, result3);
        Assert.assertEquals(testAssessmentValues, result1);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetAssignmentWithSubjectThatDoesNotExist() {
        //Set up data
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = "Other test subject";
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getAssignmentMark(valueToTest);
    } 
    
    @Test
    public void testGetAssignmentWhereSubjectIsInCapitalLetters() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject.toUpperCase();
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getAssignmentMark(valueToTest);
        
        Assert.assertEquals(50.0, result,1);
    }
    
    @Test
    public void testGetAssignmentWhereSubjectIsOnlyInLowerCase() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject.toLowerCase();
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getAssignmentMark(valueToTest);
        
        Assert.assertEquals(50.0, result,1);
    }
    
    @Test
    public void testGetAssignmentMarkWithMultipleSubjects() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        Double testAssessmentValues2 = 35.0;
        Double testAssessmentValues3 = 65.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        String testSubject2 = "Test subject 2";
        String testSubject3 = "Test subject 3";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject3;
        
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        calc.addSubject(new Subject(testSubject2,testAssessmentValues2,testAssessmentValues2,testAssessmentValues2,testWeightValues,testWeightValues,testWeightValues));
        calc.addSubject(new Subject(testSubject3,testAssessmentValues3,testAssessmentValues3,testAssessmentValues3,testWeightValues,testWeightValues,testWeightValues));
        
        Double result = calc.getAssignmentMark(valueToTest);
        
        Assert.assertEquals(65.0, result,1);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetSemesterTestWithSubjectThatDoesNotExist() {
        //Set up data
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = "Other test subject";
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getSemesterTestMark(valueToTest);
    } 
    
    @Test
    public void testGetSemesterTestWhereSubjectIsInCapitalLetters() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject.toUpperCase();
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getSemesterTestMark(valueToTest);
        
        Assert.assertEquals(50.0, result,1);
    }
    
    @Test
    public void testGetSemesterTestWhereSubjectIsOnlyInLowerCase() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject.toLowerCase();
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getSemesterTestMark(valueToTest);
        
        Assert.assertEquals(50.0, result,1);
    }
    
    @Test
    public void testGetSemesterTestMarkWithMultipleSubjects() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        Double testAssessmentValues2 = 35.0;
        Double testAssessmentValues3 = 65.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        String testSubject2 = "Test subject 2";
        String testSubject3 = "Test subject 3";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject3;
        
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        calc.addSubject(new Subject(testSubject2,testAssessmentValues2,testAssessmentValues2,testAssessmentValues2,testWeightValues,testWeightValues,testWeightValues));
        calc.addSubject(new Subject(testSubject3,testAssessmentValues3,testAssessmentValues3,testAssessmentValues3,testWeightValues,testWeightValues,testWeightValues));
        
        Double result = calc.getSemesterTestMark(valueToTest);
        
        Assert.assertEquals(65.0, result,1);
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetContinuousAssessmentWithSubjectThatDoesNotExist() {
        //Set up data
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 10.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = "Other test subject";
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getContinuousAssessmentMark(valueToTest);
    } 
    
    @Test
    public void testGetContinuousAssessmentWhereSubjectIsInCapitalLetters() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject.toUpperCase();
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getContinuousAssessmentMark(valueToTest);
        
        Assert.assertEquals(50.0, result,1);
    }
    
    @Test
    public void testGetContinuousAssessmentWhereSubjectIsOnlyInLowerCase() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject.toLowerCase();
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        
        Double result = calc.getContinuousAssessmentMark(valueToTest);
        
        Assert.assertEquals(50.0, result,1);
    }
    
    @Test
    public void testGetContinuousAssessmentWithMultipleSubjects() {
        String testDVnumber = "DV1999-1234";
        Double testAssessmentValues = 50.0;
        Double testAssessmentValues2 = 35.0;
        Double testAssessmentValues3 = 65.0;
        String testName = "Test student";
        String testSubject = "Test subject 1";
        String testSubject2 = "Test subject 2";
        String testSubject3 = "Test subject 3";
        Double testWeightValues = 10.0;
        String valueToTest = testSubject3;
        
        DPcalc calc = new DPcalc(testAssessmentValues,testAssessmentValues,testAssessmentValues, testName, testDVnumber, testSubject, testWeightValues, testWeightValues, testWeightValues);
        calc.addSubject(new Subject(testSubject2,testAssessmentValues2,testAssessmentValues2,testAssessmentValues2,testWeightValues,testWeightValues,testWeightValues));
        calc.addSubject(new Subject(testSubject3,testAssessmentValues3,testAssessmentValues3,testAssessmentValues3,testWeightValues,testWeightValues,testWeightValues));
        
        Double result = calc.getContinuousAssessmentMark(valueToTest);
        
        Assert.assertEquals(65.0, result,1);
    }
}
