package Tire;

public class CarExample {

	public static void main(String[] args) {
		
		Car_1 car = new Car_1();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 한국타이어로 교체");
				Car_1.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞왼쪽 한국타이어로 교체");
				Car_1.frontRightTire = new HankookTire("앞왼쪽", 15);
				break;
			case 3:
				System.out.println("앞왼쪽 한국타이어로 교체");
				Car_1.backLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 4:
				System.out.println("앞왼쪽 한국타이어로 교체");
				Car_1.backRightTire = new HankookTire("앞왼쪽", 15);
				break;
		
			}
		}

	}

}
