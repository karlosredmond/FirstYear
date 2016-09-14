class Jlab42
{
	public static void main(String[] args)
	{
		String name;
		String surname ;
		int    spacePos ;
		String firstName ;
			
		System.out.println("Please enter your full name. ") ;
		name = EasyIn.getString() ;
		spacePos = name.indexOf(" " ) ;
		surname = name.substring(spacePos + 1) ;
		firstName = name.substring(0, spacePos) ;
		System.out.println(firstName + " is your first name") ; 
	}
}