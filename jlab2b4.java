class jlab2b4

		 /*Student Name : 		Karl Redmond	
		 Student Id Number : 	CO0196815
		 Date :				16/09/2014
		 Purpose : 			Lab Exercise

      4.	Modify the program in 3 above so it gives you the 
            numbers in ascending order, 
            i.e. lowest, middle, highest */ 
   

		
{		
		public static void main(String args[])
		 {
		 	int number1 ;
		 	int number2 ;
		    int number3 ; 
		 	int lowest ;
		 	int middle ;
		 	int highest ;
 
		     
		 
		    
		 	System.out.println("Enter the first number ") ;
		 	number1 = EasyIn.getInt() ;
		 	System.out.println("Enter the second number ") ;
		 	number2 = EasyIn.getInt() ;
		 	System.out.println("Enter the third number ") ;
		 	number3 = EasyIn.getInt() ;
		 	
		 		
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
					middle = number1 ;
				}
				
		 	else if (number2 < highest && number2 > lowest)
		 	
		 		{
		 			middle = number2 ;
		 		}
		 		
		 	else
		 	
		 		{
		 			middle = number3 ;
		 		}
		 				 	
		 	if  (number1 == number2 && number1 == number3)
		 	 
		 		{
		 			System.out.println("All values are the same ") ;
		 		}
		 			
		    else if  (number1 == number2)
		    
		 		{
		 			System.out.println("Number1 is the same as number 2 ") ;
		 		}
		 	
		    else if  (number1 == number3)
		    
		 		{
		 			System.out.println("number1 same as number3 ") ;
		 		}
		 		
		 	else if (number2 == number3)
		 	
		 		{
		 			System.out.println("number2 same as number3") ;
                }
                
		    if  (lowest != highest && lowest != middle )
		    
		 		{
		 			System.out.println("lowest number is  " + lowest) ;
		 		}
		 		
		 	if	(middle != highest && middle != lowest) 
		 	
		 		{
		 			System.out.println("middle number is " + middle ) ;
		 		}
		 		 
		 	if  (highest != lowest && highest != middle)
		 	
		 		{
		 			System.out.println("Highest number is " + highest) ;
		 		}
		 	
		 }






}
		
		
 
	