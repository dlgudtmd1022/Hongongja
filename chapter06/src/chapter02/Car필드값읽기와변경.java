package chapter02;

public class Car필드값읽기와변경 {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		//필드값변경
		
		myCar.speed = 60;
		System.out.println("수정된 현재 속도 : " + myCar.speed);
		
	}
}
