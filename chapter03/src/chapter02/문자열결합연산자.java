package chapter02;

public class 문자열결합연산자 {

	public static void main(String[] args) {
		
		String str1 = "JDk" + 6.0;
		String str2 = str1 + "득점";
		System.out.println(str2);
		
		String str3 = "JDk" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDk";
		System.out.println(str3);
		System.out.println(str4);
}
}