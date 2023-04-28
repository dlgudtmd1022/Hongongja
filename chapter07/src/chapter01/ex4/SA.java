package chapter01.ex4;

public class SA extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly(); //Airplane 객체의 fly메서드 호출
		}
	}
}
