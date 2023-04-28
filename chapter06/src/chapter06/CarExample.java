package chapter06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//bad
		myCar.setSpeed(-50);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
	
		//good
		myCar.setSpeed(60);
	
		//stop
		
		if(myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재속도 " + myCar.getSpeed());
	}
}
