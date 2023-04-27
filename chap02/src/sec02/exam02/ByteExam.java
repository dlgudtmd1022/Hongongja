package sec02.exam02;

public class ByteExam {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//byte var6 = 128; 컴파일 에러 int에서 byte 타입으로 변환불가
		//byte 범위는 -128~127 (-2^7~(2^7-1))
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}
