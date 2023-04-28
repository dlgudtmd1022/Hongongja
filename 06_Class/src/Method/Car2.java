package Method;

public class Car2 {

	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println(speed);
		}
	}
	
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println(speed);
	}
	
}
