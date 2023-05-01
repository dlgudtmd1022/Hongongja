package Tire;

public class Car_1 {
	
	public class Car_1{
		Tire_1 frontLeftTire = new Tire("앞왼쪽", 6);
		Tire_1 frontRightTire = new Tire("앞오른쪽", 6);
		Tire_1 backLeftTire = new Tire("뒤왼쪽", 6);
		Tire_1 backRightTire = new Tire("뒤오른쪽", 6);
		
		int run() {
			if(frontLeftTire.roll()==false) {stop(); return 1;}
			if(frontRightTire.roll()==false) {stop(); return 2;}
			if(backLeftTire.roll()==false) {stop(); return 3;}
			if(backRightTire.roll()==false) {stop(); return 4;}
			return 0;
		}
		
		void stop() {
		}
	}

}
