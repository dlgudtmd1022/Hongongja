package Method;

public class Calculator {

	void powerOn() {
		System.out.println("전원 on");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원 off");
	}
	
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(3, 4);
		System.out.println(result1);
		
		byte x = 16;
		byte y = 8;
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();
		
	}
	
}


