package Case;

public class Practice {

	public static void main(String[] args) {\
		// 예제 1(조건문)
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90이상");
			System.out.println("등급은 A");
		}
		if(score < 90) {
			System.out.println("점수가 90미만");
			System.out.println("등급은 B");
		}
		System.out.println();
		
		// 예제 2
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90이상");
			System.out.println("등급은 A");
		}else {
			System.out.println("점수가 90미만");
			System.out.println("등급은 B");
		}
		System.out.println();
		
		// 예제 3
		int score 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90");
			System.out.println("등급은 A");
		}else if(score>=80) {
			System.out.println("점수가 80~89");
			System.out.println("등급은 B");
		}else if(score>=70) {
			System.out.println("점수가 70~79");
			System.out.println("등급은 C");
		}else {
			System.out.println("점수가 70미만");
			System.out.println("등급은 D");
		System.out.println();
			
		// 예제 4
		int num =(int)(Math.random()*6) + 1;
		
		if(num == 1) {
			System.out.println("1번");
		}else if(num == 2) {
			System.out.println("2번");
		}else if(num == 3) {
			System.out.println("3번");
		}else if(num == 4) {
			System.out.println("4번");
		}else if(num == 5) {
			System.out.println("5번");
		}else {
			System.out.println("6번");
		}
		System.out.println();
		
		// 예제 5
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
		}
		System.out.println();
		}
		
		// 예제 6
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무");
		default:
			System.out.println("외근");
		}
		System.out.println();
		
		// 예제 7
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원");
		default :
			System.out.println("손님");
		}
		System.out.println();
		
		// 예제 8
		String position = "과장"
				
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		
		}
		System.out.println();
		
		// 예제 9(반복문)
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// 예제 10
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100의 합: " + sum);
		System.out.println();
		
		// 예제 11
		for(float x=0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		System.out.println();
		
		// 예제 12
		for(int m=2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		System.out.println();
		
		// 예제 13
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		// 예제 14
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println();
		
		// 예제 15
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		System.out.println();
		
		// 예제 16
		Outter: for(char upper='A'; upper <= 'Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
		
		System.out.println();
		
		// 예제 17
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
	
}

