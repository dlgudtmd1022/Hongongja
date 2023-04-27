package chapter01;

public class 문자열비교 {

	public static void main(String[] args) {
		String sV1 = "신민철";
		String sV2 = "신민철";
		
		if(sV1 == sV2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(sV1.equals(sV2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String sV3 = new String("신민철");
		String sV4 = new String("신민철");
		if(sV3 == sV4) {
		System.out.println("strVa3과 strVar4는 참조가 같음");
		}else {
		System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(sV3.equals(sV4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	
	}
}
