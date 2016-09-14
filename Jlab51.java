 class Jlab51
{
	public static void main(String[] arg)
	{
		String sentence ;
		String word ;  
		int index ;
		int spacePos ;
		int wordCount = 0 ;
		boolean wordValid = true ;
		
		System.out.println("Please enter a sentence ") ;
		sentence = EasyIn.getString() ;
		sentence = sentence.trim() + " " ;
		spacePos = sentence.indexOf(' ') ;
		while(spacePos > -1 )
			{
				wordValid = true ;	
				word = sentence.substring(0,spacePos) ;
				for(index = 0 ; index < word.length() ; index++)
					{
						if(word.charAt(index) >= 'A' && word.charAt(index) <= 'Z')
							{
								wordValid = true ;	
							}
						else if(word.charAt(index) >= 'a' && word.charAt(index) <= 'z')
							{
								wordValid = true ;
							}
						else
							{
								wordValid = false ;
							}
					}
				if(word.length() > 0 && wordValid)
					{
						wordCount++ ;
						
					}	
				sentence = sentence.substring(spacePos + 1) ;
				spacePos = sentence.indexOf(' ') ;
			}
		System.out.println("There are " + wordCount + " word(s) in that sentence ") ;	 
	}
}