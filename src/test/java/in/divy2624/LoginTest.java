/**
 * 
 */
package in.divy2624;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author divy2624
 *
 */
public class LoginTest {
	
	/**
	 * FEATURE 2 : LOGIN
	 * To check it is successfully login or not
	 * 
	 * First test case is to pass correct emailId,userPassword,mobileNumber and return the true that is successfully login.
	 */
	
		@Test
		public void loginTest1() 
		{
			String emailId = "divya@gmail.com";
			String userPassword="Yavithi@89";
			Long userMob=9080767678l;
			String mobileNumber=String.valueOf(userMob);
		    boolean login1=Login.studentLogin(emailId,userPassword,mobileNumber);
		    assertTrue(login1);
		}
		
		/**
		 * Second test case is to pass wrong mailId and userPassword,mobileNumber and return the false that is emailId is wrong
		 */
		
		@Test
		public void loginTest2()  
		{
			String emailId = "divyagmail.com";
			String userPassword="Yavithi@89";
			Long userMob=9080767678l;
			String mobileNumber=String.valueOf(userMob);
		    boolean login2= Login.studentLogin(emailId,userPassword,mobileNumber);
		    assertFalse(login2);
		}
		
		/**
		 * Second test case is to pass wrong userPassword and emailId,mobileNumber and return the false that is userPassword is wrong
		 */
		
		@Test
		public void loginTest3() 
		{
			String emailId = "divya@gmail.com";
			String userPassword="Yavithi@";
			Long userMob=9080767678l;
			String mobileNumber=String.valueOf(userMob);
		    boolean login3= Login.studentLogin(emailId,userPassword,mobileNumber);
		    assertFalse(login3);
		}
		
		/**
		 * Third test case is to pass wrong userMob and emailId,userPassword and return the false that is mobileNumber is wrong
		 */
		
		@Test
		public void loginTest4() 
		{
			String emailId = "divya@gmail.com";
			String userPassword="Yavithi@89";
			Long userMob=908076l;
			String mobileNumber=String.valueOf(userMob);
		    boolean login4= Login.studentLogin(emailId,userPassword,mobileNumber);
		    assertFalse(login4);
		}
		
		
		
	

}
