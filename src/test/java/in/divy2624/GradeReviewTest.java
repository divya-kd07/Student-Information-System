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

public class GradeReviewTest
{
	/**
	 * To check-passing first test grade and return comment.
	 */
	
	@Test
	public void gradeReview1()
	{
		String comment1=GradeReview.gradeComment("A");
		assertEquals("EXCELLENT",comment1);
	}
	
	/**
	 * To check-passing second test grade and return comment.
	 */
	
	@Test
	public void gradeReview2()
	{
		String comment2=GradeReview.gradeComment("B");
		assertEquals("GOOD",comment2);
	}
	
	/**
	 * To check-passing third test grade and return comment.
	 */
	
	@Test
	public void gradeReview3()
	{
		String comment3=GradeReview.gradeComment("C");
		assertEquals("BAD",comment3);
	}
	

}
