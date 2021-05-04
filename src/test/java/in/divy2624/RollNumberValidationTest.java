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
public class RollNumberValidationTest {
	
	/**
	 * To check the given rollNo is valid
	 */
	
	@Test
	public void test1() 
	{
		String rollNo="YY23CC8767";
		boolean rollNumber=RollNumberValidation.isValidRollNo(rollNo);
		assertTrue(rollNumber);
		
	}
	
	/**
	 * To check the given rollNo is not valid.
	 */
	
	@Test
	public void test2() 
	{
		String rollNo1="78898XX";
		boolean rollNumber1=RollNumberValidation.isValidRollNo(rollNo1);
		assertFalse(rollNumber1);
		
	}

}
