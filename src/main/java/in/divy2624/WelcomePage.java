/**
 * 
 */
package in.divy2624;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;

/**
 * @author divy2624
 *
 */
public class WelcomePage {
	public static void welcome() {
		
		/**
		 * I assign CHAINSYS HIGHER SECONDARY SCHOOL
		 * School informations are used to store HashMap.because HashMap is used to store 2 data types at a time and also removes duplicates.
		 *  print all information from HashMap
		 *  Also  display School starting date.
		 */
		
		System.out.println("*******************************************************CHAINSYS HIGHER SECONDARY SCHOOL*****************************************************************");
		HashMap<String,Integer>info=new HashMap<String,Integer>();
		info.put("NUMBER OF STUDENTS  ", 600);
		info.put("NUMBER OF STAFFS ", 51);
		info.put("NUMBER OF CLASSROOMS", 20);
		info.put("NUMBER OF NON-TEACHING STAFFS ", 29);
		info.put("NUMBER OF AWARDS", 11);
		Set<String> keySet =info.keySet();
		for(String key : keySet)
		{
			Integer value=info.get(key);
			System.out.println(key+":"+value);
			
		}
		String dateOfStart="1980-06-07";
		LocalDate dos=LocalDate.parse(dateOfStart);
		System.out.println("STARTING YEAR : "+dos);
	}
	

}
