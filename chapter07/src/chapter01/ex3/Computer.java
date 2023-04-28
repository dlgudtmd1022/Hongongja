package chapter01.ex3;

public class Computer extends Cc{
	
	@Override
	double aC(double r) {
		System.out.println("컴퓨터 객체의 aC() 실행");
		return Math.PI * r*r;
	}

}
