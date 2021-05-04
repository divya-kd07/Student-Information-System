package in.divy2624;



public class SchoolStudentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * feature1: The purpose of this task is view the school information.
		 */
		
		System.out.println("************************************************************WELCOME*******************************************************************\n");
		UserVisitPage.visitors();
		
		/**
		 * feature2: The purpose of this task is student registered for the school and the student information are stored in student database.
		 */
		
	    Registration.application();
		System.out.println("***********************************************REGISTRATION SUCESSFULLY***************************************************\n");
		/*
		Login.UserLogin();
		System.out.println("***********************************************LOGIN SUCESSFULLY**********************************************************\n");
		
		System.out.println("***********************************************STUDENT MARK INFORMATION***************************************************\n");
		StudentMarks.Marks();
		
		System.out.println("***********************************************STUDENT FEES INFORMATION***************************************************\n");
		StudentFees.totalFees();
		*/
		}

}
