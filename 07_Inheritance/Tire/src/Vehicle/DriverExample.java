package Vehicle;

public class DriverExample {

	public static void main(String[] args) {
		Driver_1 driver = new Driver_1();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus);
		driver.driver(taxi);

	}

}
