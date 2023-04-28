package Class_;

public class Car3Example {

	public static void main(String[] args) {
		Car3 car1 = new Car3();
		System.out.println(car1.company);

		Car3 car2 = new Car3("레인지로버");
		System.out.println(car2.model);
		
		Car3 car3 = new Car3("쏘렌토", "black");
		System.out.println(car3.model);
		System.out.println(car3.color);
		
		Car3 car4 = new Car3("프라이드", "화이트", 220);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);

	}

}
