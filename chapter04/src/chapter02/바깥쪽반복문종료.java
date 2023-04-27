package chapter02;

public class 바깥쪽반복문종료 {

	public static void main(String[] args) {
		
		Outter: for(char u = 'A' ; u <= 'z'; u++) {
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(u + " - " + l);
				if(l == 'g') {
					break Outter;
				}
			}
		}
	}
}
