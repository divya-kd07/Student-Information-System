/**
 * 
 */
package in.divy2624;


/**
 * @author divy2624
 *
 */
public class StudentMarks {
	
	
	 //To create a StudentMarks for mark details.
	 
	
	public static void Marks()
	{
		/**
		 * To create a Marks method.
		 * To create a class object for storing first test marks.
		 * Calculating total and average for first test
		 * passing average1 variable to GradeMarks class for getting the grade.
		 */
		
		Student t1= new Student();
		t1.tamil=99;
		String tamilGrade1=GradeMarks.getGrade(t1.tamil);
		t1.english=98;
		String englishGrade1=GradeMarks.getGrade(t1.english);
		t1.mathamatics=100;
		String mathamaticsGrade1=GradeMarks.getGrade(t1.mathamatics);
		t1.science=98;
		String scienceGrade1=GradeMarks.getGrade(t1.science);
		t1.social=99;
		String socialGrade1=GradeMarks.getGrade(t1.social);
		int total1=t1.tamil+t1.english+t1.mathamatics+t1.science+t1.social;
		int average1=(total1)/5;
		String finalGrade1=GradeMarks.getGrade(average1);
		System.out.println("**********************************************FIRST TEST******************************************************************\n");
		System.out.println("SUBJECT      :      MARKS    :     GRADE");
		System.out.println("TAMIL        :      "+t1.tamil+ "       :       "  +tamilGrade1+"\n"+"ENGLISH      :      "+t1.english+"       :       "+englishGrade1+"\n"+"MATHAMATICS  :     "+t1.mathamatics+"       :       "+mathamaticsGrade1+"\n"+"SCIENCE      :      "+t1.science+"       :       "+scienceGrade1+"\n"+"SOCIAL       :      "+t1.social+"       :       "+socialGrade1+"\n"+"------------------------------------------"+"\n"+"Total        :     "+total1+"\n"+"------------------------------------------"+"\n"+"Average      :     "+average1+"        :       "+finalGrade1+"\n"+"------------------------------------------"+"\n");

		/**
		 * To create a second class object for storing second test marks.
		 * Calculating total and average for second test
		 * passing average2 variable to GradeMarks class for getting the grade.
		 */
		
		Student t2= new Student();
		t2.tamil=79;
		String tamilGrade2=GradeMarks.getGrade(t2.tamil);
		t2.english=78;
		String englishGrade2=GradeMarks.getGrade(t2.english);
		t2.mathamatics=80;
		String mathamaticsGrade2=GradeMarks.getGrade(t2.mathamatics);
		t2.science=82;
		String scienceGrade2=GradeMarks.getGrade(t2.science);
		t2.social=89;
		String socialGrade2=GradeMarks.getGrade(t2.social);
		int total2=t2.tamil+t2.english+t2.mathamatics+t2.science+t2.social;
		int average2=(total2)/5;
		String finalGrade2=GradeMarks.getGrade(average2);
		System.out.println("**********************************************SECOND TEST******************************************************************\n");
        System.out.println("SUBJECT      :      MARKS    :     GRADE");
		System.out.println("TAMIL        :      "+t2.tamil+ "       :       "  +tamilGrade2+"\n"+"ENGLISH      :      "+t2.english+"       :       "+englishGrade2+"\n"+"MATHAMATICS  :      "+t2.mathamatics+"       :       "+mathamaticsGrade2+"\n"+"SCIENCE      :      "+t2.science+"       :       "+scienceGrade2+"\n"+"SOCIAL       :      "+t2.social+"       :       "+socialGrade2+"\n"+"------------------------------------------"+"\n"+"Total        :     "+total2+"\n"+"------------------------------------------"+"\n"+"Average      :     "+average2+"        :       "+finalGrade2+"\n"+"------------------------------------------"+"\n");

		/**
		 * To create a third class object for storing final test marks.
		 * Calculating total and average for final test
		 * passing average3 variable to GradeMarks class for getting the grade.
		 */		
		
		Student t3= new Student();
		t3.tamil=93;
		String tamilGrade3=GradeMarks.getGrade(t3.tamil);
		t3.english=98;
		String englishGrade3=GradeMarks.getGrade(t3.english);
		t3.mathamatics=100;
		String mathamaticsGrade3=GradeMarks.getGrade(t3.mathamatics);
		t3.science=100;
		String scienceGrade3=GradeMarks.getGrade(t3.science);
		t3.social=100;
		String socialGrade3=GradeMarks.getGrade(t3.social);
		int total3=t3.tamil+t3.english+t3.mathamatics+t3.science+t3.social;
		int average3=(total3)/5;
		String finalGrade3=GradeMarks.getGrade(average3);
		System.out.println("**********************************************FINAL TEST******************************************************************\n");
		System.out.println("SUBJECT      :      MARKS    :     GRADE");
		System.out.println("TAMIL        :      "+t3.tamil+ "       :       "  +tamilGrade3+"\n"+"ENGLISH      :      "+t3.english+"       :       "+englishGrade3+"\n"+"MATHAMATICS  :     "+t3.mathamatics+"       :       "+mathamaticsGrade3+"\n"+"SCIENCE      :     "+t3.science+"       :       "+scienceGrade3+"\n"+"SOCIAL       :     "+t3.social+"       :       "+socialGrade3+"\n"+"------------------------------------------"+"\n"+"Total        :     "+total3+"\n"+"------------------------------------------"+"\n"+"Average      :     "+average3+"        :       "+finalGrade3+"\n"+"------------------------------------------"+"\n");
        
	    //passing finalGrade variable to GradeReview class for getting overall performance comments.
		
		GradeReview.Comment(finalGrade3);
		
		}

}

