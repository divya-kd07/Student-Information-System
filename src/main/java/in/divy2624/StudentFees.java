/**
 * 
 */
package in.divy2624;

import java.util.HashMap;
import java.util.Set;

/**
 * @author divy2624
 *
 */
public class StudentFees
{
	/**
	 * FEATURE 4 : FeesDisplay
	 * All fees are stored in HashMap.
	 */
	
	static HashMap<String,Integer>fees=new HashMap<String,Integer>();
	
	public static void studentFees() 
	{
		
		fees.put("FIRST-TERM-FEES", 5000);
		fees.put("SECOND-TERM-FEES", 5100);
		fees.put("THIRD-TERM-FEES", 5200);
		fees.put("TUTION-FEES", 3000);
		fees.put("BOOK-FEES", 4500);
		fees.put("EXTRA-ACTIVITY-FEES", 8000);
		
	}
	
	/**
	 * FEATURE 4 : FeesDisplay
	 * display the fees.
	 */
	
	
	public static int feesDisplay(String typeFees)
	{
		/** 
		 * @param typeFees
		 * @return
		 */
		
		Integer feesValue=fees.get(typeFees);
		return feesValue;
		
	}

}
