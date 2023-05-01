package sec02.exam02;

public class Driver {//매개 변수의 인터페이스화
	public void driver(Vehicle vehicle) {
		vehicle.run();
	}
	
	public void drive(Bus bus) {
		bus.run();
	}
	public void drive(Taxi taxi) {
		taxi.run();
	}
	
	
	
}
