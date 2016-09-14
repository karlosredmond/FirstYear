class jlab22

		// Student Name : 		Karl Redmond	
		// Student Id Number : 	CO0196815
		// Date :				16/09/2014
		// Purpose : 			Lab Exercise

/* 2.	Write a program where the user enters 3 exam marks. Programming, Maths and Hardware. 
        The program will then calculate their average mark 
        and indicate whether the average mark is a :
        
		Distinction	70 - 100
	    Merit1		63 - 69
		Merit2		55 - 62
		Pass		40 - 54
		Fail		Less Than 40*/
		
{		
		public static void main(String args[])
		 {
		 	int program ;
		 	int maths ;
		 	int hardware ;
		 	int average ;
		 	
		 	System.out.println("Enter your mark for Programming ") ;
		 	program = EasyIn.getInt() ;
		 	System.out.println("Enter your mark for Maths ") ;
		 	maths = EasyIn.getInt() ;
		 	System.out.println("Enter your mark for Hardware ") ;
		 	hardware = EasyIn.getInt() ;
		 	average = (program + maths + hardware) / 3 ;
		 	
		 	if (average >=0 && average < 40)
		 		{
		 			System.out.println(+ average + " is a Fail ") ;
		 		}
		 	else if (average >= 40 && average < 55)
		 		{
		 			System.out.println(+ average + " is a Pass ") ;
		 		}
		 	else if (average >=55 && average < 63)
		 	    {
		 			System.out.println(+ average + " is a Merit2 ") ;
		 		}
		 	else if (average >= 63 && average < 70)
		 		{
		 			System.out.println(+ average + " is a Merit1 ") ;
		 		}
		 	else  
		 		{
		 			System.out.println(+ average + " is a Distinction ") ;
		 		}
		 		
		 		


		 }






}
		
		
 
	