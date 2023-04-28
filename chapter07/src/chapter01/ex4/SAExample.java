package chapter01.ex4;

public class SAExample {

	public static void main(String[] args) {
		SA sa = new SA();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SA.SUPERSONIC;
		sa.fly();
		sa.flyMode = SA.NORMAL;
		sa.fly();
		sa.land();
	}
}
