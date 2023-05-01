package chapter02.ex4;

import chapter02.ex3.Bus;
import chapter02.ex3.Vehicle;

public class Driver {

	public void drive(Vehicle v) {
		if(v instanceof Bus) {
			Bus bus = (Bus) v;
			bus.cF();
		}
		v.run();
	}
}
