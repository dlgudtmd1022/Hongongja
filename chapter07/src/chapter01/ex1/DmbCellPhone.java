package chapter01.ex1;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
	this.model = model; 
	this.color = color;
	this.channel = channel;
	}
	
	void tOD() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합닏.");
	}
	void cCD(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다");
	}
	
	void tOfD() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	

}
