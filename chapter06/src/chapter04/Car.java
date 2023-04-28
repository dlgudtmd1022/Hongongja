package chapter04;

public class Car {

	//필드
	int gas;
	
	//생성자
	
	//메서드
	void setGas(int gas){
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("no gas");
			return false; //false를 리턴
		}
		System.out.println("gas ok");
		return true; //true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달린다(gas잔량 : " + gas + ")");
				gas--;
			}else {
				System.out.println("멈춘다(gas잔량 : " + gas + ")");
			return; //메서드를 종료
			}
		}
	}
}
