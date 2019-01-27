package bicycle;

public class MountainBike extends Bicycle {
    
    // the MountainBike subclass has one field
    
    private double bikeCost = 1000;
        
    // the MountainBike subclass has two methods
    
    public void setCost(double newValue) {
        bikeCost = newValue;
    }   
    
    public double getCost() {
        return bikeCost;
    }
        
}