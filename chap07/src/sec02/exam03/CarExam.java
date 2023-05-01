package sec02.exam03;

public class CarExam {//실행 클래스

	public static void main(String[] args) {
		//Car 객체 생성
		Car car=new Car();
		
		//Car 객체의 run() 메소드 5번 반복 실행
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
		
		switch(problemLocation) {
		//1회전시 출력되는 내용을 구분
		case 1://앞왼 타이어가 펑크났을때 한국타이어로 교체
			System.out.println("앞왼 한국타이어 교체");
			car.frontLeftTire=new HankookTire("앞왼", 15);
			break;
		case 2://앞오른 타이어가 펑크났을때 금호타이어로 교체
			System.out.println("앞오른 금호타이어 교체");
			car.frontLeftTire=new HankookTire("앞오른", 13);
			break;
		case 3://뒤왼 타이어가 펑크났을때 한국타이어로 교체
			System.out.println("뒤왼 한국타이어 교체");
			car.frontLeftTire=new HankookTire("뒤왼", 14);
			break;
		case 4://뒤오른 타이어가 펑크났을때 금호타이어로 교체
			System.out.println("뒤오른 한국타이어 교체");
			car.frontLeftTire=new HankookTire("뒤오른", 14);
			break;
			}
		System.out.println("------------------");
		}
	
	}	

}
