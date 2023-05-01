package sec02.exam04;

import sec02.exam03.Bus;
import sec02.exam03.Vehicle;

public class Driver {//객체 타입 확인
	public void drive(Vehicle vehicle) {//vehicle에 Bus,Taxi객체가 있다
		if(vehicle instanceof Bus) {//vehicle 매개변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle;//Bus객체일 경우 안전하게 강제 타입변환
			bus.checkFare();//Bus타입으로 강제 타입변환을 하는 이유
		}
		vehicle.run();
	}

}
