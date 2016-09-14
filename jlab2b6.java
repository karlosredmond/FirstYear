class jlab2b6
	
	/*  Student Name : 		Karl Redmond	
		 Student Id Number : 	CO0196815
		 Date :				16/09/2014
		 Purpose : 			Lab Exercise
		 
		 6.	Write a simple menu driven program that will 
		 present the user with the following conversion 
		 menu (look up conversion rates on the internet): 
			
		 1.	Fahrenheit to celcius
		 2.	Celcius to Fahrenheit
		 3.	Inches to centimetres
		 4.	Centimetres to inches
		 5.	Pounds to Kilograms
		 6.	Kilograms to Pounds

		 
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
			
			System.out.println(" 1.	Fahrenheit to celcius " + "\n 2.	Celcius to Fahrenheit" + "\n 3.	Inches to centimetres" + "\n 4.	Centimetres to inches" + "\n 5.	Pounds to Kilograms" + "\n 6.	Kilograms to Pound ") ;
			System.out.println(" Please Enter a selection ") ;
			option = EasyIn.getInt() ;
			switch (option)
				{
					case 1 :
							System.out.println("Enter the temperature in Fahrenheit ") ;
							fahrenheit = EasyIn.getDouble() ;
							System.out.println("The temperature in Celcius is " + ((fahrenheit-32) * 5 / 9) ) ;
							break ;
					
					case 2 :
							System.out.println("Enter the temperature in Celsius ") ;
							celcius = EasyIn.getDouble() ;
							System.out.println("The temperature in Fahrenheit is " + ((celcius * 9) / 5 + 32) ) ;
							break ;
					
					case 3 :
							System.out.println("Enter the length in inches ") ;
							inches = EasyIn.getDouble() ;
							System.out.println("The length in Centimeters is " + (inches * 2.54)) ;
							break ;
					
					case 4 :
							System.out.println("Enter the length in Centimeters ") ;
							centimeters = EasyIn.getDouble() ;
							System.out.println("The length in inches is " + (centimeters * 0.39370) ) ;
							break ;
					
					case 5 :
							System.out.println("Enter the weight in Pounds ") ;
							pounds = EasyIn.getDouble() ;
							System.out.println("The weight in Kilograms is " + (pounds / 2.2046) ) ;
							break ;
					
					case 6 :
							System.out.println("Enter the weight in Kilograms ") ;
							kilograms = EasyIn.getDouble() ;
							System.out.println("The weight in Pounds is " + (kilograms * 2.2046) ) ;
							break ;
							
					default :
							System.out.println("Invalid selection ") ;
					
					
					
							
				}													
								
								
								
								

			
			
		}
}