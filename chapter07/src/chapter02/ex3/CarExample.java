package chapter02.ex3;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i <= 5; i++) {
			int pL = car.run();
			
			switch(pL) {
			case 1:
				System.out.println("앞왼쪽 한타로 교체");
				car.fLT = new HT("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞왼쪽 한타로 교체");
				car.fRT = new HT("앞오쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 금타로 교체");
				car.bLT = new HT("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 금타로 교체");
				car.bRT = new HT("뒤오른쪽", 17);
				break;				
			}
			System.out.println("---------------------");
		}
	}
}
