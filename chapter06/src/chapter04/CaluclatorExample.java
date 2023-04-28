package chapter04;

public class CaluclatorExample {

	public static void main(String[] args) {
		Caluclator myCc = new Caluclator();
		myCc.powerOn();
		
		int result1 = myCc.plus(5, 6);
		System.out.println(result1);
		
		byte x = 10;
		byte y = 4;

		double result2 = myCc.divide(x, y);
		System.out.println(result2);
		
		myCc.powerOff();;
	}
}
