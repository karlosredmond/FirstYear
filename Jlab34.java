class Jlab34

{
	public static void main(String[] args)
	{
		
		int number ;
		int largest ;
		int smallest ;
		double average ;
		int pos ;
		int sum ;
	    char exit ;
	    
	    System.out.println("Please enter number ") ;
		number = EasyIn.getInt() ;
		largest = number ;
		smallest = number ;
		average = number ;
		pos = 1 ;
		sum = number ;
	    exit = 'n' ;
	    System.out.println("Would you like to exit? y/n ") ;
	    exit = EasyIn.getChar() ;
	    
	    while (exit != 'y')
		    {
			
				pos ++ ;
				System.out.println("Please Enter number " +pos) ;
				number = EasyIn.getInt() ;
				sum = sum + number ;
				
				if (number > largest)
					{
						largest = number ;
					}
				if (number < smallest)
					{
						smallest = number ;
					}	
				average = (double) sum / pos ;
				System.out.println("Would you like to exit y/n ") ;
				exit = EasyIn.getChar() ;
			}
		System.out.println("The largest number is " + largest) ;
		System.out.println("The smallest number is " + smallest) ;
		System.out.println("The average is " + average) ;
		
		
		
		
		
		
	}

}