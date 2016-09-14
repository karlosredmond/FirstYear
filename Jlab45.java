class Jlab45
{
	public static void main(String[] args)
	{
		String name;
		int    index = 0 ;
			
		System.out.println("Please enter your full name. ") ;
		name = EasyIn.getString() ;
		for (index = name.length() -1 ; index >= 0 ; index--)
			{
				System.out.print(name.charAt(index)) ;
			}
	}
}