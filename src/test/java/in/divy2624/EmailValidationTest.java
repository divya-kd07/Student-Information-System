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
public class EmailValidationTest 
{
	
	/**
	 * To check the given emailId is valid.
	 */
	
	@Test
	public void emailTest1() 
	{
		String emailId="selva@gmail.com";
		boolean emailId1=EmailValidation.isValid(emailId);
		assertTrue(emailId1);
		
	}
	
	/**
	 * To check the given emailId is invalid.
	 */
	
	@Test
	public void emailTest2() 
	{
		String emailId1="divgamail.com";
		boolean emailId2=EmailValidation.isValid(emailId1);
		assertFalse(emailId2);
		
	}
	

}
