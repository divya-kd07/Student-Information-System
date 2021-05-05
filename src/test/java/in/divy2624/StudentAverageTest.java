/**
 * 
 */
package in.divy2624;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author divy2624
 *
 */
public class StudentAverageTest {
	
	/**
	 * To check-passing first total mark and return average.
	 */
	
	@Test
	public void firstTestMarkAverage()
	{
	float averageTest1=StudentAverage.studentAverage(490);
	assertEquals(98.0,averageTest1,0.001);
	}
	
	/**
	 * To check-passing second total mark and return average.
	 */
	
	@Test
	public void secondTestMarkAverage()
	{
	float averageTest2=StudentAverage.studentAverage(463);
	assertEquals(92.0,averageTest2,0.001);
	}
	
	/**
	 * To check-passing third total mark and return average.
	 */
	
	@Test
	public void thirdTestMarkAverage()
	{
	float averageTest3=StudentAverage.studentAverage(491);
	assertEquals(98.0,averageTest3,0.001);
	}



}
