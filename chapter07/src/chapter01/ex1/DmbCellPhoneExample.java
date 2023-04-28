package chapter01.ex1;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		DmbCellPhone dCP = new DmbCellPhone("자바폰","검정", 10);
		
		System.out.println("모델 : " + dCP.model);
		System.out.println("색상 : " + dCP.color);
		
		System.out.println("채널 : " + dCP.channel);
		
		//셀폰에서 상속받은 메서드
		dCP.powerOn();
		dCP.bell();
		dCP.sV("여보세요");
		dCP.rV("안녕하세요! 저는 이형승인데요.");
		dCP.sV("아~예 반갑습니다.");
		dCP.hU();
		
		// dcp클래스의 메소드
		dCP.tOD();
		dCP.cCD(12);
		dCP.tOfD();
		
	}
}
