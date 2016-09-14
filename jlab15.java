class jlab15

{
	public static void main(String args[])
	 {
	 	
	 	double loanAmount ;
	 	final double interest ;
	 	double amountYears ;
	 	double total ;
	 	
	 	
	 	System.out.println("Enter the loan ammount ") ;
	 	loanAmount = EasyIn.getDouble() ;
	 	System.out.println("Enter the interest rate ") ;
        interest = EasyIn.getDouble() ;
        System.out.println("Enter the amount of years ") ;
        amountYears = EasyIn.getDouble() ;
        total = ((loanAmount * amountYears) * interest) + loanAmount ;
        System.out.println("The total amount repaid is " + total) ; 
        
      }
      
} 