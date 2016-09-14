class Jlab41
{
	public static void main(String[] arga)
		{
			String name;
			String surname ;
			int    index ;
			int    spaceIndex ;
			char   theChar = ' ' ;	
			
			System.out.println("Please enter your full name. ") ;
			name = EasyIn.getString() ;
			spaceIndex = name.lastIndexOf(theChar) ;
			surname = name.substring(spaceIndex + 1) ;
			System.out.println("Your surname is " + surname) ;
			 
		}
}