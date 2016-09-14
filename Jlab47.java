class Jlab47
{
	public static void main(String[] args)
	{
			String name;
			int index ;
			char character ;
			int aCount = 0 ;
			
			System.out.println("Please enter your full name. ") ;
			name = EasyIn.getString() ;
			for (index = 0 ; index <= name.length()-1 ; index++)
				{
					if (name.charAt(index) == 'a' || name.charAt(index) == 'A') 
						{
							aCount++ ;
						}  
				}
			System.out.println(aCount) ;
			
			 
	}
}