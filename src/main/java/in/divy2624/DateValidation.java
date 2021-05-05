/**
 * 
 */
package in.divy2624;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author divy2624
 *
 */
public class DateValidation {
	
	  /**
	   * This method used to valid valid date or not
	   * @param date
	   * @return
	   */
	  
	    public static boolean isValidDate(String date)
	    {
	        String regex = "^(1[0-2]|0[1-9])/(3[01]"
	                       + "|[12][0-9]|0[1-9])/[0-9]{4}$";
	        
	        // MM/DD/YYYY
	         
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher((CharSequence)date);
	        return matcher.matches();// Returns true if d is in format
	    }
	  
	    
	}


