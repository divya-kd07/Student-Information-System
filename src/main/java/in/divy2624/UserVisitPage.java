/**
 * 
 */
package in.divy2624;

import java.util.ArrayList;


/**
 * @author divy2624
 *
 */
public class UserVisitPage 
{
	static String input;
	
	
	
	/**
	 * To create ArrayList for storing type of user like STUDENT and PUBLIC,
	 * I am entering STUDENT type,so passing student as input to checkType method
	 * @return 
	 */
	

	
	public static boolean visitors(User user) 
	{
		ArrayList<User> userType=new ArrayList<User>();
		return userType.add(user);
		
	}
	
	/**
	 * To check input type is STUDENT or Not.
	 * If STUDENT,rollNo will be entered and it is passing to visitorStudents method.
	 * If PUBLIC,userMailId will be entered and it is passing to visitorPublic method.
	 * @param input
	 * @return input
	 */
	
	public static String checkType(String input )
	{
		if(input=="STUDENT")
		{
			String rollNo="IX01XX8997";
			 visitorStudents(rollNo);
		}
		else
		{
			 String userMailId="selva@gmail.com";
			 visitorPublic(userMailId);
		}
		return input;
	}
	
	/**
	 * If visitor is STUDENT,rollNo is used.
	 * To check if rollNo is  the validRollNo OR Not
	 * IF it is valid rollNo,welcome method in WelcomePage class is displayed.
	 * @param rollNo
	 */
	
	public static void visitorStudents(String rollNo) 
	{
		System.out.println("WELCOME STUDENT ");
		
		if(RollNumberValidation.isValidRollNo(rollNo)) //if validation is correct,call the welcome page.
		{
			WelcomePage.welcome();
		}
		else 
		{
		    System.out.println("PLEASE ENTER YOUR CORRECT ROLLNUMBER");
		}

	}
	
	/**
	 * If visitor is PUBLIC,userMailId is used.
	 * To check if userMailId is  the valid OR Not
	 * IF it is valid userMailId ,welcome method in WelcomePage class is displayed.
	 * @param userMailId
	 */
	
	public static void visitorPublic(String userMailId) 
	{
		System.out.println("WELCOME USER ");
		
		if(EmailValidation.isValid(userMailId)) //if validation is correct,call the welcome page.
		{
			WelcomePage.welcome();
		}
		else 
		{
		    System.out.println("PLEASE ENTER YOUR CORRECT EMAIL-ID");
		}

	}
}
