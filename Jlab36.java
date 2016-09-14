class Jlab36

{
	public static void main(String[] args)
	{
		
		int number ;
		int largest ;
		int smallest ;
		double average ;
		int pos ;
		int sum ;
	    int highestIndex ;
	    int lowestIndex ;
	    int currentHighest ;
	    int currentLowest ;
	    int amountOfNumbers ;
	    
	    System.out.println("How many numbers do you want to Enter ") ;
	    amountOfNumbers = EasyIn.getInt() ;
	    System.out.println("Please enter a number ") ;
		number = EasyIn.getInt() ;
		largest = number ;
		smallest = number ;
		average = number ;
		highestIndex = 1 ;
		lowestIndex =1 ;
		currentHighest = number ;
		currentLowest = number ;
		sum = number ;
	    System.out.println("The current highest is " + largest + "\nThe current lowest is " + smallest + "\n The current average is " +average) ;
	    
	    for (pos=1 ; pos <= amountOfNumbers ; pos ++  )
	    	{
		
		
				System.out.println("Please Enter a number ") ;
				number = EasyIn.getInt() ;
				sum = sum + number ;
				pos ++ ;
			if (number > largest)
				{
					largest = number ;
				}
			if (number < smallest)
				{
					smallest = number ;
				}	
				average = sum / pos ;
			if (number > currentHighest)
				{
					currentHighest = number ;
					highestIndex = 0 ;
					
				}	
			if (number == currentHighest) 
				{
					highestIndex++ ;
					System.out.println("The highest number has been entered " + highestIndex + "times.") ;
				}
			
			if (number < currentLowest) 
				{
					currentLowest = number ;
					lowestIndex = 0 ;
					
				}
			if (number == currentLowest)
				{	
				    lowestIndex ++ ;
					System.out.println("The lowest number has been entered " + lowestIndex + "times.") ;
				}
			System.out.println("The current highest is " + largest + "\nThe current lowest is " + smallest + "\n The current average is " +average) ;
			}
		System.out.println("The largest number is " + largest) ;
		System.out.println("The smallest number is " + smallest) ;
		System.out.println("The average is " + average) ;
		
		
		
		
		
		
	}

}