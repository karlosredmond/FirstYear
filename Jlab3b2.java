
class Jlab3b2

// "m:\javaprogs"


{
    public static void main(String[] args)
    {
    	int num ;
    	int sum ;
    	int pos ;    // record of enter order
    	int firstIndexOf12 ;
    	int lastIndexOf12 ;
    	 		
    	// Set entry position
    	System.out.print("\n\tInput number : ") ;  
		num = EasyIn.getInt();
		sum = 0 ;
		pos = 1 ;
		firstIndexOf12 = 0 ;
		lastIndexOf12 = 0 ;
		
		while(num != 0)
		{
			// Find first index
			if(num == 12 && firstIndexOf12 == 0)
			{
				firstIndexOf12 = pos ;
			}
						
			// Find last index
			if(num == 12)
			{
				lastIndexOf12 = pos ;
			} // if
			
			//pos = pos + 1 ;
			// Another way 
			pos++ ;
			sum = sum + num ;
			// Set exit condition
			System.out.print("\n\tInput number : ") ;  
			num = EasyIn.getInt();
		} // while
		
		System.out.print("\n\tTotal of numbers is :  " + sum) ; 
		System.out.print("\n\tFirst Iondex Of 12 :"  + firstIndexOf12) ;
		System.out.print("\n\tlastIondexOf12 :"  + lastIndexOf12) ;
    	System.out.println("\n\n\tHave a nice day !") ;
    } // main
}

