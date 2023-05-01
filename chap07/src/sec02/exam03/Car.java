package sec02.exam03;

import javax.swing.text.TabStop;

public class Car {//Tire를 부품으로 가지는 클래스
	//필드
	//자동차는 4개의 타이어를 가짐
	Tire frontLeftTire=new Tire("앞왼",6);
	Tire frontRightTire=new Tire("앞오른",2);
	Tire backLeftTire=new Tire("뒤왼",3);
	Tire backRightTire=new Tire("뒤오른",4);
	
	//생성자
	//메소드
	int run() {
		/*모든 타이어를 1회 회전시키기 위해 각 Tire 객체의
		 * roll()메소드를 호출. false를 리턴하는 roll()이 있을경우
		 * stop()메소드를 호출하고 해당 타이어 번호를 리턴
		 */
		System.out.println("[자동차 운행시작]");
		if(frontLeftTire.roll()==false) {stop(); return 1;}
		if(frontRightTire.roll()==false) {stop(); return 2;}
		if(backLeftTire.roll()==false) {stop(); return 3;}
		if(backRightTire.roll()==false) {stop(); return 4;}
		return 0;
	}
	
	//펑크 났을때 실행
	void stop() {
		System.out.println("[자동차 멈춤]");
	}
}
