package in.divy2624;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RollNumberValidation
{
	public static boolean isValidRollNo(String rollNo)
    {

        String regex = "^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$";  
        /*^ means start of string
        [A-Z]{2} means 2 characters in the range of A through Z
        \s means white space
        [0-9]{2} means 2 characters in the range of 0 through 9
        \s means white space
        [A-Z]{2} means 2 characters in the range of A through Z
        \s means white space
        [0-9]{4} means 4 characters in the range of 0 through 9
        $ means end of string

        Based on what you said in */

        Pattern p = Pattern.compile(regex);

        if (rollNo== null)
        {
            return false;

        }
        Matcher m = p.matcher(rollNo);
        return m.matches();

    }
}
