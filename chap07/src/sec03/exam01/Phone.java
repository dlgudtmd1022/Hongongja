package sec03.exam01;

public class Phone {//추상 클래스
	//필드
	public String owner;
	//생성자
	public Phone(String owner) {
		this.owner=owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("turn On the Phone");
	}
	public void turnOff() {
		System.out.println("turn Off the Phone");
	}

}
