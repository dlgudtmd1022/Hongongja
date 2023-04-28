package chapter04;

public class ChaExample {

	public static void main(String[] args) {
		Cha mC = new Cha();
		mC.kTO();
		mC.run();
		int speed = mC.getSpeed();
		System.out.println("현재속도 :" + speed + "km/h");
	}
}
