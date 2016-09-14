class jlab2b4

		 Student Name : 		Karl Redmond	
		 Student Id Number : 	CO0196815
		 Date :				16/09/2014
		 Purpose : 			Lab Exercise

      4.	Modify the program in 3 above so it gives you the 
            numbers in ascending order, 
            i.e. lowest, middle, highest 
   

		
{		
		public static void main(String args[])
		 {
		 	double number1 ;
		 	double number2 ;
		 	double number3 ; 
		 	int lowest ;
		 	int middle ;
		 	int highest ;
		     
		 
		    
		 	System.out.println("Enter the first number ") ;
		 	number1 = EasyIn.getDouble() ;
		 	System.out.println("Enter the second number ") ;
		 	number2 = EasyIn.getDouble() ;
		 	System.out.println("Enter the third number ") ;
		 	number3 = EasyIn.getDouble() ;
		 	
		 	if (number1 < number2 && number1 < number3)
		 		{
		 			lowest = number1 ;
		 		}
		 	
		 	else if (number2 < number1 && number2 < number3)
		 		{
		 			lowest = number2 ;
                }
		 	
		 	else 
		 		{
		 			lowest = number3 ;
		 		}			 			 
		    
		    
		 		
		 	if (number1 > number2 && number1 > number3)
		 		{
		 			highest = number1 ;
		 		}
		 	
		 	else if (number2 > number1 && number2 > number3)
		 		{
		 			highest = number2 ;
                }
		 	
		 	else 
		 		{
		 			highest = number3 ;
		 		}
				 			 
			if (number1 < highest && number1 > lowest)
				{
					number1 = middle ;
				}
		 	else if (number2 < highest && number2 > lowest)
		 		{
		 			number2 = middle ;
		 		}
		 	else
		 		{
		 			number3 = middle ;
		 		}
		 
		 
		 }






}
