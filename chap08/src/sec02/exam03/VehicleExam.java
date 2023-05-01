package sec02.exam03;

public class VehicleExam {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); Vehicle인터페이스에는 checkFare()메소드 없음
		
		Bus bus = (Bus) vehicle;// 강제 타입변환
		
		bus.run();
		bus.checkFare();//Bus클래스에는 checkFare()메소드가 있음

	}

}
