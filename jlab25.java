class jlab25

		// Student Name : 		Karl Redmond	
		// Student Id Number : 	CO0196815
		// Date :				16/09/2014
		// Purpose : 			Lab Exercise

/* 3.   Modify this program so that it takes 3 numbers and then outputs 
        whether :

	    1. The first number is exactly divisible by both numbers.
	    2. The first number is exactly divisible by one of the 2 numbers. 
	    If so, output which one it is. Also output if it is not exactly 
	    divisible by either number.
*/
		
{		
		public static void main(String args[])
		 {
		 	int number1 ;
		 	int number2 ;
		 	int number3 ;
		 	int answer1 ;
		 	int answer2 ;
		 	
		 
		 	System.out.println("Enter a number ") ;
		 	number1 = EasyIn.getInt() ;
		 	System.out.println("Enter a second number ") ;
		 	number2 = EasyIn.getInt() ;
		 	System.out.println("Enter a third number ") ;
		 	number3 = EasyIn.getInt() ;
		 	answer1 = number1 % number2 ;
            answer2 = number1 % number3 ;
            
            if (answer1 == 0 && answer2 == 0)
                 {
              		System.out.println("That number is exactly divisible by both the numbers ") ;
                 }
                 
            if (answer1 == 0 )
            	 {
            	 	System.out.println("The first number is exactly divisible by the second number ") ;
            	 }
            	 
		 	if (answer2 == 0)
		 		{
		 			System.out.println("The first number is exactly divisible by the third number ") ;
		        }
		        
		 
		 
		 }






}
		
		
 
	