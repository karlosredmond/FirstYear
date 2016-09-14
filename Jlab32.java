class Jlab3b2




{
    public static void main(String[] args)
    {
    	int num ;
    	int sum ;
    	
    	 		
      	System.out.print("\n\tInput number : ") ;  
		num = EasyIn.getInt();
		sum = 0 ;
				
		while(num != 0)
		{
			sum = sum + num ;
			System.out.print("\n\tInput number : ") ;  
			num = EasyIn.getInt() ;
			
			
		} 
		
		System.out.println("\n\t"+ sum) ;		
		
    } 
}
