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
public class StudentFees {
	public static void totalFees() {
		HashMap<String,Integer>fees=new HashMap<String,Integer>();
		fees.put("FIRST TERM FEES  ", 5000);
		fees.put("SECOND TERM FEES  ", 5100);
		fees.put("THIRD TERM FEES  ", 5200);
		fees.put("TUTION FEES  ", 3000);
		fees.put("BOOK FEES  ", 4500);
		fees.put("EXTRA-ACTIVITY FEES  ", 8000);
		int studentFees=0;
		Set<String> keySet =fees.keySet();
		for(String key : keySet)
		{
			Integer value=fees.get(key);
			System.out.println(key+":"+value);
			studentFees+=value;
		}
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("YOUR TOTAL FEES IS : "+studentFees);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

		
		
	}

}
