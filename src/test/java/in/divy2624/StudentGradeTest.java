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
public class StudentGradeTest {
	
	/**
	 * To check-passing first average mark and return grade.
	 */
	
	@Test
	public void gradeMark() 
	{
		String gradeMark1=GradeMarks.getGrade(92);
		assertEquals("A",gradeMark1);
		
	}
	
	/**
	 * To check-passing second average mark and return grade.
	 */
	
	@Test
	public void gradeMark2()
	{
		String gradeMark2=GradeMarks.getGrade(70);
		assertEquals("B",gradeMark2);
		
	}
	
	/**
	 * To check-passing third average mark and return grade.
	 */
	
	@Test
	public void gradeMark3() {
		String gradeMark3=GradeMarks.getGrade(50);
		assertEquals("C",gradeMark3);
		
		
	}

}
