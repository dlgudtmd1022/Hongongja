package chapter02.ex1;

public class Car {

	Tire fLT = new HT();
	Tire fRT = new HT();
	Tire bLT = new HT();
	Tire bRT = new HT();
	
	void run() {
		fLT.roll();
		fRT.roll();
		bLT.roll();
		bRT.roll();
	}
}
