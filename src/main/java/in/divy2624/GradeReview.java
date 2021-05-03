/**
 * 
 */
package in.divy2624;

import java.util.ArrayList;


/**
 * @author divy2624
 *
 */
public class GradeReview 
{
	static ArrayList<String> review = new ArrayList<String>();
	public static void Comment(String finalGrade3)
	{
	    review.add("A");
		review.add("GRADE A : EXCELLENT");
		review.add("B");
		review.add("GRADE B : GOOD");
		review.add("C");
		review.add("GRADE C : IMPROVE YOURSELF");
		
		System.out.println("INFORMATION AND GRADE INFORMATION :\n\n"+review.get(1)+"\n"+review.get(3)+"\n"+review.get(5)+"\n");
		System.out.println("------------------------------------------------------OVERALL PERFORMANCE-------------------------------------------------");
		String fGrade=finalGrade3;
		if(fGrade==review.get(0)) {
			System.out.println("YOUR PERFORMANCE IS :"+review.get(1));
		}
		else if(fGrade==review.get(2)) {
			System.out.println("YOUR PERFORMANCE IS :"+review.get(3));
			}
		else {
			System.out.println("YOUR PERFORMANCE IS :"+review.get(5));
		}
	
		System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
	
	}
}	
		
		
	


