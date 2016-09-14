class Addition  

// Student Name : 		Enda Dunican
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A simple addition program


 
{
    public static void main(String[] args)
	{

		int number1; 
	    int number2;
	    int sum; 
	    		
		System.out.print("Enter the first number ->  "); 
		number1 = EasyIn.getInt();
		System.out.print("Enter the second number ->  ");
		number2 = EasyIn.getInt(); 
		sum = number1 + number2; // Calculate sum
	    System.out.println("The sum of the two numbers is " + sum); 
	  
	}
}
