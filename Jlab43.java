class Jlab48
{
	public static void main(String[] arga)
		{
			String name;
			String surname ;
			int    spacePos ;
			String firstName ;
			
			System.out.println("Please enter your full name. ") ;
			name = EasyIn.getString() ;
			spacePos = name.indexOf(" ") ;
			surname = name.indexOf(spacePos," ") ;

		}
}