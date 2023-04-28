package chapter03;

public class ChaExample {

	public static void main(String[] args) {
		
		Cha car1 = new Cha();
		System.out.println(car1.company);
		System.out.println();
		
		Cha car2 = new Cha("머스탱");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		
		Cha car3 = new Cha("머스탱", "검정");
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();
		
		Cha car4 = new Cha("머스탱", "검정",300);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
		System.out.println();	
	}
}
