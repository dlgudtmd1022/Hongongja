package sec01.exam01;

public class CellPhone {// 부모 클래스
	//필드
	
	String model;
	String color;
	
	//생성자
	
	//메소드
	void powerOn() {
		System.out.println("Turn On");
	}
	void powerOff() {
		System.out.println("Turn Off");
	}
	void bell() {
		System.out.println("ring- ring-");
	}
	void sendVoice(String message) {
		System.out.println("자기: "+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방: "+message);
	}
	void hangUp() {
		System.out.println("전화 끊어짐");
	}
	
	
}
