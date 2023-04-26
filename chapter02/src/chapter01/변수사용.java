package chapter01;

public class 변수사용 {

	public static void main(String[] args) {
		// 변수에 값을 대입 후 콘솔에 출력
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
	
		//변수의 값이 정수일 경우 변수와 정수 연산 가능
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
	
	
	}
}
