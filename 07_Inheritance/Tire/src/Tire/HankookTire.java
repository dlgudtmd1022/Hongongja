package Tire;

public class HankookTire extends Tire_1 {

	public static void main(String[] args) {
		
		public HankookTire(String location, int maxRotation) {
			super(location, maxRotation);
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
