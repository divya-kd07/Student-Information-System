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
public class ParentLoginTest
{
	
	/**
	 * FEATURE 2 : LOGIN-PARENT
	 * To check it is successfully login or not
	 * 
	 * First test case is to pass correct rollNo,dateOfBirth and return the true that is successfully login.
	 */
	
		@Test
		public void loginTest1() 
		{
			String rollNumber1= "XX23UU6787";
			String dob1="09/08/2000";
		    boolean login1=ParentLogin.parentLogin(rollNumber1,dob1);
		    assertTrue(login1);
		}
		
		/**
		 * Second test case is to pass wrong rollNumber and correct dateOfBirth and return the false that is rollNumber is wrong
		 */
		
		@Test
		public void loginTest2()  
		{
			String rollNumber2= "XX2387";
			String dob2="09/08/2000";
		    boolean login2=ParentLogin.parentLogin(rollNumber2,dob2);
		    assertFalse(login2);
		}
		
		/**
		 * Third test case is to pass correct rollNumber and wrong dateOfBirth and return the false that is dateOfBirth is wrong
		 */
		
		@Test
		public void loginTest3() 
		{
			String rollNumber3= "CC28UU6787";
			String dob3="26/08/2000";
		    boolean login3=ParentLogin.parentLogin(rollNumber3,dob3);
		    assertFalse(login3);
		}
		
		
		
		
		
		
		
	


}
