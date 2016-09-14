class jlab12

{
	public static void main(String args[])
	 {
	    double disTrav ;
	 	double timeSpent ;
	 	double fuelUsed ;
	 	double avgMPH ;
	 	double avgMPG ;
	 	
	 	System.out.println("How far did you travel? ");
	 	disTrav = EasyIn.getDouble() ;
	 	System.out.println("How long did the trip take you? ");
	 	timeSpent = EasyIn.getDouble() ;
	 	System.out.println("How much Fuel did you use in Gallons? ") ;
	    fuelUsed = EasyIn.getDouble() ;
	 	avgMPH = disTrav / timeSpent ;
	 	avgMPG = disTrav / fuelUsed ;
	 	System.out.println("Your average speed is " + avgMPH + ",your average fuel usage is " + avgMPG +"MPG ") ;
	 	
	 }
}