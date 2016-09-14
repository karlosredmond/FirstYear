class jlab11

{
	public static void main(String args[])
	 {
	 	
	 	final double centim ;
	 	double inches ;
	 	double calc ;
	 	
	 	
	    System.out.println("What is your value in inches? ") ;
	    inches = EasyIn.getDouble() ;
	    centim = 2.54 ;
	    calc = inches * centim ;
	    System.out.println("Your measurement in centimeters is " + calc) ;
	 }
}