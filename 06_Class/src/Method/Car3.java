package Method;

public class Car3 {

	String model;
	int speed;
	
	Car3(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.speed);
		}
	}
	public static void main(String[] args) {
		Car3 myCar = new Car3("포르쉐");
		Car3 yourCar = new Car3("람보르기니");
		
		myCar.run();
		yourCar.run();
	}
	
}
