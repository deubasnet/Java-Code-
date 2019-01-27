package bicycle;

public class Bicycle {
    
    // the Bicycle class has three fields
	
    private int cadence = 25;
    private int gear;
    private double speed;        
     
    // the Bicycle class has six methods
    
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
     
    public void setSpeed(double newValue) {
        speed = newValue;
    }
    public void applyBrake(double decrement) {
    	//mod to return new speed
    	speed -= decrement;
    }
        
    public void speedUp(double increment) {
    	// mod to return new speed
        speed += increment;
    }
    
    public double getSpeed() {
        return speed;
    }      
    
    public double getRatio() {
        return cadence / gear;
    }      
           
}