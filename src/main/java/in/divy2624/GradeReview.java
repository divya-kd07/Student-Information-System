/**
 * 
 */
package in.divy2624;
/**
 * @author divy2624
 *
 */
public class GradeReview 
{
	/**
	 *This method is used to feature3-display comments for grade.
	 */
	
	public static String gradeComment(String finalGrade)
	{
		/**
		 * @param finalGrade
		 * @return
		 */
		
	 	String fGrade=finalGrade;
		String result;
		if(fGrade=="A") 
		{
			result="EXCELLENT";
			
		}
		else if(fGrade=="B")
		{
			result="GOOD";
		}
		else {
			result="BAD";
		}
	    
		return result;
	
	}
}	
		
		
	


