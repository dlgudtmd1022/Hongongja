package sec01.exam03;

public class Computer extends Calculator {//자식 클래스
	@Override
	double areaCircle(double r) {//재정의
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
	
	
	
	
}
