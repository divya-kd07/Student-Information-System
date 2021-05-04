/**
 * 
 */
package in.divy2624;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

/**
 * @author divy2624
 *
 */
public class SchoolStudentInformationTest {

	
	/**
	 * Feature 1 : The first feature is Visiting School Welcome Page
	 * The process of Visiting School Welcome Page  
	 * student
	 * public
	 * if you are student,enter your rollNo.
	 * if you are public ,enter your emailId.
	 * To check  test 2cases, 1. RollNumberValidation task,2.EmailValidation task.
	 */
	
	/**
	 * TEST CASE1: To check if STUDENT type is passing to checkType method it is correctly work or not.
	 */
	
	@Test
	public void test1() 
	{
	    User user =new User();
		String type1="K.DIVYA";
		String type2="R.KUMAR";
		user.type1=type1;
		user.type2=type2;
		boolean isTypeAdd=UserVisitPage.visitors(user);
		assertTrue(isTypeAdd);
	}
	
	@Test
	public void test2() 
	{
	    String userType="STUDENT";
		String input=UserVisitPage.checkType(userType);
		assertEquals("STUDENT",input);
		
	}
	
	/**
	 * TEST CASE1: To check if PUBLIC type is passing to checkType method it is correctly work or not.
	 */
	
	@Test
	public void test3() 
	{
		String userType1="PUBLIC";
		String input=UserVisitPage.checkType(userType1);
		assertEquals("PUBLIC",input);
		
	}
	
	/**
	 * To check the given rollNo is valid
	 */
	
	@Test
	public void test4() 
	{
		String rollNo="YY23CC8767";
		boolean rollNumber=RollNumberValidation.isValidRollNo(rollNo);
		assertTrue(rollNumber);
		
	}
	
	/**
	 * To check the given rollNo is not valid.
	 */
	
	@Test
	public void test5() 
	{
		String rollNo1="78898XX";
		boolean rollNumber1=RollNumberValidation.isValidRollNo(rollNo1);
		assertFalse(rollNumber1);
		
	}
	
	/**
	 * To check the given emailId is valid.
	 */
	
	@Test
	public void test6() 
	{
		String emailId="selva@gmail.com";
		boolean emailId1=EmailValidation.isValid(emailId);
		assertTrue(emailId1);
		
	}
	
	/**
	 * To check the given emailId is not valid.
	 */
	
	@Test
	public void test7() 
	{
		String emailId1="divgamail.com";
		boolean emailId2=EmailValidation.isValid(emailId1);
		assertFalse(emailId2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	//task1:To check the Registration process.
	
	@Test
	public void test5() 
	{
		Registration.Details();
		
	}
	
	//task2:To check the EmailValidation process.
	
	@Test
	public void test6() 
	{
		String email="divya@gmail.com";
		boolean userEmail=EmailValidation.isValid(email);
		assertEquals(true,userEmail);
	}
	
	@Test
	public void test7() 
	{
		String email="divyagmail.com";
		boolean userEmail=EmailValidation.isValid(email);
		assertEquals(false,userEmail);
	}
	
	//task3:To check the PasswordValidation process.
	
	@Test
	public void test8() 
	{
		String password="Yavithi@89";
		boolean userPassword=PasswordValidation.isValidPassword(password);
		assertEquals(true,userPassword);
	}
	
	@Test
	public void test9() 
	{
		String password="divya78";
		boolean userPassword=PasswordValidation.isValidPassword(password);
		assertEquals(false,userPassword);
	}

	//task4:To check the Login process.
	
	@Test
	public void test10() 
	{
		Login.UserLogin();
		
	}
	

	//task 5: Passing average for getting the grade.
	
	@Test
	public void test11() 
	{
		int average=65;
		String grade=GradeMarks.getGrade(average);
		assertEquals("C",grade);
	}
	
	//task 6: check the grade
	
	@Test
	public void test12() 
	{
		String grade="B";
		GradeReview.Comment(grade);
		
	}
	
	*/
	
}
