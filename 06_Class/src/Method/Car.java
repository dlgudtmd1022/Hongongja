package Method;

public class Car {
	
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas 제로");
			return false;
		}
		System.out.println("gas 있음");
		return true;
		}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다." + gas);
				gas -= 1;
			}else {
				System.out.println("멈춥니다." + gas);
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(50);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas 주입 필요 없음");
		}else {
			System.out.println("gas 주입하세요.");
		}
	}
	
}

