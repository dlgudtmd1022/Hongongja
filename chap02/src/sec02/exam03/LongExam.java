package sec02.exam03;

public class LongExam {
	public static void main(String[] args) {
		long var1=10;
		long var2=20L;
		//long var3 = 1000000000000;
		//컴파일 에러(정수 리터럴 뒤에 소문자l 또는 대문자L을 붙이면 된다.)
		long var4=1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
