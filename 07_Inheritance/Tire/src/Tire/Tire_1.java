package Tire;

public class Tire_1 {

	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	
	public Tire1(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
	++accumulatedRotation;
	if(accumulatedRotation<maxRotation) {
		System.out.println(location + (maxRotation - accumulatedRotation));
		return true;
	}else {
		System.out.println(location);
		return false;
		}
		
	}
}
