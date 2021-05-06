/**
 * 
 */
package in.divy2624;

/**
 * @author divy2624
 *
 */
public class GradeMarks
{
	
	/**
	 *This method is used to feature3-calculate grade for marks.
	 */
	
	public static String getGrade(int marks) 
	{
		
		/** 
		 * @param marks
		 * @return
		 */
		
         String grade=null;
         if(marks>90)
         {
        	 grade="A";
         }
         else if( marks<=90 && marks>=70) 
         {
        	 grade="B";
         }
         else
         {
        	 grade="C";
         }
         return grade;
	}

}
