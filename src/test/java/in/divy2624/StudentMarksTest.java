/**
 * 
 */
package in.divy2624;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author divy2624
 *
 */
public class StudentMarksTest
{
	
	/**
	 * To check - passing first test marks to addition process and return the total
	 */
	
	@Test
	public  void firstTestMarks()
	{
		
		int totalMark1=MarksAddition.addition(97,98,100,98,97);
		assertEquals(490,totalMark1);
		
	}
	
	/**
	 * To check - passing second test marks to addition process and return the total
	 */
	
	@Test
	public void secondTestMarks()
	{
	
		int totalMark2=MarksAddition.addition(90,98,80,98,97);
		assertEquals(463,totalMark2);
	}	
	
	/**
	 * To check - passing third test marks to addition process and return the total
	 */
	
	@Test
	public  void thirdTestMarks()
	{
	
		int totalMark3=MarksAddition.addition(98,98,99,98,98);
		assertEquals(491,totalMark3);
     }	
	
	}
