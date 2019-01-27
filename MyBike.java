package bicycle;

public class MyBike {
	
    // the MyBike subclass has one static field
	public static String BIKETYPE = "TREK";
	
	// the MyBike subclass has one method
	public static void main(String[] args) {
	    // the MountainBike subclass has one no-argument constructor
		MountainBike myRide = new MountainBike();
		
		myRide.setGear( 3 );
		myRide.setSpeed( 18.7 );
//		myRide.getCost();
	
		// variable is private and hidden
//		System.out.println( "My " + BIKETYPE + "'s speed is: " + myRide.speed );
		
		System.out.println( "My " + BIKETYPE + "'s ratio is: " + myRide.getRatio() );
		System.out.println( "My " + BIKETYPE + "'s speed is: " + myRide.getSpeed() );
		
		myRide.speedUp( 1.1 );
		System.out.println( "My " + BIKETYPE + "'s speed is: " + myRide.getSpeed() );
		
		System.out.println( "My " + BIKETYPE + "'s cost is: " + myRide.getCost() );
		
		myRide.setCost( 777.77 );
		System.out.println( "My " + BIKETYPE + "'s cost is: " + myRide.getCost() );
		
//		System.out.println( "My " + BIKETYPE + "'s cadence is: " + cadence;
		
	}

} 