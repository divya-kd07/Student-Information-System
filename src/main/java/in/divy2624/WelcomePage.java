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
		String dateOfBirth="1980-06-07";
		LocalDate dob=LocalDate.parse(dateOfBirth);
		System.out.println("STARTING YEAR : "+dob);
	}
	

}
