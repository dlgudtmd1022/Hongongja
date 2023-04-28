package chapter05;

public class Cha {

	int speed;
	
	void run() {
		System.out.println(speed + "로 달림");
	}
	
	public static void main(String[] args) {
		Cha mC = new Cha();
		mC.speed = 60;
		mC.run();
	}
}
