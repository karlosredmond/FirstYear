class jlab31

	/*  Student Name : 		Karl Redmond	
		 Student Id Number : 	CO0196815
		 Date :				16/09/2014
		 Purpose : 			Lab Exercise
		 
		 1.	Rewrite the following program using a loop structure of your choice. The program keeps presenting the user with options until the user enters the value 7 to exit

	     1.	Fahrenheit to celcius
		 2.	Celcius to Fahrenheit
	   	 3.	Inches to centimetres
		 4.	Centimetres to inches
		 5.	Pounds to Kilograms
		 6.	Kilograms to Pounds
		 7.	Exit Program


		 */
	
{
	public static void main(String args[])
		{
			
			double fahrenheit ;
			double celcius ;
			double centimeters ;
			double inches ;
			double pounds ;
			double kilograms ;
			int    option ;
		    char   answer ;
		    answer = 'n' ;
			
			
			
			
			do
				{	
				
					System.out.println(" 1.	Fahrenheit to celcius " + "\n 2.	Celcius to Fahrenheit" + "\n 3.	Inches to centimetres" + "\n 4.	Centimetres to inches" + "\n 5.	Pounds to Kilograms" + "\n 6.	Kilograms to Pound " + "\n 7.     Exit Program ") ;
					System.out.println(" Please Enter a selection ") ;
					option = EasyIn.getInt() ;
					answer = 'n' ;
		
			
		    
		    	
		    
				
					if ( option == 1)
						{
					
							System.out.println("Enter the temperature in Fahrenheit ") ;
							fahrenheit = EasyIn.getDouble() ;
							System.out.println("The temperature in Celcius is " + ((fahrenheit-32) * 5 / 9) ) ;
							answer = 'y' ;
						}
					
					else if (option == 2)
						{
							System.out.println("Enter the temperature in Celsius ") ;
							celcius = EasyIn.getDouble() ;
							System.out.println("The temperature in Fahrenheit is " + ((celcius * 9) / 5 + 32) ) ;
							answer = 'y' ;
						}		
					
					else if (option == 3)
						{
							System.out.println("Enter the length in inches ") ;
							inches = EasyIn.getDouble() ;
							System.out.println("The length in Centimeters is " + (inches * 2.54)) ;
							answer = 'y' ;
						}
					else if (option == 4)
						{
							System.out.println("Enter the length in Centimeters ") ;
							centimeters = EasyIn.getDouble() ;
							System.out.println("The length in inches is " + (centimeters * 0.39370) ) ;
							answer = 'y' ;
						}
					
					else if (option == 5)
						{
							System.out.println("Enter the weight in Pounds ") ;
							pounds = EasyIn.getDouble() ;
							System.out.println("The weight in Kilograms is " + (pounds / 2.2046) ) ;
							answer = 'y' ;
						}
					
					else if (option == 6)
						{
						    System.out.println("Enter the weight in Kilograms ") ;
							kilograms = EasyIn.getDouble() ;
							System.out.println("The weight in Pounds is " + (kilograms * 2.2046) ) ;
							answer = 'y' ;
						}
					
			
					
					
							
		  		    if (option == 7)
		    			{
		    				System.out.println("Are you sure? y/n ") ;
		    				answer = EasyIn.getChar() ;
							
						}		
					
					}
					while (option !=7 && answer != 'y') ;
					
							
							
					
					
				
					
					
					
					
							
			
																	
								
								
								
								

			
			
		}
}