package chapter03;

public class KarExample {

	public static void main(String[] args) {
		Kar k1 = new Kar();
		System.out.println(k1.company);
		System.out.println();
		
		Kar k2 = new Kar("911");
		System.out.println(k2.company);
		System.out.println(k2.model);
		System.out.println();
		
		Kar k3 = new Kar("911", "빨강");
		System.out.println(k3.company);
		System.out.println(k3.model);
		System.out.println(k3.color);
		System.out.println();
		
		Kar k4 = new Kar("911", "노랑", 400);
		System.out.println(k4.company);
		System.out.println(k4.model);
		System.out.println(k4.color);
		System.out.println(k4.maxSpeed);
		System.out.println();
		}	
}
