class Jlab44
{
	public static void main(String[] args)
	{
		String name;
		int    index ;
		char   character ;
		int    capitalCount = 0 ;
			
		System.out.println("Please enter your full name. ") ;
		name = EasyIn.getString() ;
		for (index = 0 ; index<name.length() ; index++)
			{
				for(character = 'A' ; character <= 'Z' ; character ++)
					{
				
						if (name.charAt(index) == character)
							{
								capitalCount++ ;
							}
					}
			}
		System.out.println("The number of capitals is " + capitalCount) ;
		
		
		
	}
}