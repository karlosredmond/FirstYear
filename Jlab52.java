class Jlab51
{
	public static void main(String[] arg)
	{
		String sentence ;
		String word ;
		String sentence2 = " " ;  
		int index ;
		int spacePos ;
		int wordCount = 0 ;
		char currentChar ;
		int characterCountWord ;
		int characterCountTest = 0  ;
		char character = ' ';
		
		System.out.println("Please enter a sentence ") ;
		sentence = EasyIn.getString() ;
		do
		{
			spacePos = sentence.indexOf(character) ;
			if(spacePos != -1)
				{
					word = sentence.substring(0,spacePos) ;
					characterCountWord = word.length() ;
					characterCountTest = 0 ;
					for(index = 0 ; index <= word.length() -1 ; index ++)
						{
							currentChar = word.charAt(index) ;
							if(currentChar >= 'A' && currentChar <= 'Z')
								{
									characterCountTest++ ;	
								}
							else if(currentChar >= 'a' && currentChar <= 'z')
								{
									characterCountTest++ ;
								}
						}
					if(characterCountTest == characterCountWord)
						{
							wordCount++ ;
						}
					sentence2 = word + " " + sentence2 ;	
					sentence = sentence.substring(spacePos + 1) ;
				}
		}
		while (spacePos != -1) ;
		word = sentence.substring(0) ;
		sentence2 = word + " " + sentence2 ;
		characterCountWord = word.length() ;
		characterCountTest = 0 ;
		for(index = 0; index <= word.length() -1 ; index++)
			{
				currentChar = word.charAt(index) ;
				if(currentChar >= 'A' && currentChar <= 'Z')
						{
							characterCountTest++ ;	
						}
				else if(currentChar >= 'a' && currentChar <= 'z')
						{
							characterCountTest++ ;
						}		
			}
		if(characterCountTest == characterCountWord)
			{
				wordCount++ ;
			}
		if(sentence.length() == 0)
			{
				wordCount = 0 ;
			}
		System.out.println("There are " + wordCount + " word(s) in that sentence ") ;
		System.out.println(sentence2) ;
			
		 
		 
	}
}