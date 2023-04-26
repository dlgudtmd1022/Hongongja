package chapter03;

public class 연산식에서자동타입변환 {

	public static void main(String[] args) {
		byte bv1 = 10;
		byte bv2 = 20;
		// byte bv3 = bv1 + bv2;  < byte값과 byte값을 더하여 int로 자동 형 변환되어 byte타입에 저장이 불가능하여 에러 발생
		int iv = bv1 + bv2;
		System.out.println(iv);
		
		char cv1 = 'A';
		char cv2 = 1;
		//char cv3 = cv1 + cv2 < 위와 같은 이유로 에러 발생
		int iv2 = cv1 + cv2;
		System.out.println("유니코드=" + iv2);
		System.out.println("출력문자=" + (char)iv2);
		
		int iv3= 10;
		int iv4 = iv3/4; // 10/4로 2.5이지만 int타입으로 2출력
		System.out.println(iv4);
	
		int iv5 = 10;
//		int iv6 = 10 / 4.0; //int타입에 4.0을 대입하여 오류 발생
		double dv = iv5 / 4.0; //정수형과 실수형의 계산식에서는 실수형으로 자동 형변환
		System.out.println(dv);
	
		int x = 1;
		int y = 2;
		double r = (double) x / y; // 정수형 간의 연산식이지만 연산식 앞에 (double)를 붙여줘 double로 강제 형 변환이 이루어짐
		System.out.println(r);
	
	}
}
