package chapter01;

public class 변수사용범위 {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5; // v2 변수는 if문 안에서 선언되어 if문 종료 시 v2 변수도 사라져 에러발생
	}
}
