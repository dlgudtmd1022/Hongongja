package sec01.exam01;

public class DmbCellPhone extends CellPhone {// 자식 클래스
	
	//필드
	int channel;
	
	//생성자
	public DmbCellPhone(String model, String color, int channel) {
		// Cellphone 클래스로부터 상속받은 필드
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB방송 수신 시작");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널 "+channel+"번으로 바꿈");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 멈춤");
	}
}
