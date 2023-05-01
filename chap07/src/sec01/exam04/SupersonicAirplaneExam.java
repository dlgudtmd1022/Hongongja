package sec01.exam04;

public class SupersonicAirplaneExam {//super변수

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
