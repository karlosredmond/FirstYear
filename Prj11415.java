class Prj11415
{
	public static String shortEqual(String word)//Method which takes in a word and returns the word if it has an equal amount of vowels and consonants
	{
		String returnValue ; // variable declarations
		int vowelCount ;
		int consoCount ;
		
		vowelCount = vowelCount(word) ; // Calls Method vowelCount to determine amount of vowels and assigns the returned value to vowelCount
		consoCount = consoCount(word) ;// Calls Method consoCount to determine amount of consonants and assigns the returned value to consoCount
		returnValue = "" ;
		if(vowelCount == consoCount) // Checks if the vowel Count is equal to the consonant count
			{
				returnValue = word ; // If vowel Count is equal to consonant count, returnValue is assigned the word taken in by the method
			}	
		return returnValue ;//returns whatever is stored in returnValue
	}
	public static int consoCount(String word) // Method to determine the amount of consonants in a word
	{  
		int returnValue ; //variable declarations

		returnValue = word.length() - vowelCount(word) ; // Calls the method vowelCount and subtrats the value returned from the length of the word to determine the amount of consonants
		return returnValue ; // Returns returnValue to the method from which it was called			
	}
	public static int vowelCount(String word)// Method to determine the amount of Vowels in a given word
	{  
		int returnValue ; // variable declarations
		int index ;
		
		returnValue = 0 ;
		for(index = 0 ; index < word.length() ; index ++ ) // This loop is set to run for the length of the word 
			{
				if(word.charAt(index) == 'A' || word.charAt(index) == 'E' || word.charAt(index) == 'I' || word.charAt(index) == 'O' || word.charAt(index) == 'U') // Checks if the current character going through the loop is a vowel
					{
						returnValue ++ ;// If it is a capital vowel it adds one to the returnValue
					}
				else if(word.charAt(index) == 'a' || word.charAt(index) == 'e' || word.charAt(index) == 'i' || word.charAt(index) == 'o' || word.charAt(index) == 'u')
					{
						returnValue ++ ; // If it is a lowercase vowel it adds one on to the returnValue 
					}
			}		
		return returnValue ; // Returns returnValue to the Method from which it was called
	}
	public static void sentenceStat(String sentence) // Method for determining the statistics of a string/sentence
	{
		String printValid ; // variable declarations
		String vowelWord ;
		String consoWord ;
		String equalWord ;
		String shortestEqual ;
		String word ;
		int vowel ;
		int consonants ;
		int longestEqual ;
		int highestVowel ;
		int highestConso ;
		int numWords ;  
		int index ;
		int spacePos ;
		int wordCount = 0 ;
		boolean wordValid ;
		
		vowelWord = "" ;
		consoWord = "" ;
		shortestEqual = "" ;
		equalWord = "" ;
		vowel = 0 ;
		highestVowel = 0 ;
		highestConso = 0 ;
		printValid = "" ;
		sentence = sentence.trim() + " " ; // removes leading and trailng space from a given string and add one space to the end of the string, I used this to make it easier to isolate the words
		spacePos = sentence.indexOf(' ') ; // Finds the first space position and assigns the value to spacePos
		while(spacePos > -1) // Sets up a loop to run until the spacePos value is -1 or less
			{
				wordValid = true ; // Assumes that the word being checked is a valid word
				index = 0 ;	
				word = sentence.substring(0,spacePos) ; // Assigns word with the characters from position 0, to the spacePos value, from the String sentence
				while(wordValid && index < word.length()) // Sets up a loop to run while wordValid is true and index value is less than the length of the word
					{
						if(word.charAt(index) >= 'A' && word.charAt(index) <= 'Z') // Checks if the character at the index value is between A and Z
							{
								wordValid = true ;	// wordValid retains a true value if the character is between A and Z
							}
						else if(word.charAt(index) >= 'a' && word.charAt(index) <= 'z') // Checks if the character at the index value is between a and z
							{
								wordValid = true ; // wordValid retains a true value if the character is between a and z
							}
						else
							{
								wordValid = false ; // wordValid is assigned a false value if the character is found to not be between a and z
							}
						index++ ; // adds one onto the index value
					}
				if(word.length() > 0 && wordValid) // Checks if the length of the word is greater than zero and wordValid value is true
					{
						wordCount++ ; // Adds one onto wordCount
						printValid = printValid + word + " " ; // Concatenates the word onto printValid String
						vowel = vowelCount(word) ; // Calls the Mehtod vowelCount to check for the number of vowels and assigns the returned value to vowel
						consonants = consoCount(word) ; // Calls the Method consoCount to check for the number of consonants and assigns the returned value to consonants
						equalWord = shortEqual(word) ; // Calls the Method shortEqual to check if the word has an equal amount of vowels and consonants and assigns equalWord with the returned value
						if(vowelWord == "") // Checks if vowleWord is empty
						{
							vowelWord = word ; // assigns vowelWord with word
							highestVowel = vowel ;	// assigns highestVowel with the value stored in vowel
						}
						else if(vowel >= highestVowel)// Checks if the amount of vowels is greater than or equal to the amount of vowels stored in highestVowel
							{
								highestVowel = vowel ; // Assigns highestVowel with vowel value
								vowelWord = word ; // Assigns vowelWord with string stored in word
							}
						if(consoWord == "") // Checks if consoWord is empty
						{
							consoWord = word ;
							highestConso = vowel ;	
						}
						else if(consonants >= highestConso) // Checks if value of consonants is greater than or equal to the value stored in highestConso
							{
								highestConso = consonants ;
								consoWord = word ;
							}
						if(shortestEqual == "") // Checks if shortestEqual is empty
							{
								shortestEqual = equalWord ;
							}
						else if(equalWord.length() <= shortestEqual.length() && equalWord.length() > 0) // Checks if the length of equalWord is less than or equal to the length of shortestEqual and that the length of equalWord is greater than 0
							{
								shortestEqual = equalWord ;
							}
					}	
				sentence = sentence.substring(spacePos + 1) ; // Assigns sentence with a substring of sentence from the spacePos onwards, essentially removes the currrent String stored in word from the String sentence
				spacePos = sentence.indexOf(' ') ; // Finds a new value for spacePos
			}
		System.out.println("\n\nSentence Statistics : ") ; // Outputs to the screen
		System.out.println("\nThe number of valid words\t" + wordCount ) ;
		System.out.println("The valid words are\t\t" + printValid ) ;
		System.out.println("\nThe word with the largest number of vowels \t\t\t\t" + vowelWord ) ;
		System.out.println("The word with the largest number of consonants \t\t\t\t" + consoWord ) ;
		System.out.println("The shortest word with an equal no of vowels and consonants \t\t" + shortestEqual) ;
	}
	public static void main(String[] args) // Main Method
	{
		String sentence ; // variable declaraion
		
		System.out.print("Input a sentence : ") ;
	//	sentence = EasyIn.getString() ; 
		sentence = "This            i$         an         aardvaAr   yeEeeAs onDO qwerty in aaaaaa yyyyyy ip XYZ9 " ;
		sentenceStat(sentence) ; // Calls the Method sentenceStat
	}
}