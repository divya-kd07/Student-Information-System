/**
 * 
 */
package in.divy2624;

/**
 * @author divy2624
 *
 */
public class ParentLogin {

	/**
	 * FEATURE 2 : LOGIN-PARENT To create a UserLogin method for Login purpose. To
	 * check the Login process using these variables rollNumber,dateOfBirth.
	 * 
	 * @return
	 * 
	 */
	public static boolean parentLogin(String rollNo, String dateOfBirth) {
		System.out.println("************************************PARENT LOGIN PAGE**************************************");

		boolean result;
		if (RollNumberValidation.isValidRollNo(rollNo))// If the roll number is to check correct format or not
		{
			System.out.println("ENTER YOUR ROLLNUMBER : " + rollNo);
			if (DateValidation.isValidDate(dateOfBirth))// If the date is to check correct format or not
			{
				System.out.println("ENTER YOUR DATEOFBIRTH : " + dateOfBirth);
				result = true;

			} else {
				System.out.println("INVALID  CREDENTIALS\nPLEASE ENTER YOUR CORRECT DATEOFBIRTH\n");
				result = false;
			}

		} else {
			System.out.print("INVALID CREDENTIALS\nPLEASE ENTER YOUR CORRECT ROLLNUMBER\n");
			result = false;
		}

		return result;

	}

}
