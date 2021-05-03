/**
 * 
 */
package in.divy2624;



import static org.junit.Assert.assertEquals;

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
	
	//If student....
	
	@Test
	public void test1() 
	{
		String rollNo="YY23CC8767";
		UserVisitPage.visitorStudents(rollNo);
		
	}
	
	
	@Test
	public void test2() 
	{
		String userMailId="ramyagmail.com";
		UserVisitPage.visitor(userMailId);
		
}
	
	
	
	//task1:To check the Registration process.
	
	@Test
	public void test3() 
	{
		Registration.Details();
		
	}
	
	//task2:To check the EmailValidation process.
	
	@Test
	public void test4() 
	{
		String email="divya@gmail.com";
		boolean userEmail=EmailValidation.isValid(email);
		assertEquals(true,userEmail);
	}
	
	@Test
	public void test5() 
	{
		String email="divyagmail.com";
		boolean userEmail=EmailValidation.isValid(email);
		assertEquals(false,userEmail);
	}
	
	//task3:To check the PasswordValidation process.
	
	@Test
	public void test6() 
	{
		String password="Yavithi@89";
		boolean userPassword=PasswordValidation.isValidPassword(password);
		assertEquals(true,userPassword);
	}
	
	@Test
	public void test7() 
	{
		String password="divya78";
		boolean userPassword=PasswordValidation.isValidPassword(password);
		assertEquals(false,userPassword);
	}

	//task4:To check the Login process.
	
	@Test
	public void test8() 
	{
		Login.UserLogin();
		
	}
	

	//task 5: Passing average for getting the grade.
	
	@Test
	public void test9() 
	{
		int average=65;
		String grade=GradeMarks.getGrade(average);
		assertEquals("C",grade);
	}
	
	//task 6: check the grade
	
	@Test
	public void test10() 
	{
		String grade="B";
		GradeReview.Comment(grade);
		
	}
	
	
	
}
