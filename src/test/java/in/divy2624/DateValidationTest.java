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
public class DateValidationTest
{
	/**
	 * To check-passing the date of birth and return true that is date is correct format
	 */
	
	@Test
	public void dateTest1()
    {
		String studentDob="06/07/2000";//(MM/DD/YYYY)
        boolean dob1=DateValidation.isValidDate(studentDob);
        assertTrue(dob1);
    }
	
	/**
	 * To check-passing the date of birth and return true that is date is incorrect format
	 */
	
	@Test
	public void dateTest2()
    {
		String studentDob1="17/07/2000";//(MM/DD/YYYY)
        boolean dob2=DateValidation.isValidDate(studentDob1);
        assertFalse(dob2);
    }

}
