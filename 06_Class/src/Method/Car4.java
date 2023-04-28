package Method;

public class Car4 {

	int speed;
	
	void run() {
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		Car4 myCar = new Car4();
		myCar.speed = 60;
		myCar.run();
	}
	
}
