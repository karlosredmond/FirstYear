class jlab2b3

		// Student Name : 		Karl Redmond	
		// Student Id Number : 	CO0196815
		// Date :				16/09/2014
		// Purpose : 			Lab Exercise

/*      3.	Write a program which asks the user to enter 3 
            different numbers. The program then tells the 
            user which number was the lowest number entered.
	
   
*/
		
{		
		public static void main(String args[])
		 {
		 	double number1 ;
		 	double number2 ;
		 	double number3 ;     
		 
		    
		 	System.out.println("Enter the first number ") ;
		 	number1 = EasyIn.getDouble() ;
		 	System.out.println("Enter the second number ") ;
		 	number2 = EasyIn.getDouble() ;
		 	System.out.println("Enter the third number ") ;
		 	number3 = EasyIn.getDouble() ;
		 	
		 	if (number1 < number2 && number1 < number3)
		 		{
		 			System.out.println("The lowest number entered was number 1, which was " + number1 ) ;
		 		}
		 	
		 	if (number2 < number1 && number2 < number3)
		 		{
		 			System.out.println("The lowest entered was number 2, which was " + number2) ;
                }
		 	
		 	if (number3 < number1 && number3 < number2)
		 		{
		 			System.out.println("The lowest number entered was number 3, which was " + number3) ;
		 		}			 			 
		    
		    if ((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3))
		 		{
		 			System.out.println("The second lowest number entered was number 1, which was " + number1 ) ;
		 		}
		 	
		 	if ((number2 > number1 && number2 < number3) || (number2 < number1 && number2 >number3 ))
		 		{
		 			System.out.println("The second lowest number entered was number 2, which was " + number2) ;
                }
		 	
		 	if ((number3 > number1 && number3 < number2) || (number3 < number1 && number3 > number2 ))
		 		{
		 			System.out.println("The second lowest number entered was number 3, which was " + number3) ;
		 		}
		 		
		 	if (number1 > number2 && number1 > number3)
		 		{
		 			System.out.println("The highest number entered was number 1, which was " + number1 ) ;
		 		}
		 	
		 	if (number2 > number1 && number2 > number3)
		 		{
		 			System.out.println("The highest number entered was number 2, which was " + number2) ;
                }
		 	
		 	if (number3 > number1 && number3 > number2)
		 		{
		 			System.out.println("The highest number entered was number 3, which was " + number3) ;
		 		}			 			 
				 			 

		 }






}
		
		
 
	