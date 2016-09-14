class jlab24

		// Student Name : 		Karl Redmond	
		// Student Id Number : 	CO0196815
		// Date :				16/09/2014
		// Purpose : 			Lab Exercise

/* 3.   Write a program which determines whether a number is odd or even*/
		
{		
		public static void main(String args[])
		 {
		 	int number1 ;
		 	int number2 ;
		 	int answer ;
		 	
		 
		 	System.out.println("Enter a number ") ;
		 	number1 = EasyIn.getInt() ;
		 	System.out.println("Enter a second number ") ;
		 	number2 = EasyIn.getInt() ;
		 	answer = number1 % number2 ;
            
            if (answer < 1)
                 {
              		System.out.println("That number is exactly divisible by the second number ") ;
                 }
            else
            	 {
            	 	System.out.println("That number is not exactly divisible by the second number ") ;
            	 }
		 }






}
		
		
 
	