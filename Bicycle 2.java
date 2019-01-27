package bicycle2;

public class Bicycle {
	
	public int cadence = 25;
    public int gear;
    public double speed;  
    
	public Bicycle(int startCadence, double startSpeed, int startGear) {
	    gear = startGear;
	    cadence = startCadence;
	    speed = startSpeed;
	}

}
