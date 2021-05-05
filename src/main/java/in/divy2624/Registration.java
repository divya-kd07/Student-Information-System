package in.divy2624;


import java.util.ArrayList;

public class Registration 
{
	
	/**
	 * FEATURE1 : REGISTRATION
	 * To create static ArrayList 
	 * The static ArrayList is used in two methods.so I using static ArrayList.
	 */
	
	static ArrayList<StudentDetails> register=new ArrayList<StudentDetails>();
	
	/**
	 * I going to add student information in ArrayList as register.
	 * Class object name is user. 
	 * @return 
	 */
	
	public static boolean register(StudentDetails user)
	{
		return register.add(user);
		
	}
	
	/**
	 * To display Student details from ArrayList 
	 * @return 
	 */

	public static boolean display(StudentDetails user)
	{
		// TODO Auto-generated method stub
		System.out.println("************************************APPLICATION************************************");
		System.out.println("************************************WELCOME****************************************");
		
		for(StudentDetails user1: register) 
		{
			 System.out.println("NAME:"+user1.name1+"\n"+"FATHER NAME:"+user1.name2+"\n"+"MOTHER NAME:"+user1.name3+"\n"+"EMAIL-ID:"+user1.emailId+"\n"+"PASSWORD:"+user1.passWord+"\n"+ "ROLLNUMBER:"+user1.rollNo+"\n"+ 
		    "GENDER:"+user1.gender+"\n"+"ADDRESS:"+user1.address+"\n"+"CITY:"+user1.city+"\n"+"OCCUPATION:"+user1.occupation+"\n"+"BLOOD-GROUP:"+user1.bloodGroup+"\n"+"CLASS:"+user1.standard+"\n"+
			"PARENT MOBILE NUMBER:"+user1.parentMobileNumber+"\n"+"DATE OF BIRTH:"+user.dateOfBirth+"\n"+"DATEOF JOINING OUR EDUCATION:"+user.dateOfJoining);
			 System.out.println("REGISTRATION SUCESSFULLY");
			
		
		}
		return true;
		
	}
	
}
	
	

