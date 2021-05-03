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
	public static void visitors() {
		ArrayList<String>type=new ArrayList<String>();
		type.add("STUDENTS");
		type.add("PUBLIC");
		System.out.println("ENTER YOUR TYPE : " +type.get(0));
		if(type.get(0) != null)
		{
			String rollNo="IX01XX8997";
			 visitorStudents(rollNo);
		}
		else
		{
			 String userMailId="selva@gmail.com";
			 visitorPublic(userMailId);
		}
	}
	
	public static void visitorStudents(String rollNo) 
	{
		
		if(RollNumberValidation.isValidRollNo(rollNo)) 
		{
			WelcomePage.welcome();
		}
		else 
		{
		    System.out.println("PLEASE ENTER YOUR CORRECT ROLLNUMBER");
		}

	}
	
	public static void visitorPublic(String userMailId) 
	{
		
		if(EmailValidation.isValid(userMailId)) 
		{
			WelcomePage.welcome();
		}
		else 
		{
		    System.out.println("PLEASE ENTER YOUR CORRECT PASSWORD");
		}

	}
}
