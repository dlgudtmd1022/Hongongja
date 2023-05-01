package Tire;

public class KumhoTire extends Tire_1 {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
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
