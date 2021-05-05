/**
 * 
 */
package in.divy2624;

/**
 * @author divy2624
 *
 */
public class Login {
	
	/**
	 * FEATURE 2 : LOGIN
	 * To create a UserLogin method for Login purpose.
	 * To check the Login process using these variables emailId,userPassword,MobileNumber.
	 * @return 
	 * 
	 */
	public static boolean studentLogin(String emailId,String userPassword,String mobileNumber)
	{
		System.out.println("************************************STUDNET LOGIN PAGE**************************************");
		
		boolean result;
	    if (EmailValidation.isValid(emailId))//If the email is to check correct format or not
	    {
	    	System.out.println("ENTER YOUR EMAIL-ID : "+emailId);
	    	if(PasswordValidation.isValidPassword(userPassword))//comparing the password for password checking
	    	{
	    		System.out.println("ENTER YOUR PASSWORD : "+userPassword);
	        		 if(mobileNumber.length()==10) 
	        		 {
	        			 System.out.println("ENTER YOUR MOBILE NUMBER : "+mobileNumber);
	        			 result=true;
	        			 
	        			 //if you or anyone  login your account each and every time,the alert message send your mobile number
	        		 }
	        		 else 
	        		 {
	        			 System.out.println("INVALID MOILE NUMBER CREDENTIALS\nPLEASE ENTER YOUR CORRECT MOBILE NUMBER ");
	        			 result = false;
	        		 }
	        		
	        }
	    	else
	    	{
	    		System.out.println("INVALID PASSWORD CREDENTIALS\nPLEASE ENTER YOUR CORRECT PASSWORD");
	    		 result=false;
	    	}
	    			 
	    }
	    else
	    {
	        System.out.print("INVALID EMAIL-ID CREDENTIALS\nPLEASE ENTER YOUR CORRECT EMAIL-ID");
	        result=false;
	    }
		
		return result; 
		
	}
	
	
	 
	

}
