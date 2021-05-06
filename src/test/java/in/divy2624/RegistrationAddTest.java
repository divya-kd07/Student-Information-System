/**
 * 
 */
package in.divy2624;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

/**
 * @author divy2624
 *
 */
public class RegistrationAddTest 
{
	
	/**
	 * Feature1: Registration-Add the student details to the ArrayList
	 * To check it is successfully add or not.
	 */
	
	@Test
	public void studentInputDetails() 
	{
		StudentDetails user =new StudentDetails();
		String studentName="K.DIVYA";
		String fatherName="R.KUMAR";
		String motherName="K.RAJESWARI";
		String emailId="divya@gmail.com";
		String passWord="divyamar";
		String rollNo="DD23CC8767";
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
		
		user.studentName=studentName;
		user.fatherName=fatherName;
		user.motherName=motherName;
		user.emailId=emailId;
		user.passWord= passWord;
		user.rollNo=rollNo;
		user.gender=gender;
		user.address=address;
		user.city=city;
		user.occupation=occupation;
		user.bloodGroup=bloodGroup;
		user.standard=standard;
		user.parentMobileNumber=parentMobileNumber;
		user.dateOfBirth=dob;
		user.dateOfJoining=doj;
	    boolean isAdd=Registration.register(user);
	    assertTrue(isAdd);
	    
	
	
	}
}
