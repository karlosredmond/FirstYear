class jlab13

{
	public static void main(String args[])
	 {
	  	
	  	double number1 ;
	  	double number2 ;
	  	double number3 ;
	  	double average ;
	  	double product ;
	  	double sum ;
	  	
	  	System.out.println("Enter the first number ") ;
	  	number1 = EasyIn.getDouble() ;
	    System.out.println("Enter the second number ") ;
	  	number2 = EasyIn.getDouble() ;
	  	System.out.println("Enter the third number ") ;
	  	number3 = EasyIn.getDouble() ;
	  	average = (number1 + number2 + number3) / 3 ;
	  	product = number1 * number2 * number3 ;
	  	sum = number1 + number2 + number3 ;
	  	System.out.println("The sum of the numbers is " + sum + " \n the product is " + product + "\n the average is " + average ) ;
	 	
	 }
}