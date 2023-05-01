package chapter01.ex19;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Promgraming";
		String str2 = "Java Promgraming";
	
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str1.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
