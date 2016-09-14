class Jlab23

{
	public static void main(String[] args)
	{
		int number ;
		int sum ;
		int firstIndex12 ;
		int lastIndex12 ;
		int pos ;
		
		System.out.println("Please enter a number ") ;
		number = EasyIn.getInt() ;
		sum = 0 ;
		pos = 1 ;
		firstIndex12 = 0 ;
		lastIndex12 = 0 ;
		
		while (number != 0)
		{
			if (number == 12 && firstIndex12 == 0)
			{
				firstIndex12 = pos ;
			}
			if (number == 12) ;
			
			{
				lastIndex12 = pos ;
			}	
					
			sum = number + sum ;
			pos ++ ;
			System.out.println("Please enter a number ") ;
			number = EasyIn.getInt() ;	
		}
		
		System.out.println("The sum is " + sum) ;
		System.out.println("The first index is " + firstIndex12) ;
		System.out.println("The last index is " + lastIndex12) ;
			
	}
}