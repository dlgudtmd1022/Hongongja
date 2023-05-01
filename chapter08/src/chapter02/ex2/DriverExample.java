package chapter02.ex2;

public class DriverExample {

	public static void main(String[] args) {
		Driver d1= new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		d1.driber(bus);
		d1.driber(taxi);
	}
}
