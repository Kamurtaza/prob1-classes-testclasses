package prob1;

public class Car {
	private double fuelCapacity;
	private double fuelEfficiency;
	private double fuelLevel;
	private double totalDistance;

	public Car(double fuelCapacity, double fuelEfficiency){
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
	 
	 
 }
	Car(double fuelCapacity, double fuelEfficiency, double fuelLevel){
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelLevel = fuelLevel;
 
 }
	
	public void fillUp(double amount) {
		if(fuelLevel <= fuelCapacity) {
			fuelLevel = amount + fuelLevel;
			
		}
			
	}
	public void drive(double time,double rate) {
		double tank = fuelLevel;
		double a = rate*time;
		double b = fuelEfficiency;
		double c = a/b;
		if(c<=tank) {
            totalDistance += a;
            fuelLevel = fuelLevel - c;
            if(c>=tank) { if(c<=tank) {
            c = fuelEfficiency * fuelLevel;
            totalDistance +=c;
            fuelLevel =0;
		}
			}
		}
	}
	
	public double getFuelCapacity() {
		return fuelCapacity;
	
	}
	
	public double getFuelEfficiency() {
		return fuelEfficiency;
		
	}
	
	public double getFuelLevel() {
		return fuelLevel;
		
	}
	
	public double getTotalDistance() {
		return totalDistance;
		
	}
	
	public String toString() {
		String words = "car(" + fuelEfficiency + "," + fuelCapacity + "," + fuelLevel+")";
		return words;
	}
}
