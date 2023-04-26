package chapter03;

public class 기본타입과문자열간의변환 {

	public static void main(String[] args) {
		
		int v1 = Integer.parseInt("10"); //10을 정수형으로 변환
		double v2 = Double.parseDouble("3.14"); //3.14를 실수형으로 변환
		boolean v3 = Boolean.parseBoolean("true");// true를 문자열이 아닌 참과 거짓을 판정 할 수 있게 변환
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		//문자열로 다시 변환
		String s1 = String.valueOf(10);
		String s2 = String.valueOf(3.14);
		String s3 = String.valueOf(true);
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
