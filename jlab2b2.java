class jlab2b2

		// Student Name : 		Karl Redmond	
		// Student Id Number : 	CO0196815
		// Date :				16/09/2014
		// Purpose : 			Lab Exercise

/*      2.	Write a program to calculate credit card interest. 
        Interest is charged at 12% for the first €500 and at 
        18% for any remaining amount over €500. 
*/
		
{		
		public static void main(String args[])
		 {
		 	double debtOnCard ;     
		 
		    
		 	System.out.println("What is the debt? ") ;
		 	debtOnCard = EasyIn.getDouble() ;
		 	if (debtOnCard <= 500)
		 		{
		 			System.out.println("Your interest is " + (debtOnCard * 0.12))  ;
		 		}
		 	else 
		 		{
		 			System.out.println("Your interest is" + ((debtOnCard - 500)* .18 + (500 * .12))) ;

		 		}		 			 
		 
		 }






}
		
		
 
	