package chapter04;

public class CarReturn {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("가스 충분");
		}else {
			System.out.println("주유소 가야해");
		}
	}
}
