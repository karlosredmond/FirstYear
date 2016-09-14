class jlab2b1

		// Student Name : 		Karl Redmond	
		// Student Id Number : 	CO0196815
		// Date :				16/09/2014
		// Purpose : 			Lab Exercise

/* 1.	Write a program which calculates the insurance premium for the
        coming year. The program asks the user for the value of last
        year's premium and the number of claims you made in the year.
        The basic premium for the following year  will be a 5% increase on 
        last years premium. If the person made no claims they get a 40% discount
        on this increase. If they made a claim the get an extra charge of 20%
        for every claim that they made.
*/
		
{		
		public static void main(String args[])
		 {
		 	double lastYrsPrem ;   //
		 	double noOfClaims ;    //
		 	double basicPremium ;  //
		 	double noClaimPrem ;   //
		 	double standardIn ;    //
		 	double discount ;      //
		 	double penalty ;       //
		 	double claimPrem ;     //
		 
		    
		    
		 	System.out.println("What was your last years Premium? ") ;
		 	lastYrsPrem = EasyIn.getDouble() ;
		 	System.out.println("How many claims did you make last year? ") ;
		 	noOfClaims = EasyIn.getDouble() ;
		 	standardIn = 0.05 ;
		 	discount = 0.4 ;
		 	penalty = 0.2 ;
		 	basicPremium = lastYrsPrem * standardIn ;
		 	noClaimPrem = lastYrsPrem + (lastYrsPrem * standardIn) - (lastYrsPrem * standardIn * discount) ;
		 	claimPrem = lastYrsPrem + (lastYrsPrem * standardIn) + (lastYrsPrem * standardIn * noOfClaims * penalty) ;
		 	
		 
            
            if (noOfClaims == 0)
                 {
              		System.out.println("Your Premium is " + noClaimPrem) ;
                 }
                 
            else 
            	{
            		System.out.println("Your premium is " + claimPrem) ;
            	}
                 
                 
            
		 
		 
		 }






}
		
		
 
	