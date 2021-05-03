/**
 * 
 */
package in.divy2624;

/**
 * @author divy2624
 *
 */
public class GradeMarks {
	public static String getGrade(int marks) {
		// TODO Auto-generated method stub
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
