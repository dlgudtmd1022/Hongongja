package Class_;

public class Car4Example {

	public static void main(String[] args) {
		Car4 car1 = new Car4();
		System.out.println(car1.company);
		
		Car4 car2 = new Car4("프라이드");
		System.out.println(car2.model);
		
		Car4 car3 = new Car4("프라이드", "화이트");
		System.out.println(car2.model);
		System.out.println(car2.color);
		
		Car4 car4 = new Car4("프라이드", "화이트", 220);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		
	}

}
