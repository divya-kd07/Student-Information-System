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
public class PasswordValidation
{
	
	// Java program to check if an password is correct format or not.
	
		public static boolean isValidPassword(String password)
	    {

	        String regex = "^(?=.*[0-9])"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=.*[@#$%^&+=])"
	                       + "(?=\\S+$).{8,20}$";
	        
	        

	        Pattern p = Pattern.compile(regex);

	        if (password == null) {
	            return false;
	        }

	        Matcher m = p.matcher(password);


	        return m.matches();
	    }

	}
	
