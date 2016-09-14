class Jlab83
{
	public static void listName(String nameArray[] ,int noOfElements)
	{
		int index ;
		
		for(index = 0; index < noOfElements ; index ++)
			{
				System.out.println("\n\t" + nameArray[index]) ;
			}
	}
	public static int searchArray(String nameArray[], int noOfElements)
	{
		int step ;
		String searchName ;
		int returnValue ;
		
		System.out.println("\nEnter the name you are Searching for or wish to delete") ;
		searchName = EasyIn.getString() ;
		step = 0 ;
		while(step < noOfElements && nameArray[step].equals(searchName) == false)//
			{
				step ++ ;
			}
		if(step < noOfElements)
			{
				returnValue = step ;
			}
		else
			{
				returnValue = -1 ;
				System.out.println("\n\tThat name is not in the Array ") ;
			}															
		return returnValue ;
	}
	public static void delName(String nameArray[], int noOfElements, int position)
	{
		int index ;
		
		for(index = position ; index < noOfElements - 1 ; index++)
			{
				nameArray[index] = nameArray[index + 1] ; 
			}
		nameArray[noOfElements - 1] = "" ;
	}
	public static int addName(String nameArray[], int noOfElements) //add name to array
	{
		String name = "" ;
		int returnValue ;
		int numNames = 0 ;
		int step = 0  ;
		int place ;
		int index ;
		
		System.out.println("How many names would you like to Enter? ") ;
		numNames = EasyIn.getInt() ;
		numNames = numNames + noOfElements ;
		for(index = noOfElements ; index < numNames; index ++)
			{
				System.out.println("Please enter a name ") ;
				name = EasyIn.getString() ;
				if(noOfElements == 0)
					{
						nameArray[0] = name ;
						noOfElements++ ;
					}
				else
					{
						step = 0 ;
						while(step < noOfElements && name.compareTo(nameArray[step]) > 0)
							{
								step++ ;
							}
						place = step ;
						for(step = noOfElements - 1 ; step >= place ; step --)
							{
								nameArray[step + 1] = nameArray[step] ;
							}
						nameArray[place] = name ;
						noOfElements++ ;
					}	
			}
		returnValue = noOfElements ;
		return returnValue ;
	}
	public static void menu()
	{
		String menu ;
		String nameArray[] ;
		int option ;
		int index ;
		int noOfElements ;
		int nameInString ;
		
		noOfElements = 0 ;
		nameArray = new String[50] ;
		menu = "\n1. Add name " ;
		menu += "\n2. Delete name " ;
		menu += "\n3. Search for a name " ;
		menu += "\n4. List All names " ;
		menu += " \n5. Exit " ;
		System.out.println(menu) ;
		do
			{
				System.out.println("Please  select an option ") ;
				option = EasyIn.getInt() ;
				switch(option)
					{
						case 1 :
								{
									noOfElements = addName(nameArray, noOfElements) ;
									break ;
								}
						case 2 :
								{
									nameInString = searchArray(nameArray, noOfElements) ;
									if(nameInString > -1)
										{
											System.out.println("\n\tThat name has been deleted") ;
											delName(nameArray, noOfElements, nameInString) ;
											noOfElements-- ;
										}
									break ;
								}
						case 3 :
								{
									nameInString = searchArray(nameArray, noOfElements) ;
									if(nameInString > -1)
										{
											System.out.println("\n\tThat name is in the Array and it is located at index position " + nameInString) ;
										}
									break ;
								}
						case 4 :
								{
									listName(nameArray, noOfElements) ;
									break ;
								}
						default:
								{
									System.out.println("\n\tPlease enter a valid seletion") ;
									break ;
								}
					}
				System.out.println(menu) ;
			}
		while(option != 5) ;
		for(index = 0 ; index < noOfElements ; index ++) // Loop to run through array for testing purposes
			{
				System.out.println(nameArray[index]) ;
			}
	
	}
	public static void main(String []args)
	{
		menu() ;
	}
}