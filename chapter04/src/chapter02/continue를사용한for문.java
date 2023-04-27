package chapter02;

public class continue를사용한for문 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
