package sec03;

public class Car2Example {

	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println("car1.company: "+car1.company);
		System.out.println();
		
		Car2 car2 = new Car2("자가용");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		
		Car2 car3 = new Car3("자가용", "빨강");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("ca");
	}

}