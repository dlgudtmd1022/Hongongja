package chapter02.ex3;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle v = new Bus();
		 
		v.run();
//		v.cF();     
		
		Bus bus = (Bus) v;
		
		bus.run();
		bus.cF();
		
	}
}
