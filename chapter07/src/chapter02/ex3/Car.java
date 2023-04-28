package chapter02.ex3;

public class Car {

	Tire fLT = new Tire("앞왼쪽", 6);
	Tire fRT = new Tire("앞오른쪽", 2);
	Tire bLT = new Tire("뒤왼쪽", 3);
	Tire bRT = new Tire("뒤오른쪽", 4);

	int run() {
		System.out.println("[차가 달린다]");
		if(fLT.roll()==false) {stop(); return 1;}
		if(fRT.roll()==false) {stop(); return 2;}
		if(bLT.roll()==false) {stop(); return 3;}
		if(bRT.roll()==false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[어어 멈춘다!]");
	}

}
