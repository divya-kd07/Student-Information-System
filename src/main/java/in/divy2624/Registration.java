package in.divy2624;

import java.time.LocalDate;
import java.util.ArrayList;

public class Registration 
{
	
	/**
	 * The application method is like as application form details.
	 * To create a student class
	 * All student information stored in class object.
	 */
	static Student d =new Student();
	public static void Application()
	{
		String name1="K.DIVYA";
		String name2="R.KUMAR";
		String name3="K.RAJESWARI";
		String emailId="divya@gmail.com";
		String passWord="divyamar";
		String rollNo="17uix079";
		String gender="FEMALE";
		String address="ANNA NAGAR";
		String city="CHENNAI";
		String occupation="MASON";
		String bloodGroup="A+ve";
		String standard="IX";
		Long parentMobileNumber=9080605049l;
		String dateOfBirth="2000-06-07";
		LocalDate dob=LocalDate.parse(dateOfBirth);
		String dateOfJoining="2005-06-08";
		LocalDate doj=LocalDate.parse(dateOfJoining);
		
		d.name1=name1;
		d.name2=name2;
		d.name3=name3;
		d.emailId=emailId;
		d.passWord= passWord;
		d.rollNo=rollNo;
		d.gender=gender;
		d.address=address;
		d.city=city;
		d.occupation=occupation;
		d.bloodGroup=bloodGroup;
		d.standard=standard;
		d.parentMobileNumber=parentMobileNumber;
		d.dateOfBirth=dob;
		d.dateOfJoining=doj;
	    Register(d);
	}
	
	/**
	 * To create static ArrayList 
	 * The static ArrayList is used in two methods.so I using static ArrayList.
	 */
	
	static ArrayList<Student> register=new ArrayList<Student>();
	
	/**
	 * I going to add student information in ArrayList as register.
	 * Class object name is d .
	 * To call the Details method.
	 */
	
	public static void Register(Student d)
	{
		register.add(d);
		Details();

	}
	
	// The Details method used to display the student information.
	
	public static void Details()
	{
		System.out.println("************************************APPLICATION************************************");
		System.out.println("************************************WELCOME****************************************");
		
		for(Student d: register) 
		{
			 System.out.println("NAME:"+d.name1+"\n"+"FATHER NAME:"+d.name2+"\n"+"MOTHER NAME:"+d.name3+"\n"+"EMAIL-ID:"+d.emailId+"\n"+"PASSWORD:"+d.passWord+"\n"+ "ROLLNUMBER:"+d.rollNo+"\n"+ 
		    "GENDER:"+d.gender+"\n"+"ADDRESS:"+d.address+"\n"+"CITY:"+d.city+"\n"+"OCCUPATION:"+d.occupation+"\n"+"BLOOD-GROUP:"+d.bloodGroup+"\n"+"CLASS:"+d.standard+"\n"+
			"PARENT MOBILE NUMBER:"+d.parentMobileNumber+"\n"+"DATE OF BIRTH:"+d.dateOfBirth+"\n"+"DATEOF JOINING OUR EDUCATION:"+d.dateOfJoining);
			
		
		}
	}
	

}
