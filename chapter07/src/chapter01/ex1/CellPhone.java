package chapter01.ex1;

public class CellPhone {

	String model;
	String color;
	
	
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sV(String message) {System.out.println("본인 : " + message);}
	void rV(String message) {System.out.println("상대방 :" + message);}
	void hU() {System.out.println("전화를 끊습니다.");}
}
