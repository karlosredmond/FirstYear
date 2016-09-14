class Jlab85
{
	public static boolean checkWin(char[] guessWord, char[] hang ,int noOfElements) 
	{
		int index ;
		boolean returnValue ;
		
		index = 0 ;
		returnValue = true ;
		while(returnValue && index < noOfElements)
			{
				if(hang[index] == guessWord[index])
					{
						returnValue = true ;
					}
				else
					{
						returnValue = false ;
					}
				index++ ;
			}
		return returnValue ;
	}
	public static void assignHangman(String[] hangman)
	{
		int index ;
		
		for(index = 0 ; index < 11; index++)
			{
				hangman[index] = "" ;
			}
	}
	public static void printMan(String[] hangman, int noOfGuess)
	{
		switch(noOfGuess)
			{
				case 0 :
						hangman[6] = "O" ;
						hangman[7] = "_" ;
						hangman[8] = "_" ;
						hangman[9] = "|" ;
						hangman[10] = "/ \\" ;
						break ;
				case 1 :
						hangman[5] = "|" ;
				case 2:
						hangman[4] = "___" ;
						break ;
				case 3:
						hangman[1] = "|" ;
						hangman[2] = "|" ;
						hangman[3] = "|" ;
						break ;
				case 4:
						hangman[0] = "__|" ;
						break ;
			}
		System.out.println() ;
		System.out.println("           "+hangman[4]) ;
		System.out.println("           "+hangman[3] + " " + hangman[5]) ; 
		System.out.println("           "+hangman[2] + "" +hangman[7] +hangman[6] + hangman[8] ); 
		System.out.println("           "+hangman[1]+ " "+ hangman[9]  ) ;
		System.out.println("         " + hangman[0] +   hangman[10] ) ;  	
	}
	public static void printGuess(char[] guessWord, int noOfElements)
	{
		int index ;
		
		for(index = 0; index < noOfElements ; index ++)
			{
				System.out.print(guessWord[index] + " ") ;
			}
	}
	public static void playGame(char[] hang, char[] guessWord, int noOfElements, String[] hangman, String word)
	{
		char guess ;
		int noOfGuess ;
		int index ;
		boolean correct ;
		boolean checkWin ;
		
		noOfGuess = 5 ;
		do
		{
			checkWin = false ;
			correct = false ;
			printGuess(guessWord, noOfElements) ;
			System.out.print("\nPlease make your guess!! You have "+ noOfGuess + " guess(s) remaining :   ") ;
			guess = EasyIn.getChar() ;
			guess = Character.toUpperCase(guess) ;
			for(index = 0; index < noOfElements; index ++)
			{
				if(guess == hang[index])
					{ 
						correct = true ;
						guessWord[index] = guess ;
					}
			}
			if(!correct)
				{
					noOfGuess -- ;
				}
			printMan(hangman, noOfGuess) ;
			checkWin = checkWin(guessWord, hang , noOfElements) ;
			if(checkWin)
				{
					System.out.println("CONGRATULATIONS!!!") ;
					printGuess(guessWord, noOfElements) ;	
					noOfGuess = 0 ;
				}
		}
		while(noOfGuess > 0) ;
		if(!checkWin)
			{
				System.out.println() ;
				System.out.println("UNLUCKY!!!") ;
				System.out.println("The word was " + word) ;
			}
	}
	public static void insertWord(char[] hang, char[] guessWord, String word)
	{
		int index ;
		
		for(index = 0 ;index < word.length() ;index ++)
			{
				hang[index] = word.charAt(index) ;
				hang[index] = Character.toUpperCase(hang[index]) ;
				guessWord[index] = '_' ;
			}
	}
	public static void main(String[] args)
	{
		String word ;
		char[] hang ;
		char[] guessWord ; 
		String[] hangman ;
		int noOfElements ;
		
		System.out.println("Please enter a word") ;
		word = EasyIn.getString() ;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ") ;
		noOfElements = word.length() ;
		hangman = new String[11] ;
		assignHangman(hangman) ;
		hang = new char [word.length()] ;
		guessWord = new char [word.length()] ;
		insertWord(hang, guessWord, word) ;
		playGame(hang, guessWord, noOfElements, hangman, word) ;
	}
}