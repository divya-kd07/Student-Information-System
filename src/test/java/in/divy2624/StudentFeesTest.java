package in.divy2624;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class StudentFeesTest 
{
	/**
	 * To check-passing first term fees  then return he fees value.
	 */
	
	@Test
	public void feesDisplay1() 
	{
		StudentFees.studentFees();	
		String firstTeamFees="FIRST-TERM-FEES";
		int studentFees1=StudentFees.feesDisplay(firstTeamFees);
		assertEquals(5000,studentFees1);
	}
	
	/**
	 * To check-passing second term fees  then return he fees value.
	 */
	
	@Test
	public void feesDisplay2() 
	{
		
		String secondTeamFees="SECOND-TERM-FEES";
		int studentFees2=StudentFees.feesDisplay(secondTeamFees);
		assertEquals(5100,studentFees2);
	}
	
	/**
	 * To check-passing third term fees  then return he fees value.
	 */
	
	@Test
	public void feesDisplay3() 
	{
		
		String thirdTeamFees="THIRD-TERM-FEES";
		int studentFees3=StudentFees.feesDisplay(thirdTeamFees);
		assertEquals(5200,studentFees3);
	}
	
	/**
	 * To check-passing Tution fees  then return he fees value.
	 */
	
	@Test
	public void feesDisplay4() 
	{
		
		String tutionFees="TUTION-FEES";
		int studentFees4=StudentFees.feesDisplay(tutionFees);
		assertEquals(3000,studentFees4);
	}
	
	/**
	 * To check-passing book fees  then return he fees value.
	 */
	
	@Test
	public void feesDisplay5()
	{
		
		String bookFees="BOOK-FEES";
		int studentFees5=StudentFees.feesDisplay(bookFees);
		assertEquals(4500,studentFees5);
	}
	
	/**
	 * To check-passing extra activity fees  then return he fees value.
	 */
	
	@Test
	public void feesDisplay6() 
	{
		
		String extraFees="EXTRA-ACTIVITY-FEES";
		int studentFees6=StudentFees.feesDisplay(extraFees);
		assertEquals(8000,studentFees6);
	}

}
