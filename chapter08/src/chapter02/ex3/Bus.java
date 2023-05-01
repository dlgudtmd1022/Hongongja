package chapter02.ex3;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스 달린다.");
	}
	
	public void cF() {
		System.out.println("승차 요금 체크");
	}
}
