package chapter04;

public class Cha {

	//필드
	int speed;
	
	//생성자

	//메서드
	int getSpeed() {
		return speed;
	}
	
	void kTO() {
		System.out.println("키온");
	}
	
	void run() {
		for(int i = 10 ; i <= 50; i+=10) {
			speed = i;
			System.out.println("달린다(시속 : " + speed + "km/h)");
			
		}
	}

}
