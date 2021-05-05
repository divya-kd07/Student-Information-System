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
public class PasswordValidationTest {
	
	/**
	 * To check the given password is valid.
	 */
	
		@Test
		public void passwordTest1() 
		{
			String userPwd="Vanith@19";
			boolean userPassword=PasswordValidation.isValidPassword(userPwd);
			assertTrue(userPassword);
			
		}
		
		/**
		 * To check the given password is invalid.
		 */
		
		@Test
		public void  passwordTest2() 
		{
			String userPwd="Yavithi9";
			boolean userPassword=PasswordValidation.isValidPassword(userPwd);
			assertFalse(userPassword);
			
		}
}
