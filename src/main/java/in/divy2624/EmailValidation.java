/**
 * 
 */
package in.divy2624;

import java.util.regex.Pattern;

/**
 * @author divy2624
 *
 */
public class EmailValidation {
	// Java program to check if an email address is correct format or not
	public static boolean isValid(String email)
    {
		
        String emailId = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$";
        /*A-Z characters are allowed,
          a-z characters are allowed,
          0-9 numbers are allowed,
          Additionally email can contain dot(.), underscore(_), and dash(-),
          The remaining characters are not allowed.*/
        Pattern pat = Pattern.compile(emailId);
        if (email == null)
            return false;
        return pat.matcher(email).matches();

}
}
