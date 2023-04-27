package chapter02;

public class 논리연산자 {

	public static void main(String[] args) {
		
		int cC = 'A';
		
		if((cC >= 65) & (cC <= 90)){
			System.out.println("대문자군요");
		}	
		if((cC >= 97) && (cC <= 122)){
			System.out.println("소문자군요");	
		}	
		if(!(cC < 48) && !(cC > 57)){
			System.out.println("0 ~ 9 숫자군요");
		}
		int v = 6;
			
		if((v%2 == 0) | (v%3 == 0)){
			System.out.println("2 또는 3의 배수군요");
		}
		if((v%2 == 0) || (v%3 == 0)){
			System.out.println("2 또는 3의 배수군요");
		}
	}
}
