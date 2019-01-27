package bicycle2;

public class myBike {
	
	public static void main(String[] args) {
		
		Bicycle myRide = new Bicycle(10, 50.5, 3);
		
		// variables are public and available
//		System.out.println( "Speed is: " + speed );
		System.out.println( "Speed is: " + myRide.speed );
		System.out.println( "Speed ratio is: " + myRide.cadence / myRide.gear );
		

	}

}
